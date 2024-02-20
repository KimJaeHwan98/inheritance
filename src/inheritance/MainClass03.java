//오버로딩
package inheritance;
//부모의 기능을 변경해서 사용한다.
//상속을 받으면 이런 오버라이딩이라는 기능을 사용 가능하다.
//다형성이다
//내일 다시..
import java.util.ArrayList;

class TestClass03 extends ArrayList<String> {

	
	@Override //새로운 기능을 넣어서 사용 가능하게 코드를 만들어준다.
	public String get(int index) {
		System.out.println("데이터를 가져오는 기능");
		return super.get(index);
	}

	@Override
	public boolean add(String e) {
		System.out.println("데이터를 추가했습니다!!");
		return super.add(e);
	}
	
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 tc = new TestClass03();
		tc.add("aaa");
		System.out.println(tc.get(0));
	}
}
