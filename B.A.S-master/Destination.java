import java.awt.Desktop;
import java.net.URI;
import java.io.File; 
import java.util.Scanner;

public class Destination
{   
	//attributes
	private String name;
	private String weather;
	public enum Type { abroad,internal} 
	private Type destinType;
	private double[] coordinates = new double[2];
	//πίνακες που περιέχουν τα δρομολόγια από και προς κάθε προορισμό
	String[][] routesTOdestin;
	String[][] routesFROMdestin;
	public enum TypeOfDir { FROM, TO }
	private TypeOfDir direction;
	private String[] days = new String[];
    
	//constructor
	public Destination(String name, String weather,Type type,double[] coordinates,
	String[][] routesTOdestin, String[][] routesFROMdestin,TypeOfDir dir, String[] days)
	{ 
	this.name = name;
	this.weather = weather;
	this.destinType = type;
	this.coordinates = coordinates;
	this.routesTOdestin = routesTOdestin;
	this.routesFROMdestin = routesFROMdestin;
	this.direction = dir;
	this.days = days;
	}
	
	public String getDays()
	{
		String d = "";
		for (int i = 0; i <= days.length; i++)
		{
			d = d.concat(days[i]);
		}
		return "Οι μέρες για τον προορισμό" + name + "είναι: " + d;
	}
	
	public String getDesWeather()
	{
		/*Επιστρέφει μια σύντομη πρόγνωση καιρού εμφανίζοντας κατάλληλο εικονίδιο*/ 
	}
	
	public void getRoutes()
	{
		System.out.println(" Routes FROM " + name + " : \n" + routesFROMdestin);
		
		System.out.println ("Routes TO " + name + ": \n" + routesTOdestin);
	}
	
	public void goToMeteo()
	{
		String urlToOpen ="https://www.meteo.gr/";
		try{
		   Desktop.getDesktop().browse(URI.create(urlToOpen));}
		catch (Exception e){
		   e.printStackTrace();}
	}
	
	public double getCoordinates()
	{
		return coordinates;
	}
	
	public String getHotelNames()
	{
		/*Το σύστημα λαμβάνει τα ονόματα των ξενοδοχείων (από τη ΒΔ ξενοδοχείων) που πληρούν τα κριτήρια που έδωσε ο χρήστης και τα εμφανίζει*/
	}
	
	public void goToTrivago()
	{
		String urlToOpen ="https://www.trivago.gr/";
		try{
		   Desktop.getDesktop().browse(URI.create(urlToOpen));}
		catch (Exception e){
		   e.printStackTrace();}
	}
	
	public void display()
	{
		/*Εμφανίζει τις οθόνες GUI πιθανός μέσω κάποιας διασύνδεσης της JAVA με την html*/
	}
	
}
