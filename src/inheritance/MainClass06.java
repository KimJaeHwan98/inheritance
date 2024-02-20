package inheritance;
//나한테 없으면 부모껄로 찾아간다
//나한테도 존재하고 부모한테도 존재한다 라고하면 super를 사용한다.
// this. 자기자신 syper. 부모클래스 실행.
class Test06 {
	public void test() {
		System.out.println("부모 test 메소드");
	}
}
class TestClass06 extends Test06 {
	public void test() {
		System.out.println("자식 test 메소드");
	}

	public void display() {
		this.test();
		super.test();
	}
}
public class MainClass06 {
public static void main(String[] args) {
	TestClass06 tc = new TestClass06();
	tc.display();
	
}
}
