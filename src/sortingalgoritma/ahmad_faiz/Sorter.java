package sortingalgoritma.ahmad_faiz;

/*

author : ahmad faiz setiawantoro
nim :  32602200034
berikan penjelasan kode ini baris perbaris dengan komentar, bagian polimorfisme, getter setter, constructor, inheritance
*/

// Deklarasi kelas Sorter
public class Sorter {
    // Deklarasi atribut privat sortAlgorithm bertipe SortAlgorithm
    private SortAlgorithm sortAlgorithm;

    // Constructor default
    public Sorter() {
        // Default constructor
    }

    // Getter untuk mendapatkan nilai sortAlgorithm
    public SortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }

    // Setter untuk mengatur nilai sortAlgorithm
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    // Metode performSort menggunakan polimorfisme
    public void performSort(int[] array) {
        // Memeriksa apakah sortAlgorithm tidak null
        if (sortAlgorithm != null) {
            // Jika tidak null, memanggil metode sort pada objek sortAlgorithm
            sortAlgorithm.sort(array);
        } else {
            // Jika null, mencetak pesan bahwa algoritma sorting belum diatur
            System.out.println("Mohon atur algoritma sorting terlebih dahulu.");
        }
    }
}
