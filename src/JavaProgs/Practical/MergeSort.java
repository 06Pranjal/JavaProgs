package JavaProgs.Practical;
import java.io.*;

public class MergeSort {
    private static int[] temp;
    private static long comp = 0;

    static void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        System.arraycopy(a, l, temp, l, r - l + 1);
        int i = l, j = m + 1, k = l;
        while (i <= m && j <= r) {
            comp++;
            a[k++] = temp[i] <= temp[j] ? temp[i++] : temp[j++];
        }
        while (i <= m) a[k++] = temp[i++];
    }

    static void showCase(String type, int[] a) {
        if (temp == null || temp.length < a.length) {
            temp = new int[a.length];
        }
        System.out.printf("\n%s:\nBefore: ", type);
        for(int x : a) System.out.print(x + " ");
        comp = 0;
        long t = System.nanoTime();
        sort(a, 0, a.length - 1);
        System.out.printf("\nAfter: ");
        for(int x : a) System.out.print(x + " ");
        System.out.printf("\nTime: %.3fms, Comparisons: %d\n",
                (System.nanoTime() - t) / 1e6, comp);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("MERGE SORT ANALYSIS\n" +
                "Best/Avg/Worst: O(n log n)\n" +
                "Space: O(n)\n");

        showCase("Best Case", new int[]{1,2,3,4,5});
        showCase("Worst Case", new int[]{5,4,3,2,1});

        System.out.print("\nEnter array size: ");
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(br.readLine());

        showCase("Your Case", a);
        br.close();
    }
}