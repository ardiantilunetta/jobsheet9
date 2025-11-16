import java.util.Scanner;

public class Tugas3SearchMenu18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[] = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate ice"};
        String cari;
        boolean hasil;

        System.out.print("Menu yang dicari : ");
        cari = sc.nextLine();
        
        for (int i = 0 ; i < 7 ; i++) {
            if (cari.equalsIgnoreCase(menu[i])) {
                hasil = true;
            }
        }

        
    }
}
