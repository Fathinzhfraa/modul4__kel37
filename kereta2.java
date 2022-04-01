package tugas;
import java.util.Scanner;
public class kereta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------PEMESANAN TIKET KERETA API BANDUNG-ACEH-BALI-SURABAYA--------------");
        System.out.print("Masukkan nama : ");
        String nama = sc.next();
        System.out.print("Masukkan tujuan : ");
        String Tujuan = sc.next().toUpperCase();
        kereta1 objek = new kereta1();
        objek.tujuan();
        switch (Tujuan) {
            case "BANDUNG":
                System.out.print("pilih tingkat :");
                int tingkat = sc.nextInt();
                if (tingkat == 1) {
                    System.out.println("Anda memilih kelas bisnis");
                    System.out.println(objek.dataHarga(0,0));

                } else if (tingkat == 2) {
                    System.out.println("Anda memilih kelas Ekonomi");
                    System.out.println(objek.dataHarga(1, 0));
                    ;
                } else {
                    System.out.println("Anda memilih kelas Eksekutif");
                    System.out.println(objek.dataHarga(2, 0));
                }
                break;
            case "ACEH":
                System.out.print("pilih tingkat :");
                tingkat = sc.nextInt();
                if (tingkat == 1) {
                    System.out.println("Anda memilih kelas bisnis");
                    System.out.println(objek.dataHarga(0, 1));

                } else if (tingkat == 2) {
                    System.out.println("Anda memilih kelas Ekonomi");
                    System.out.println(objek.dataHarga(1, 1));
                    ;
                } else {
                    System.out.println("Anda memilih kelas Eksekutif");
                    System.out.println(objek.dataHarga(2, 1));
                    ;
                }
                break;
            case "BALI":
                System.out.print("pilih tingkat :");
                tingkat = sc.nextInt();
                if (tingkat == 1) {
                    System.out.println("Anda memilih kelas bisnis");
                    System.out.println(objek.dataHarga(0, 2));
                } else if (tingkat == 2) {
                    System.out.println("Anda memilih kelas Ekonomi");
                    System.out.println(objek.dataHarga(1, 2));
                } else {
                    System.out.println("Anda memilih kelas Eksekutif");
                    System.out.println(objek.dataHarga(2, 2));
                }
                break;
            case "SURABAYA":
                System.out.print("pilih tingkat :");
                tingkat = sc.nextInt();
                if (tingkat == 1) {
                    System.out.println("Anda memilih kelas bisnis");
                    System.out.println(objek.dataHarga(0, 3));
                } else if (tingkat == 2) {
                    System.out.println("Anda memilih kelas Ekonomi");
                    System.out.println(objek.dataHarga(1, 3));
                } else {
                    System.out.println("Anda memilih kelas Eksekutif");
                    System.out.println(objek.dataHarga(2, 3));
                }
                break;
            default:

        }
    }
}
