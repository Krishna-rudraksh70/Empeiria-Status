import java.util.Scanner;
import java.util.Arrays;

class Laptop{
	private int laptopId;
  	private String brand;
  	private String osType;
  	@SuppressWarnings("unused")
    private double price;
  	private int rating;
  
  	public Laptop(int laptopId, String brand, String osType, double price, int rating){
    	this.laptopId = laptopId;
      	this.brand = brand;
      	this.osType = osType;
      	this.price = price;
      	this.rating = rating;
    }
  
  	public int getLaptopId(){
    	return this.laptopId;
    }
  
  	public int getRating(){
    	return this.rating;
    }
  
  	public String getBrand(){
    	return this.brand;
    }
  
  	public String getOsType(){
    	return this.osType;
    }
}

class laptop{
	
	public static void main(String[] args){
    
      	Scanner sc = new Scanner(System.in);
      
      	Laptop[] arr = new Laptop[4];
      
      	for(int i=0; i<arr.length; i++){
        	int a = sc.nextInt(); sc.nextLine();
          	String b = sc.nextLine();
          	String c = sc.nextLine();
          	double d = sc.nextDouble(); sc.nextLine();
          	int e = sc.nextInt(); sc.nextLine();
          
          	arr[i] = new Laptop(a,b,c,d,e);
        }
      
      	String s1 = sc.nextLine();
      	int c = countOfLaptopByBrand(arr, s1);
      	if(c>0)
          	System.out.println(c);
      	else
          	System.out.println("The given brand is not available");
      
      	String s2 = sc.nextLine();
      	Laptop[] lap = searchLaptopByOsType(arr, s2);
      	if(lap == null)
          	System.out.println("The given os is not available");
      	else{
        	for(Laptop i: lap){
            	System.out.println(i.getLaptopId());
              	System.out.println(i.getRating());
            }
        }
      
      	sc.close();      
    }

	public static int countOfLaptopByBrand(Laptop[] arr, String s){
    	int count = 0;
      
      	for(Laptop i: arr){
        	if(i.getRating() > 3 && i.getBrand().equalsIgnoreCase(s))
              	count++;
        }
      
      	return count==0?0:count;
    }

	public static Laptop[] searchLaptopByOsType(Laptop[] arr, String s){
    	Laptop[] l = new Laptop[0];
      
      	for(Laptop i: arr){
        	if(i.getOsType().equalsIgnoreCase(s)){
            	l = Arrays.copyOf(l, l.length+1);
              	l[l.length-1] =  i;
            }
        }
      
      	Arrays.sort(l, (d1, d2) -> (d2.getLaptopId() - d1.getLaptopId()));
      
      	return l.length==0?null:l;
    }
}