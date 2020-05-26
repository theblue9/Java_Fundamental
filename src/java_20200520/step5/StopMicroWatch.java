package java_20200520.step5;

public class StopMicroWatch extends StopWatch {

	// 나노세컨드를 관리하기 위한 변수
	private long startTime;
	private long endTime;

	// 나노세컨드의 경과시간
	private double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000_000_000;
	}

	// 나노세컨드의 시작시간
	private void start() {
		startTime = System.nanoTime();
	}

	// 나노세컨드의 종료시간
	private void stop() {
		endTime = System.nanoTime();
	}

	public void execute() {
		start();
		for (long i = 0; i < 20000_000_000l; i++) {

		}
		stop();

		double elapsedTime = getElapsedTime();	//elapsed 흐르다
		System.out.printf("경과시간 : %.6f", elapsedTime);  //6의자리 수까지 표기

	}
}
