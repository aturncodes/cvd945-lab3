package edu.utsa.cs3443.cvd945_lab3;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowRoom {

    private ArrayList<Drivable> drivables = new ArrayList<Drivable>();

    public void loadCars(String filename){
        try {
            File myFile = new File(filename);
            Scanner myScanner = new Scanner(myFile);

            String data1 = null;
            String[] tokens = null;
            String newMake = null;
            String newModel = null;
            int newYear = 0;
            String newColor = null;
            double newPrice = 0;
            int j = 0;

            while (myScanner.hasNextLine()) {
                data1 = myScanner.nextLine();
                tokens = data1.split(",");
                newMake = null;
                newModel = null;
                newYear = 0;
                newColor = null;
                newPrice = 0;

                int i = 0;
                for (String t : tokens) {

                    if(i == 0 && j != 0) {
                        newMake = t;
                    }
                    else if(i == 1 && j != 0) {
                        newModel = t;
                    }
                    else if(i == 2 && j != 0) {
                        newYear = Integer.parseInt(t);
                    }
                    else if(i == 3 && j != 0) {
                        newColor = t;
                    }
                    else if(i == 4 && j != 0) {
                        newPrice = Double.parseDouble(t);
                        Car newCar = new Car(newMake, newModel, newYear, newColor, newPrice);
                        drivables.add(newCar);
                    }
                    i++;
                    j++;
                }

            }
            myScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public Drivable getCar(int index){
        return drivables.get(index);
    }
}
