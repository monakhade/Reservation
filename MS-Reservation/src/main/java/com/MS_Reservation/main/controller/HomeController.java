package com.MS_Reservation.main.controller;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MS_Reservation.main.model.TrainInfo;
import com.MS_Reservation.main.serviveI.TrainServiceI;


@RestController
public class HomeController 
{
	@Autowired
	private TrainServiceI ts;
	
	@PostMapping("/TrainInfoData")
	public String TrainInfoData(@RequestBody TrainInfo t)
	{
		t.setReservationDate(new Date());
		t.setReservationTime(new Time(System.currentTimeMillis()));
		TrainInfo tInfo=ts.TrainInfoData(t);
		return "Train Info Data Saved.....!!!!";
	}
	
	@GetMapping("getAllTrainData")
	public List<TrainInfo>getAllTrainData()
	{
		List<TrainInfo> al=ts.getAllTrainData();
		return al;
		
	}
	
	@GetMapping("getAllByTrainName/{rname}")
	public List getAllByTrainName(@PathVariable String rname)
	{
		List al=ts.getAllByTrainName(rname);
		return al;
		
	}
	
}
