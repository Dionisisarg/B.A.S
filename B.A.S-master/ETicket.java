public class ETicket
{
    private int code;
    private enum type { olokliro, foititiko, politekno};
    private type typeTicket;
    // η τιμή του εισητηρίου για το συγκεκριμένο προορισμό (χωρίς την έκπτωση που πιθανόν να έχει)
    private int destinationPrice;
    private int seat; 
    private int discount;
    private boolean withreturn;
    private int busID;
    private String owner;
    

   public ETicket(int code, type typeTicket, int seat,boolean withreturn,int busID,String owner,int price )
    {          
	        this.destinationPrice = price;
                this.code = code;
		this.typeTicket = typeTicket;
	        this.seat = seat;
		this.withreturn = withreturn;
		this.busID = busID;
	        this.owner = owner;
    }
   public int getDiscount(){
   
        switch (typeTicket) {
            case "olokliro":
                discount = 0;
                System.out.println("Your discount is" + discount + "$");
                break;
                    
            case "foititiko":
                discount = price * 50/100;
                System.out.println("Your discount is" + discount + "$");
                break;
                         
            case "politekno":
                discount = price * 20/100;
                System.out.println("Your discount is" + discount + "$");
                break;
                  }
        return discount;
   }
    public void calculatePrice() {
	
	int price = destinationPrice - discount;
	if (withreturn == true )
	{ price = 2 * price;}
        System.out.println("The price of your ticket is:" + price);
   }
   public void display(){
      /*ΕΜΦΑΝΊΖΕΙ ΚΑΤΑΛΗΛΕΣ ΟΘΟΝΕΣ GUI*/
   }
   
}
