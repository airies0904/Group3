import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Nhom3");

        int age = 19;
        int height = 155;
        boolean likeCoding = false;

        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao: " + height + "cm");
        System.out.println("Thich lap trinh: " + likeCoding);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int b = scanner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        if (b != 0) {
            int thuong = a / b;
            int phanDu = a % b;

            System.out.println("\nKet qua:");
            System.out.println("Tong: " + tong);
            System.out.println("Hieu: " + hieu);
            System.out.println("Tich: " + tich);
            System.out.println("Thuong: " + thuong);
            System.out.println("Phan du: " + phanDu);
        } else {
            System.out.println("\nKhong the chia cho 0.");
            System.out.println("Tong: " + tong);
            System.out.println("Hieu: " + hieu);
            System.out.println("Tich: " + tich);
        }

        System.out.print("\nNhap so tien gui (VND): ");
