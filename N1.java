class N1
{
	public static void main(String[] args)
	{
    int g, k, n=64; 
		for (g=0; g<=n; g++) 
		{
			for (k=0; k<=n/2; k++) 
			{
				if (2*g + 4*k == n) 
				{
					System.out.println ("Гуси ="+ g + " Кролики ="+ k );
				}
			}
		}

	}
}