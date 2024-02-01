import java.io.*;
import java.util.Scanner;
import java.util.*; 

public class User
{
   //attributes
   private String email;
   private String name;
   private int phoneNumber;
   private Seat userSeat;
   private type typeTicket;
   public enum type{ 50%ticket, 25%ticket, fullticket}
   private String password;
   private String username;
   private double[] userLocation= new double[2];
   //λίστες(ίδιου μεγέθους) των usernames και των αντίστοιχων passwords στο σύστημα
   ArrayList <String> usernames = new ArrayList<String>();
   ArrayList <String> passwords= new ArrayList<String>();
   
  //constructor
  public User(String name, String email,int phoneNumber, Seat seat,type ticket,String password, String username)
   {
      this.name = name;
      this.typeTicket = ticket;
      this.userSeat = seat;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.username = username;
      this.password = password;
     }

  public void login() 
  {
    /*μεταβλητή η οποία θα χρησιμοποιηθεί για να δείξει αν υπάρχει 
    αυτός ο χρήστης στο σύστημα ώστε να γίνει με επιτυχία το login*/
    boolean isExist = false;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your username");
    String inputUsername =scan.nextLine();
    System.out.println("Enter your password");
    String inputPassword = scan.nextLine();
    for(int i=0; i < usernames.size(); i++)
    { if(inputUsername.equals(usernames.get(i)) && iputPassword.equals(passwords.get(i))) 
        { isExist = true;
          System.out.println("Success Login!"); 
          break;
        }      
    }
    if (isExist == false ) 
    { System.out.println("Invalid username or password. Try again!"); }
  }
  public void register()
  {  
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Enter your username");
    String inputname =scan2.nextLine();
    //εισαγωγή του username στην αντίστοιχη λίστα του συστήματος
    usernames.add(inputname);
    System.out.println("Enter your password");
    String inputpass = scan2.nextLine();
    //εισαγωγή του password στην αντίστοιχη λίστα του συστήματος
    passwords.add(inputpass);
   }
  //οι παράμετροι της μεθόδου παρακάτω αντιστοιχούν στα πεδία που συμπλήρωσε ο χρήστης κατά το login/register του
  public boolean checkData(String username, String password, String email)
   {
      //έλεγχος στοιχείων login/register του χρήστη
      //αν συμπλήρωσε όλα τα στοιχεία, η μέθοδος θα επιστρέψει True
      //αν παρέλειψε να συμπληρώσει κάτι, η μέθοδος θα επιστρέψει False
      if(username.isEmpty() || password.isEmpty() || email.isEmpty())
        { System.out.println("You must fill all fields to continue!");
         return false; }
      else
        { return true; }
    }
  /*οι παράμετροι της μεθόδου παρακάτω αντιστοιχούν στα πεδία κατά τη συμπλήρωση 
  των στοιχείων του χρήστη για τον υπολογισμο της τιμής εισητηρίου*/
  public boolean checkName_Type(String name,type typeTicket)
   {

     if(name.isEmpty() || typeTicket.isEmpty())
       { System.out.println("You must enter your name and type of your ticket to continue!");
         return false;}
     else {return true; }
	
     }

  public boolean isActive(){

       //ελέγχεται αν το GPS είναι ενεργό στο κινητό του χρήστη

       //αν είναι ενεργό, η μέθοδος θα επιστρέψει True

       //αν δεν είναι ενεργό, η μέθοδος θα επιστρέψει False

   }
  public double[] getGPSdata()
  {
    //λαμβάνονται τα δεδομένα τοποθεσίας του χρήστη ώστε να χρησιμοποιηθούν από το σύστημα
  }
  public void display()
  {
      /*ΕΜΦΑΝΊΖΕΙ ΚΑΤΑΛΗΛΕΣ ΟΘΟΝΕΣ GUI*/
   }

}