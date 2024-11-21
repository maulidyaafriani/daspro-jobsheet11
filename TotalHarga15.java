import java.util.Scanner;
public class TotalHarga15 {
    
    public static int hitungTotalHarga(int[] pilihanMenu, int[] banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = 0;
        
        for (int i = 0; i < pilihanMenu.length; i++) {
            totalHarga += hargaItems[pilihanMenu[i] - 1] * banyakItem[i];
        }

               
                if (kodePromo.equals("DISKON50")) {
                    totalHarga = totalHarga / 2; 
                } else if (kodePromo.equals("DISKON30")) {
                    totalHarga = totalHarga - (totalHarga * 30 / 100); 
                } else if (!kodePromo.isEmpty()) {
                    System.out.println("Kode promo tidak valid! Tidak ada diskon.");
                }
        
                return totalHarga;
            }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jenis menu yang ingin Anda pesan: ");
        int jumlahPesanan = input.nextInt();

        int[] pilihanMenu = new int[jumlahPesanan];
        int[] banyakItem = new int[jumlahPesanan];

        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nomor menu untuk pesanan ke-" + (i + 1) + ": ");
            pilihanMenu[i] = input.nextInt();

            System.out.print("Masukkan jumlah item untuk pesanan ke-" + (i + 1) + ": ");
            banyakItem[i] = input.nextInt();
        }

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = input.next();
        
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk semua pesanan Anda: Rp " + totalHarga);

        input.close();
    }
}
    
