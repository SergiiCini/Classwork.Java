package lesson4;

public class Methods {
    public static int add2(int a, int b) {
        return a + b;
    }

    public static int add3(int a, int b, int c) {
        return add2(add2(a, b), c);
    }

    public static int addN(int... as) {
        int sum = 0;
        for(int a: as) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        add2(1,2);
        add3(1,2,3);
        addN(1,2,3,4);
        addN(1,2,3,4,6);
        addN(1,2,3,4,7);
        addN(1,2,3,4,8);
        addN(1,2,3,4,9);
    }
}
