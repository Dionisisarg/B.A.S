import javax.swing.*;
import java.io.*;
import java.util.*; 

public class Line

{
    private int num;
    private BusStop[] outwardstops=new BusStop[];
    private BusStop[] returnstops=new BusStop[];
    public enum TypeOfDir{ OUTWARD,RETURN}
    private TypeOfDir direction;
    //πίνακας δρομολογίων που έχει 7 γραμμές(αντιστοιχούν σε κάθε ημέρα της εβδομάδας) και 9 στήλες(αντιστοιχούν στις χρονικές ζώνες)
    private boolean[][] outwardRoutes = new String[7][9];
    private boolean[][] returnRoutes = new String[7][9];
    private TicketCounter[] tickCounters;

    public Line(int num,BusStop[] outwardstops,BusStop[] returnstops,boolean[][] outwardRoutes,

    boolean[][] returnRoutes,TicketCounter[] tickCounters )
    {

       this.num = num;
       this.outwardstops = outwardstops;
       this.returnstops = returnstops;
       this.outwardRoutes = outwardRoutes;
       this.returnRoutes = returnRoutes;
       this.tickCounters = tickCounters;

	}
    public boolean[][] getRoutes(TypeOfDir dir)
	{   
	 boolean[][] routes;
	 /*Το σύστημα ελέγχει τα στοιχεία της γραμμής προς τη συγκεκριμένη κατεύθηνση και
	 εμφανίζει στον χρήστη τις ημέρες και ώρες αναχώρησης προς αυτή την κατεύθυνση*/
	   if( dir == "OUTWARD")
              { routes = this.outwardRoutes; 
                return routes; }
              else 
               { routes = this.returnRoutes; 
                 return routes; }
		
	}
    public BusStop[] getBusStops(TypeOfDir dir)

	{   BusStop[] stops;
	    //Το σύστημα ανακτά τις στάσεις της γραμμής προς την συγκεκριμένη κατεύθηνση
            if( dir == "OUTWARD")
              { stops = this.outwardstops; 
                return stops; }
              else 
               { stops = this.returnstops; 
                 return stops; }
	}
    public void getDirections()
     {  
         //Το σύστημα εμφανίζει στον χρήστη την επιλογή μεταξύ 2 κατευθύνσεων που υποστηρίζει αυτή η γραμμή.
         System.out.println(" You can go: ");
         JButton a = new JButton("outward of starting point");
         JButton a = new JButton("return to starting point");
	
     }
    
    public void display()
    { //εμφανίζει τις gui οθόνες με κάποια διασύνδεση της java με html
     }
	

	
}
