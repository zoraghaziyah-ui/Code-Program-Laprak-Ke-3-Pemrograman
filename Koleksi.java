public class Koleksi {
    public static void main(String[] args) {
        boolean membayar = false;
        boolean anggota = true;
        if (anggota) {
            if (membayar) {
                System.out.println("Akses e-book dibuka");
            } else {
                System.out.println("Harap bayar iuran dulu");
            }
        } else {
            System.out.println("Silakan daftar anggota dulu");
        }
    }
}
