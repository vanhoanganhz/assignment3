package assignment3;
import java.util.Scanner;

public class giaiptbat1va2 {

    // ham giai pt bac 1 ; ax + b = 0
    public static String giaiPhuongTrinhBac1(double a, double b) {
        // kiem tra a
        if (a == 0) {
            if (b == 0) {
                return "phuong trinh co vo so nghiem";
            } else {
                return "phuong trinh vo nghiem";
            }
        } else {
            // tinh nghiem x
            double x = -b / a;
            return "nghiem cua pt bac 1 la: x = " + x;
        }
    }

    // ham giai pt bac 2: ax^2 + bx + c = 0
    public static String giaiPhuongTrinhBac2(double a, double b, double c) {
        // kiem tra he so a
        if (a == 0) {
            // neu a = 0, pt tro thanh bac 1
            return giaiPhuongTrinhBac1(b, c);
        }

        // tinh delta
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            return "pt vo nghiem";
        } else if (delta == 0) {
            // co mot nghiem kep
            double x = -b / (2 * a);
            return "pt co nghiem kep: x = " + x;
        } else {
            // co hai nghiem phan biet
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);  // Nghiem x1
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);  // Nghiem x2
            return "nghiem cua pt bac 2 la: x1 = " + x1 + ", x2 = " + x2;
        }
    }

    // nhap du lieu tu ng dung`
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("chon loai phuong trinh:");
        System.out.println("1. Phuong trinh bac 1");
        System.out.println("2. Phuong trinh bac 2");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Nhap he so a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhap he so b: ");
            double b = scanner.nextDouble();
            System.out.println(giaiPhuongTrinhBac1(a, b));
        } else if (choice == 2) {
            System.out.print("Nhap he so a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhap he so b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhap he so c: ");
            double c = scanner.nextDouble();
            System.out.println(giaiPhuongTrinhBac2(a, b, c));
        } else {
            System.out.println("Chon ko dung, vui long nhap 1 hoac 2.");
        }

        scanner.close();
    }
}
