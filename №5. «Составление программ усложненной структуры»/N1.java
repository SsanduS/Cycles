class N1
{
public static void main (String[] args)
{
	int n = 55 , k = 9;
	if(n < 10)
	{
		n += k * 10;
	}
	else 
	{
		n += k * 100;
	}	
	n *= 10;
    n += k;
	System.out.println(n);
}
}