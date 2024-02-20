package inheritance;
class Test09 {
	public Test09(String s) {
		System.out.println(s+": 부모 생성자");
	}
	public Test09() {//기본생성자
		System.out.println("부모  기본 생성자");
	}
}
class TestClass09 extends Test09 {
	public TestClass09() { // 기본생성자
		System.out.println("기본 기본생성자");
	}
	public TestClass09(String s) {
		super(s);
	System.out.println(s+": 자식 생성자");	
	}
	
}
public class MainClass09 {
public static void main(String[] args) {
	TestClass09 tc = new TestClass09("전달");
	TestClass09 tc2 = new TestClass09();
	
}
}
//기본 생성자를 만들어두면 오류가 줄어든다
// 슈퍼를 사용하게되면 기본생성자가 아닌 변수를 전달받는 부모 매소드로 실행된다.
//기본생성자를 만들지 않으면 super를 첫줄에 넣어줘야 에러가 발생하지 않는다.