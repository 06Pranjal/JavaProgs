package JavaProgs.SelfProgs.Multithreading;


class Mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Cooking");
            System.out.println("Sad");
            i++;
        }
    }
}

class Mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Chatting");
            System.out.println("Happy");
            i++;
        }
    }
}

public class Main_Threading {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
    }
}
