import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();

        System.out.println((Integer.toBinaryString(n)));
        int a = n, c = 0;
        int mask = 1;
        mask = mask << i;
        n = n ^ mask;
        System.out.println(Integer.toBinaryString(n));
        c = a - n;
        System.out.println(Integer.toBinaryString(c));
    }
}
