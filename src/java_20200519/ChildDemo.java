package java_20200519;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.money = 1_000_000_000;
		p.makeMoney();
		p.play("baduk");
		
		Child c = new Child();
		c.money = 1_000_000_000;
		c.setParentMoney(1_000_000);
		c.chicken = "교촌통닭";
		c.gotoSchool();
		c.makeMoney();
		c.play("omok");
		
		System.out.println(c.money);
		System.out.println(c.getParentMoney());
		System.out.println(c.chicken);
	}

}
