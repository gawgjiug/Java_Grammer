// 10.1 클래스 상속의 개념과 문법적 특징
// - 부모 클래스, 자식 클래스 = 수퍼 클래스, 서브 클래스
// - 부모 클래스의 멤버(필드+메소드) 자식 클래스에 상속됨, 그러나 생성자는 상속 불가
// - 장점
//   - 코드 재사용, 다형성 지원

package ch10_클래스상속과다형성.p307;

class Human {
	String name;
	int age;
	void eat() {}
	void sleep() {}
}
class Student extends Human {
	int studentID;
	void goToSchool() {}
}
class Worker extends Human {
	int workerID;
	void goToWork() {}
}
public class Inheritance {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();

		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID =128;
		s.eat();
		s.sleep();
		s.goToSchool();

		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goToWork();
	}
}
