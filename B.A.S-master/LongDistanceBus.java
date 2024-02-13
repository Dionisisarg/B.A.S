public class LongDistanceBus extends Bus
{
	//attributes
	public enum Type{ MiniBus,DoubledeckerBus, Seats_20_50, Seats_50_62 }
	private Type busType;
	private int id;

	public int getId(){
		return id;
	}
    
	//constructor
	public LongDistanceBus(int id, String name, int numSeats, Seat[] busSeats,
	double[] location, int speed, Type type)
	{  
		super(id,name,numSeats,busSeats,location,speed);
		this.busType = type;
	}
   
	public String getBusData()
	{
		String freeSeats = "";
		for (int i = 0; i <= busSeats.length; i++) {
			if (busSeats.isAvailable())
			{
				freeSeats += busSeats[i].getSeatId();	
			}
		}
	
		return "O κωδικός λεωφορείου είναι: " + getId() + "και οι ελεύθερες θέσεις: " + freeSeats;
	}
	
	public Boolean checkSeat(Seat seat)
	{
		if (seat.isAvailable())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display()
	{
		/*Εμφανίζει τις οθόνες GUI πιθανός μέσω κάποιας διασύνδεσης της JAVA με την html*/
	}

}
