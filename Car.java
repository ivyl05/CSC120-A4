import java.util.ArrayList;

/**
 * This class respresents the car part of the train
 * It manages the onboard passengers and the capacity of the car.
 * 
 * @author Ivy Li
 * @version 2 October 2024
 */
public class Car {

    /** An Arraylist that stores the passengers currently on the car */
    private ArrayList < Passenger > passengerOnboard;

    /** The maximum capacity for the car */
    private int maxCapacity;

    /**
     * This is a constructor. It initialize the appropriate size for the ArrayList according to the maximum capacity it takes in. 
     * 
     * @param maxCapacity
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengerOnboard = new ArrayList < Passenger > (maxCapacity);
    }

    /**
     * This is an accessor that gets the value of the maximum capacity. 
     * 
     * @return the maximum capacity of the car
     */
    public int getCapacity() {
        return this.maxCapacity;
    }

    /**
     * This is an accessor that gets the number of seats remaining in the car. 
     * 
     * @return the number of seats remaining
     */
    public int seatsRemaining() {
        return this.maxCapacity - this.passengerOnboard.size();
    }

    /**
     * This method adds a passenger to the car if the car have seats remaining. 
     * 
     * @param p the passenger to be added to the car
     * @return true if there is seats for the passenger and the passenger is being add to the car successfully, else returns false
     */
    public boolean addPassenger(Passenger p) {
        if (this.passengerOnboard.size() < this.maxCapacity) {
            this.passengerOnboard.add(p);
            return true;
        } else {
            System.out.println("Reached maximum Capacity");
            return false;
        }

    }

    /**
     * This method removes a passenger from the car if the person exist in the car 
     * 
     * @param p the passenger being removed
     * @return true if passenger is being removed successfully, else returns false
     */
    public boolean removePassenger(Passenger p) {
        if (this.passengerOnboard.size() > 0 && this.passengerOnboard.contains(p)) {
            this.passengerOnboard.remove(p);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Print the passengers current on board. 
     * If there is no passengers, print that the car is empty.
     */
    public void printManifest() {
        if (this.passengerOnboard.size() == 0) {
            System.out.println("This car is EMPTY");
        } else {
            for (int i = 0; i < this.passengerOnboard.size(); i++) {
                System.out.println(this.passengerOnboard.get(i));
            }
        }
    }
}