public class DosenMain02 {
    public static void main(String[] args) {
        System.out.println("Informasi Mengenai Dosen 1");
        Dosen02 dosen1 = new Dosen02();
        dosen1.idDosen = "D001";
        dosen1.nama = "Budi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Teknik Elektro";
        dosen1.hitungMasaKerja(2025);
        dosen1.tampilInformasi();

        System.out.println("\nSetelah diubah");
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Teknologi Informasi");
        dosen1.hitungMasaKerja(2025);
        dosen1.tampilInformasi();

        System.out.println("\n===============");
        System.out.println("Informasi Mengenai Dosen 2");
        Dosen02 dosen2 = new Dosen02("D002", "Andi", true, 2015, "Teknik Informatika");
        dosen2.hitungMasaKerja(2025);
        dosen2.tampilInformasi();

        System.out.println("\nSetelah diubah");
        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Teknik Mesin");
        dosen2.hitungMasaKerja(2025);
        dosen2.tampilInformasi();
    }
}
