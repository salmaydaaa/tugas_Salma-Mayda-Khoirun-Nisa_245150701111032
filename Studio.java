 class Studio {
        int nomorStudio;
        int jumlahKursi;
        Film1 film;
    
        public Studio(int nomorStudio, int jumlahKursi, Film1 film) {
            this.nomorStudio = nomorStudio;
            this.jumlahKursi = jumlahKursi;
            this.film = film;
        }
    
        public void tampilkanInfo() {
            System.out.println("Studio       : " + nomorStudio);
            System.out.println("Jumlah Kursi    : " + jumlahKursi+ " kursi");
            System.out.println("Film yang sedang tayang:");
            film.tampilkanInfo();
            System.out.println("-------------------------------");
        }
    }
