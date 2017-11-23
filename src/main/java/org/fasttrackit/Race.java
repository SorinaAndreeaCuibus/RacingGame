package org.fasttrackit;

public class Race {

    private Track track;
    private Car firstCompetitor;
    private Car secondCompetitor;


    public void start () {
        Engine engine = new Engine();
        engine.setManufacturer("Volvo");

        firstCompetitor = createCompetitor( engine, "Volvo", "red", 40, 4, 8.5) ;

        System.out.println(firstCompetitor.toString());




        Engine secondengine = new Engine();
        secondengine.setManufacturer("Toyota");
        secondCompetitor = createCompetitor(secondengine, "Volvo", '"black"', 50,6, 10 );

        System.out.println(secondCompetitor);
    }


    // parameters contain car prefix just to demo they can have any name
    private Car createCompetitor(Engine carEngine, String carName, String carColor, double carMileage, int carDoorCount, double carFuelLevel) {
    Car competitor = new Car(carEngine);
    competitor.setName(carName);
    competitor.setColour(carColor);
    competitor.setFuelLevel(carFuelLevel);
    competitor.setMileage(carMileage);
    competitor.setDoorCount(carDoorCount);


    return competitor;

}





    public Track getTrack() {
        return track;
    }

    public Car getFirstCompetitor() {
        return firstCompetitor;
    }

    public Car getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public void setFirstCompetitor(Car firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public void setSecondCompetitor(Car secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
