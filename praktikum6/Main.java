package praktikum6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Stack = new Scanner(System.in);

        orderBarang order = new orderBarang();

        int jmlBarang;

        System.out.println();
        System.out.println("Input Barang Order");
        System.out.print("Input Counter Barang = ");
        jmlBarang = Stack.nextInt();
        for (int i = 0; i < jmlBarang; i++) {
            order.inputBarang();
            order.pushRak();
        }
        System.out.println("Stack Barang saat ini = " + order.rakBarang);
        System.out.print("Cek Stack Kosong = " + order.cekKosong());
        System.out.println();
        order.popBarang();
        order.peekBarang();
        System.out.println("Stack Barang terkini = " + order.rakBarang);
        order.showSearch();

        Stack.close();

    }
}