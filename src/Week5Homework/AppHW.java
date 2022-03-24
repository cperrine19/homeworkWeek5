package Week5Homework;

public class AppHW {

	public static void main(String[] args) {
		AsteriskLoggerHW aLog = new AsteriskLoggerHW();
		System.out.println("Asterisk Log");
		aLog.log("Hello");
		System.out.println("Asterisk Error: ");
		aLog.error("Hello");
		System.out.println();
		SpacedLoggerHW sLog = new SpacedLoggerHW();
		System.out.println("Spaced Log:");
		sLog.log("Goodbye");
		System.out.println("Spaced Error: ");
		sLog.error("Goodbye");

	}

}
