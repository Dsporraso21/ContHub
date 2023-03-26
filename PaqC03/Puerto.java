package PaqC03;

import javax.swing.*;

public class Puerto {
    private Hub[] h;
    boolean lleno;

    public Puerto(){
        h= new Hub[3];
        this.lleno=false;
    }

    public Hub apilarContenedores(Contenedor x, int nhub) {
        for (int i = 0; i <12 ; i++) {
            for (int j = 0; j <10; j++) {
                if(h[nhub].getContenedor()[i][j]==null){
                    h[nhub].AñadirContenedor(i,j,x);
                    lleno=false;
                    return h[nhub];
                }
                else {
                    lleno=true;


                }
            }

        }
        return null;


    }
    public  void desapilar(int id, int nhub){

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if( h[nhub].getContenedor()[i][j].getNidentificador()==id){
                    h[nhub].AñadirContenedor(i,j,null);


                }

            }


        }


    }
}
