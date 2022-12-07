package GUI;
public class Includian {
    double hasilHitung;
    String label;

    public Includian(double hasilHitung, String label) {
        this.hasilHitung = hasilHitung;
        this.label = label;
    }

    
    public double getHasilHitung() {
        return hasilHitung;
    }

    public void setHasilHitung(double hasilHitung) {
        this.hasilHitung = hasilHitung;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
