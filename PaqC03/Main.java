package PaqC03;

public class Main {
    public static void main(String[] args) {
        Contenedor v= new Contenedor(23,"Argentina",3,"Copa del mundo","FIFA","MESSI");
        Contenedor v2= new Contenedor(143,"Argentina",3,"Tumama","china","vergas");
        Contenedor v3= new Contenedor(232,"España",2,"LaMAMa del alex","casd","verrafasd");
       Hub h = new Hub();
        v.setInspeccionado(true);
      h.apilar(v);
      h.apilar(v2);
      h.apilar(v3);
      h.muestraDatos(2);
      h.calcularPais("Argentina");
        System.out.println(h);
    }
}
