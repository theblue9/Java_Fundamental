package java_20200514;

public class CalendarDemo {
	public static void main(String[] args) {

		// 배열을 이용한 캘린더 만들기
		// 1. 각각의 입력값 선언하기.
		int year = 2020;
		int month = 3;
		int day = 10;
		int totalCount = 0;
		int rest = 0;

		// 2019 총 일수
		int preYear = year - 1;

		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		//4의 배수는 윤년이고,100의 배수는 윤년이 아니고, 400배수는 윤년이 아니라는 것의 코드
		boolean isLeafYear = year%4==0 && year%100 !=0 && year%400 != 0;
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		
		//monthArray 배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면 monthArray의 두번쨰 방의 값을 29로 변경해야 한다
		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}

		// 2019년 1월 ~ 4월까지 총일 수
		// totalCount += 31 + 29 + 31 + 30;

		// 2019년 5월 12일의 12일 까지 총일 수
		totalCount += day;

		rest = totalCount % 7;
		String message = null;
		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else if (rest == 7) {
			message = "일요일";
		} else {
			message = "없는 요일";
		}
		
		
		System.out.println(year + "년" + month + "월" + day + "일은 " + message + "입니다.");
			
	}

}
