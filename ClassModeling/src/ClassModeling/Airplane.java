package ClassModeling;

public class Airplane {
    private String destination;
    private boolean isAvailable;
    private String airplaneType;
    private int[] Seats;

    public Airplane() {
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public int[] getSeats() {
        return Seats;
    }

    public void setSeats(int[] seats) {
        Seats = seats;
    }
}
