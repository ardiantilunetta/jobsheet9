import java.util.Scanner;

public class Tugas1Nilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlmhs, rata, tinggi=0, rendah=100, jmlnilai=0;
        
        System.out.print("Masukkan Jumlah mahasiswa : ");
        jmlmhs = sc.nextInt();
        int nilai[] = new int[jmlmhs];
        for (int i = 0 ; i < jmlmhs ; i++) {
            System.out.print("Masukkan nilai mahasiwa ke "+(i+1)+" = ");
            nilai[i] = sc.nextInt();
            jmlnilai += nilai[i];
            if (nilai[i] > tinggi) {
                tinggi = nilai[i];
            }
            if (nilai[i] < rendah) {
                rendah = nilai[i];
            }
        }


        System.out.println();
        System.out.println("Nilai rata - rata : "+jmlnilai/jmlmhs);
        System.out.println("Nilai terendah : "+rendah);
        System.out.println("Nilai tertinggi : "+tinggi);
        System.out.println("---- DAFTAR NILAI ----");

        for (int i = 0 ; i < jmlmhs ; i++) {
            System.out.println("Nilai mahasiswa "+(i+1)+" = "+nilai[i]);
        }
    }
}
