public class FizzBuzz
{
	public static void main(String[] args)
	{
		for (int x=1;x<=100;x++)
		{
			if (x % 3 == 0 && x % 5 == 0)
			{
				System.out.println("FizzBuzz");
			}
			
			if (x % 3 == 0)
			{
				System.out.println("Fizz");
			}
			
			if (x % 5 == 0)
			{
				System.out.println("Buzz");
			}
			
			else
			{
				System.out.println(x);
			}  
		}
	}
}
