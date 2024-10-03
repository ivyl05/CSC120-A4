/**
 * This class respresents the passenger part of the train.
 * It contains methods to board and get off a car.
 * 
 * @author Ivy Li
 * @version 2 October 2024
 */
public class Passenger {
    /** The name of the passenger */
    private String name;

    /**
     * This is a constructor that takes in passenger's name.
     * 
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * This method was written with the help of Chatgpt.
     * This method allows the passenger to board a car.
     * 
     * @param c the car that the passenger is planning to board.
     * @return true if the passenger can successfully boards the car; false otherwise.
     * @throws NullPointerException if the specified car is null.
     */
    public boolean boardCar (Car c) {
        if (c == null) {
            throw new NullPointerException("Cannot board a null car.");
        }
        boolean success = c.addPassenger(this); 
        if (!success) {
            System.out.println("Unable to board car: it is full.");
        }
        return success;
    }

    /**
     * This method was written with the help of Chatgpt.
     * This method allows the passenger to get off a car.
     * 
     * @param c the car that the passenger is getting off from.
     * @return true if the passenger can be removed successfully; false otherwise.
     * @throws NullPointerException if the specified car is null.
     */
    public boolean getOffCar(Car c) {
        if (c == null) {
            throw new NullPointerException("Cannot get off a null car.");
        }
        boolean success = c.removePassenger(this); 
        if (!success) {
            System.out.println("Unable to get off car: passenger not found.");
        }
        return success; 
    }
}
