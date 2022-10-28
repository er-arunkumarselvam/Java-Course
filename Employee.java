class Employee implements OfferLetter
{
public static void main(String[] args)
{
Employee arun = new Employee(); 
arun.wear_formal_dress(); 
System.out.println(OfferLetter.salary); 
//System.out.println(Employee.salary); 
//OfferLetter.salary = 500000; 

}
public void work_40_hours(){ 
System.out.println("9-6 PM");   }

public void wear_formal_dress(){  
System.out.println("Shirts Pants");    } 

public void wear_casual_dress(){ 
System.out.println("T Shirt");   } 

public void apply_leave_10days(){   }

}
