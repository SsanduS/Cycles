class N4
{
public static void main(String[] args)
{
	int e = 5;
	int n = 1;
double a=1,y;
while(n<10)
{
	y = (Math.pow(-1,n)*n)/2;
	
	a++;
	n++;
	if(Math.abs(y)<e)
	{
		System.out.println("a = "+a+ " Результат = "+y);
	}
}
}
}