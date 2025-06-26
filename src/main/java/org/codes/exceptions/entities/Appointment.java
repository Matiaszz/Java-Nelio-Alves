package org.codes.exceptions.entities;


import org.codes.exceptions.exceptions.FutureDateException;

import java.util.Date;

public class Appointment {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    public void print(){
        System.out.printf("Room number: %d\nCheckIn date: %s\nCheckOutDate: %s",
                this.roomNumber, this.checkIn.toString(), this.checkOut.toString());
    }

    public Appointment(int roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int duration(){
        long diffInMillis = checkOut.getTime() - checkIn.getTime();
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        return (int) diffInDays;

    }

    public void updateDates(Date in, Date out){
        if (in.before(this.checkIn)){
            throw new FutureDateException("new check in date must be after than the older checkIn date.");
        }
        if (in.after(out)){
            throw new FutureDateException("new check in date must be before than new check out date.");
        }

        this.checkIn = in;
        this.checkOut = out;

    }



    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
}
