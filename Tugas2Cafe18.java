import java.util.Scanner;

public class Tugas2Cafe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlpsn, totalbiaya;

        System.out.print("Masukkan jumlah pesanan : ");
        jmlpsn = sc.nextInt();

        String nama[] = new String[jmlpsn];
        int harga[] = new int[jmlpsn];

        for (int i = 0 ; i < jmlpsn ; i++) {
            System.out.print("Masukkan nama makanan/minuman  = ");
            nama[i] = sc.nextLine();
            System.out.print("Masukkan harga makanan/minuman = ");
            harga[i] = sc.nextInt();
            
        }
    }
}
