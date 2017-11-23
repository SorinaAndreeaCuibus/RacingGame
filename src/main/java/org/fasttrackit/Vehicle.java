package org.fasttrackit;


public class Vehicle {


   private String name;
   private String colour;

    public double accelerate (double speed) {

        System.out.println(speed);

        return(10.1);
    }

//
//    Engine engine2= new Engine();
//    engine2.manufacturer"Honda"



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

