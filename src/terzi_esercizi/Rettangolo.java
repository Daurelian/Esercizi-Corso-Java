package terzi_esercizi;

public class Rettangolo {
   protected int lm;
   protected   int lM;
   protected double Area;
   protected double Perimetro;

   protected String forma = "Rettangolo";

    public Rettangolo(int lm, int lM) {
        this.lm = lm;
        this.lM = lM;
    }

    public double getArea() {
        return lm*lM;
    }

    public double getPerimetro() {
        return lm*2+lM*2;
    }

    public String toString(){
        return forma;
    }
}


