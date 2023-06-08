// 2. 다음과 같은 상속 구조도가 있을 때 이를 코드로 작성하시오.
//    (클래스의 내용은 작성하지 않음).
//    - B 클래스는 A 클래스를 상속한다.
//    - C 클래스는 B 클래스를 상속한다.
//    - D 클래스는 B 클래스를 상속한다.

package ch10_클래스상속과다형성.probs.prob02;

class A extends Object {
    A(){
        super();
    }

}


class B extends A{

}
class C extends  B{

}
class D extends B{

}

