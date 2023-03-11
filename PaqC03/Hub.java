package PaqC03;

public class Hub  {
protected Contenedor[][] c = new Contenedor[10][12];

public Hub(){

}

    public String toString(){
        String s="";
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                if(c[i][j]==null){
                    s+="[L]"; //L de que esta libre
                }
                else s+="[O]"; //O de que esta ocupado

            }
           s+="\n";
        }

        return s;

    }

public void apilar(Contenedor c1) {
    if (c1.getPrioridad() == 1 || c1.getPrioridad() == 2) {
        int columna = c1.getPrioridad() - 1;
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i][columna] == null) {
                c[i][columna] = c1;
                return;
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


public void desapila(int columna){
    for (int i = 0; i < c.length; i++) {
            if(c[i][columna] != null){
                c[i][columna]=null;
                return;
            }

        }

    }



public void muestraDatos(int nidentificador){
    int encontrado=0;
    for (int i = 0; i < c.length ; i++) {
        for (int j = 0; j <c[0].length ; j++) {
            if(c[i][j] != null && c[i][j].getNidentificador()==nidentificador){
                System.out.println(c[i][j].toString());
                encontrado++;
            }

        }
    }
    if(encontrado==0){
        System.out.println("El contenedor con ese numero de identificador no se encuentra");
    }
}

public void calcularPais(String pais){
    int contador=0;
    for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c[0].length; j++) {
            if( c[i][j] !=null && c[i][j].getPais().equals(pais)){
                contador++;
            }

        }

    }
    System.out.println("Hay un total de "+contador+" contenedores para ese pais");
}


}
