import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();

        System.out.println((Integer.toBinaryString(n)));
        int mask = 1;
        System.out.println(Integer.toBinaryString(mask));
        mask = ~mask;
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(n & mask);
        System.out.println(Integer.toBinaryString(n & mask));
    }
}
