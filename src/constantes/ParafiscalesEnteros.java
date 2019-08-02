package constantes;

import impuestos.Parafiscales;

public enum ParafiscalesEnteros {

    /*7: Se crea el mensaje o el valor*/
    CERO(0),
    NOVECIENTOS(900000);

    /*8: Se crea la variable*/
    private int numero;

    /*9: Se crea el constructor de la clase*/
    ParafiscalesEnteros(int i){
        this.numero = i;
    }

    /*10: Se crea el metodo Getter */
    public int getNumero() {
        return numero;
    }

    /*11: Vamos a parafiscales e importarmos esta clase y cambiamos el valor 0 por la constante de esta clase y se crea la clase hija*/

}
