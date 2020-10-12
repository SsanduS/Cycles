class N3
{
	public static void main(String[] args)
	{
		int b = 6;
		double a = 1, h=0.5 ;
		while(a < b)
		{
			System.out.println("x= "+a+"\t\tF(x)= "+Math.cos(a)/Math.sin(a));
			a+=h;
		}
	}
}