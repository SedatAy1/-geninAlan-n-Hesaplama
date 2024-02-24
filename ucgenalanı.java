import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ucgenalanı {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int kenar_a, kenar_b, kenar_c;
        int u;
        int alan;

        System.out.print("a kenarını giriniz : ");
        kenar_a = Scan.nextInt();
        System.out.print("b kenarını giriniz : ");
        kenar_b = Scan.nextInt();
        System.out.print("c kenarını giriniz : ");
        kenar_c = Scan.nextInt();

        u = (kenar_a + kenar_b + kenar_c) / 2;
        alan = (int) Math.sqrt(u * (u - kenar_a) * (u - kenar_b) * (u - kenar_c));
        System.out.println("Üçgenin alanı = " + alan);



    }
}
