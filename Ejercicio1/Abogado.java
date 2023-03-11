package Ejercicio1;

public class Abogado extends Empleado{
    public int getVacaciones() {
        return super.getVacaciones()/2;
    }

    public double getSalario() {
        return super.getSalario()+40000.0;
    }

    public int getHoras() {
        return super.getHoras()+5;
    }

    public String getMesVacaciones() {
        return super.getMesVacaciones()="Julio";
    }
    public class AbogadoH {
        void mensaje(){
            System.out.println ("Estoy en el tribunal");
        }
    }
}
