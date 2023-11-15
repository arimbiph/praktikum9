import java.util.Scanner;

public class TugasKelompok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

          String[] namaMahasiswa = new String[jumlahMahasiswa];
        double[] nilaiTugas = new double[jumlahMahasiswa];
        double[] nilaiQuiz = new double[jumlahMahasiswa];
        double[] nilaiUTS = new double[jumlahMahasiswa];
        double[] nilaiAkhir = new double[jumlahMahasiswa];
        char[] nilaiHuruf = new char[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = input.next();
          
            System.out.print("Masukkan nilai Tugas: ");
            nilaiTugas[i] = input.nextDouble();
            System.out.print("Masukkan nilai Quiz: ");
            nilaiQuiz[i] = input.nextDouble();
            System.out.print("Masukkan nilai UTS: ");
            nilaiUTS[i] = input.nextDouble();

            nilaiAkhir[i] = (nilaiTugas[i] * 0.2) + (nilaiQuiz[i] * 0.3) + (nilaiUTS[i] * 0.5);

                        if (nilaiAkhir[i] >= 80) {
                if (nilaiAkhir[i] >= 90) {
                    nilaiHuruf[i] = 'A';
                } else {
                    nilaiHuruf[i] = 'B';
                }
            } else {
                if (nilaiAkhir[i] >= 70) {
                    nilaiHuruf[i] = 'C';
                } else if (nilaiAkhir[i] >= 50) {
                    nilaiHuruf[i] = 'D';
                } else {
                    nilaiHuruf[i] = 'E';

                    
                     for (int I = 0; i < jumlahMahasiswa; i++) {
                     System.out.println("Nilai akhir " + namaMahasiswa[i] + " adalah: " + nilaiAkhir[i]);
                     System.out.println("Nilai " + namaMahasiswa[i] + " adalah " + nilaiHuruf[i]);
                 }
                }
                }
            }
        }
    }

            


