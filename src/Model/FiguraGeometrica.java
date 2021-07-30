package Model;

public class FiguraGeometrica {

    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimetro() {
        return 0;
    }

    public double getDiagonal() {
        return 0;
    }
    
    public String getCoordenadas(){
        return null;
    }
    
    public String getTipo() {
        return null;
    }

}
