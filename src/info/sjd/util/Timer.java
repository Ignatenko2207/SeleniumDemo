package info.sjd.util;

public class Timer {

	public static void getPause(int seconds) {
		try {
			Thread.sleep(1000*seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
