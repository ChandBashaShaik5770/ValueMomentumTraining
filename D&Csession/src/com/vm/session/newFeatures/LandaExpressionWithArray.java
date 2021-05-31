package com.vm.session.newFeatures;


interface SumOfArray
{
	int sumOfArray(int arr[]);
}

interface Smallest
{
	int smallest(int arr[]);
}




public class LandaExpressionWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfArray s=(arr)->
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
			}
			return sum;
		};
		int a[]= {7,3,1,4,5};
		System.out.println("Sum of array= "+s.sumOfArray(a));
		Smallest s1=(arr)->
		{
			int temp=0;
			for (int i=0;i<arr.length;i++)   
	        {  
	            for (int j=i+1;j<arr.length;j++)   
	            {  
	                if (a[i]>a[j])   
	                {  
	                    temp=a[i];  
	                    a[i]=a[j];  
	                    a[j]=temp;  
	                }  
	            }  
	        }  
	       return a[0];  
	}; 
	System.out.println("Samllese elemnt = "+s1.smallest(a));
		}
		
	}


