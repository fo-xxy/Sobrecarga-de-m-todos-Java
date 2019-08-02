package main;

import impuestos.ParafiscalesDao;
import static constantes.ParafiscalesString.*;

import javax.swing.*;

public class Main {

    /*1: En este ejemplo se crea primero el método principal*/
    public static void main(String[] args){
    /*2: Se crea un package en este caso impuestos y la clase*/

        /*23; Se instancia la clase hija*/
        ParafiscalesDao parafiscalesDao = new ParafiscalesDao();

        /*24: Se crea una variable*/
        String nombre = JOptionPane.showInputDialog(null, SOLICITUD_NOMBRE.getMensaje()  );

        /*25: Se convierte el salario y se muestra el mensaje*/
        String salario = JOptionPane.showInputDialog(null, SOLICITUD_SALARIO.getMensaje() );

        /*26: se llama al objeto de la clase para asignar el valor*/
        parafiscalesDao.setNombre(nombre);
        parafiscalesDao.setSalario(Double.parseDouble(salario));

        /*27: Se imprime el mensaje*/
        JOptionPane.showMessageDialog(null, MENSAJE_EMPLEADO.getMensaje() + parafiscalesDao.getNombre() + "\n"
                + MENSAJE_SALARIO_BASE.getMensaje()  + parafiscalesDao.getSalario() + "\n"
        +  MENSAJE_DESCUENTO_SALUD.getMensaje()+ parafiscalesDao.calcularSalud() + "\n"
        + MENSAJE_DESCUENTO_PENSION.getMensaje() + parafiscalesDao.calcularPension() + "\n"
        + MENSAJE_SALARIO_FINAL.getMensaje() + parafiscalesDao.totalSalario());

        /*28: SE crean las constantes de los mensajes*/


    }
}
