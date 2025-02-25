class Tiket1 {
    String nomorTiket;
    Film1 film;
    Studio studio;
    int nomorKursi;
    String namaPenonton;

    public Tiket1(String nomorTiket, Film1 film, Studio studio, int nomorKursi, String namaPenonton) {
        this.nomorTiket = nomorTiket;
        this.film = film;
        this.studio = studio;
        this.nomorKursi = nomorKursi;
        this.namaPenonton = namaPenonton;
    }

    public void tampilkanTiket() {
        System.out.println("\n=== Detail Tiket ===");
        System.out.println("Nomor Tiket   : " + nomorTiket);
        System.out.println("Nama Penonton : " + namaPenonton);
        System.out.println("Film          : " + film.judul);
        System.out.println("Studio        : " + studio.nomorStudio);
        System.out.println("Nomor Kursi   : " + nomorKursi);
        System.out.println("Harga Tiket   : " + film.hargaTiket);
        System.out.println("=======================");
}
}                                                        
