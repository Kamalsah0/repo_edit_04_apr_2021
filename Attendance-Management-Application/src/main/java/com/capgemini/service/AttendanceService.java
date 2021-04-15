package com.capgemini.service;

import com.capgemini.entity.AttendanceEntity;

public interface AttendanceService {
	
	public AttendanceEntity addAttendance(AttendanceEntity entity);
	
	public AttendanceEntity updateAttendance(AttendanceEntity entity);
	
	public String deleteAttendance(AttendanceEntity entity);
	

	
}

