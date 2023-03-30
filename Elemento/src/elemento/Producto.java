
package elemento;


public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    
    public Producto(){
        codigo = "";
        nombre = "";
        precio = 0;
    }

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void imprimir(){
        System.out.println("Su código es: "+codigo+"\nNombre: "+nombre+"\nPrecio: "+precio);
    }
    
    
    
}
