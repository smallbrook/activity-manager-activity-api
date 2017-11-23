package com.ouc.am.activity.api.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ouc.am.activity.api.po.ActivityPo;

@Mapper
public interface ActivityMapper {
	List<ActivityPo> activityQuery(Map<String,Object> map);
	int insert(ActivityPo activityPo);
	int count(ActivityPo activityPo);
}
