package BTH1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape[] shapes = new Shape[3];

        // Khởi tạo các đối tượng
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        // Nhập dữ liệu và tính diện tích cho từng hình
        for (Shape shape : shapes) {
            shape.inputData();
            shape.calArea();
            System.out.println();
        }
    }
}