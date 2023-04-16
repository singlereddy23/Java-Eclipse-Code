package ADVANCE_JAVA;

import java.util.ArrayList;

public class test5 //ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> score = new ArrayList<>();
		score.add(10);
		score.add(20);
		score.add(30);
		score.add(40);
		System.out.println(score);
		score.remove(2);
		System.out.println(score);
		score.set(2, 50);
		System.out.println(score);
	}
}