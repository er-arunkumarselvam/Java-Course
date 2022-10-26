class Sony
{
int price; 
Sony()
{
System.out.println("Sony Products"); 
}
Sony(int price)
{
this.price = price; 
}
//Sony products = new Sony(tv2);
Sony(Sony so)
{
this.price = so.price; 
}

}
