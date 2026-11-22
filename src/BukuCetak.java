public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    public int hitungOngkir() {
        // Rp5.000 per 500 gram, sisa dibulatkan ke atas
        return (beratGram + 499) / 500 * 5000;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() + hitungOngkir();
    }

    @Override
    public String keterangan() {
        return beratGram + " gram, ongkir " + formatRupiah(hitungOngkir());
    }
}