import java.util.Scanner;
import java.util.Arrays;

class Hotel{
	private int hotelId;
  	@SuppressWarnings("unused")
    private String hotelName;
  	private String dateOfBooking;
  	private int noOfRoomBooked;
  	private String wifiFacility;
  	private double totalBill;
  
  	public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomBooked, String wifiFacility, double totalBill){
    	this.hotelId = hotelId;
      	this.hotelName = hotelName;
      	this.dateOfBooking = dateOfBooking;
      	this.noOfRoomBooked = noOfRoomBooked;
      	this.wifiFacility = wifiFacility;
      	this.totalBill = totalBill;
    }
  
  	public String getWifiFacility(){
    	return this.wifiFacility;
    }
  
  	public double getTotalBill(){
    	return this.totalBill;
    }	
  
  	public int getNoOfRoomBooked(){
    	return this.noOfRoomBooked;
    }
  
  	public String getDateOfBooking(){
    	return this.dateOfBooking;
    }
  
  	public int getHotelId(){
    	return this.hotelId;
    }
}

class hotelRooms{

  	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	
      	Hotel[] h = new Hotel[4];
      	
      	for(int i=0; i<h.length; i++){
        	int a=sc.nextInt(); sc.nextLine();
          	String b=sc.nextLine();
          	String c=sc.nextLine();
          	int d=sc.nextInt(); sc.nextLine();
          	String e=sc.nextLine();
          	double f=sc.nextDouble(); sc.nextLine();
          
          	h[i] = new Hotel(a,b,c,d,e,f);
        }
      
      	String s1 = sc.nextLine();
      	int count = noOfRoomsBookedInGivenMonth(h, s1);
      	if(count>0)
          	System.out.println(count);
      	else
          	System.out.println("No rooms booked in the given month");
      
      	String s2 = sc.nextLine();
      	Hotel k = searchHotelByWifiOption(h, s2);
     	if(k == null){
        	System.out.println("No such option available");
        }
      	else{
        	System.out.println(k.getHotelId());
        }
      
      	sc.close();
    }

	public static int noOfRoomsBookedInGivenMonth(Hotel[] arr, String s){
    	int count = 0;
      
      	for(Hotel i: arr){
        	if(i.getDateOfBooking().substring(3, 6).equalsIgnoreCase(s)){
            	count += i.getNoOfRoomBooked();
            }       
        }
      
      return count==0?0:count;
    } 

	public static Hotel searchHotelByWifiOption(Hotel[] arr, String s){
    	Hotel[] h = new Hotel[0];
      
      	for(Hotel i: arr){
        	if(i.getWifiFacility().equalsIgnoreCase(s)){
            	h = Arrays.copyOf(h, h.length+1);
              	h[h.length-1] = i;
            }
        }
      
      	Arrays.sort(h, (d1, d2) -> Double.compare(d2.getTotalBill(), d1.getTotalBill()));
      
      	return h.length<2?null:h[1];
    }
}