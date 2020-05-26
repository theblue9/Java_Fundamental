package java_20200522;

import java.util.HashSet;	// ctr + shift + O(영문자)
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// ctr + shift + O(영문자)
		// HashSet은 객체의 중복을 허용하지 않고, 순서없음.
		
		
		// 1.선언 및 생성
		HashSet<Integer> set = new HashSet<Integer>();	//
		
		// 2 . 할당
		set.add(1);		//primitive를 자동으로 전환해주는 auto-boxing
		set.add(2);		
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(8);
		set.add(9);
		set.add(4);
		
	
		// System.out.println(set.size()); //5개가 들어가 있지 않다는 것.(4개출력)
		// 3. 출력
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);
		}
		
		HashSet<Customer> set1 = new HashSet<Customer>();
		set1.add(new Customer("성영한1"));
		set1.add(new Customer("성영한2"));
		set1.add(new Customer("성영한3"));
		set1.add(new Customer("성영한4"));

		System.out.println("size : " + set1.size());
		
		//로또복권 - HashSet
		//TreeSet - 객체의 중복을 허용하지 않는다, 오름차순 정렬해준다.
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random() *45) +1;
			lotto.add(random);
			if(lotto.size() == 6) break;
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
	}

}
