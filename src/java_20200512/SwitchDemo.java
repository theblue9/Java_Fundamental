 package java_20200512;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;
		// month => 수식(char, byte, short, int, String)
		switch(month) {
		// case 평가값 => 반드시 유의 해야 한다.
		// case 절에 break가 없으면 아래의 case로 이동한다.
		// 맨앞줄에 놓고싶으면 default : season = "없는계절";break;를 붙이면 된다.
		case 12 : 
		case 1 : 
		case 2 : season = "겨울"; break;
		case 3 :
		case 4 : 
		case 5 : season = "봄"; break;
		case 6 : 
		case 7 : 
		case 8 : season = "여름"; break;
		case 9 : 
		case 10 :
		case 11 : season = "가을"; break;
		// default의 위치는 어디있든 상관없음.
		//마지막 문장에 있으면 break문을 사용하지 않지만 다른곳에 있을경우에는
		// break문을 사용해야 한다. (필수는 아니지만 예상 못한 결과가 발생할 수 있음)
		default : season = "없는계절";				// 맨앞줄에 놓고싶으면 default : season = "없는계절";break;를 붙이면 된다.
		}
		
		System.out.println(month + "월은 " + season + "입니다.");
	}

}
