/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author user
 */
public class Automobile extends Vehicle implements Drivable {
    public Automobile(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
    numWheels = 4;
}
}
