package edu.utsa.cs3443.cvd945_lab3;

public class Car extends Drivable{
    private String carMake;
    private String carModel;
    private int carYear;
    private String carColor;
    private double carPrice;

    public Car(String carMake, String carModel,
                 int carYear, String carColor, double carPrice) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }
}
