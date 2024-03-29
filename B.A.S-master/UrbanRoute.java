import java.util.Scanner;
import java.io.*;
import java.util.*; 
public class UrbanRoute
{
  //attributes
  /* στον πίνακα point σε κάθε γραμμή αναγράφεται το γνωστό σημείο της πόλης και οι συντεταγμένες του
  (ενδεικτικά παρακάτω φαίνονται 2 σημεία της πόλης)*/
  private String[][] point = { {"hospital","38.242126","22.072720"} , {"city hall","38.250093","22.087763"} };
  public enum type { BusStop,point }
  private type start;
  private type end;
  private Line line;
  private int maxTotalTime;
  private String day;
  private String timeZone;
  public enum TypeOfDir{ OUTWARD,RETURN}
  private TypeOfDir direction;
  private int walkingMeters;
  private String[] days = {"Monday","Thuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
  private String[] timezones = {"07:00-09:00","09:00-11:00","11:00-13:00","13:00-15:00",
  "15:00-17:00","17:00-19:00","19:00-21:00","21:00-23-00","23:00-00:00"};
    
  //constructor
  public UrbanRoute(type start,type end,Line line,String day,String time,TypeOfDir dir)
    { 
    this.start = start;
    this.end = end;
    this.line = line;
    this.day = day;
    this.timeZone = time;
    this.direction = dir;
     }
  
  public boolean checkRoute()
  { 
    //αν η τοποθεσία της αφετηρίας βρίσκεται πριν την τοποθεσία του τερματισμού
    if(this.start.location[0] < this.end.location[0] && this.start.location[1] < this.end.location[1])
    { System.out.println ("Correct Route");
      System.out.println(days);
      System.out.println(timezones);
      return 1;
    }
    //αν βρίσκεται μετά την τοποθεσία του τερματισμού
    else
    { System.out.println ("Incorrect Route. Choose again start-end!"); 
     return 0;
    }
   }
  public int calcDuration()
  {
    int duration = 0;
    /*Υπολογισμός της απόστασης μεταξύ της αφετηρίας και του τερματισμού και απόδοση
    μιας αρχικής τιμής στο duration */
    /* αν η ώρα της διαδρομής κυμαίνεται από τις 1 εως τις 5 το απόγευμα τότε η διάρκεια
    της αυξάνεται κατα 7 λεπτά */
    if (this.timeZone = "13:00-15:00" || this.timeZone = "15:00-17:00") 
     { duration = duration + 7;}
    /* αν η μέρα της διαδρομής είναι καθημερινή τότε η διάρκεια της αυξάνεται 
    κατά 3 λεπτά */
    if (this.day = "Monday" ||  this.day = "Tuesday" || this.day = "Wednesday" ||
      this.day = "Thursday" ||  this.day = "Friday")
      { duration = duration + 3; }
      
    return duration;
   }
  public Boolean checkIfExist()
    { /*Το σύστημα ελέγχει για μια συγκεκριμένη διαδρομή αν υπάρχει δρομολόγιο της γραμμής 
        (προς τη συγκεκριμένη κατεύθυνση της διαδρομής) που να εκτελείτε την ημέρα και ώρα που επέλεξε ο χρήστης*/
      boolean[][] routes;
      int numDay;
      int time;
      //αποδίδεται ενας int αριθμός στην ημέρα που επέλεξε ο χρήστης να κάνει την διαδρομή του
      switch (this.day)
      {
          case "Monday" : numDay = 0; break;
          case "Tuesday" : numDay = 1; break;
          case "Wednesday" : numDay = 2; break;
          case "Thursday" : numDay = 3; break;
          case "Friday" : numDay = 4; break;
          case "Saturday" : numDay = 5; break;
          case "Sunday" : numDay = 6; break;
       }
      //αποδίδεται ενας int αριθμός στην χρονική ζώνη που επέλεξε ο χρήστης να κάνει την διαδρομή του
      switch (this.timeZone)
      {
          case "07:00-09:00" :  time = 0; break;
          case "09:00-11:00" : time = 1; break;
          case "11:00-13:00" : time = 2; break;
          case "13:00-15:00" : time = 3; break;
          case "15:00-17:00": time = 4; break;
          case "17:00-19:00": time = 5; break;
          case "19:00-21:00": time = 6; break;
          case "21:00-23:00": time = 7; break;
          case "23:00-00:00": time = 8; break;
        }
      if( this.direction == "OUTWARD")
      { routes = this.line.outwardRoutes; }
       else 
      { routes = this.line.returnRoutes; }
      // ελέγχει αν την ημέρα και ώρα που επέλεξε ο χρήστης υπάρχει δρομολόγιο 
      if (routes[day][time] == true ) { return true; }
      else { return false;}
    }
  public void insertTimeandMeters()
  { 
    Scanner obj = new Scanner (System.in);
    System.out.println("Enter maxTotalTime for your route:");  
    this.maxTotalTime = obj.nextInt();
    System.out.println("Enter max number of meters, you want to walk:");  
    this.walkingMeters = obj.nextInt();
   }
  public boolean trailFeasibility()
  { //υπολογίζει χρόνο(time) και μέτρα περπατήματος(meters) που χρειάζονται για να διανυθεί η απόσταση της διαδρομής
    // αν ο χρονος και τα μέτρα έχουν τιμές μικρότερες από αυτές που εισήγαγε ο χρήστης 
    if (time < this.maxTotalTime && meters < this.walkingMeters)
    { return 1;}
    else { return 0;}
    
    }
  public void bestRoute()
   { //εύρεση βέλτιστης διαδρομής με βάση το maxTotalTime,walkingMeters και την συνολικη διαδρομή του χρήστη
    }
  public void display()
  { //εμφανίζει τις gui οθόνες με κάποια διασύνδεση της java με html
   }
}
