package com.MS_Reservation.main.serviveI;

import java.util.List;

import com.MS_Reservation.main.model.TrainInfo;

public interface TrainServiceI {

	public TrainInfo TrainInfoData(TrainInfo t);

	public List<TrainInfo> getAllTrainData();

	public List getAllByTrainName(String rname);

}
