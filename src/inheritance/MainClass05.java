package inheritance;
class calc05 {
	public void display() {
		System.out.println("나는 계산기 입니다.");
	}
}//calc
class Computer05 extends calc05{
	public void print() {
		System.out.println("컴퓨터로 동작합니다");
		display();
	}
}// com 
public class MainClass05 {
public static void main(String[] args) {
	Computer05 com = new Computer05();
	com.print();
}
}// Computer05에 없는 기능을 extends에 있는 기능을 가져다가 사용한다.

//computer05로 객체를 생성했기에 computer05로 이동해서
//      print라는 기능을 찾아가고 만약 있으면 그것을 동작시키며
//      위의 print내에서 display를 발견 후 computer05내부에서 우선적으로
//      display가 있는 지 확인 후 없다면 extends된 부모 클래스에 display()가 있는 지 
//      확인한다.