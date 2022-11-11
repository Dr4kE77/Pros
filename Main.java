class divide
{
static boolean isDivisible(long n)
{
	while (n / 100 != 0)
	{
		long d = n % 10;

		n /= 10;
		n += d * 7;
	}

	return (n % 23== 0);
}
public static void main(String[] args)
{
	long n = 230;
	if(isDivisible(n))
		System.out.println("Yes");
	else
		System.out.println("No");
}
}

