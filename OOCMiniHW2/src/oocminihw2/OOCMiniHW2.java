/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aeroplane airplane = new Aeroplane(520, "Airbus", "Aircraft", 180);
        Ship ship = new Ship(10, "Ship", "Cargo Ship", 2);
        Automobile car = new Automobile(80, "Toyota ", "Mark X", 6);

        ship.hoistSail();
        ship.landHo();

        airplane.changeAltitude(44000);
        System.out.println("Current Altitude: " + airplane.getAltitude());

        car.accelerate(26);
        System.out.println("Current Speed: " + car.getSpeed());
    }
        
    }
    

