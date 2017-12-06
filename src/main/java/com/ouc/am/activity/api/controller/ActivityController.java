package com.ouc.am.activity.api.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.sql.ast.statement.SQLIfStatement.Else;
import com.ouc.am.activity.api.common.po.ResponseMessage;
import com.ouc.am.activity.api.common.utils.SysConstant;
import com.ouc.am.activity.api.core.page.ResponsePageData;
import com.ouc.am.activity.api.po.ActivityPo;
import com.ouc.am.activity.api.service.ActivityService;

@Controller
@RequestMapping("/api/activity")
public class ActivityController {

	@Autowired
	ActivityService activityService;
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(value="/list/{page}/{pageSize}",method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_UTF8_VALUE})
	@ResponseBody
	public ResponsePageData<ActivityPo> getActivityList(ActivityPo activityPo,@PathVariable int page,@PathVariable int pageSize){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("activityEntity", activityPo);
		map.put("offset", page==0? 0 : page*pageSize);
		map.put("rows", pageSize);
		
		int count = activityService.activityCount(activityPo);
		
		List<ActivityPo> activityList = activityService.activityQuery(map);
		
		ResponsePageData<ActivityPo> responsePageData = new ResponsePageData<>(activityList, count, pageSize, page);
		return responsePageData;
	}
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(value = "/add", method = RequestMethod.POST,produces={MediaType.APPLICATION_JSON_UTF8_VALUE})
	@ResponseBody
	public ResponseMessage<String> addActivity(@RequestBody ActivityPo activityPo){
		ResponseMessage<String> rm = new ResponseMessage<>();
		
		if (activityPo.getActivityID() != null)
			activityService.update(activityPo);
		else
			activityService.activityInsert(activityPo);
		rm.setCode(SysConstant.SUCCESS_CODE);
		rm.setMessage(SysConstant.SUCCESS_MSG);
		return rm;
	}
	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="/get/{id}",method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_UTF8_VALUE})
	@ResponseBody
	public ResponseMessage<ActivityPo> getActivityPo(@PathVariable long id){
		ResponseMessage<ActivityPo> rmAP = new ResponseMessage<>();
		
		ActivityPo ap = activityService.getOneByID(id);
		if (ap.getActivityName() != null){
			rmAP.setCode(SysConstant.SUCCESS_CODE);
			rmAP.setMessage(SysConstant.SUCCESS_MSG);
			rmAP.setResult(ap);
		}
		else {
			rmAP.setCode(SysConstant.FAILURE_CODE);
			rmAP.setMessage(SysConstant.FAILURE_MSG);
		}
		return rmAP;
	}
}
