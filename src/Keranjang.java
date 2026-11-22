import java.util.ArrayList;
import java.util.List;

// Tanggung jawab: menyimpan buku dan menghitung total belanja.
public class Keranjang {
    private ArrayList<Buku> isi = new ArrayList<>();

    public void tambah(Buku buku) {
        isi.add(buku);
    }

    public List<Buku> getIsi() {
        return isi;
    }

    public int hitungTotal() {
        int total = 0;
        for (Buku buku : isi) {
            total += buku.hargaAkhir();
        }
        return total;
    }
}