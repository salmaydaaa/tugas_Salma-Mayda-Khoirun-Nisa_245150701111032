import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
        Film1 film1 = new Film1("Film A", "Romance", "10:00", 50000);
        Film1 film2 = new Film1("Film B", "Horor", "12:00", 60000);
        Film1 film3 = new Film1("Film C", "Comedy", "14:00", 55000);

        
        Studio studio1 = new Studio(1, 100, film1);
        Studio studio2 = new Studio(2, 130, film2);
        Studio studio3 = new Studio(3, 105, film3);

        
        System.out.println("=== Jadwal Film di Bioskop ABC ===");
        studio1.tampilkanInfo();
        studio2.tampilkanInfo();
        studio3.tampilkanInfo();

        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan Nomor Tiket: ");
        String nomorTiket = input.nextLine();

        System.out.print("Masukkan Nama Penonton: ");
        String namaPenonton = input.nextLine();

        System.out.print("Pilih Studio (1/2/3): ");
        int pilihanStudio = input.nextInt();

        System.out.print("Masukkan Nomor Kursi: ");
        int nomorKursi = input.nextInt();

        
        Studio studioPilih;
        if (pilihanStudio == 1) {
            studioPilih = studio1;
        } else if (pilihanStudio == 2) {
            studioPilih = studio2;
        } else if (pilihanStudio == 3) {
            studioPilih = studio3;
        } else {
            System.out.println("Pilihan studio tidak valid!");
            input.close();
            return;
        }

        
        Tiket1 tiket = new Tiket1(nomorTiket, studioPilih.film, studioPilih, nomorKursi, namaPenonton);



        
        tiket.tampilkanTiket();

        input.close();
    }
}
