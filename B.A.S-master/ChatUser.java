

import java.util.Random; 
        

public class ChatUser extends User {
    private int id;
  
   public ChatUser(String name, String email,int phoneNumber, Seat seat,TicketType ticket,String password, String username){
     super(name, email, phoneNumber, seat, ticket, username, password); 
  }
  public int generateID(){
    int rant_int;
    
    Random rand = new Random();
    
    int rand_int = rand.nextInt(5000);
    System.out.println("Your ID is "+ rand_int);
    return rand_int;
  }
 }
