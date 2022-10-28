class Employe implements OfferLetter
{
public static void main(String[] args)
{
OfferLetter manager = new Employe(); 
manager.work_40_hours(); 
manager.wear_formal_dress(); 
//manager.ride(); 

}
public void ride(){     }

public void play(){     }

public void work_40_hours(){ 
System.out.println("9-6 PM");   }

public void wear_formal_dress(){ 

System.out.println("Shirts Pants");    } 

public void wear_casual_dress(){ 
System.out.println("T Shirt");   } 

public void apply_leave_10days(){   }


}
