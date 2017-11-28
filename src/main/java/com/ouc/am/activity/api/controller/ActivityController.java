package com.ouc.am.activity.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
		
		//activityService.activityInsert(activityPo);
		
		rm.setCode(SysConstant.SUCCESS_CODE);
		rm.setMessage(SysConstant.SUCCESS_MSG);
		return rm;
	}
}
