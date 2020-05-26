package java_20200520.step5;

public class StopMilliWatch extends StopWatch{

	// 밀리세컨드를 관리하기 위한 변수
	private long startTime;
	private long endTime;

	// 밀리세컨드의 경과시간
	private double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000;
	}

	// 밀리세컨드의 시작 시간
	private void start() {
		startTime = System.currentTimeMillis();
	}

	// 밀리세컨드의 종료 시간
	private void stop() {
		endTime = System.currentTimeMillis();
	}

	public void execute() {
		start();
		
		for (long i = 0; i < 2_000_000_000l; i++) {

		}
		stop();

		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}

}
