package ch10_클래스상속과다형성;
class A {
    void pirnt(){
        System.out.println("a");
    }
}
class B extends A {
    void pirnt(){
        System.out.println("b");
    }
}
class  C extends  B{
    int c;
    void pirnt(){
        System.out.println("c");
    }
}
public class D{
    public static void main(String[] args) {
//        A [] abc = new A[3];
//        abc[0] = new C();
//        abc[1] = new B();
//        abc[2] = new A();
//
//        for(int i = 0; i<abc.length;i++){
//            abc[i].pirnt();
//        }
//        if (abc instanceof A){
//
//
//        }
        B b = new C();
        if (b instanceof C){
            C cc = (C)b;
            cc.c= 100;
        }
    }
}



