package JavaProgs.OOPs;

import java.util.Arrays;
import java.util.List;

public class stream3 {
    public void streamProg(){
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        int count=0;

        for(int i:numbers) {
            if (i % 2 == 0)
                count++;
        }
        System.out.println(count);
    }

    public void realStreamProg(){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
        System.out.println(numbers.stream().filter(x->x%2==0).count());
    }


    public static void main(String[] args) {
        stream3 ob=new stream3();
        ob.streamProg();
        ob.realStreamProg();
    }
}
