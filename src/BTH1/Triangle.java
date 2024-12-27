package BTH1;
import java.util.Scanner;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double area;

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài đáy của tam giác: ");
        base = sc.nextDouble();
        System.out.print("Nhập chiều cao của tam giác: ");
        height = sc.nextDouble();
    }

    @Override
    public void calArea() {
        area = 0.5 * base * height;
        System.out.println("Diện tích tam giác: " + area);
    }
}