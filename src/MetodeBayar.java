public interface MetodeBayar {
    String nama();

    // Kontrak totalBayar: hasilnya tidak pernah negatif.   <- baris baru
    int totalBayar(int totalBelanja);
}