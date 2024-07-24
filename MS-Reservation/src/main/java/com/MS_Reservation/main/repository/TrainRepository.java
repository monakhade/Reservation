package com.MS_Reservation.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.MS_Reservation.main.model.TrainInfo;

@Repository
public interface TrainRepository extends JpaRepository<TrainInfo, Integer>
{
	@Query(name="getAllByTrainName",value="from TrainInfo where rname=?1")
	List getAllByTrainName(String rname);

}
