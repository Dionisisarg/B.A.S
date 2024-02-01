
public class BusStop {
	private int bus_id;
	//bus location
	private String blocation;
	//user location
	private String ulocation;

	private String[] nearestPointsOfint= new String[20];
	private int  lines[] = new int[20];
	private String busStopName;
	
	private int position=-1;
	
	private int busstop_id;
	private int busstopsids[] = new int[20];//pinakas gia ola ta bus stops bazo 20 gia eykolia oi staseis tha einai gnostes me ta id tous mesa 
											// ston pinaka pou mporei n ginei k vector h lista g eykolia
	public boolean isCodeValid(int bus_id){
		for (int i = 0; i < 20; i++) {
			  if (busstopsids[i] == bus_id) {
				  return true;
				  }
			}
		return false;
	}
	public void display() {
		System.out.println(getData());
	}
	public String getData() {
		position = aSearchAndDestroy(bus_id);//briskei thn thesh tou pinaka pou yparxnooyn oi grammes kai ta kontina shmeia endiaferontos gia to sygkekrimeno bus_stop 
		return (bus_id + " " + busStopName + " " + blocation + " " + lines[position] + " " + nearestPointsOfint[position]);
	}
	
	public BusStop nearBusStop(String ulocation) { 
		// briskei me vasi thn topothesia toy xrhsth poies stasis vriskontai konta se ayton kai tis epistrefei
	}
	public int aSearchAndDestroy(int bus_id) {
		for (int i = 0; i < 20; i++) {
			  if (busstopsids[i] == bus_id) {
				  position = i;
				  }
			}
		return position;
	}
}
