package com.MS_Reservation.main.model;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
@Entity
@Data
public class TrainInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	private String rname;
	private long contact;
	private String email;
	private int age;
	private String gender;
	@Temporal(TemporalType.DATE)
	private Date reservationDate;
	@Temporal(TemporalType.TIME)
	private Time reservationTime;
	
	
}
