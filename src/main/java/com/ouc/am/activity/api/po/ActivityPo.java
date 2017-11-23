package com.ouc.am.activity.api.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ActivityPo {
	private Long activityID;
	private String activityName;
	@JsonFormat(timezone = "GMT+8",pattern="yyyy-MM-dd HH:mm:ss")
	private Date activityStartTime;
	@JsonFormat(timezone = "GMT+8",pattern="yyyy-MM-dd HH:mm:ss")
	private Date activityEndTime;
	public Long getActivityID() {
		return activityID;
	}
	public void setActivityID(Long activityID) {
		this.activityID = activityID;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Date getActivityStartTime() {
		return activityStartTime;
	}
	public void setActivityStartTime(Date activityStartTime) {
		this.activityStartTime = activityStartTime;
	}
	public Date getActivityEndTime() {
		return activityEndTime;
	}
	public void setActivityEndTime(Date activityEndTime) {
		this.activityEndTime = activityEndTime;
	}
}
