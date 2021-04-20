public class BusStop{

    //attributes
    private int busStopID;
    private Bus bus;
    private String address;

    public BusStop(Bus bus, String address) {
        this.bus = bus;
        this.address = address;
    }

    @Override
    public String toString() {
        return "BusStop{" +
                "busStopID=" + busStopID +
                ", bus=" + bus +
                ", address='" + address + '\'' +
                '}';
    }

    //accessors and mutators
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBusStopID() {
        return busStopID;
    }

    public void setBusStopID(int busStopID) {
        this.busStopID = busStopID;
    }
}
