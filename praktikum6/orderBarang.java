package praktikum6;

import java.util.Scanner;
import java.util.Stack;


public class orderBarang {
    Stack rakBarang = new Stack();

    Scanner namaBarang = new Scanner(System.in);

    String barang;
    public String inputBarang() {
        System.out.print("Input Nama Barang= ");
        barang = namaBarang.nextLine();
        return barang;

    }

    void pushRak() {
		rakBarang.push(barang);
    }

    boolean cekKosong() {
        boolean cekBarang;
        cekBarang=rakBarang.empty();
        return cekBarang;
    }

    void popBarang() {
        if (!rakBarang.empty()) {
            String deletedBarang;
            deletedBarang = (String) rakBarang.pop();

            System.out.println("Barang yang terhapus = " + deletedBarang);
        } else {
            System.out.println("Kosong");
        }

    }

    void showSearch() {
        String searchBarang;
        int showBarang;
        System.out.print("Barang yang dicari di rak (stack) = ");
        searchBarang = namaBarang.nextLine();
        System.out.println();
        showBarang = rakBarang.search(searchBarang);
        System.out.println("Barang ada di index- " + showBarang);
    }

    void peekBarang(){
        if (rakBarang.empty()){
           System.out.println("Stack Kosong");
        }else {
            String checkBarang;
            checkBarang= (String) rakBarang.peek();
            System.out.println("Nama Barang paling ujung (peek)= "+checkBarang);
        }
    }
}