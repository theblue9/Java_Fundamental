package java_20200520.step3;

public class StopWatchDemo {
	
	
	public static void main(String[] args) {
		
		StopNanoWatch s1 = new StopNanoWatch();
		// StopMilliWatch s1 = new StopMilliWatch();
		s1.start();
		
		for(long i = 0; i<2000_000_000l; i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
