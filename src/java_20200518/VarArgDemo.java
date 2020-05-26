package java_20200518;

public class VarArgDemo {
	
	public void print(int... a) {  // variavle arguments
								   // a 변수는 배열로 처리함.
		int length =a.length;
		
		for(int value : a) {
			System.out.printf("%d",value);
		}
		System.out.println(); //개행 (내려쓰기)
	}
	
	public static void main(String[] args) {
		VarArgDemo v1 = new VarArgDemo();
		v1.print(1);
		v1.print(10,20);
		v1.print(100,200,300);
		v1.print(1000,2000,3000,4000);
	}

}
