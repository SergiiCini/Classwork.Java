package lesson4;


public class diagonalDif {

    private static int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {9, 8, 9}
    };

    public static int diagonalDifference(int[][] arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {

            firstDiagonal = firstDiagonal + arr[i][i];
            secondDiagonal = secondDiagonal + arr[i][size - i - 1];
        }
        return Math.abs(firstDiagonal - secondDiagonal);

    }


    public static void main(String[] args) {
        int result = diagonalDifference(array);
        System.out.println(result);
    }

}