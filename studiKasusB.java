import java.util.ArrayList;
import java.util.Scanner;

public class studiKasusB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> Mahasiswa = new ArrayList<>();
        double total = 0;
        int pilihan;

        do {
            System.out.println("Daftar Mahasiswa");
            System.out.println("1. Tambah Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa ");
            System.out.println("0. Keluar dari program");

            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();

            switch(pilihan) {
                case 1 :
                    System.out.print("Masukkan Nama Mahasiswa :");
                    String mhs = input.nextLine();

                    Mahasiswa.add(mhs);

                    System.out.println("Mahasiswa Sudah Ditambahkan");
                    break;
                case 2 :
                    System.out.println("Daftar Mahasiswa");
                    for (int i = 0; i < Mahasiswa.size(); i++) {
                        System.out.println(i + 1 + ". " + Mahasiswa.get(i));
                    }
                    break;
                case 0 :
                    break;
                default :
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
            System.out.println();
        }while(pilihan != 0);
    }
}