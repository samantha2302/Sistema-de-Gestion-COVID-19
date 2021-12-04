package Persona;

import PruebaCovid.*;
import java.util.LinkedList;
import java.util.List;


public class Paciente extends Persona {
    private String lugarResidencia;
    private String fechaSintomas;
    private List<Sintoma> listaSintomas;
    private List<Prueba> pruebasAplicadas;
    private List<Contacto> listaContactos;

    /**
     *
     * @param cedula
     * @param nombre
     * @param edad
     * @param telefono
     * @param correoElectronico
     * @param lugarResidencia
     * @param fechaSintomas
     */
    public Paciente(int cedula, String nombre, int edad, int telefono, String correoElectronico, String lugarResidencia, String fechaSintomas) {
        super(cedula, nombre, edad, telefono, correoElectronico);
        this.lugarResidencia = lugarResidencia;
        this.fechaSintomas = fechaSintomas;
        this.listaSintomas = new LinkedList<>();
        this.pruebasAplicadas = new LinkedList<>();
        this.listaContactos = new LinkedList<>();
    }

    /**
     * Constructor vacio
     */
    // Constructor vacio para inicializar.
    public Paciente() {
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
    public String getLugarResidencia() {
        return lugarResidencia;
    }

    /**
     *
     * @param lugarResidencia
     */
    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    /**
     *
     * @return
     */
    public List<Prueba> getPruebasAplicadas() {
        return pruebasAplicadas;
    }

    /**
     *
     * @param pruebasAplicadas
     */
    public void setPruebasAplicadas(List<Prueba> pruebasAplicadas) {
        this.pruebasAplicadas = pruebasAplicadas;
    }

    /**
     *
     * @return
     */
    public String getFechaSintomas() {
        return fechaSintomas;
    }

    /**
     *
     * @param fechaSintomas
     */
    public void setFechaSintomas(String fechaSintomas) {
        this.fechaSintomas = fechaSintomas;
    }

    /**
     *
     * @return
     */
    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    /**
     *
     * @param listaContactos
     */
    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Paciente=" +
                "Cedula: "+ getCedula()+'\n'+
                "Nombre: "+ getNombre()+'\n'+
                "Edad: "+ getEdad()+'\n'+
                "Telefono: "+ getTelefono()+'\n'+
                "Correo Electronic: "+ getCorreoElectronico()+'\n'+
                "Lugar Residencia: " + lugarResidencia + '\n' +
                "Fecha Sintomas: " + fechaSintomas + '\n' +
                "Lista Sintomas: " + listaSintomas +
                "Pruebas Aplicadas: " + pruebasAplicadas + '\n' +
                "Lista Contactos: " + listaContactos +
                '.';
    }

    /**
     *
     * @param sintoma
     * @param contacto
     */
    // Metodos de contacto.
    public void guardarDatoContacto(Sintoma sintoma, Contacto contacto){
        if(verificarContacto(contacto.getCedula())){
            System.out.println("Los datos de los contactos ya se encuentran registrados.");
        }
        else{
            listaContactos.add(contacto);
            contacto.agregarSintomas(sintoma);
            System.out.println("Los datos del contacto: "+ contacto.getNombre()+" ya se encuentran registrados.");
        }
    }

    /**
     *
     * @param idContacto
     * @return
     */
    private boolean verificarContacto(int idContacto){
        for(Contacto item:listaContactos){
            if(item.getCedula() == idContacto){
                return true;
            }

        }
        return false;
    }

    /**
     *
     * @param idContacto
     * @param cedulaNueva
     * @param nombreNuevo
     * @param edadNueva
     * @param telefonoNuevo
     * @param correoElectronicoNuevo
     * @param direccionNueva
     */
    public void modificarDatoContacto(int idContacto, int cedulaNueva, String nombreNuevo, int edadNueva, int telefonoNuevo, String correoElectronicoNuevo, String direccionNueva){
        for(Contacto item: listaContactos){
            if(item.getCedula() == idContacto){
               item.setCedula(cedulaNueva);
               item.setNombre(nombreNuevo);
               item.setEdad(edadNueva);
               item.setTelefono(telefonoNuevo);
               item.setCorreoElectronico(correoElectronicoNuevo);
               item.setDireccion(direccionNueva);
            }
            else{
                System.out.println("Los datos de los contactos no se encuentran guardados.");
            }
        }
    }

    /**
     *
     * @param sintoma
     */
    public void agregarSintomas(Sintoma sintoma){
        listaSintomas.add(sintoma);
    }

    /**
     *
     * @param prueba
     */
    //Pruebas Aplicadas.
    public void registrarPrueba(Prueba prueba){
        pruebasAplicadas.add(prueba);
    }
}

