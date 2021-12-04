package Persona;
import PruebaCovid.*;
import java.util.LinkedList;
import java.util.List;

public class Contacto extends Persona {
    private String direccion;
    private List<Sintoma> listaSintomas;

    /**
     *
     * @param cedula
     * @param nombre
     * @param edad
     * @param telefono
     * @param correoElectronico
     * @param direccion
     */
    public Contacto(int cedula, String nombre, int edad, int telefono, String correoElectronico, String direccion) {
        super(cedula, nombre, edad, telefono, correoElectronico);
        this.direccion = direccion;
        this.listaSintomas = new LinkedList<>();
    }

    /**
     * Constructor vacio.
     */
    public Contacto() {
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public List<Sintoma> getListaSintomas() {
        return listaSintomas;
    }

    /**
     *
     * @param listaSintomas
     */
    public void setListaSintomas(List<Sintoma> listaSintomas) {
        this.listaSintomas = listaSintomas;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Contacto= " +
                "Direccion:'" + direccion + '\'' +
                "Cedula: "+ getCedula()+'\n'+
                "Nombre: "+ getNombre()+'\n'+
                "Edad: "+ getEdad()+'\n'+
                "Telefono: "+ getTelefono()+'\n'+
                "Correo Electronic: "+ getCorreoElectronico()+'\n'+
                "Direccion:'" + direccion + '\n' +
                "Lista de Sintomas: " + listaSintomas +
                '.';
    }

    /**
     *
     * @param sintoma
     */
    public void agregarSintomas(Sintoma sintoma){
        listaSintomas.add(sintoma);
    }

}

