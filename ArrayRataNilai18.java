import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlLulus = 0, jmlTidakLulus = 0, jmlMhs;
        double totalLulus = 0, totalTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0 ; i < jmlMhs ; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }

        System.out.println("Rata - rata nilai lulus = "+totalLulus/jmlLulus);
        System.out.println("Rata - rata nilai tidak lulus = "+totalTidakLulus/jmlTidakLulus);

    }

}
