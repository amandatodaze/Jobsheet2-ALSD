public class MataKuliahMain02 {
    public static void main(String[] args) {
    MataKuliah02 matkul1 = new MataKuliah02();
    System.out.println("Informasi Mata Kuliah 1");
    matkul1.kodeMK = "MK01";
    matkul1.nama = "Basis Data";
    matkul1.sks = 3;
    matkul1.jumlahJam = 6;
    matkul1.tampilInformasi();

    MataKuliah02 matkul2 = new MataKuliah02("MK02", "Pemrograman Berorientasi Objek", 3, 6);
    System.out.println("\nInformasi Mata Kuliah 2");
    matkul2.tampilInformasi();
    
    System.out.println("\nMengubah SKS Mata Kuliah 1 menjadi 4");
    matkul1.ubahSKS(4);

    System.out.println("\nMenambahkan 2 jam pada Mata Kuliah 2");
    matkul2.tambahJam(2);

    System.out.println("\nMengurangi 1 jam pada Mata Kuliah 2");
    matkul2.kurangiJam(1);
    }
}
