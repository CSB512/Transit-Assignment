import java.util.ArrayList;

public class TransitSystem {

    //attributes
    private String name;
    private ArrayList<Bus> buses;
    private int numBuses;

    //methods
    //constructor
    public TransitSystem(String name) {
        this.name = name;
    }

    //creates a Bus object and adds it to the collection
    public boolean addBus(String model, int numPassengers){
        Bus newBus = new Bus(model, numPassengers);
        buses.add(newBus);
        return true;
    }

    //creates a BusStop object and adds it to the Bus with the same ID
    public boolean addBusStop(String address, int busID){
        BusStop newBusStop = new BusStop();
    }

    //finds and returns a Bus by searching a given ID
    public Bus getBus(int busID){

            
        }
    }

    //lists all the buses in the system
    public String listBuses(){
        for(Bus bus:buses)
            System.out.println(bus);
        return null;
    }

    //lists all the bus stops in the system
    public String listBusStops(){
        for(BusStop stops:busStops)
            System.out.println(stops);
        return null;
    }

    //lists all the bus stops of a selected bus
    public String listBusStopsByBus(int busID){

    }

    //lists all the bus stops on a street
    public String listBusStopsByStreet(String address){

    }

}
