package week1.day1.assignments;

public class PrimeNumber {
	

	public static void main(String[] args) {


		int value=13;
		boolean flag=false;

		for (int i=2;i<=value/2;i++)
		{
			if (value%i==0)
				{flag=true;
				break;}
				
				
		}


		if(flag)
		{
			System.out.println(value+" is not a Prime Number");
		}
		else
		{
			System.out.println(value+" is a Prime Number");
		}

	

   }
}
