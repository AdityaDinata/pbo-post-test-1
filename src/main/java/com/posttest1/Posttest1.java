/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posttest1;

/**
 *
 * @author Aditya D
 */
import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek-objek Smartphone
        ArrayList<Smartphone> smartphones = new ArrayList<>();

        // Menambahkan objek-objek Smartphone ke dalam ArrayList
        smartphones.add(new Smartphone("Samsung", "Galaxy S21", 6.2));
        smartphones.add(new Smartphone("Apple", "iPhone 12", 6.1));
        smartphones.add(new Smartphone("Google", "Pixel 5", 6.0));
        smartphones.add(new Smartphone("OnePlus", "8T", 6.55));
        smartphones.add(new Smartphone("Xiaomi", "Mi 11", 6.81));

        // Menampilkan informasi tentang setiap Smartphone
        for (Smartphone phone : smartphones) {
            phone.displayInfo();
            System.out.println(); // Tambahkan baris kosong untuk pemisah
        }
    }
}
