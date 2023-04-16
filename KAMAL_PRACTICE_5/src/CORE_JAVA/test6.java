package CORE_JAVA;

import java.util.Arrays;

public class test6	//ARRAYS
//Arrays are used to store multiple values in a single variable
//Instead of declaring separate variables for each value.
{
	public static void main(String[] args)
	{
		int[] scoree = {10,20,30,40};
		
		System.out.println(scoree[0] +" "+ scoree[1] +" "+ scoree[2] +" "+ scoree[3]);
		System.out.println("-----------");
		System.out.println(Arrays.toString(scoree));	//In array format

		System.out.println("-----------");
		
		int[] score = new int[4]; 
		score[0]=10; 
		score[1]=20; 
		score[2]=30; 
		score[3]=40;
		 
		for (int i = 0; i < score.length; i++)
		{
			System.out.println(score[i]);
		}
		
		System.out.println("-----------");
		
		int[][] mutidim = {{10,30,40,50},{11,33,44,55}};	//Multi Dimentional Array
		System.out.println(Arrays.deepToString(mutidim));
		
	}
}