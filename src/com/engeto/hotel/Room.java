package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {

   private int roomNumber;
   private int numberOfBeds;
   private boolean balcony;
   private boolean seeView;
   private BigDecimal price;

   public int getRoomNumber() {
      return roomNumber;
   }

   public void setRoomNumber(int roomNumber) {
      this.roomNumber = roomNumber;
   }

   public int getNumberOfBeds() {
      return numberOfBeds;
   }

   public void setNumberOfBeds(int numberOfBeds) {
      this.numberOfBeds = numberOfBeds;
   }

   public boolean isBalcony() {
      return balcony;
   }

   public void setBalcony(boolean balcony) {
      this.balcony = balcony;
   }

   public boolean isSeeView() {
      return seeView;
   }

   public void setSeeView(boolean seeView) {
      this.seeView = seeView;
   }

   public BigDecimal getPrice() {
      return price;
   }

   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   public Room(int roomNumber, int numberOfBeds, boolean balcony, boolean seeView, BigDecimal price) {
      this.roomNumber = roomNumber;
      this.numberOfBeds = numberOfBeds;
      this.balcony = balcony;
      this.seeView = seeView;
      this.price = price;
   }
}
