package PaqC03;
import PaqC03.Contenedor;
import PaqC03.Hub;

public class Puerto {
    private PaqC03.Hub[] P;
    boolean lleno;

    public Puerto() {
        P = new PaqC03.Hub[3];
        for (int i = 0; i < P.length; i++) {
            PaqC03.Hub aux = new Hub();
            P[i] = aux;

        }


    }

    public boolean Ocupado (int hub){  //ok
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                if(P[hub].getContenedor()[i][j]==null){
                    return false;
                }
            }
        }
        return true;
    }



    public PaqC03.Contenedor apilar(PaqC03.Contenedor c, int hub) {
        if (Ocupado(hub)){
            return null;

        }
        else{
            P[hub].apilar(c);
            return c;
        }
    }


    public void desapilar(int hub, int col) {
        P[hub].desapila(col);
    }

    public String toString(int hub) {
        return P[hub].toString();
    }
    public Contenedor muestraDatosid(int hub, int id){
        return P[hub].muestraDatos(id);
    }
    public int ContadorPaises(String pais,int hub){
        return P[hub].calcularPais(pais);
    }
}


