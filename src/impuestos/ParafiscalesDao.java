package impuestos;

import static constantes.ParafiscalesEnteros.NOVECIENTOS;
import  static  constantes.ParafiscalesDouble.*;

/*17: Se hereda la clase parafiscalesNombre*/
public class ParafiscalesDao extends ParafiscalesNombre {

    /*18: Se crea un metodo en este caso salud */
    public double calcularSalud(){
        /*19: Se condiciona */
        if(this.getSalario() > NOVECIENTOS.getNumero()){
            return (this.getSalario() * CUATRO_PORCIENTO.getDescuento());
        }
        else
        {
            return (this.getSalario() * DOS_PORCIENTO.getDescuento());
        }
    }

    /*20: Se crea otro metodo para pension*/
    public double calcularPension(){
        if(this.getSalario() > NOVECIENTOS.getNumero()){
            return (this.getSalario() * CINCO_PORCIENTO.getDescuento());
        }
        else
        {
            return (this.getSalario() * TRES_PORCIENTO.getDescuento());
        }
    }

    /*21: Se crea otro metodo del total*/
    public double totalSalario(){
        return (this.getSalario() - (this.calcularSalud() + this.calcularPension()));
    }

    /*22: Se crean las constantes de los mensajes*/
}
