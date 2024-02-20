package inheritance;
class Test10{
	protected int num = 1000;
}
class TestClass10 extends Test10 {
	public int num = 12345;
	public void test() {
		System.out.println("num :" + num);
		System.out.println("this.num :" + this.num);
		System.out.println("super.num :"+ super.num);
	}
}
public class MianClass10 {
public static void main(String[] args) {
	TestClass10 tc = new TestClass10();
	tc.test();
}
}
//자기 사진의 변수먼저 출력을 한다.
//부모가 가지고 있는 넘을 출력하려면 super사용
// private를 사용하면 super로 불러오지 못한다. 왜냐면 클래스가 아니기때문이다
//외부의 접근은 막겠지만 상속받은 자식클래스에는 허용하겠다 는 프로텍트를 사용.
//protected 외부의 접근은 막지만 상속받은 자식클래스에는 사용을 허용한다.