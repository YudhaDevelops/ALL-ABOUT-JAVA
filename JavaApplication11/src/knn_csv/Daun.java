package knn_csv;

public class Daun {
    String label;
    double panjang, lebar;

    public Daun() {
        panjang = 0;
        lebar = 0;
        label = null;
    }

    public Daun(double panjang, double lebar,String label) {
        this.label = label;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    
}