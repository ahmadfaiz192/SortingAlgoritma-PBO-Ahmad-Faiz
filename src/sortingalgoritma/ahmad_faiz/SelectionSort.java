package sortingalgoritma.ahmad_faiz;

/*

author : ahmad faiz setiawantoro
nim :  32602200034
berikan penjelasan kode ini baris perbaris dengan komentar, bagian polimorfisme, getter setter, constructor, inheritance
*/

// Deklarasi kelas SelectionSort yang mengimplementasikan antarmuka SortAlgorithm
public class SelectionSort implements SortAlgorithm {
    
    // Implementasi metode sort dari antarmuka SortAlgorithm
    @Override
    public void sort(int[] array) {
        // Mendapatkan panjang array
        int n = array.length;
        
        // Iterasi melalui seluruh array
        for (int i = 0; i < n - 1; i++) {
            // Temukan nilai minimum dalam sisa array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Memeriksa apakah ada nilai yang lebih kecil dari nilai minimum yang ditemukan
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Jika ya, update nilai minimum
                }
            }
            // Tukar nilai minimum dengan nilai pertama dalam sisa array
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
