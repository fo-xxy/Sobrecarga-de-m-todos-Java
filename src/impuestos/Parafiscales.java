package impuestos;
/*12: se importa la clase */
import static constantes.ParafiscalesEnteros.CERO;

public class Parafiscales {

    /*3: Se crea el atributo que es el parametro que va arecibir el programa*/
    private double salario;

    /*4: Se crea un constructor de la clase, este tendra parametros y el otro constructor no tendrá parametros, se le
    * llama sobrecarga de metodos*/
    public Parafiscales(double salario) {
        this.salario = salario;
    }

    public Parafiscales() {
        this.salario = CERO.getNumero();
    }

    /*5: Se crean los metodos Getter y Setter*/
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*6: Se crea el package para crear las constantes*/


}
