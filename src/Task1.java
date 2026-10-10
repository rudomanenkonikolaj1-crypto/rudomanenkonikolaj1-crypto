import java.util.Scanner;
public class Main { public static void main(String[] args) { Scanner scanner = new Scanner(System.in); final double EPS = 1e-9;

    System.out.print("Введіть першу сторону трикутника: ");
    double a = scanner.nextDouble();

    System.out.print("Введіть другу сторону трикутника: ");
    double b = scanner.nextDouble();

    System.out.print("Введіть третю сторону трикутника: ");
    double c = scanner.nextDouble();

    if (!Double.isFinite(a) || !Double.isFinite(b)
            || !Double.isFinite(c)) {
        System.out.println("Введіть коректні скінченні числа.");
    } else if (a <= 0 || b <= 0 || c <= 0) {
        System.out.println("Сторони мають бути додатними.");
    } else if (a + b <= c + EPS
            || a + c <= b + EPS
            || b + c <= a + EPS) {
        System.out.println(
                "Трикутник із такими сторонами не існує.");
    } else if (Math.abs(a - b) < EPS
            && Math.abs(b - c) < EPS) {
        System.out.println("Трикутник рівносторонній.");
    } else if (Math.abs(a - b) < EPS
            || Math.abs(a - c) < EPS
            || Math.abs(b - c) < EPS) {
        System.out.println("Трикутник рівнобедрений.");
    } else {
        System.out.println("Трикутник різносторонній.");
    }

    scanner.close();
}