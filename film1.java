 class Film1 {
    String judul;
    String genre;
    String jamTayang;
    double hargaTiket;

    public Film1(String judul, String genre, String jamTayang, double hargaTiket) {
        this.judul = judul;
        this.genre = genre;
        this.jamTayang = jamTayang;
        this.hargaTiket = hargaTiket;
    }

    public void tampilkanInfo() {
        System.out.println("Judul Film  : " + judul);
        System.out.println("Genre       : " + genre);
        System.out.println("Jam Tayang  : " + jamTayang);
        System.out.println("Harga Tiket : " + hargaTiket);
    }
}
