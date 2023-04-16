package pack03;

public interface IMediaPlayer
{
	public abstract void play();
	public abstract void pause();
	public abstract void stop();
	
	public default void display()
	{
		System.out.println("Display() of MediaPlayer class");
	}
	
}
