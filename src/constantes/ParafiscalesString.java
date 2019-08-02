package constantes;

public enum ParafiscalesString {
    SOLICITUD_NOMBRE("Ingresa el nombre del empleado"),
    SOLICITUD_SALARIO("Ingrese el salario"),
    MENSAJE_EMPLEADO("Señor/a: "),
    MENSAJE_SALARIO_BASE("Su salario base es: "),
    MENSAJE_DESCUENTO_SALUD("Su descuento de Salud es: "),
    MENSAJE_DESCUENTO_PENSION("Su descuento de Pension es "),
    MENSAJE_SALARIO_FINAL("Su salario final es: ");

    private String mensaje;

    ParafiscalesString(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
