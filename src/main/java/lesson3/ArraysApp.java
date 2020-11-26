package lesson3;

import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArraysApp {

    static int random_int_1to10_v0() {
        double r = Math.random(); // [0, 1)
        double r1 = r * 10;       // [0, 10)
        double r2 = r1 + 1;       // [1..11)
        int r3 = (int) r2;        // [1..10]
        return r3;
    }

    /**
     * @param from <= to
     * @param to
     * @return random number in range [from, to]
     */
    static int random_int(int from, int to) {
        double r = Math.random();        // [0, 1)
        double r1 = r * (to - from + 1); // [0, to - from)
        double r2 = r1 + from;           // [from .. to + 1)
        int r3 = (int) r2;               // [from .. to]
        return r3;
    }

    static int random_int_1to10() {
        return random_int(1, 10);
    }

    static int[] random_ints(int n, int from, int to) {
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random_int(from, to);
        }
        return ints;
    }

    static int[] random_ints1to10(int n) {
        return random_ints(n, 1, 10);
    }

    static int array_min_v1(int[] a) {
        int mn = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] < mn) mn = a[i];
        }
        return mn;
    }

    static int array_min_v2(int[] a) {
        int mn = Integer.MAX_VALUE;
    for (int item: a) {
        if (item < mn) mn = item;
        }
        return mn;
    }

    /**
     *
     * @param a - source array
     * @return minimal item of the array
     * or NoSuchElementException is array is empty
     */

    static int array_min(int[] a) {
        if(a.length == 0) throw new NoSuchElementException ("Given array is empty");
        int mn = Integer.MAX_VALUE;
    for (int item: a) {
        mn = Math.min(item, mn);
        }
        return mn;
    }


    public static void main(String[] args) {
        int[] ints = random_ints1to10(7);
        String intss = Arrays.toString(ints);
        System.out.println(intss);
        int min = array_min(ints);
        System.out.printf("Minimal item in array %s is %d", intss, min);
    }

    static void syntax() {
        int[] a = new int[5];
        int len = a.length;
        int a1 = a[0];
        int a5 = a[4];
        random_int(5,7);
        int x = random_int_1to10();
    }

    static void arraysSyntax() {
        int [] a = {1, 2, 3};

        Arrays.sort(a);
        String sa = Arrays.toString(a);
        int [] a3 = Arrays.stream(a).map(x -> x*2).toArray();
    }

    public static void Scan(String[] args) {
        InputStream is = System.in;
        Scanner sc = new Scanner(is);

        String next = sc.next();
        int i = sc.nextInt();

    }

}
