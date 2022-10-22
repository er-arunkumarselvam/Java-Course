class CS_Theni extends ChennaiSilks
{
CS_Theni() {
System.out.println("10% Discount"); 
}
CS_Theni(int cc)
{
//this(); //this self
super(cc);
//super(); 
//new CS_Theni() Anonymous Object
//super - 
System.out.println("Credit Card Purchase");
}

public static void main(String[] args)
{
//CS_Theni saree = new CS_Theni(); 
CS_Theni jeans = new CS_Theni(1234); 
}

}
