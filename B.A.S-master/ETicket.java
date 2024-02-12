public class ETicket
{
    private int code;
    private Type typeTicket;
    // η τιμή του εισητηρίου για το συγκεκριμένο προορισμό (χωρίς την έκπτωση που πιθανόν να έχει)
    private int destinationPrice;
    private int seat; 
    private int discount;
    private boolean withReturn;
    private int busID;
    private String owner;
    

   public ETicket(int code, Type typeTicket, int seat, boolean withReturn,int busID,String owner,int destinationPrice )
    {          
	        this.destinationPrice = destinationPrice;
                this.code = code;
		this.typeTicket = typeTicket;
	        this.seat = seat;
		this.withreturn = withReturn;
		this.busID = busID;
	        this.owner = owner;
    }
   public int getDiscount(){
   
        switch (typeTicket) {
            case OLOKLIRO:
                discount = 0;
                System.out.println("Your discount is" + discount + "$");
                break;
                    
            case FOITITIKO:
                discount = destinationPrice * 50/100;
                System.out.println("Your discount is" + discount + "$");
                break;
                         
            case POLITEKNO:
                discount = destinationPrice * 20/100;
                System.out.println("Your discount is" + discount + "$");
                break;
                  }
        return discount;
   }
    public void calculatePrice() {
	
	int price = destinationPrice - discount;
	if (withReturn)
	{ 
		price = 2 * price;}
        System.out.println("The price of your ticket is:" + price);
   }
   public void display(){
      /*ΕΜΦΑΝΊΖΕΙ ΚΑΤΑΛΗΛΕΣ ΟΘΟΝΕΣ GUI*/
   }
   
}
enum Type {
	OLOKLIRO,
	FOITITIKO,
	POLITEKNO
}
