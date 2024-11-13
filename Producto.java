
package Taller2;

/**
 *
 * @author altoc
 */
public class Producto {
    
    String nombre;
    int precio;
    
    //constructor con parametros
    public Producto(String nombre,int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
        public String getNombre() {
        return nombre;
    }

        public double getPrecio() {
        return precio;
        
    }
    
    public void mostrarProducto(){
        System.out.println("Producto: \n Nombre= "+ this.nombre +", Precio= "+this.precio+"");
    }
    
    

}
