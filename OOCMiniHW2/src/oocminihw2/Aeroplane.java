/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author user
 */
public class Aeroplane extends Vehicle implements Flyable{
  public Aeroplane(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
    numWings = 2;
}
  private float altitude;
  @Override
    public void changeAltitude(float change) {
        altitude += change;
    }

    @Override
    public float getAltitude() {
        return altitude;
    }
}
