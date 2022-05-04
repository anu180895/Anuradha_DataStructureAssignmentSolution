package com.greatlearning.floorconstruction;
import java.util.*;

public class FloorConstruction
{
	public static void main(String args[])
	{
		System.out.println("WELCOME TO SKYSCRAPER ");
		System.out.println("Enter the total no of floors in the building : ");		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Integer[] notes = new Integer[size];
		Integer[] sortArray = new Integer[size];		
		int i;
		
		for ( i = 0; i < size; i++) 
		{
			System.out.println("Enter the floor size given on day : "+ (i+1));			
			notes[i] = sc.nextInt();
			
		}
		
		for ( i = 0; i < size; i++) 
		{
			sortArray[i]=notes[i];
		}
		Arrays.sort(sortArray, Collections.reverseOrder());
		
		int j,day=0,flag=1;
		for ( i = 0; i < size; i++) 
		{
			for ( j = 0; j < size; j++) 
			{
				if (j>day || flag ==1)
					System.out.println("Day : "+ (j+1));
								
				if(sortArray[i] == notes[j])
				{
					flag=0;
					if(day<j)
						day = j;
									
					System.out.println(sortArray[i]);
					break;
				}
			}			
		}
	}		
}
