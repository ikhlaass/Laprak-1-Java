import java.util.ArrayList;
import java.util.Scanner;

public class laprak1 {
    public static void main(String[] args) { 
        System.out.flush();
        Scanner input = new Scanner(System.in);

        ArrayList<String> Item = new ArrayList<>();
        ArrayList<Integer> Harga = new ArrayList<>();
        double total = 0;
        int pilihan;

        do {    
            System.out.println("Menu");
            System.out.println("1. Tambah Item Belanjaan");
            System.out.println("2. Hapus Item Belanjaan");
            System.out.println("3. Tampilkan Seluruh Item Belanjaan");
            System.out.println("4. Cari Item Belanjaan");
            System.out.println("0. Keluar dari program");

            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();  

            switch(pilihan) {
                case 1 :
                    System.out.print("Masukkan Nama Item Belanjaan :");
                    String item = input.nextLine();
                    System.out.print("Masukkan Harga Item Belanjaan :");
                    int harga = input.nextInt();

                    Item.add(item);
                    Harga.add(harga);

                    System.out.println("Item Belanja Telah Di Tambahkan!");
                    break;
                case 2 :
                    Item.remove(Item.size() - 1);
                    Harga.remove(Harga.size() - 1);
                    break;
                case 3 :
                    System.out.println("Daftar Mahasiswa");
                    for (int i = 0; i < Item.size(); i++) {
                        System.out.println(i + 1 + ". " + Item.get(i));
                    }
                    break;
                case 4 :
                    System.out.print("Masukkan Item Belanjaan yang dicari : ");
                    String cari = input.nextLine();
                    for (int i = 0; i < Item.size(); i++) {
                        if (Item.get(i).equalsIgnoreCase(cari)) {
                            System.out.println("Item Belanjaan " + cari + " Ditemukan");
                            break;
                        }
                        if (Item.get(i).contains(cari)) {
                            System.out.println("Item Belanjaan " + cari + " Ditemukan");
                        }
                    }

                    System.out.println("Item Belanjaan " + cari + " Tidak Ditemukan");

                    break;
                default :
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
            System.out.println();
        }while(pilihan != 0);
    }
}
    

