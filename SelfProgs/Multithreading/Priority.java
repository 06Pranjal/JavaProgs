package JavaProgs.SelfProgs.Multithreading;

class Priority1 extends Thread{
    public Priority1(String name){
        super(name);
    }
     public void run(){
         System.out.println("Hello there"+this.getName());
     }
}

public class Priority {
    public static void main(String[] args) {
        Priority1 t1=new Priority1(" World 1");
        Priority1 t2=new Priority1(" World 2");
        Priority1 t3=new Priority1(" World 3");
        Priority1 t4=new Priority1(" World 4");
        Priority1 t5=new Priority1(" World 5");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();




    }
}
