package java_20200519;

/*
public class Child extends Parent Object {
String chicken;
int money;
public void gotoSchool() {
	System.out.println("Child gotoSchool()");
}	다중상속이 불가능
*/ 
public class Child extends Parent {
	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}
	
	
	public void play(String starcraft) {
		super.play(starcraft);			//부모클래스에서 play하는법도 하는것
		System.out.println("child play()"); //자식 클래스에서 play하는법을 재정의 하는법.
	}
	
	public void setParentMoney(int money) {
		super.money = money;
	}
	public int getParentMoney() {
		return super.money;
	}
}
