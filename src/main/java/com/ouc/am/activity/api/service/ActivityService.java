package com.ouc.am.activity.api.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouc.am.activity.api.mapper.ActivityMapper;
import com.ouc.am.activity.api.po.ActivityPo;

@Service
public class ActivityService {
	@Autowired
	ActivityMapper activityMapper;
	
	public List<ActivityPo> activityQuery(Map<String, Object> map) {
		
		return activityMapper.activityQuery(map);
	}
	
	public int activityInsert(ActivityPo activityPo){
		return activityMapper.insert(activityPo);
	}

	public int activityCount(ActivityPo activityPo){
		return activityMapper.count(activityPo);
	}
}
