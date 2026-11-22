public interface MetodeBayar {
    String nama();

    // Kontrak totalBayar: hasilnya tidak pernah negatif.   <- baris baru
    int totalBayar(int totalBelanja);


// Langkah 5 (LSP): saat Voucher memakai "return totalBelanja - nilai;", baris voucher
// untuk keranjang kedua tercetak negatif:
// Voucher Rp100.000    : Rp-36.000
// Penyebab: Voucher melanggar kontrak MetodeBayar.totalBayar (hasil tidak boleh negatif).
// Sudah diperbaiki dengan Math.max(0, totalBelanja - nilai) sehingga tercetak Rp0.
    }