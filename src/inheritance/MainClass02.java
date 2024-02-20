	package inheritance;

import java.util.ArrayList;

// 상속 받을 자료 받아오는 코드 extends 어레이 리스트가 부모가 된다.
//테스트 코드를 상속받으면 테스트코드2기능 플러스 어레이리스트 기능을 사용가능하다.
//  익스텐즈로 상속을 받는다 부모클레스에 받아오면 마음대로 그 기능을 사용가능하다.
	class TestClass02 extends ArrayList<String>{ 
	public void test() {
		System.out.println("test 메소드 실행");
	}
	}
	
	public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 tc = new TestClass02();
		tc.test();
		tc.add("aaaa");
		System.out.println(tc.get(0));
	}
	}
