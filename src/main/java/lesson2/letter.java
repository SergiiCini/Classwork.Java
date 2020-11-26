package lesson2;

public class letter {
    public static void main(String[] args) {

        int H = 20;
        int W = 60;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(isPrinting(H, W, i, j) ? "*" : " ");
            }
            System.out.println(" ");
        }
    }

    public static boolean isPrinting(int h, int w, int i, int j) {
        return isDiagonal(h, w, i, j) || isBorders(h, w, i, j);
    }

    public static boolean isBorders(int h, int w, int i, int j) {
        return i == 0 || j == 0 || i == h - 1 || j == w - 1;
    }

    public static boolean isDiagonal (int h, int w, int i, int j) {
        double sp = ((double)w)/h;
        return j == i*sp - 1 || j == w - i*sp - 1;
    }


}