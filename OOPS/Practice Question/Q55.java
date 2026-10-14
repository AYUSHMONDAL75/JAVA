// Q55: Matrix copy constructor with deep copy
class Matrix {
    int[][] data;

    Matrix(int[][] data) {
        this.data = data;
    }

    Matrix(Matrix other) {
        data = new int[other.data.length][other.data[0].length];
        for (int i = 0; i < other.data.length; i++) {
            for (int j = 0; j < other.data[i].length; j++) {
                data[i][j] = other.data[i][j];
            }
        }
    }

    void display(String label) {
        System.out.println(label + ":");
        for (int[] row : data) {
            for (int v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}

public class Q55 {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(new int[][] { {1, 2}, {3, 4} });
        Matrix m2 = new Matrix(m1);
        m2.data[0][0] = 99;
        m1.display("Original");
        m2.display("Copy");
    }
}
