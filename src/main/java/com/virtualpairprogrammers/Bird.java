package com.virtualpairprogrammers;

public abstract class Bird {

     String name;
     int strength;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getStrength() {
          return strength;
     }

     public void setStrength(int strength) {
          this.strength = strength;
     }

     public  abstract void attack();

     public String food(){

          return "food";
     }




}
