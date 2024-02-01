

abstract class Bus
{
    //attributes
    protected int bus_id;
    protected String driverName;
    protected int numOfSeats;
    protected Seat[] busSeats= new Seat[numOfSeats];
    protected double[] location= new double[2];
    protected int speed;
    
    Seat myseat = new Seat();
    
    //constructor
    public Bus(int id, String name, int numSeats, Seat[] busSeats, double[] location, int speed)
    { 
     this.bus_id = id;
     this.driverName = name;
     this.numOfSeats = numSeats;
     this.busSeats = busSeats;
     this.location = location;
     this.speed = speed;
    }

   
}
