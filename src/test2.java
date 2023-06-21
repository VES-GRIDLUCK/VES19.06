import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();

        System.out.println((Integer.toBinaryString(n)));
        int a = 2;
        System.out.println(a << n - 1);
    }
}
