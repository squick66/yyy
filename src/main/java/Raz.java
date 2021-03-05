public class Raz {
    String marka;
    int rocznik;


    public Raz(String marka, int rocznik) {
        this.marka = marka;
        this.rocznik = rocznik;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    @Override
    public String toString() {
        return "Raz{" +
                "marka='" + marka + '\'' +
                ", rocznik=" + rocznik +
                '}';
    }
}
