
public class MataKuliah02 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    //default
    public MataKuliah02() {
        this.kodeMK = " ";
        this.nama = " ";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // berparameter
    public MataKuliah02(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
    }
    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam telah ditambahkan menjadi " + jumlahJam);
    }
    public void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Jumlah jam awal lebih kecil dari jam pengurang.");

        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi menjadi " + jumlahJam);
        }
    }
}