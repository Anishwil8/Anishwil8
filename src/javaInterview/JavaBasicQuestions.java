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
		palindrome("ABCDEDCBA");
		palindrome("madamimadam");
		palindrome("mal a y a lam");
		palindrome("1342846");
		palindromeNo(36876426);
		palindromeNo(123454321);
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

	
	
	public static void palindrome(String val) {
		
		 String str = val, reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }	
	}	
	
	public static void palindromeNo(int no) {
		
		
		 int num = no, reversed = 0;
		    
		    System.out.println("Original Number: " + num);

		    // run loop until num becomes 0
		    while(num != 0) {
		    
		      // get last digit from num
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      num /= 10;
		    }
		    
		 if(no==reversed) {
			 System.out.println("Palindrome >>>> Reversed no: "+reversed+" is a palindrome");
		 }
		 else
		 {
			 System.out.println("Palindrome >>>> Reversed no. "+reversed+" is not a palindrome");
		 }
		 
		 
		    num=no;
		    int dig=0;
		    int newNo=0;
		    while (num!=0) {
		    	dig=num%10;
		    	newNo= newNo *10 + dig;
		    	num=num/10;		    	
		    	}
		    
		    System.out.println("New reverser No: "+newNo+"");
	}	
	
	
}
