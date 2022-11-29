package knn_csv;
public class Tebak {
    double includian;
    String label, tebakan;

    public Tebak(double includian, String label) {
        this.includian = includian;
        this.label = label;
        this.tebakan = null;
    }
    
    public double getIncludian() {
        return includian;
    }

    public void setIncludian(double includian) {
        this.includian = includian;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTebakan() {
        return tebakan;
    }

    public void setTebakan(String tebakan) {
        this.tebakan = tebakan;
    }
    
    
}
