abstract class Car
{
Car()
{
//System.out.println("Car Constructor "); 
}
public static void main(String[] args)
{
//Car is abstract; cannot be instantiated
//Car car = new Car(); 
//car.accelerate(); 
}
abstract void accelerate(); 

abstract void applyBrakes();

final void fixairbags()
{
System.out.println("Air bags"); 
}
}
