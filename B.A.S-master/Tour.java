import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File


public class Tour {
	private int id;
	
	private enum typeTour{abroad,inbroad};//
	private typeTour type;
	
	private int passangerscapacity;
	private int participants=0;
	private String startDate;
	private String backDate;
	private String title;
	private String descritpion;
	private String coordinator;
	
	private String acctickettypes;
	
	private String names;
	private String ticketsType;
	
	public Tour(int id, typeTour type, int passangerscapacity,int participants, String startDate, String backDate, String title,
			String descritpion, String coordinator) {
		this.id = id;
		this.type = type;
		this.passangerscapacity = passangerscapacity;
		this.participants = participants;
		this.startDate = startDate;
		this.backDate = backDate;
		this.title = title;
		this.descritpion = descritpion;
		this.coordinator = coordinator;
	}
	
	public void display() { //stoixeia edropmhs
		System.out.println(id + " " + type + " " + passangerscapacity + " " + startDate + " " + backDate + " " + title + " " + descritpion + " " + coordinator );
	}
	
	public boolean checkTourData() {
			if (id<0 || id > 999) {return false;}
			boolean pro = checkSeats(passangerscapacity,participants);
			return pro;
			
	}
	
	public boolean checkSeats() 
	{   if (participants >passangercapacity) 
	       {return false;}
	    else  {return true;}
	}
	public boolean checkNamesandTypes(){
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter name/names.");
	    String names = scan.nextLine();
	    //if names.matches() a regex pattern for name else return false
	    System.out.println("Enter type/types of tickets.");
	    String ticketsType = scan.nextLine();
	    //if tickets are ticket types we want acctickettypes
		return true;
		
	}
	
	public void addNewPost(){
		createPoat();	
	}
	
	public void createPost(){
		
		public objs = new Tour[100];
		protected static int i = 0;
		System.out.println("Δώσε τα τον τύπο, τον αριθμό των συμετεχόντων, ημερομηνία εναρξης και ολοκλήρωσης, τον τίτλο, μια περιγταφή και τον διοργανωτή.");
		Scanner in = new Scanner(System.in);
		String type = in.readLine();
		int passangerscapacity = in.nextInt();
		String startDate = in.readLine();
		String backDate = in.readLine();
		String title = in.readLine();
		String descritpion = in.readLine();
		String coordinator = in.readLine();
		
		objs[i] = new Tour(i,type,passangerscapacity,0,startDate,backDate,title,description,coordinator);
	}
	
	public void showExistsPosts{
		for (int i = 0: 1 < 100; i++){
			System.out.println(objs[i].title);	
		}
	}
	
	public boolean checkFileSize(){
		
		long length = 0;
    		File[] files = folder.listFiles();
 
    		for (int i = 0; i < files.length; i++) {
        		if (files[i].isFile()) {
            			length += files[i].length();
        		}
        		else {
            			length += getFolderSize(files[i]);
        		}
    		}
		if (length/1024*1024 > 100){
			return false;
		}
		else{
			return true;
		}
	}
}
