package tamilnadu.chennai; 
//javac -d . Office.java
public class HeadOffice
{
String name = "The Chennai Silks";
public int salary = 25000; 

public HeadOffice() //package level access
{
System.out.println("Office Offer Letter");
}

public void work()
{
int abc = 123; //local 
//local variable global variable
// static - non-static
System.out.println("Working - 9 - 9 PM"); 
}

public void pay_salary()
{
System.out.println("Payment"); 
}

}
