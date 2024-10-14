package JavaProgs.SelfProgs.Multithreading;

class STOne extends Thread{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("Hello");
            i++;
        }
    }
}

class STTwo extends Thread{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("Bye");
            i++;
        }
    }
}

public class SleepConcept {
    public static void main(String[] args) {
        STOne t1=new STOne();
        t1.start();


        STTwo t2=new STTwo();
        t2.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

