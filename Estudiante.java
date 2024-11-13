
package Taller2;

/**
 *
 * @author altoc
 */
public class Estudiante {
    
    String nombre;
    int edad;
    
      
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        
    }
        public String getNombre() {
        return nombre;
    }

        public double getEdad() {
        return edad;
        }
    
       public void mostrarDetalles(){
        System.out.println("Estudiante: \n Nombre= "+ this.nombre +", Edad= "+this.edad+"");
       }
       
}
