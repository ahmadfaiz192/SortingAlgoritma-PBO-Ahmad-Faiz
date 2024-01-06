
package sortingalgoritma.ahmad_faiz;

/*


author : ahmad faiz setiawantoro
nim :  32602200034

berikan penjelasan kode ini baris perbaris dengan komentar
*/

// Import paket-paket yang diperlukan
import java.util.Arrays;
import java.util.Scanner;
import sortingalgoritma.ahmad_faiz.BubbleSort;
import sortingalgoritma.ahmad_faiz.SelectionSort;
import sortingalgoritma.ahmad_faiz.Sorter;

// Deklarasi kelas utama Main
public class Main {
    // Deklarasi metode main
    public static void main(String[] args) {
        // Inisialisasi objek Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi objek Sorter untuk melakukan sorting
        Sorter sorter = new Sorter();

        // Meminta pengguna memasukkan panjang array
        System.out.print("Masukkan panjang array: ");
        int length = scanner.nextInt();

        // Membuat array dengan panjang yang telah dimasukkan pengguna
        int[] array = new int[length];

        // Meminta pengguna memasukkan elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Meminta pengguna memilih algoritma sorting
        System.out.println("Pilih algoritma sorting:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        int choice = scanner.nextInt();

        // Memilih algoritma sorting berdasarkan pilihan pengguna
        switch (choice) {
            case 1:
                sorter.setSortAlgorithm(new BubbleSort());
                break;
            case 2:
                sorter.setSortAlgorithm(new SelectionSort());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        // Meminta pengguna memilih urutan sorting (ascending atau descending)
        System.out.println("Pilih urutan sorting:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        int order = scanner.nextInt();

        // Jika pengguna memilih descending, reverse array
        if (order == 2) {
            array = Arrays.stream(array).boxed().sorted(java.util.Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        }

        // Menampilkan array sebelum sorting
        System.out.println("Array sebelum sorting: " + Arrays.toString(array));

        // Melakukan sorting menggunakan algoritma yang telah dipilih
        sorter.performSort(array);

        // Menampilkan array setelah sorting
        System.out.println("Array setelah sorting: " + Arrays.toString(array));

        // Menutup objek Scanner
        scanner.close();
    }
}
