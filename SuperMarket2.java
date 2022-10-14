class SuperMarket2
{ // non-static variables
//global - Default values:
int price, discount; 
String brand; 
static String name = "Raja SuperMarket2";
// Constructor: 
// 1. This area is called automatically when Object is created. 
//[Constructor will be invoked automatically when class in instantiated] // Instantiation - Instance Creation -
// 2. Constructor has same name of our class name 
// 3. Constructor will not have any return data type. 
    //4. What is Constructor
//Constructor is useful for initializing global non-static variables. [object specific values]
SuperMarket2(String brand, int price, int discount)
{                  //s          a           b
this.brand = brand; //brand = s; 
this.price = price; // price = a; 
this.discount = discount;// discount = b; 
}
SuperMarket2(String brand, int price) // parameterized constructor
{   
//System.out.println("para constructor");                //s          a           b
this.brand = brand; //brand = s; 
this.price = price; // price = a; 
}
SuperMarket2() // Zero-args or no-args constructor
{
System.out.println("Take a sip for free"); 
}
public static void main(String[] args)
{
SuperMarket2 brush = new SuperMarket2("Pepsodent", 30, 5); 
SuperMarket2 soap = new SuperMarket2("Lux", 25, 2);
SuperMarket2 rice = new SuperMarket2("Ponni", 50);
SuperMarket2 boost = new SuperMarket2(); 
brush.purchase(); 
soap.purchase();
rice.purchase(); 
}
void purchase()
{
System.out.println("Customer is buying product "+ brand + " for Rs. "+ price + " with discount "+ discount); 
}

}
