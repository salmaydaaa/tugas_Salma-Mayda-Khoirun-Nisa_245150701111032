package Praktikum;

public class Studio {
    private int nomorStudio;
    private int kapasitasKursi;
    private Film film; // Film yang ditayangkan di studio

    // Constructor
    public Studio(int nomorStudio, int kapasitasKursi, Film film) {
        this.nomorStudio = nomorStudio;
        this.kapasitasKursi = kapasitasKursi;
        this.film = film;
    }

    // Getter Methods
    public int getNomorStudio() {
        return nomorStudio;
    }

    public int getKapasitasKursi() {
        return kapasitasKursi;
    }

    public Film getFilm() {
        return film;
    }

    // Menampilkan informasi studio
    public void tampilkanInfo() {
        System.out.println("Studio       : " + nomorStudio);
        System.out.println("Kapasitas    : " + kapasitasKursi + " kursi");
        System.out.println("Film yang tayang:");
        film.tampilkanInfo();
        System.out.println("-------------------------------");
    }
}
