import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Mahasiswa konversi = new Mahasiswa(0,0,0,0);
        Scanner in = new Scanner(System.in);

        int jam,menit,detik,hasil = 0;
        System.out.println("Masukkan Jam : ");
        jam = in.nextInt();
        konversi.setJam(jam);
        System.out.println("Masukkan Menit : ");
        menit = in.nextInt();
        konversi.setMenit(menit);
        System.out.println("Masukkan Detik : ");
        detik = in.nextInt();
        konversi.setDetik(detik);

//        hasil = (jam * 60 * 60) + (menit * 60) + detik;
        System.out.println("Total Detik :"+konversi.hasil(hasil));

    }
}