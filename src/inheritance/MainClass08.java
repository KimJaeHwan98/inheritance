package inheritance;

class Test08 {
	public Test08(String s ) {
		System.out.println(s+"부모 생성자 실행!!");
	}
}
class TestClass08 extends Test08 {
	public TestClass08() {
		super("값 전달"); // 슈퍼는 부모니까 여기다 값을 전달한다.
		//슈퍼를 확인하고 슈퍼가 확인되면 부모클래스로 올라가서 부모클래스를 호출한다.
		//슈퍼는 생성자(자식클래스) 첫줄에 입력해줘야 인식을해서 부모클래스로 올라간다.
		System.out.println("자식 생성자 실행!!");
	}
}
public class MainClass08 {
TestClass08 tc = new TestClass08();
}
