import java.util.Scanner;

public class studiKasusA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang Di Program Kalkulator Sederhana");
        System.out.print("Masukkan Angka 1 : ");
        int angka1 = input.nextInt(); 
        System.out.print("Masukkan Angka 2 : ");
        int angka2 = input.nextInt();

        System.out.println("Pilih Operasi : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih Operasi : ");
        int operasi = input.nextInt();

        int hasil = 0;

        switch(operasi) {
            case 1 :
                hasil = angka1 + angka2;
                break;
            case 2 :
                hasil = angka1 - angka2;
                break;
            case 3 :
                hasil = angka1 * angka2;
                break;
            case 4 :
                hasil = angka1 / angka2;
                break;
            default :
                System.out.println("Operasi Tidak Tersedia");
                break;
        }
        System.out.println("Hasil : " + hasil);

    }
    
}
