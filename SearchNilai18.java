import java.util.Scanner;

public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyak, key, hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        banyak = sc.nextInt();

        int[] arrNilai = new int[banyak];

        for (int i = 0 ; i < banyak ; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0 ; i < arrNilai.length ; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+hasil);
                break;
            }
        }
        
        if (hasil==0) {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
