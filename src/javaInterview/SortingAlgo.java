package javaInterview;

import java.util.Arrays;

public class SortingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int intUnsortedArr[] = {23,1,14,56,82,32,55,68,99,1};
		System.out.println("Unsoreted Array: "+Arrays.toString(intUnsortedArr));
	//	bubblesort(intUnsortedArr);
		insertionsort(intUnsortedArr);
	//	selectionSort(intUnsortedArr);
	}
	
	
	
	public static void bubblesort(int[] intArr)
		
		{
			int temp=0;
			
			System.out.println(intArr[1]);
			for (int i=0; i< intArr.length -1; i++)
			{
				for (int j=0; j<intArr.length-1-i;j++)
				{
					if(intArr[j]> intArr[j+1])
							{ temp=intArr[j+1];
							  intArr[j+1]=intArr[j];
							  intArr[j]=temp;
							  
							  System.out.println("No:"+intArr[i]+" is swapped with No:"+ intArr[j]);
								}
							}
				 System.out.println("Iteration No:"+i+" is over and last value on Array is "+ intArr[intArr.length-1]);
			}
			System.out.println(Arrays.toString(intArr));
		}
	
	
	
	
	public static void selectionSort(int[] intArr)
	
	{
		int temp=0;
		int intIndex = 0;
		
		System.out.println("********  Selection Sort begins    *******");

		for (int i=0; i< intArr.length-1; i++)
		{
			intIndex = i;
			for (int j=i+1; j<intArr.length;j++)
			  {
				if(intArr[j]< intArr[intIndex])
					
						{ 
						System.out.println("Value "+intArr[j]+" at index: "+j+" is smaller then value: "+intArr[intIndex]+" at index: "+intIndex+".");
						  intIndex =j;
						} 
					  
			  	}
		      temp=intArr[intIndex];
			  intArr[intIndex]=intArr[i];
			  intArr[i]=temp; 
			  System.out.println("Value at index "+i+" is "+intArr[i]+".");
			
				
			System.out.println("Sorted after interation No"+i+": "+Arrays.toString(intArr));
		}
		System.out.println(Arrays.toString(intArr));
	}

	
	public static void insertionsort(int[] intCards)
	{
		int arrCards[]=intCards, i=0,j=0,current;
		
		for (i=0; i<arrCards.length;i++)
		{
			j=i-1;
			current=arrCards[i];
			while(j>=0 && arrCards[j]>=current)
			{
				arrCards[j+1]=arrCards[j];
				j=j-1;
				System.out.println("Sorted after interation No"+i+": "+Arrays.toString(arrCards));
			}
			arrCards[j+1]=current;
		}
		
		
	}

}
