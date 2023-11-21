import java.util.Scanner;
  public class dataMahasiswa06 {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        
        // Data for Mahasiswa
        String[] namaMahasiswa = {"Bagas Satria YN", "Arimbi Putri H", "Angga Ahmad"};
        String[] nimMahasiswa = {"2341760108", "2341760108", "2341760108"};
        int totalMahasiswa = 3;

        // Print existing Mahasiswa table
        System.out.println("(Tabel Data Mahasiswa)\n");
        printMahasiswaTable(namaMahasiswa, nimMahasiswa, totalMahasiswa);

        // Input new student data
        System.out.print("Masukkan Nama Mahasiswa: ");
        String newNama = sc06.nextLine();

        System.out.print("Masukkan NIM Mahasiswa: ");
        String newNim = sc06.nextLine();

        // Add data to arrays
        namaMahasiswa[totalMahasiswa] = newNama;
        nimMahasiswa[totalMahasiswa] = newNim;

        // Increment totalMahasiswa
        totalMahasiswa++;

        // Print updated Mahasiswa table
        System.out.println("\n(Tabel Data Mahasiswa) [updated]\n");
        printMahasiswaTable(namaMahasiswa, nimMahasiswa, totalMahasiswa);

        sc06.close();
    }

    private static void printMahasiswaTable(String[] namaMahasiswa, String[] nimMahasiswa, int totalMahasiswa) {
        System.out.println("No.\tNama\t\tNIM");
        for (int i = 0; i < totalMahasiswa; i++) {
            System.out.println((i + 1) + ".\t" + namaMahasiswa[i] + "\t" + nimMahasiswa[i]);
        }
        System.out.println();
    }
}