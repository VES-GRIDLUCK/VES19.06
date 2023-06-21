import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();

        System.out.println((Integer.toBinaryString(n)));
        int t = 1;
        if (n >= i << 16) i <<= 16;
        if (n >= i << 8) i <<= 8;
        if (n >= i << 4) i <<= 4;
        if (n >= i << 2) i <<= 2;
        if (n >= i << 1) i <<= 1;

        System.out.println(Integer.toBinaryString(n));
    }
}
