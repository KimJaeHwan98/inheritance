package inheritance;
//실행 순서는 부모클래스 다음 자식클래스
class Test07 {
	public Test07() {
		System.out.println("부모 생성자 실행");
	}
}
class TestClass07 extends Test07 {
	public TestClass07() {
		System.out.println("자식 생성자 실행");
	}
}
public class MainClass07 {
public static void main(String[] args) {
	TestClass07 tc = new TestClass07();
	
}
}
// 자식클래스 올라가서 부모클래스가 존재하면 부모클래스 호출 후 자식클래스 호출.