package utils;

import java.util.Comparator;

import Models.Contacto;

public class ContactoComparatorNumeros implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        // comparo por el apellido alfabeticamente
        int resultComparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());

        if (resultComparacionApellido != 0){
            return resultComparacionApellido;
        }

        int resultComparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if (resultComparacionNombre != 0) {
            return resultComparacionNombre;
        }

        return c2.getTelefono().compareTo(c1.getTelefono());
    }
}
