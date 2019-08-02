package impuestos;

/*13: se hace uso de la herencia */
public class ParafiscalesNombre extends Parafiscales{
    /*14: Se crea una variable*/
    private String nombre;

    /*15: Se crea metodo get y set*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*16: Se crea otra clase en este caso parafiscalesDao y se hereda esta clase*/
}
