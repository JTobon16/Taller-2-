
package Taller2;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Producto producto = new Producto("Laptop", 1500000);
        producto.mostrarProducto();
        
        Estudiante estudiante = new Estudiante ("Andres", 15);
        estudiante.mostrarDetalles();
        
    }
    
    
       /*
      public static void mostrarProducto(){
         System.out.println(this.nombre);
     }
     */
    
   
      public static void mostrarProducto(){
         System.out.println("nombre");
     }
 
   
    
}
