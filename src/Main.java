import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();

        System.out.println((Integer.toBinaryString(n)));

        //1.
        //  int mask = 1;
        // System.out.println(Integer.toBinaryString(mask));
        // mask =~ mask;
        // System.out.println(Integer.toBinaryString(mask));
        // System.out.println(n & mask);
        //  System.out.println(Integer.toBinaryString(n & mask));
        //2.
        //int a = 2;
        //  System.out.println(a << n -1);
        //3.
        // int mask = 1;
        // mask = mask << i-1;
        // n = n | mask;
        // System.out.println(n);
        // System.out.println(Integer.toBinaryString(n));
        //4.
        // int mask = 1;
        // mask = mask << i;
        // n = n ^ mask;
        // System.out.println(n);
        // System.out.println(Integer.toBinaryString(n));
        //5.
       /* int mask = 1;
        mask = mask << i;
        n = n ^ mask;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));*/
        //6.
       /* n = n >> i << i;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));*/
        //7.
      /* int a= n, c = 0;
        int mask = 1;
        mask = mask << i;
        n = n^mask;
        System.out.println(Integer.toBinaryString(n));
        c= a-n;
        System.out.println(Integer.toBinaryString(c));*/
        //8.
        int t = 1;
        if (n >= i << 16) i <<= 16;
        if (n >= i << 8) i <<= 8;
        if (n >= i << 4) i <<= 4;
        if (n >= i << 2) i <<= 2;
        if (n >= i << 1) i <<= 1;

        System.out.println(Integer.toBinaryString(n));





    }
}