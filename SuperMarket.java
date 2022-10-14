class SuperMarket
{ // non-static variables
//global - Default values:
int price, discount; 
String brand; 
static String name = "Raja SuperMarket";
// Constructor: 
// 1. This area is called automatically when Object is created. 
//[Constructor will be invoked automatically when class in instantiated] // Instantiation - Instance Creation -
// 2. Constructor has same name of our class name 
// 3. Constructor will not have any return data type. 
    //4. What is Constructor
//Constructor is useful for initializing global non-static variables. [object specific values]
SuperMarket(String brand, int price, int discount)
{                  //s          a           b
// this is a keyword which is useful for indicating current object of same class.
// global non-static variable 
this.brand = brand; //brand = s; 
this.price = price; // price = a; 
this.discount = discount;// discount = b; 
}

public static void main(String[] args)
{
SuperMarket brush = new SuperMarket("Pepsodent", 30, 5); 
SuperMarket soap = new SuperMarket("Lux", 25, 2);
brush.purchase(); 
soap.purchase();
}
void purchase()
{
System.out.println("Customer is buying product "+ brand + " for Rs. "+ price + " with discount "+ discount); 
}

}
