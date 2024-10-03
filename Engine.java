/**
 * This class respresents the engine part of the train.
 * It manages the fuel type, current fuel level, and max fuel level of the train. 
 * It allows a train to refuel and use fuel. 
 * 
 * @author Ivy Li
 * @version 2 October 2024
 */
public class Engine {

    /** The type of fuel used by this engine. */
    private FuelType fuelType;

    /** The current amount of fuel in the engine. */
    private double currentFuel;

    /** The maximum fuel capacity of the engine. */
    private double maxFuel;

    /**
     * This is a contructor that sets the fuel type and initialize current fuel level to maximum fuel level.
     *
     * @param fuelType the type of fuel used by the engine.
     * @param maxFuel the maximum level of fuel the engine can hold.
     */
    public Engine(FuelType fuelType, double maxFuel) {
        this.fuelType = fuelType;
        this.currentFuel = maxFuel;
        this.maxFuel = maxFuel;
    }

    /**
     * This method refuel the engine to the maximum fuel level. 
     */
    public void refuel() {
        this.currentFuel = this.maxFuel;
    }

    /**
     * This method uses fuel. 
     * 
     * @param goFuel the amout of fuel to be used
     * @return true if there is sufficient fuel and the operation is successful; false if there is not enough fuel.
     */
    public boolean go(double goFuel) {
        if (this.currentFuel >= goFuel) {
            this.currentFuel -= goFuel;
            System.out.println("Remaining Fuel Level is: " + this.currentFuel + ".");
            return true;
        } else {
            System.out.println("Fuel level is too low!");
            return false;
        }
    }

    /**
     * An accessor to get the fuel type
     * 
     * @return the fuel type of the engine
     */
    public FuelType getFuelType() {
        return this.fuelType;
    }

    /**
     * An accesssor to get the current fuel level
     * 
     * @return the value of current fuel level
     */
    public double getcurrentFuel() {
        return this.currentFuel;
    }

    /**
     * An accessor to get the maximum fuel level
     * 
     * @return the value of the maximum fuel level
     */
    public double getmaxFuel() {
        return this.maxFuel;
    }

    /**
     * Main method for testing the Engine class
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go(10)) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}