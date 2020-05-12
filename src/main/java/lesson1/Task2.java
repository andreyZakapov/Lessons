package lesson1;

public class Task2 {
    public static void main(String[] args) {

        int[][] a = new int[][]{
                {1, 2, 3, 4, 15, 16},
                {5, 6, 7, 8, 9, 0},
                {1, 15, 216, 17, 55, 21},
                {4, 2, 3, 1, 5, 6,},
                {5, 6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5, 6},
        };

        Task2.org(a);


    }

    //CPU:O(n)
    //RAM:O(1)
    static int sumLine(int[] a) {
        int m = a.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += a[i];
        }

        return sum;

    }


    //CPU:O(n^2*m)
    //RAM:O(1)
    static void org(int[][] a) {


        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                int m = a[i].length;
                if (sumLine(a[j]) > sumLine(a[j - 1])) {
                    for (int k = 0; k < m; k++) {
                        int t = a[j][k];
                        a[j][k] = a[j - 1][k];
                        a[j - 1][k] = t;
                    }
                }
            }
        }
    }
}