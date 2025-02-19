public class Dosen02 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen02() {

    }

    public Dosen02(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }


    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status dosen telah diubah menjadi: " + (statusAktif? "Aktif" : "Tidak Aktif"));
    }

    void hitungMasaKerja(int thnSkg) {
        int masaKerja = thnSkg - tahunBergabung;
        System.out.println("Masa Kerja      : " + masaKerja + " tahun");
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}
