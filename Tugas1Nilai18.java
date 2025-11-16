import java.util.Scanner;

public class Tugas1Nilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlmhs, rata, tinggi=0, rendah=100;
        
        System.out.print("Masukkan Jumlah mahasiswa : ");
        jmlmhs = sc.nextInt();
        int nilai[] = new int[jmlmhs];
        for (int i = 0 ; i < jmlmhs ; i++) {
            System.out.print("Masukkan nilai mahasiwa ke "+(i+1));
            nilai[i] = sc.nextInt();
        }
    }
}
