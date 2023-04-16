package pack04;

public abstract class MediaPlayer
{
	public abstract void play();
	public abstract void pause();
	public abstract void stop();
	
	public void display()
	{
		System.out.println("Display() of MediaPlayer class");
	}

}
