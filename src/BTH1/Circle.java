package BTH1;

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;
    private double area;

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        radius = sc.nextDouble();
    }

    @Override
    public void calArea() {
        area = Math.PI * radius * radius;
        System.out.println("Diện tích hình tròn: " + area);
    }
}