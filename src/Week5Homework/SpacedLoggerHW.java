package Week5Homework;

public class SpacedLoggerHW implements LoggerHW {

	@Override
	public void log(String log) {
		StringBuilder spaceBuilder = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			spaceBuilder.append(log.charAt(i)).append(" ");
		} System.out.println(spaceBuilder);
			}


	@Override
	public void error(String error) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			builder.append(error.charAt(i)).append(" ");
		} System.out.println("ERROR: " + builder);
	
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
