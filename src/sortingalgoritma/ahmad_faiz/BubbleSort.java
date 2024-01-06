package sortingalgoritma.ahmad_faiz;

/*

author : ahmad faiz setiawantoro
nim :  32602200034
berikan penjelasan kode ini baris perbaris dengan komentar, bagian polimorfisme, getter setter, constructor, inheritance
*/

// Deklarasi kelas BubbleSort yang mengimplementasikan antarmuka SortAlgorithm
public class BubbleSort implements SortAlgorithm {
    
    // Implementasi metode sort dari antarmuka SortAlgorithm
    @Override
    public void sort(int[] array) {
        // Mendapatkan panjang array
        int n = array.length;
        
        // Variabel untuk menandai apakah terjadi pertukaran elemen
        boolean swapped;
        
        // Melakukan pengulangan (loop) sampai tidak ada lagi pertukaran yang dilakukan
        do {
            swapped = false; // Menandai bahwa tidak ada pertukaran yang dilakukan
            for (int i = 1; i < n; i++) {
                // Memeriksa apakah elemen sebelumnya lebih besar dari elemen saat ini
                if (array[i - 1] > array[i]) {
                    // Jika ya, lakukan pertukaran elemen
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true; // Menandai bahwa terjadi pertukaran
                }
            }
        } while (swapped); // Ulangi proses jika terdapat pertukaran
    }
}
