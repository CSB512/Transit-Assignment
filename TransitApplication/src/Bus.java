import java.util.ArrayList;

public class Bus {

    //attributes
    private int busID = 1;
    private String model;
    private int numPassengers;
    private ArrayList<BusStop> busStops;
    private int numBusStops;

    //constructor
    public Bus(String model, int numPassengers) {
        this.model = model;
        this.numPassengers = numPassengers;
    }

    //create a bus stop and add it to the list of bus stops
    public boolean addBusStop(String address){
        busStops = new BusStop(, address);

    }

    //methods
    //finds and returns a bus stop and ID
    public BusStop getBusStop(int busStopID){

    }

    public String getAllBusStops(String streetName){

    }

    public String listBusStops(){
        System.out.print("\n" + "Bus Stop Number:     Street Name:");

    }

    @Override
    public String toString() {
        return "Bus{" +
                "busID=" + busID +
                ", model='" + model + '\'' +
                ", numPassengers=" + numPassengers +
                ", busStops=" + busStops +
                ", numBusStops=" + numBusStops +
                '}';
    }

    //accessors and mutators

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public ArrayList<BusStop> getBusStops() {
        return busStops;
    }

    public void setBusStops(BusStop[] busStops) {
        this.busStops = busStops;
    }

    public int getNumBusStops() {
        return numBusStops;
    }

    public void setNumBusStops(int numBusStops) {
        this.numBusStops = numBusStops;
    }
}
