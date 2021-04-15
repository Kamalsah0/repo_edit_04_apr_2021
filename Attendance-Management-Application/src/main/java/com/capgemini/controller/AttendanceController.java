package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.AttendanceEntity;
import com.capgemini.service.AttendanceService;

@RestController
@RequestMapping("/Attendance")
public class AttendanceController {

	@Autowired
	AttendanceService attService;
	
	@PostMapping(path="/addAttendance")
	public ResponseEntity<AttendanceEntity> addAttend(@RequestBody AttendanceEntity ae)
	{
		return new ResponseEntity<AttendanceEntity>(attService.addAttendance(ae),HttpStatus.OK);
	}
	
	@PutMapping(path="/updateAttendance")
	public ResponseEntity<AttendanceEntity> updateAttend(@RequestBody AttendanceEntity ae)
	{
		return new ResponseEntity<AttendanceEntity>(attService.updateAttendance(ae),HttpStatus.OK);
	}
	
	@DeleteMapping(path="/deleteAttendance")
	public String deleteAttend(@RequestBody AttendanceEntity ae)
	{
		return  attService.deleteAttendance(ae);
		
		
	}
}
