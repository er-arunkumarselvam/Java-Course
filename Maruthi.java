class Maruthi extends Car
{

public static void main(String[] args)
{
Car inspector = new Maruthi();
Maruthi model = new Maruthi();
inspector.fixairbags();
model.servicePoint();
}
void servicePoint()
{
System.out.println("All over india service centers available");
}
void maintain_mileage()
{
System.out.println("Super Mileage Car");
}

void accelerate(){
System.out.println("Maruti High Speed"); 
}


void applyBrakes(){
System.out.println("Maruti Stopping"); 
}

}
