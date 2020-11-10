import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, x2, x3;
        x1 = in.nextInt();
        x2 = in.nextInt();
        x3 = in.nextInt();
        System.out.println(x1 % 2 == 0 && x2 % 2 == 0 || x1 % 2 == 0 && x3 % 2 == 0 || x2 % 2 == 0 && x3 % 2 == 0? true : false);
    }
}
