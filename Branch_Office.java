package tamilnadu.erode; 
import tamilnadu.chennai.HeadOffice; 

public class Branch_Office extends HeadOffice
{
public int salary = 20000; 
public Branch_Office()
{
System.out.println("Branch Office Constructor");
}
public static void main(String[] args)
{

Branch_Office manager = new Branch_Office(); 

System.out.println(manager.salary); 
manager.work(); 

}

public void work()
{
int abc = 123; //local 
//local variable global variable
// static - non-static
System.out.println("Working - 10 - 10 PM"); 
}


}
