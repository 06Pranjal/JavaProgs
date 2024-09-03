package JavaProgs.SelfProgs;

import java.io.*;
class change {
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int arr[], lower, upper, num =0;
        System.out.println("Enter lower limit");
        lower = Integer.parseInt(in.readLine());
        System.out.println("Enter upper limit");
        upper = Integer.parseInt(in.readLine());
        System.out.println("Enter Numbers");
        arr=new int[upper];
        for (int i = lower; i < upper; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        for (int i = lower; i < upper; i++) {
            if (arr[lower] != lower)
                num = lower;
        }
        System.out.println("Number which was not present in list was " + num);
    }
}
