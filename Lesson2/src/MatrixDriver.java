public class MatrixDriver {
    public static void main(String[] args) {
        double[][] m = {{11d, 12d}, {21d,22d}};
        Matrix matrix1 = new Matrix(m);
        Matrix matrix2 = new Matrix(matrix1);

        System.out.println("Матрица 1");
        matrix1.Print();
        System.out.println("Матрица 2");
        matrix2.Print();
        System.out.println();

        matrix1.Add(matrix2);
        System.out.println("Матрица 1 += Матрица 2");
        matrix1.Print();
        System.out.println();

        System.out.println("Матрица 1 *= 0.3");
        matrix1.Multiply(.3d);
        matrix1.Print();
        System.out.println();

        System.out.println("Матрица 1 *= Матрица 2");
        matrix1.MultiplyMatrix(matrix2);
        matrix1.Print();
        System.out.println();
    }
}
