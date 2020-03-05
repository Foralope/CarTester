/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author wizwa9381
 */
public class Car {
    //Private global variables
    private int carAge, yearMade;
    private double price;
    private String brand,modelType;
    
    public Car(int age, int made, double cost, String type, String model){
        carAge = age;
        yearMade = made;
        price = cost;
        brand = type;
        modelType = model;
    }
    
    public String toString() {
        String output1 = "Car age (in years): "+carAge+"\n";
        output1 += "Year it was made: "+yearMade+"\n";
        output1 += "Car cost (in dollars): "+price+"\n";
        output1 += "Car brand: "+brand+"\n";
        output1 += "Car model: "+modelType+"\n";
        return output1;
    }
}
