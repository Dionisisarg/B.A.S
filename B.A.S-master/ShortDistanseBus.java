import java.lang.Math;
import java.util.Scanner;

public class ShortDistanseBus extends Bus
{
    //constructor
    public ShortDistanseBus(int id, String name, int numSeats,Seat[] busSeats,double[] location, int speed)
    { super(id,name,numSeats,busSeats,location, speed); }

	public int calcArivalTime()
	{
		private stops = new BusStop[Line.getBusStops().length]
		stops = Line.getBusStops()
		System.out.println("Επέλεξε τον αριθμό αριστερά από την στάση για την οποία θές να δεις το χρόνο άφηξης")
		for (int i = 0; i <= stops.length; i++) {
			System.out.println((i + 1) + stops[i].busStopName);
		}
		Scanner console = new Scanner(System.in);
		int index = console.nextInt();
		
		return Math.floor(Math.sqrt(Math.pow(location[1] - stops[index].location[1], 2) + Math.pow(location[2] - stops[index].location[2], 2))/speed);
	}

	public void display()
	{
		/*Εμφανίζει τις οθόνες GUI πιθανός μέσω κάποιας διασύνδεσης της JAVA με την html*/
	}
}
