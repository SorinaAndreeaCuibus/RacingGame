package org.fasttrackit;

public class Car extends AutoVehicle {

   private int doorCount;

    public Car(Engine engine) {

        super(engine);
    }

    public Car(Engine engine, int doorCount) {
        super(engine);
        this.doorCount = doorCount;
    }
}
