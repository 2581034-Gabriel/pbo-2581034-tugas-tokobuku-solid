public class TokoBukuSolid {
    public static void main(String[] args) {
        Buku cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        Buku cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        Buku digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        Buku audio = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        Keranjang pertama = new Keranjang();
        pertama.tambah(cetak1);
        pertama.tambah(cetak2);
        pertama.tambah(digital);
        pertama.tambah(audio);

        Keranjang kedua = new Keranjang();
        kedua.tambah(digital);

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("KERANJANG PERTAMA", pertama);
        System.out.println();
        printer.cetakKeranjang("KERANJANG KEDUA", kedua);
    }
}