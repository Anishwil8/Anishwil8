package javaInterview;

public class JavaBasicQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//	WAP to find prime number
		//	WAP to find Fibonacci series
		//	WAP to find given string is palindrome
		//	WAP to find given number is Armstrong 
		//	WAP to find factorial of given number
		//	WAP to find square root of numbers
		//	WAP to add two matrices 

		primeNo1(100);
		fibonacci(30);
		
	}
	
	public static void primeNo1(int a) {
		
		int pno=0;
		int i=0;
		int counter;
		
		for(pno=1;pno<=a;pno++)
		{
			counter = 0;
			
			for(i=pno;i>=1;i--)
			{
				if(pno%i==0)
				{
					counter = counter+1;
				}
			}
			if(counter==2)
			{
				System.out.println("No "+pno+ " is a Prime No");
			}
		}
	}	
	
	//Fibonacci Series 0 1 1 2 3 5 8 13 21 34
	public static void fibonacci(int count){
		int no1=0;
		int no2=1;
		int no3=0;
		
		System.out.println("Fibonacci Series:");
		System.out.println(no1);
		
		for(int i=0;i<=count;i++) {
				no1=no2;
				no2=no3;
				no3=no1+no2;
				System.out.println(no3);
			}
		System.out.println("Total "+count+" Fibonacci nos. are printed");
		}

	
	
	
	
	
}
