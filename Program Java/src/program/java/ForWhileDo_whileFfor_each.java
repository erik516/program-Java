package program.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForWhileDo_whileFfor_each {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas bawah: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Masukkan batas atas: ");
        int upperBound = scanner.nextInt();

        List<Integer> evenNumbers = new ArrayList<>();
        int sum = 0;

        // Menggunakan for-loop untuk mengisi daftar bilangan genap
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        // Menggunakan while-loop untuk menjumlahkan bilangan genap
        int index = 0;
        while (index < evenNumbers.size()) {
            sum += evenNumbers.get(index);
            index++;
        }

        // Menampilkan bilangan genap menggunakan do-while
        System.out.println("Bilangan genap dalam rentang: ");
        index = 0;
        do {
            if (evenNumbers.isEmpty()) {
                System.out.println("Tidak ada bilangan genap.");
                break;
            }
            System.out.print(evenNumbers.get(index) + " ");
            index++;
        } while (index < evenNumbers.size());

        // Menggunakan for-each untuk menampilkan jumlah
        System.out.println("\nJumlah bilangan genap: " + sum);

    }
}
