package week1.day1;



public class TwoWheeler {
	
	private static TwoWheeler tw;
	int noOfWheels =4;
	short noOfMirrors=2;
	long chasisNumber=2356235623562356l;
	boolean isPunctured=false;
	double runningKm= 1000000;
    String bikeName= "ducati";
	
	public void TWoWheelerdata(){
		
		System.out.println( noOfWheels );
		System.out.println( noOfMirrors);
		System.out.println(chasisNumber);
		System.out.println(isPunctured);
		System.out.println(  bikeName);
		System.out.println( runningKm);
		
		}

	
	public static void main(String[] args) {
		TwoWheeler .tw= new TwoWheeler();
		tw.TWoWheelerdata();
		
		

	}


		
	}
