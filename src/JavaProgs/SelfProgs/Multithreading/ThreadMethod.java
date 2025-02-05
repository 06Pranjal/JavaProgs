package JavaProgs.SelfProgs.Multithreading;

class ThreadMethod1 extends Thread{
    public ThreadMethod1(String name){

        super(name);
    }
    public void run(){
        int i=1;
        while(i<400){
            System.out.println("Hey There "+this.getName());
            i++;
        }
    }
}


class ThreadMethod2 extends Thread{
    public ThreadMethod2(String name2){
        super(name2);
    }
    public void run(){
        int i=1;
        while(i<400){
            System.out.println("Bye There "+this.getName());
            i++;
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {
        ThreadMethod1 t1=new ThreadMethod1("World 1");
        ThreadMethod2 t3=new ThreadMethod2("End");

        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t3.start();
    }
}
