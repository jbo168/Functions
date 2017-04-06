public class Functions
{
	public static void main(String []args)
	{
		int power1 = iterativeWhile(10,10);
		System.out.println(power1);
		
		int power2 = recursivePow(3,3);
		System.out.println(power2);

		int power3 = iterativeFor(3,3);
		System.out.println(power3);
	}

	public static int iterativeWhile(int num,int pow)
	{
		int ctr1 = 0;
		int result = 1;

		while(ctr1 < pow)
		{
			result = result*num;
			ctr1++;
		}

		return result;
	}

	public static int recursivePow(int num, int pow)
	{
		if(pow == 0)
			return 1;
		else
			return num*recursivePow(num,pow-1);
	}

	public static int iterativeFor(int num, int pow)
	{
		int result = 1;

		for(int i=0; i<pow; i++)
		{
			result = result*num;
		}

		return result;
	}
}