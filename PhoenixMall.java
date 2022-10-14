class PhoenixMall
{ // Global Variables - Fields: 
// We are declaring instance variables only once. But, many copies of these instance variables will be present inside memory. 
// How many copies of memory:
// How many Objects we have, those many copies will be created. 
//In case, if we did not assign any value to global variables, their corresponding default values will be considered by JDK. 
// int --> 0, String --> null, boolean --> false
// byte, short, int, long --> 0
// float, double --> 0.0
// boolean --> false
// char --> ''
// String --> null
static String address = "12, Vivekanandar Street, Dubai"; 
static int openingTime = 9; 
static boolean ac = true; 
//for static values, only one memory copy will be maintained. 
String movieName; //null 
int movieTime; // 0
boolean movieHit; // false
public static void main(String[] args)
{
PhoenixMall screen1 = new PhoenixMall();
screen1.movieName = "Ponniyin Selvan";  
screen1.movieTime = 10; 
screen1.movieHit = true; 
PhoenixMall screen2 = new PhoenixMall();
screen2.movieName = "Nane Varuven"; 
screen2.movieTime = 1030;  
screen2.movieHit = false; 
PhoenixMall screen3 = new PhoenixMall();
screen3.movieName = "Kantara"; 
screen3.movieTime = 11; 
screen3.movieHit = true; 
 
PhoenixMall screen4 = new PhoenixMall();
System.out.println("Movie Name: " + screen1.movieName + " Movie Time -> "+ screen1.movieTime + " Hit: -> "+ screen1.movieHit);
//System.out.println(movieTime); 
//error: non-static variable movieTime cannot be referenced from a static context

System.out.println(screen1.movieName); 
System.out.println(screen2.movieName); 
System.out.println(screen3.movieName); 
System.out.println(screen4.movieName); 
System.out.println(screen1.movieTime); 
System.out.println(screen2.movieTime); 
System.out.println(screen3.movieTime); 
System.out.println(screen4.movieTime); 
System.out.println(screen1.movieHit); 
System.out.println(screen2.movieHit); 
System.out.println(screen3.movieHit); 
System.out.println(screen4.movieHit); 
System.out.println(PhoenixMall.address); 
System.out.println(address);
}

}
