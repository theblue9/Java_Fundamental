package java_20200525;

public class ThrowsDemo {
	public static int getDivide(int first, int second) 
			throws ArithmeticException {		//ArithmeticException사용할 경우 getDivide 메소드를 예외 처리 해도되고 안해도 된다.

		int result = first / second; // 예외가 발생하는 코드
		
		return result;
	}

	public static void main(String[] args) {
		try {
			int first = Integer.parseInt(args[0]);	// 예외가 발생하는 코드
			int second = Integer.parseInt(args[1]); // 예외가 발생하는 코드

			int result = getDivide(first, second);
			System.out.printf("결과 : %d%n", result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("인자를 2개 입력하셔야 합니다.");
		} catch (NumberFormatException e) {
			System.err.println("인자에는 숫자를 넣어야 합니다");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} finally {
			System.out.println("finally");
		}
	}
}
