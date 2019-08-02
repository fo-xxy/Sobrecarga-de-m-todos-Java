package constantes;


public enum ParafiscalesDouble {
    /*Se crean las constantes*/
    DOS_PORCIENTO(0.02),
    TRES_PORCIENTO(0.03),
    CUATRO_PORCIENTO(0.04),
    CINCO_PORCIENTO(0.05);

    /*Se crea el constructor*/
    private double descuento;
    ParafiscalesDouble(double v) {
        this.descuento = v;
    }

    /*Se crea el metodo get para retornar */
    public double getDescuento() {
        return descuento;
    }

    /*Se hacen los cambios respectivos y nos vamos al main*/
}
