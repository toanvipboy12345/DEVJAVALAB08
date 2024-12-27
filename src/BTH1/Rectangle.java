package BTH1;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double length;
    private double width;
    private double area;

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        length = sc.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        width = sc.nextDouble();
    }

    @Override
    public void calArea() {
        area = length * width;
        System.out.println("Diện tích hình chữ nhật: " + area);
    }
}