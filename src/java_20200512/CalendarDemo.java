package java_20200512;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기 1. 1년 1월 1일 월요일 2. 1년은 365일이고, 윤년일때는 366일(2월29일) 3. 윤년은 4년마다 발생하고, 그중에
		 * 100의 배수는 제외하고, 400배수는 제외하지 않는다. 4. 2020년 5월 12일은 무슨요일 일까? 5. 2019년까지 총일수 +
		 * 4월까지 총일수 + 12 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일,.....
		 * 
		 * 1년 364.24,,,,,
		 * 
		 * (2019*365 + ((2019/4 - 2019/100 + 2019/400)) + 31 + 29 +31 +30 + 12) % 7
		 * 
		 */

		int year = 2020;
		int month = 5;
		int day = 12;
		int totalCount = 0;
		int rest = 0;
		
		// 2019 총 일수
		int preYear = year - 1;

		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);
		// 2019년 1월 ~ 4월까지 총일 수
		totalCount += 31 + 29 + 31 + 30;
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
