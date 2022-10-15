package tamilnadu.chennai; 
//javac -d . Office.java
public class Office
{
public int salary = 25000; 

public Office() //package level access
{
System.out.println("Office Offer Letter");
}

public void work()
{
int abc = 123; //local 
//local variable global variable
// static - non-static
System.out.println("Working"); 
}

public void pay_salary()
{
System.out.println("Payment"); 
}

}
