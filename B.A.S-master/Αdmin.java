import java.util.Scanner;      
import java.io.File;               
import java.io.FileNotFoundException; 

public class Admin extends User{
     private int id;
    
     
     public Admin(int id, String username, String password)
     {
         super(username,password);
         this.id = id;
    }
    public boolean checkData() throws FileNotFoundException {
        // ask the user for the search string
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your username and your password");
        String searchString=keyboard.next();
        boolean isEqualIgnoreCase = searchString.equalsIgnoreCase(searchString);
        // open the data file
        File file = new File("Admin.csv");
        // create a scanner from the file
        Scanner inputFile = new Scanner (file);
        // set up the scanner to use "," as the delimiter
        inputFile.useDelimiter("[\\r,]");
        // While there is another line to read.
        while(inputFile.hasNext())
        {
            
            String username = inputFile.next(); //Read username
            String password = inputFile.next(); //Read password
            //Check if user input is a match 
            if(searchString.equals(username))
            {
                System.out.println("Please enter your password");
            }
            else
            {
                System.out.println("Your username isn't Admin's username");
            }
            //εφόσον είναι σωστός και ο κωδικός του Admin, η μέθοδος επιστρέφει True
            //αν είναι λάθος, η μέθοδος επιστρέφει False.
         
        }

        inputFile.close();
    }
 
   
    public void checkChanges(){
    //γίνεται έλεγχος των αλλαγών που έχει κάνει ο Admin
   }
}
