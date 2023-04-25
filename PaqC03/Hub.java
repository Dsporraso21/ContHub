
package PaqC03;

import PaqC03.Contenedor;

public class Hub {
    protected PaqC03.Contenedor[][] c;

    public Hub() {
        this.c = new PaqC03.Contenedor[10][12];
    }
    public PaqC03.Contenedor[][] getContenedor(){
        return c;
    }



    public String obtenerContenedoresConPesoMayorOIgual(double pesoMinimo) {
        StringBuilder sb = new StringBuilder();

        for (examen.Contenedor contenedor : contenedores) {
            if (contenedor.getPeso() >= pesoMinimo) {
                sb.append(contenedor.toString());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                if (c[i][j] == null) {
                    s += "[L]"; //L de que esta libre
                } else s += "[O]"; //O de que esta ocupado

            }
            s += "\n";
        }

        return s;

    }

    public void apilar(PaqC03.Contenedor c1) {
        if (c1 != null) {
            if (c1.getPrioridad() == 1 || c1.getPrioridad() == 2) {
                int columna = c1.getPrioridad() - 1;
                for (int i = c.length - 1; i >= 0; i--) {
                    if (c[i][columna] == null) {
                        c[i][columna] = c1;
                        return;
                    }

                }


            }
        }

        if (c1.getPrioridad() == 3) {
            for (int j = 2; j < c[0].length; j++) {
                for (int i = c.length - 1; i >= 0; i--) {
                    if (c[i][j] == null) {
                        c[i][j] = c1;
                        return;
                    }

                }

            }

        }
    }








    public PaqC03.Contenedor desapila(int columna){
        for (int i = 0; i < c.length; i++) {
            if(c[i][columna] != null){
                PaqC03.Contenedor aux=c[i][columna];
                c[i][columna]=null;
                return aux;

            }

        }
        return null;

    }



    public Contenedor muestraDatos(int nidentificador){

        for (int i = 0; i < c.length ; i++) {
            for (int j = 0; j <c[0].length ; j++) {
                if(c[i][j] != null && c[i][j].getNidentificador()==nidentificador){
                    return c[i][j];

                }

            }
        }
        return null;
    }

    public int calcularPais(String pais){
        int contador=0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                if( c[i][j] !=null && c[i][j].getPais().equals(pais)){
                    contador++;
                }

            }

        }
        return contador;
    }

    public void desapila(){
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j <c[0].length ; j++) {
                if (c[i][j] != null){
                    c[i][j]=null;
                    return;
                }

            }

        }
    }


}
