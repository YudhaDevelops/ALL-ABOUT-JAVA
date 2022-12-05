package knn_csv;

import java.util.ArrayList;

public class DataBesar {
    ArrayList<Includian> listInclu = new ArrayList<Includian>();
    double tebakBenar, tebakSalah;
    double akurasi;
    String tebakK;

    public DataBesar(ArrayList<Includian> listIncludian) {
        this.listInclu = listIncludian;
        this.tebakBenar = 0;
        this.tebakSalah = 0;
        this.akurasi = 0;
        this.tebakK = "";
    }

    public DataBesar() {
        this.listInclu = null;
        this.tebakBenar = 0;
        this.tebakSalah = 0;
        this.akurasi = 0;
        this.tebakK = "";
    }
    
    public DataBesar(int tebakBenar, int tebakSalah, double akurasi, String tebakK) {
        this.tebakBenar = tebakBenar;
        this.tebakSalah = tebakSalah;
        this.akurasi = akurasi;
        this.tebakK = tebakK;
    }

    public String getTebakK() {
        return tebakK;
    }

    public void setTebakK(String tebakK) {
        this.tebakK = tebakK;
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
