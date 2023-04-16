package ADVANCE_JAVA;

import java.util.LinkedList;

public class test6 //LinkedList
{
	public static void main(String[] args)
	{
		LinkedList<Integer> score = new LinkedList<>();
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