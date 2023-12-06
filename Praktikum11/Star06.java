import java.util.Scanner;
public class Star06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int n = sc.nextInt();

        for (int i = 0; i <=n; i++) {
            System.out.print("*");
        } 
    }
}