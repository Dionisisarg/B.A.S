public class LongDistanceBus extends Bus
{
	//attributes
	public enum Type{ MiniBus,DoubledeckerBus, 20-50Seats,50-62Seats }
	private Type busType;
    
	//constructor
	public LongDistanceBus(int id, String name, int numSeats, Seat[] busSeats,
	double[] location,Type type)
	{  
		super(id,name,numSeats,busSeats,location);
		this.busType = type;
	}
   
	public String getBusData()
	{
		String freeSeats = "";
		for (int i = 0; i <= Seats.length; i++) {
			if (Seat.availability == true)
			{
				freeSeats = freeSeats + Seats[i].id;	
			}
		}
	
		return "O κωδικός λεωφορείου είναι: " + id + "και οι ελεύθερες θέσεις: " + freeSeats;
	}
	
	public Boolean checkSeat(Seat seat)
	{
		if (seat.availability == true)
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