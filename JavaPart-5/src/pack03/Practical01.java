package pack03;

public class Practical01
{

	public static void main(String[] args)
	{
		Outer outer = new Outer();
		
		Outer.Inner inner = outer.new Inner();
		
		inner.show();

	}

}
