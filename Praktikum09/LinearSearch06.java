import java.util.Scanner;
public class LinearSearch06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiKey = new int [10];
        int jmlKey = 0;
        int cari = 0;
        System.out.print("Masukkan jumlah elemen array: ");
        jmlKey = sc.nextInt();

        for (int i = 0; i < jmlKey; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + ": ");
            nilaiKey[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        cari = sc.nextInt();

        boolean keyDitemukan = false;

        System.out.print("Key ada di posisi ke- ");
        for (int i = 0; i < jmlKey; i++) {
            if (nilaiKey[i] == cari) {
                System.out.print(i + " ");
                keyDitemukan = true;
            }
        }

        if (!keyDitemukan) {
            System.out.println("Key tidak ditemukan.");
        } else {
            System.out.println();
        }
    }
}






        