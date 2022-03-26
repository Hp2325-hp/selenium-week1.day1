package week1.day1.assignments;

public class FibonacciSeries {


	public static void main(String[] args) {

		int range=8, firstNum=0,secNum=1,sum=0;
		System.out.print(firstNum+","+secNum+",");
		for (int i=3;i<=range;i++)
		{
			sum=firstNum+secNum;
			firstNum=secNum;  //1 1
			secNum=sum;	//1 2
			if(i==range)
				System.out.print(sum);
			else
				System.out.print(sum+",");
		}
		

	}
	
}
