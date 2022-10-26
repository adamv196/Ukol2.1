package com.engeto.hotel;

import java.time.LocalDate;

public class Booking {

    int guestsOnRoom;
    LocalDate arrival;
    LocalDate departure;
    boolean typeOfVacation;

    public int getGuestsOnRoom() {
        return guestsOnRoom;
    }

    public void setGuestsOnRoom(int guestsOnRoom) {
        this.guestsOnRoom = guestsOnRoom;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }

    public boolean isTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(boolean typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public Booking(int guestsOnRoom, LocalDate arrival, LocalDate departure, boolean typeOfVacation) {
        this.guestsOnRoom = guestsOnRoom;
        this.arrival = arrival;
        this.departure = departure;
        this.typeOfVacation = typeOfVacation;
    }
}
