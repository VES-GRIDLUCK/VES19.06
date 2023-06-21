import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();

        System.out.println((Integer.toBinaryString(n)));
        n = n >> i << i;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
    }
}
