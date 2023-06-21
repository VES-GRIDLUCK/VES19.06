import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();

        System.out.println((Integer.toBinaryString(n)));
        int mask = 1;
        mask = mask << i;
        n = n ^ mask;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
    }
}
