package JavaProgs.SelfProgs.Multithreading;

class prog extends Thread{
    public prog(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<400){
            System.out.println("Hello");
            i++;
        }
    }
}

public class Constructor {
    public static void main(String[] args) {
        prog t1=new prog("Harry");
        t1.start();
        System.out.println("The name of the thread is "+t1.getName());
        System.out.println("The ID of the thread is "+t1.getId());
    }
}

