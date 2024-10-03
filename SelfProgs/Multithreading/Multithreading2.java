package JavaProgs.SelfProgs.Multithreading;

class One implements Runnable{
    public void run(){
        for(int i=1;i<50;i++){
            System.out.println("This is 111111");

        }
    }
}

class Two implements Runnable{
    public void run(){
        for(int i=1;i<50;i++){
            System.out.println("This is 22222");
        }
    }
}

public class Multithreading2 {
    public static void main(String[] args) {
        One bullet1 =new One();
        Thread gun1 =new Thread(bullet1);

        Two bullet2 =new Two();
        Thread gun2 =new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

