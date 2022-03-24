package Week5Homework;


public class AsteriskLoggerHW implements LoggerHW {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String str = "\n***ERROR: " + error + "***";
		for (int i = 1; i < str.length(); i++) {
			System.out.print("*");
	}
		System.out.println(str);
		for (int i = 1; i < str.length(); i++) {
			System.out.print("*");
		}

	


	
}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
}
