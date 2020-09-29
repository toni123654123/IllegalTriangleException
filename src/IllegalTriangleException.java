import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap a: ");
            double a = scanner.nextDouble();
            System.out.println("Nhap b: ");
            double b = scanner.nextDouble();
            System.out.println("Nhap c: ");
            double c = scanner.nextByte();

            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("tam giac");
            }

        } catch (InputMismatchException a) {
            System.out.println(" nhap sai kieu du lieu");

        } catch (EmptyStackException ex) {
            System.out.println("nhap sai dieu kien");
        }
    }
}
