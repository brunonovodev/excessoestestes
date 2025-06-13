package model.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Reservation {
		
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	
	public Reservation( ) {}


	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public LocalDate getCheckin() {
		return checkIn;
	}


	public LocalDate getCheckout() {
		return checkOut;
	}
   
	public long diffDays() {
		return ChronoUnit.DAYS.between(checkIn, checkOut);
	}
	
	
	
}
