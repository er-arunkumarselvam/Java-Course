class Calculator2
{
public static void main(String[] args)
{
Calculator2 calc = new Calculator2();

calc.add(20,30);//Arguments Passing
calc.add(50,30);
calc.add(10,30,50);
calc.add(5.5f, 6.5f);
}
void add(int number1,int number2)//Parameter Passing
{
System.out.println(number1+number2);
}
void add(int number1,int number2,int number3)
{
System.out.println(number1+number2+number3);
}
void add(float number1,float number2)
{
System.out.println(number1+number2);
}
}
