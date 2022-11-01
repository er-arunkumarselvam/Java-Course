class WhileLooping
{
public static void main(String[] args)
{

WhileLooping wl =new WhileLooping();
wl.calculateAmount(0);
//wl.calculateSecurity(1024);
//wl.calculateDosai(8);

}
//Scenario#1
void calculateAmount(int amount)
{
int day=1;
while(day<=10)
{
amount =amount+day;
System.out.println("Day "+ day+" , Daughthe earn "+amount);
day=day+1;

}
System.out.println("Total Amount is " + amount);

}
//Scenaio#2
void calculateSecurity(int beats)
{
int security =0;
while(beats>1)
{
beats=beats/2;
security=security+1;
System.out.println("Total No. of Beats "+ beats +". The security is number is  " + security);
}
System.out.println("Last 1 beat take Tenali Raman.");
System.out.println("Total No. of Securities " + security);
}
//Scenario#3
void calculateDosai(int dosai)
{
int count=3;
while(count >=1)
{

dosai=dosai+dosai/2;
count=count-1;
System.out.println("No. of Times Count is "+count+" . Total No. of Dosai is " + dosai);
}
System.out.println("Total No. of Dosai made " + dosai);
}
}
