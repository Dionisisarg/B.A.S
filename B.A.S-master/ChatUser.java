

import java.util.Random; 
        

public class ChatUser extends User {
    private int id;
  
   public ChatUser(int id){
   this.id = id;
  }
  public int generateID(){
    int rant_int;
    
    Random rand = new Random();
    
    int rand_int = rand.nextInt(5000);
    System.out.println("Your ID is "+ rand_int);
    return rand_int;
  }
 }