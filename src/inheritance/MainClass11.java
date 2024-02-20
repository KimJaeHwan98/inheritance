package inheritance;
class A {
	public void a() {
		System.out.println("a 메소드 실행");
		
	}
}
class B extends A {
	public void b() {
		System.out.println("bbbb 메소드 실행");
		
	}
}
class C extends B {
	public void c() {
		System.out.println("cccc 메소드 실행");
		
	}
}
public class MainClass11 {
public static void main(String[] args) {
	C c = new C();
	c.c(); c.a(); c.b();
	
}
}

// 다중 상속은 불가능
//다른 클래스에서 상속받고 그 아래에 그 위에 클래스를 상속받으면 전부 상속받을 수 있다.
//이렇게 상속을 받으면 c에서 a,b를 전부 사용이 가능하다.











