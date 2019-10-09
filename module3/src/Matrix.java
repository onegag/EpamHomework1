import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private int n, m;
    double array[][];


    Matrix() {
        this(10, 10);
    }

    private Matrix(int n) {
        this(n, n);

    }

    private Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        Random random = new Random();
        array = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextDouble();

            }

        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(array[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static Matrix initializator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it irregular matrix? Y/N: ");
        String i = scanner.next();

        if (i.equals("y") || i.equals("Y")) {
            System.out.println("Put the number of rows: ");
            int n = scanner.nextInt();
            System.out.println("Put the number of columns: ");
            int m = scanner.nextInt();
            return new Matrix(n, m);
        } else {
            System.out.println("Put the matrix dimension: ");
            int n = scanner.nextInt();
            return new Matrix(n);
        }
    }


    public double findMin() {
        double min = Double.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) min = array[i][j];
            }
        }
        return min;
    }

    public double findMax() {
        double max = Double.MIN_VALUE;

        for (double[] line : array) {
            for (double element : line) {
                if (element > max) max = element;
            }
        }
        return max;
    }

    public double findAriphmeticMean() {
        double am = 0;
        for (double[] line : array) {
            for (double element : line) {
                am += element;
            }
        }
        am = am / n * m;
        return am;
    }


    public double findGeometricMean() {
        double gm = 1;
        for (double[] line : array) {
            for (double element : line) {
                gm *= element;
            }
        }
        gm = Math.pow(gm, 1. / n * m);
        return gm;
    }

    public int maxima() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {


            }

        }
        return 0;
    }
}
