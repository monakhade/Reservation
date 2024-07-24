package com.MS_Reservation.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MS_Reservation.main.model.TrainInfo;
import com.MS_Reservation.main.repository.TrainRepository;
import com.MS_Reservation.main.serviveI.TrainServiceI;

@Service
public class TrainServiceImpl implements TrainServiceI
{
	@Autowired
	private TrainRepository tr;

	@Override
	public TrainInfo TrainInfoData(TrainInfo t) 
	{
		TrainInfo tInfo=tr.save(t);
		return tInfo;
	}

	@Override
	public List<TrainInfo> getAllTrainData() 
	{
		return tr.findAll();
	}

	@Override
	public List getAllByTrainName(String rname) 
	{
		List al=tr.getAllByTrainName(rname);
		return al;
	}
}
