import java.io.*;
import java.util.*; 

public class LongDistanceRoute
{
    private int id;
    private String time;
    private String date;
    //πίνακας με τις διαθέσιμες ώρες που μπορεί να πραγματοποιήσει ο χρήστης την υπεραστική διαδρομή του
    private String[] availableTime;
    private Destination destination;
    public enum TypeOfDir { FROM, TO }
    private TypeOfDir direction;
    public LongDistanceRoute(int id,String date,String time,Destination dest,TypeOfDir dir)
    {
        this.id = id;
	this.time =  time;
	this.date =  date;
	this.destination = dest;
	this.direction = dir;
    }

    public boolean checkDestinationData ()
    { 
	//Έλεγχος αν τα στοιχεία του προορισμού έχουν συμπληρωθεί
        if (this.date.isEmpty() || this.destination == null ||  this.direction == null )
         { System.out.println(" You must insert all data of your longDistance route to continue!");
                 return false;}
        else {
         //τσεκάρει τα στοιχεία της υπεραστικής διαδρομής και αρχικοποιεί τον πίνακα availableTime
          return true; }

     }
    public boolean checkHour ()
    {   
        boolean answer = false;
        //έλεγχος αν έχει επιλέχθει κάποια από τις διαθέσιμες ώρες
        for(int i = 0; i < availableTime.length ; i++)
        {  if( availableTime[i].equals(this.time) )
           { answer = true;} 
        }
        
        if (answer == false )
               { System.out.println(" You must choose one of available time!");
                 return false;}
               else {return true; }
	}

}
