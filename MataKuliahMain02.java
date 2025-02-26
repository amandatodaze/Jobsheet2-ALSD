public class MataKuliahMain02 {
    public static void main(String[] args) {
    MataKuliah02 matkul1 = new MataKuliah02();
    System.out.println("Informasi Mata Kuliah 1");
    matkul1.kodeMK = "MK01";
    matkul1.nama = "Basis Data";
    matkul1.sks = 3;
    matkul1.jumlahJam = 6;
    matkul1.tampilInformasi();

    matkul1.ubahSKS(4);
    matkul1.tambahJam(2);
    matkul1.kurangiJam(3);

    System.out.println("Setelah perubahan:");
    matkul1.tampilInformasi();

    MataKuliah02 matkul2 = new MataKuliah02("MK02", "Pemrograman Berorientasi Objek", 3, 6);
    System.out.println("Informasi Mata Kuliah 2");
    matkul2.tampilInformasi();

    matkul2.tambahJam(2);
    matkul2.kurangiJam(5);

    System.out.println("Setelah perubahan: ");
    matkul2.tampilInformasi();
    }
}
