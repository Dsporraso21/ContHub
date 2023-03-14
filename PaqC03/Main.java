package PaqC03;

public class Main {
    public static void main(String[] args) {
        Contenedor v= new Contenedor(1,"Argentina",3,"Camiseta de Argentina(2022)","Addidas","Amazon");
        Contenedor v2= new Contenedor(10,"Argentina",3,"Vaso mate Selección Argentina","balibetov","Amazon");
        Contenedor v3= new Contenedor(150,"España",2,"Silver Élite AMD Ryzen 5 5500/16GB/500GB SSD/Radeon RX 6600","PcComponentes","fedex");
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
