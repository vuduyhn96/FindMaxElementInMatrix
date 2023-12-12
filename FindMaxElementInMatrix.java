import java.util.Scanner;

public class FindMaxElementInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tìm phần tử lớn nhất của ma trận có sẵn
        // Sử dụng mảng hai chiều để phản ánh ma trận
        double[][] matrix = {
                {3.5, 2.8, 1.2},
                {4.1, 5.2, 6.3},
                {7.4, 8.5, 9.6}
        };

        double maxElement = matrix[0][0];
        int row = 0, col = 0;

        // Duyệt qua ma trận để tìm phần tử lớn nhất
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        // Hiển thị kết quả
        System.out.println("Phần tử lớn nhất trong ma trận: " + maxElement);
        System.out.println("Tọa độ của phần tử lớn nhất: [" + row + ", " + col + "]");

        // Bước 2: Thu thập đầu vào từ người dùng
        System.out.print("Nhập số hàng của ma trận: ");
        int numRows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int numCols = scanner.nextInt();

        double[][] userMatrix = new double[numRows][numCols];

        // Nhập giá trị cho ma trận từ người dùng
        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Nhập giá trị tại [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        // Hiển thị ma trận được nhập từ người dùng
        System.out.println("Ma trận được nhập từ người dùng:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(userMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
