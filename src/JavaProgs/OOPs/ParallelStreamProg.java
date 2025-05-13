package JavaProgs.OOPs;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamProg {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        List<Integer> list= Stream.iterate(1,x->x+1).limit(20000).toList();
        List<Long> factorialList=list.stream().map(ParallelStreamProg::factorial).toList();
        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken="+(endTime - startTime)+"ms");


        startTime=System.currentTimeMillis();
        list= Stream.iterate(1,x->x+1).limit(20000).toList();
        factorialList=list.parallelStream().map(ParallelStreamProg::factorial).toList();
        endTime=System.currentTimeMillis();
        System.out.println("Total time taken="+(endTime - startTime)+"ms");
    }

    private static long factorial(int n) {
        if(n==0)
            return 1;
        else
            return (n*factorial(n-1));


    }
}


