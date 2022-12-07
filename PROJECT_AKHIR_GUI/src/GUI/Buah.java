package GUI;
public class Buah {
    double R_Men,G_Men,B_Men,R_Var,G_Var,B_Var,R_Skew,G_Skew,B_Skew,R_Kur,G_Kur,B_Kur;
    String label;

    public Buah() {
    }

    public Buah(double R_Men, double G_Men, double B_Men, double R_Var, double G_Var, double B_Var, double R_Skew, double G_Skew, double B_Skew, double R_Kur, double G_Kur, double B_Kur) {
        this.R_Men = R_Men;
        this.G_Men = G_Men;
        this.B_Men = B_Men;
        this.R_Var = R_Var;
        this.G_Var = G_Var;
        this.B_Var = B_Var;
        this.R_Skew = R_Skew;
        this.G_Skew = G_Skew;
        this.B_Skew = B_Skew;
        this.R_Kur = R_Kur;
        this.G_Kur = G_Kur;
        this.B_Kur = B_Kur;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public double getR_Men() {
        return R_Men;
    }

    public void setR_Men(double R_Men) {
        this.R_Men = R_Men;
    }

    public double getG_Men() {
        return G_Men;
    }

    public void setG_Men(double G_Men) {
        this.G_Men = G_Men;
    }

    public double getB_Men() {
        return B_Men;
    }

    public void setB_Men(double B_Men) {
        this.B_Men = B_Men;
    }

    public double getR_Var() {
        return R_Var;
    }

    public void setR_Var(double R_Var) {
        this.R_Var = R_Var;
    }

    public double getG_Var() {
        return G_Var;
    }

    public void setG_Var(double G_Var) {
        this.G_Var = G_Var;
    }

    public double getB_Var() {
        return B_Var;
    }

    public void setB_Var(double B_Var) {
        this.B_Var = B_Var;
    }

    public double getR_Skew() {
        return R_Skew;
    }

    public void setR_Skew(double R_Skew) {
        this.R_Skew = R_Skew;
    }

    public double getG_Skew() {
        return G_Skew;
    }

    public void setG_Skew(double G_Skew) {
        this.G_Skew = G_Skew;
    }

    public double getB_Skew() {
        return B_Skew;
    }

    public void setB_Skew(double B_Skew) {
        this.B_Skew = B_Skew;
    }

    public double getR_Kur() {
        return R_Kur;
    }

    public void setR_Kur(double R_Kur) {
        this.R_Kur = R_Kur;
    }

    public double getG_Kur() {
        return G_Kur;
    }

    public void setG_Kur(double G_Kur) {
        this.G_Kur = G_Kur;
    }

    public double getB_Kur() {
        return B_Kur;
    }

    public void setB_Kur(double B_Kur) {
        this.B_Kur = B_Kur;
    }
}
