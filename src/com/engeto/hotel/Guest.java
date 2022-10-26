package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {

   private String forename, surname;
   private LocalDate dateOfBirth;

   ///region Pristupove metody (gettery a settery)

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    ///endregion


    public Guest(String forename, String surname, LocalDate dateOfBirth) {
        this.forename = forename;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    String getDescription;

    public String getGetDescription() {
        return getDescription;
    }

    public void setGetDescription(String getDescription) {
        this.getDescription = getDescription;
    }
}
