// Tanggung jawab: mencetak struk. Buku dan Keranjang tidak tahu cara mencetak diri.
public class StrukPrinter {
    private static final int LEBAR = 41;

    private void cetakJudul(String judul, char pembatas) {
        int sisa = LEBAR - judul.length() - 2;
        int kiri = sisa / 2;
        int kanan = sisa - kiri;
        System.out.println(String.valueOf(pembatas).repeat(kiri) + " " + judul + " "
                + String.valueOf(pembatas).repeat(kanan));
    }

    public void cetakKeranjang(String judul, Keranjang keranjang) {
        cetakJudul(judul, '=');
        for (Buku buku : keranjang.getIsi()) {
            System.out.println(buku.getJudul() + " (" + buku.getPenulis() + ")");
            System.out.println("  Harga       : " + Buku.formatRupiah(buku.getHarga()));
            System.out.println("  Keterangan  : " + buku.keterangan());
            System.out.println("  Harga akhir : " + Buku.formatRupiah(buku.hargaAkhir()));
        }
        System.out.println("-".repeat(LEBAR));
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }
}
