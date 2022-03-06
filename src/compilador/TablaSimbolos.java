package compilador;

import java.util.*;

/**
 *
 * @author Juan Pablo
 */

class Simbolo {

    String nombre;
    Object valor;

    public Simbolo(String nombre, Object valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
}

public class TablaSimbolos {

    HashMap t;

    public TablaSimbolos() {
        t = new HashMap();
    }

    public Simbolo insertar(String nombre) {
        Simbolo s = new Simbolo(nombre, null);
        t.put(nombre, s);
        return s;
    }

    public Simbolo buscar(String nombre) {
        return (Simbolo) (t.get(nombre));
    }

    public void imprimir() {
        Iterator it = t.values().iterator();
        while (it.hasNext()) {
            Simbolo s = (Simbolo) it.next();
            System.out.print(s.nombre + ": ");
            if (s.valor == null) {
                System.out.print("i: Indefinido");
            } else if (s.valor instanceof Integer) {
                System.out.print("e: " + s.valor.toString());
            } else if (s.valor instanceof String) {
                System.out.print("c: " + s.valor);
            }
        }
    }
}

//cambios
