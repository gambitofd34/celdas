
package figuras;

public class Rectangulo {
    private double longitud;
    private double anchura;
    
    public Rectangulo(){
        longitud=1;
        anchura=1;
    }
    
    public void calcularPerimetro(float lado1, float lado2){
        double perimetro = (lado1*2)+(lado2*2);
        System.out.println("El perimetro es de: "+perimetro);
        
    }
    
    public void calcularArea(float lado1, float lado2){
        double area = lado1*lado2;
        System.out.println("El area es de: "+area);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }
    
    
}
