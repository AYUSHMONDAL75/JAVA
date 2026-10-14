// Q13: Matrix addition
class Matrix {
    int[][] data;

    Matrix(int[][] data) {
        this.data = data;
    }

    Matrix add(Matrix other) {
        int rows = data.length;
        int cols = data[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    void display() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Q13 {
    public static void main(String[] args) {
        Matrix a = new Matrix(new int[][] { {1, 2}, {3, 4} });
        Matrix b = new Matrix(new int[][] { {5, 6}, {7, 8} });
        Matrix sum = a.add(b);
        System.out.println("Sum of matrices:");
        sum.display();
    }
}
