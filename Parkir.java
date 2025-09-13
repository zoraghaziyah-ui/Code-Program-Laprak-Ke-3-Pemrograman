public class Parkir {
    public static void main(String[] args) {
        int jam = 20;
        if (jam < 12) {
            System.out.println("Pagi, tarif Rp 5000");
        } else if (jam >= 12 && jam < 18) {
            System.out.println("Siang, tarifRp 7000");
        } else {
            System.out.println("Malam, tarifRp 10000");
        }
    }
}
