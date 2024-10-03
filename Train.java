import java.util.ArrayList;

/**
 * This class combines all the other classes (Car, Engine, and Passenger) together to form a train. 
 * 
 * @author Ivy Li
 * @version 2 October 2024
 */
public class Train {

    /** The engine of the train. */
    private Engine engine;

    /** A list of cars of the train. */
    private ArrayList<Car> cars;

    /**
     * This is a contructor that set values to the engine and the car.
     * 
     * @param fuelType the type of fuel used by the engine.
     * @param fuelCapacity the maximum fuel level of the engine.
     * @param nCars the number of cars in the train.
     * @param passengerCapacity the maximum capacity of passengers on each car. 
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine =  new Engine (fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>(passengerCapacity);
    }

    /**
     * An accessor that gets the engine of the train
     * 
     * @return the engine
     */
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * An accessor to get a specific car.
     * 
     * @param i the index of the car.
     * @return the car at the specified index. 
     * @throws IndexOutOfBoundsException if the index is not in the range.
     */
    public Car getCar(int i) {
        if (i<1 || i > this.cars.size()){
            throw new IndexOutOfBoundsException("Car index" + i +" is out of range." 
            + "Valid range is 1 to" + this.cars.size() + ".");
        }
        return this.cars.get(i-1);
    }

    /**
     * An accessor to get the maximum capacity of all cars.
     * 
     * @return the maximum capacity of the cars. 
     */
    public int getMaxCapacity() {
        int maxx = 0;
        for (int i = 0; i < cars.size(); i++) {
            maxx = Math.max(maxx, this.cars.get(i).getCapacity());
        }
        return maxx;
    }

    /**
     * This method tells you the total number of seats remaining across all cars. 
     * 
     * @return the total number of available seats.
     */
    public int seatsRemaining() {
        int sum = 0;
        for (int i = 0; i < this.cars.size(); i++) {
            sum += this.cars.get(i).seatsRemaining();
        }
        return sum;
    }

    /**
     * This method prints out the passengers on each car of the train. 
     */
    public void printManifest() {
        for (int i = 0; i < this.cars.size(); i++) {
            this.cars.get(i).printManifest();
        }
    }
}
