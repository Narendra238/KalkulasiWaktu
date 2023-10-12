public class Mahasiswa{
    private int jam;
    private int menit;
    private int detik;
    public int hasil;
    public int hasil(int hasil){
        return (jam*3600) + (menit*60) + detik;
    }
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    public Mahasiswa(int jam, int menit, int detik , int hasil){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
        this.hasil = hasil;
    }
}
