
package java_20200519;
/**
   Calendar 클래스는 엄청난 클래스이다.
  */
public class Calendar {
	
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };    //월별 일수 배열정리. private로 감춘다.
	
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	
	
	public Calendar() {
	}

	
	private int getCount(int year, int month, int day) {
		int totalCount = 0;

		int preYear = year - 1;
		
		// 2019 총 일수
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);
		
		// monthArray 배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면 monthArray의 두번쨰 방의 값을 29로 변경해야 한다
		// 4의 배수는 윤년이고,100의 배수는 윤년이 아니고, 400배수는 윤년이 아니라는 것의 코드
		boolean isLeafYear = isLeafYear(year);
		if (isLeafYear) {
			monthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i]; // 월까지 더한다음
		}

		// 2019년 1월 ~ 4월까지 총일 수
		// totalCount += 31 + 29 + 31 + 30;
		// 2019년 5월 12일의 12일 까지 총일 수
		totalCount += day;

		return totalCount;
	}

	
	private boolean isLeafYear(int year) {
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 && year % 400 != 0;
		return isLeafYear;
	}
	
	//마지막 날짜 구하기
	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// monthArray배열에tj
		// 4의 배수는 윤년이고,100의 배수는 윤년이 아니고, 400배수는 윤년이 아니라는 것의 코드
		boolean isLeafYear = isLeafYear(year);
		
		if (isLeafYear) {
			monthArray[1] = 29;
		}
		return monthArray[month - 1];

	}
	/**
	 * 요일을 출력해주는 메서드 입니다. 
	 * @param year
	 * @param month
	 * @param day
	 */

	//날짜 달력 만들기.
	public void print(int year, int month, int day) {
		int totalCount = getCount(year, month, day);
		int dayOfWeek = totalCount % 7;
		String message = null;
		if (dayOfWeek == Calendar.MONDAY) {
			message = "월요일";
		} else if (dayOfWeek == Calendar.TUESDAY) {
			message = "화요일";
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfWeek == Calendar.THURSDAY) {
			message = "목요일";
		} else if (dayOfWeek == Calendar.FRIDAY) {
			message = "금요일";
		} else if (dayOfWeek == Calendar.SATURDAY) {
			message = "토요일";
		} else if (dayOfWeek == Calendar.SUNDAY) {
			message = "일요일";
		} 
		
		System.out.println(year + "년" + month + "월" + day + "일은 " + message + "입니다.");
	}

	/**
	 * 월을 출력해주는 메서드 입니다.
	 * @param year
	 * @param month
	 */
	//월 달력 만들기.
	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		// 2020년 5월 1일 날짜를 구해서 일요일부터 1일 이전 날짜 까지 빈공백 처리
		int totalCount = getCount(year, month, 1);

		int rest = totalCount % 7; // 나머지 값

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= getLastDay(year, month); i++) {
			System.out.print(i + "\t");
			rest++;
			if (rest % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

	}

	/**
	 * 년을 출력해주는 메서드 입니다.
	 * @param year
	 */
	//연 달력 만들기.
	public void print(int year) {
		for (int i = 1; i <= 12; i++) {
			print(year, i);
		}
	}

}
