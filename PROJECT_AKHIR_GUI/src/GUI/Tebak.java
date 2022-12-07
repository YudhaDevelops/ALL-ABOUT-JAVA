package GUI;
public class Tebak {
    String labelDataUji, labelTebak;

    public Tebak() {
    }

    public Tebak(String labelDataUji, String labelTebak) {
        this.labelDataUji = labelDataUji;
        this.labelTebak = labelTebak;
    }

    
    public String getLabelDataUji() {
        return labelDataUji;
    }

    public void setLabelDataUji(String labelDataUji) {
        this.labelDataUji = labelDataUji;
    }

    public String getLabelTebak() {
        return labelTebak;
    }

    public void setLabelTebak(String labelTebak) {
        this.labelTebak = labelTebak;
    }
    
    
}
