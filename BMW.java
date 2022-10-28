class BMW extends Car
{
public static void main(String[] args)
{
//Dynamic Binding
Car inspector = new BMW(); 
inspector.accelerate(); 
inspector.applyBrakes();
//inspector.maintain_quality(); 

//BMW bmw = new BMW(); 
//bmw.accelerate(); 
//bmw.applyBrakes(); 
//bmw.fixairbags(); 
//bmw.maintain_quality(); 
}
void maintain_quality()
{
System.out.println("Super Quality Car");
}

final void accelerate(){
System.out.println("High Speed"); 
}
void applyBrakes(){
System.out.println("Stopping"); 
}

}
