// Kelas Hewan
class Hewan {

    String nama;
    String jenis;
    String suara;

    // Constructor untuk inisialisasi objek
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan pertama
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");

        // Membuat objek hewan kedua
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Memanggil metode tampilkanInfo() untuk kedua objek
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
