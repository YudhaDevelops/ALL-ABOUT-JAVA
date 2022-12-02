package knn_csv;

import java.util.ArrayList;

public class DataBesar {
    ArrayList<Includian> listInclu = new ArrayList<Includian>();
    double tebakBenar, tebakSalah;
    double akurasi;

    public DataBesar(ArrayList<Includian> listIncludian) {
        this.listInclu = listIncludian;
        this.tebakBenar = 0;
        this.tebakSalah = 0;
        this.akurasi = 0;
    }

    public DataBesar() {
        this.listInclu = null;
        this.tebakBenar = 0;
        this.tebakSalah = 0;
        this.akurasi = 0;
    }
    
    public DataBesar(int tebakBenar, int tebakSalah, double akurasi) {
        this.tebakBenar = tebakBenar;
        this.tebakSalah = tebakSalah;
        this.akurasi = akurasi;
    }
    
    public ArrayList<Includian> getListInclu() {
        return listInclu;
    }

    public void setListInclu(ArrayList<Includian> listInclu) {
        this.listInclu = listInclu;
    }

    public double getTebakBenar() {
        return tebakBenar;
    }

    public void setTebakBenar(double tebakBenar) {
        this.tebakBenar = tebakBenar;
    }

    public double getTebakSalah() {
        return tebakSalah;
    }

    public void setTebakSalah(double tebakSalah) {
        this.tebakSalah = tebakSalah;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public void setAkurasi(double akurasi) {
        this.akurasi = akurasi;
    }
    
    
}
