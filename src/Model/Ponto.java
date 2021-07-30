package Model;

public class Ponto extends FiguraGeometrica {

    private int coordenadaX;
    private int coordenadaY;

    public Ponto() {
        this(0, 0);
        this.id = "PONTO";
    }

    public Ponto(int coordenadaX, int coordenadaY) {
        setId("PONTO");
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void setPonto(String id, int coordenadaX, int coordenadaY) {
        setId(id);
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String getCoordenadas() {      
        return String.valueOf("X: "+coordenadaX+" - Y: "+ coordenadaY); 
    }
    
    @Override
    public String getTipo() {
        return "PONTO";
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

}
