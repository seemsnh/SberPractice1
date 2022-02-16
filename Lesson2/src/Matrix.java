public class Matrix {
    double[][] matrix;
    int rows;
    int cols;

    Matrix(double[][] matrix){
        cols = matrix.length;
        rows = matrix[0].length;
        this.matrix = new double[cols][rows];
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                this.matrix[r][c] = matrix[r][c];
            }
        }
    }

    Matrix(Matrix matrix){
        cols = matrix.cols;
        rows = matrix.rows;
        this.matrix = new double[cols][rows];
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                this.matrix[r][c] = matrix.matrix[r][c];
            }
        }
    }

    public void Add(Matrix mat){
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                matrix[r][c] += mat.matrix[r][c];
            }
        }
    }

    public void Multiply(double n){
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                matrix[r][c] *= n;
            }
        }
    }

    public void Print() {
        for (int r = 0; r < rows; r++) {
            for (int c= 0; c < cols; c++) {
                System.out.printf("%12f", matrix[r][c]);
            }
            System.out.println();
        }
    }

    public void MultiplyMatrix(Matrix mat) {
        if (cols == mat.rows) {
            Matrix tempMatrix = new Matrix(new double[cols][mat.rows]);
            for (int c = 0; c < tempMatrix.cols; c++){
                for (int r = 0; r < tempMatrix.rows; r++){
                    for (int i = 0; i < tempMatrix.cols; i++){
                        tempMatrix.matrix[c][r] += (this.matrix[c][i] * mat.matrix[i][r]);
                    }
                }
            }
            matrix = tempMatrix.matrix;
            rows = tempMatrix.rows;
            cols = tempMatrix.cols;
        }
    }

}
