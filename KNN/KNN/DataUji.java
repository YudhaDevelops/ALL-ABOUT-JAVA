package KNN;

public class DataUji {
    
    String label;
    double panjang;
    double lebar;

    public DataUji(String label, double panjang, double lebar) {
        this.label = label;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public String getLabel() {
        return label;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    
}
