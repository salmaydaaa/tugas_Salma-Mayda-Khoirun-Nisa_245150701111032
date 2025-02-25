package Praktikum;

public class Tiket {
    private String nomorTiket;
    private Film film;
    private Studio studio;
    private int nomorKursi;
    private String namaPenonton;

  
    public Tiket(String nomorTiket, Film film, Studio studio, int nomorKursi, String namaPenonton) {
        this.nomorTiket = nomorTiket;
        this.film = film;
        this.studio = studio;
        this.nomorKursi = nomorKursi;
        this.namaPenonton = namaPenonton;
    }

    
    public void tampilkanTiket() {
        System.out.println("=== Detail Tiket ===");
        System.out.println("Nomor Tiket   : " + nomorTiket);
        System.out.println("Nama Penonton : " + namaPenonton);
        System.out.println("Film          : " + film.getJudul());
        System.out.println("Studio        : " + studio.getNomorStudio());
        System.out.println("Nomor Kursi   : " + nomorKursi);
        System.out.println("Harga Tiket   : " + film.getHargaTiket());
        System.out.println("=======================");
    }
}
