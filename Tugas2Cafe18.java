import java.util.Scanner;

public class Tugas2Cafe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlpsn, totalbiaya=0;

        System.out.print("Masukkan jumlah pesanan : ");
        jmlpsn = sc.nextInt();

        String nama[] = new String[jmlpsn];
        int harga[] = new int[jmlpsn];

        for (int i = 0 ; i < jmlpsn ; i++) {
            sc.nextLine();
            System.out.print("Masukkan nama makanan/minuman  = ");
            nama[i] = sc.nextLine();
            System.out.print("Harga = ");
            harga[i] = sc.nextInt();
            totalbiaya += harga[i];
        }

        System.out.println("---- DAFTAR PESANAN ----");
        for (int i = 0 ; i < jmlpsn ; i++) {
            System.out.println(nama[i]+"\n-> "+harga[i]);
        }
        System.out.println("TOTAL HARGA = "+totalbiaya);
    }
}
