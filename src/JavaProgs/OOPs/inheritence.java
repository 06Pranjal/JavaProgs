package JavaProgs.OOPs;

class animal {
    void bark1(){
        System.out.println("hello");
    }
    void bark2(){
        System.out.println("hey");
    }
}


class animal2 extends animal{
    void bark3(){
        System.out.println("hahaha");
    }
}

public class inheritence {
    public static void main(String[] args) {
        animal2 ob =new animal2();
        ob.bark1();
        ob.bark2();
        ob.bark3();
    }
}
