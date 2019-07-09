import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("Nhap vao mau sac: ");
        String color = scanner.nextLine();
        do {
            System.out.print("Nhap vao do dai 3 canh: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            if (a + b < c || a + c < b || b + c < a || a < 0 || b < 0 || c < 0) {
                System.out.println("Moi nhap lai !!! ");
            }
        } while (a + b < c || a + c < b || b + c < a);

        Triangle triangle = new Triangle(color, true, a, b, c);
        System.out.println("Chu vi: " + triangle.getPerimeter() + " Dien tich: " + triangle.getArea());
        String chuoi = triangle.toString();
        System.out.print(chuoi);
    }
}
