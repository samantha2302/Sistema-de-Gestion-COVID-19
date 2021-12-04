package Area;

import Persona.*;
import PruebaCovid.*;
import java.util.LinkedList;
import java.util.List;

public class AreaSalud {
    private int idAreaSalud;
    private String nombreArea;
    private String nombrePersona;
    private int telefono;
    private String correoElectronico;
    private String direccion;
    private String areaAtraccion;
    //Listas.
    private List<AreaSalud> listaAreaSalud;
    private List<Paciente> listaPacientes1;
    private List<Paciente> listaPacientes2;
    private List<Paciente> listaPacientes3;
    private List<Paciente> listaPacientes4;
    private List<Paciente> listaPacientes5;
    private List<Paciente> listaPacientes6;
    private List<Paciente> listaPacientes7;

    private List<OrdenSanitaria> listaOrdenesSanitariasPaciente1;
    private List<OrdenSanitaria> listaOrdenesSanitariasPaciente2;
    private List<OrdenSanitaria> listaOrdenesSanitariasPaciente3;
    private List<OrdenSanitaria> listaOrdenesSanitariasPaciente4;
    private List<OrdenSanitaria> listaOrdenesSanitariasPaciente5;
    private List<OrdenSanitaria> listaOrdenesSanitariasPaciente6;
    private List<OrdenSanitaria> listaOrdenesSanitariasPaciente7;


    private List<OrdenSanitaria> listaOrdenesSanitariasContacto1;
    private List<OrdenSanitaria> listaOrdenesSanitariasContacto2;
    private List<OrdenSanitaria> listaOrdenesSanitariasContacto3;
    private List<OrdenSanitaria> listaOrdenesSanitariasContacto4;
    private List<OrdenSanitaria> listaOrdenesSanitariasContacto5;
    private List<OrdenSanitaria> listaOrdenesSanitariasContacto6;
    private List<OrdenSanitaria> listaOrdenesSanitariasContacto7;

    /**
     *
     * @param idAreaSalud
     * @param nombreArea
     * @param nombrePersona
     * @param telefono
     * @param correoElectronico
     * @param direccion
     * @param areaAtraccion
     */
    public AreaSalud(int idAreaSalud, String nombreArea, String nombrePersona, int telefono, String correoElectronico, String direccion, String areaAtraccion) {
        this.idAreaSalud = idAreaSalud;
        this.nombreArea = nombreArea;
        this.nombrePersona = nombrePersona;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.areaAtraccion = areaAtraccion;
        //Instancia de lista.
        this.listaAreaSalud = new LinkedList<>();
        //Instancia de listas de pacientes.
        this.listaPacientes1 = new LinkedList<>();
        this.listaPacientes2 = new LinkedList<>();
        this.listaPacientes3 = new LinkedList<>();
        this.listaPacientes4 = new LinkedList<>();
        this.listaPacientes5 = new LinkedList<>();
        this.listaPacientes6 = new LinkedList<>();
        this.listaPacientes7 = new LinkedList<>();

        //Listas de ordenes sanitarias Paciente.
        this.listaOrdenesSanitariasPaciente1 = new LinkedList<>();
        this.listaOrdenesSanitariasPaciente2 = new LinkedList<>();
        this.listaOrdenesSanitariasPaciente3 = new LinkedList<>();
        this.listaOrdenesSanitariasPaciente4 = new LinkedList<>();
        this.listaOrdenesSanitariasPaciente5 = new LinkedList<>();
        this.listaOrdenesSanitariasPaciente6 = new LinkedList<>();
        this.listaOrdenesSanitariasPaciente7 = new LinkedList<>();


        //Listas de ordenes sanitarias Contacto.
        this.listaOrdenesSanitariasContacto1 = new LinkedList<>();
        this.listaOrdenesSanitariasContacto2 = new LinkedList<>();
        this.listaOrdenesSanitariasContacto3 = new LinkedList<>();
        this.listaOrdenesSanitariasContacto4 = new LinkedList<>();
        this.listaOrdenesSanitariasContacto5 = new LinkedList<>();
        this.listaOrdenesSanitariasContacto6 = new LinkedList<>();
        this.listaOrdenesSanitariasContacto7 = new LinkedList<>();

    }

    /**
     * Constructor vacio.
     */
    // Construtor vacio para hacer instancias.
    public AreaSalud() {
    }

    /**
     *
     * @return
     */
    public int getIdAreaSalud() {
        return idAreaSalud;
    }

    /**
     *
     * @param idAreaSalud
     */
    public void setIdAreaSalud(int idAreaSalud) {
        this.idAreaSalud = idAreaSalud;
    }

    /**
     *
     * @return
     */
    public String getNombreArea() {
        return nombreArea;
    }

    /**
     *
     * @param nombreArea
     */
    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    /**
     *
     * @return
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     *
     * @param nombrePersona
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    /**
     *
     * @return
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     *
     * @param correoElectronico
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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
    public String getAreaAtraccion() {
        return areaAtraccion;
    }

    /**
     *
     * @param areaAtraccion
     */
    public void setAreaAtraccion(String areaAtraccion) {
        this.areaAtraccion = areaAtraccion;
    }

    /**
     *
     * @return
     */
    public List<AreaSalud> getListaAreaSalud() {
        return listaAreaSalud;
    }

    /**
     *
     * @param listaAreaSalud
     */
    public void setListaAreaSalud(List<AreaSalud> listaAreaSalud) {
        this.listaAreaSalud = listaAreaSalud;
    }

    /**
     *
     * @return
     */
    // Aqui estan los getter y setter de las 8 listas de pacientes para cada area.
    public List<Paciente> getListaPacientes1() {
        return listaPacientes1;
    }

    /**
     *
     * @param listaPacientes
     */
    public void setListaPacientes1(List<Paciente> listaPacientes) {
        this.listaPacientes1 = listaPacientes1;
    }

    /**
     *
     * @return
     */
    public List<Paciente> getListaPacientes2() {
        return listaPacientes2;
    }

    /**
     *
     * @param listaPacientes2
     */
    public void setListaPacientes2(List<Paciente> listaPacientes2) {
        this.listaPacientes2 = listaPacientes2;
    }

    /**
     *
     * @return
     */
    public List<Paciente> getListaPacientes3() {
        return listaPacientes3;
    }

    /**
     *
     * @param listaPacientes3
     */
    public void setListaPacientes3(List<Paciente> listaPacientes3) {
        this.listaPacientes3 = listaPacientes3;
    }

    /**
     *
     * @return
     */
    public List<Paciente> getListaPacientes4() {
        return listaPacientes4;
    }

    /**
     *
     * @param listaPacientes4
     */
    public void setListaPacientes4(List<Paciente> listaPacientes4) {
        this.listaPacientes4 = listaPacientes4;
    }

    /**
     *
     * @return
     */
    public List<Paciente> getListaPacientes5() {
        return listaPacientes5;
    }

    /**
     *
     * @param listaPacientes5
     */
    public void setListaPacientes5(List<Paciente> listaPacientes5) {
        this.listaPacientes5 = listaPacientes5;
    }

    /**
     *
     * @return
     */
    public List<Paciente> getListaPacientes6() {
        return listaPacientes6;
    }

    /**
     *
     * @param listaPacientes6
     */
    public void setListaPacientes6(List<Paciente> listaPacientes6) {
        this.listaPacientes6 = listaPacientes6;
    }

    public List<Paciente> getListaPacientes7() {
        return listaPacientes7;
    }

    /**
     *
     * @param listaPacientes7
     */
    public void setListaPacientes7(List<Paciente> listaPacientes7) {
        this.listaPacientes7 = listaPacientes7;
    }

    /**
     *
     * @return
     */
    //Aqui estan todas las listas de las ordenes sanitarias de contacto de todas las areas.
    public List<OrdenSanitaria> getListaOrdenesSanitariasContacto1() {
        return listaOrdenesSanitariasContacto1;
    }

    /**
     *
     * @param listaOrdenesSanitariasContacto1
     */
    public void setListaOrdenesSanitariasContacto1(List<OrdenSanitaria> listaOrdenesSanitariasContacto1) {
        this.listaOrdenesSanitariasContacto1 = listaOrdenesSanitariasContacto1;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasContacto2() {
        return listaOrdenesSanitariasContacto2;
    }

    /**
     *
     * @param listaOrdenesSanitariasContacto2
     */
    public void setListaOrdenesSanitariasContacto2(List<OrdenSanitaria> listaOrdenesSanitariasContacto2) {
        this.listaOrdenesSanitariasContacto2 = listaOrdenesSanitariasContacto2;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasContacto3() {
        return listaOrdenesSanitariasContacto3;
    }

    /**
     *
     * @param listaOrdenesSanitariasContacto3
     */
    public void setListaOrdenesSanitariasContacto3(List<OrdenSanitaria> listaOrdenesSanitariasContacto3) {
        this.listaOrdenesSanitariasContacto3 = listaOrdenesSanitariasContacto3;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasContacto4() {
        return listaOrdenesSanitariasContacto4;
    }

    /**
     *
     * @param listaOrdenesSanitariasContacto4
     */
    public void setListaOrdenesSanitariasContacto4(List<OrdenSanitaria> listaOrdenesSanitariasContacto4) {
        this.listaOrdenesSanitariasContacto4 = listaOrdenesSanitariasContacto4;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasContacto5() {
        return listaOrdenesSanitariasContacto5;
    }

    /**
     *
     * @param listaOrdenesSanitariasContacto5
     */
    public void setListaOrdenesSanitariasContacto5(List<OrdenSanitaria> listaOrdenesSanitariasContacto5) {
        this.listaOrdenesSanitariasContacto5 = listaOrdenesSanitariasContacto5;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasContacto6() {
        return listaOrdenesSanitariasContacto6;
    }

    /**
     *
     * @param listaOrdenesSanitariasContacto6
     */
    public void setListaOrdenesSanitariasContacto6(List<OrdenSanitaria> listaOrdenesSanitariasContacto6) {
        this.listaOrdenesSanitariasContacto6 = listaOrdenesSanitariasContacto6;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasContacto7() {
        return listaOrdenesSanitariasContacto7;
    }

    /**
     *
     * @param listaOrdenesSanitariasContacto7
     */
    public void setListaOrdenesSanitariasContacto7(List<OrdenSanitaria> listaOrdenesSanitariasContacto7) {
        this.listaOrdenesSanitariasContacto7 = listaOrdenesSanitariasContacto7;
    }

    /**
     *
     * @return
     */
    //Aqui estan las ordenes sanitarias de pacientes de todas las areas.
    public List<OrdenSanitaria> getListaOrdenesSanitariasPaciente1() {
        return listaOrdenesSanitariasPaciente1;
    }

    /**
     *
     * @param listaOrdenesSanitariasPaciente1
     */
    public void setListaOrdenesSanitariasPaciente1(List<OrdenSanitaria> listaOrdenesSanitariasPaciente1) {
        this.listaOrdenesSanitariasPaciente1 = listaOrdenesSanitariasPaciente1;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasPaciente2() {
        return listaOrdenesSanitariasPaciente2;
    }

    /**
     *
     * @param listaOrdenesSanitariasPaciente2
     */
    public void setListaOrdenesSanitariasPaciente2(List<OrdenSanitaria> listaOrdenesSanitariasPaciente2) {
        this.listaOrdenesSanitariasPaciente2 = listaOrdenesSanitariasPaciente2;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasPaciente3() {
        return listaOrdenesSanitariasPaciente3;
    }

    /**
     *
     * @param listaOrdenesSanitariasPaciente3
     */

    public void setListaOrdenesSanitariasPaciente3(List<OrdenSanitaria> listaOrdenesSanitariasPaciente3) {
        this.listaOrdenesSanitariasPaciente3 = listaOrdenesSanitariasPaciente3;
    }
    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasPaciente4() {
        return listaOrdenesSanitariasPaciente4;
    }
    /**
     *
     * @param listaOrdenesSanitariasPaciente4
     */
    public void setListaOrdenesSanitariasPaciente4(List<OrdenSanitaria> listaOrdenesSanitariasPaciente4) {
        this.listaOrdenesSanitariasPaciente4 = listaOrdenesSanitariasPaciente4;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasPaciente5() {
        return listaOrdenesSanitariasPaciente5;
    }

    /**
     *
     * @param listaOrdenesSanitariasPaciente5
     */
    public void setListaOrdenesSanitariasPaciente5(List<OrdenSanitaria> listaOrdenesSanitariasPaciente5) {
        this.listaOrdenesSanitariasPaciente5 = listaOrdenesSanitariasPaciente5;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasPaciente6() {
        return listaOrdenesSanitariasPaciente6;
    }

    /**
     *
     * @param listaOrdenesSanitariasPaciente6
     */
    public void setListaOrdenesSanitariasPaciente6(List<OrdenSanitaria> listaOrdenesSanitariasPaciente6) {
        this.listaOrdenesSanitariasPaciente6 = listaOrdenesSanitariasPaciente6;
    }

    /**
     *
     * @return
     */
    public List<OrdenSanitaria> getListaOrdenesSanitariasPaciente7() {
        return listaOrdenesSanitariasPaciente7;
    }

    /**
     *
     * @param listaOrdenesSanitariasPaciente7
     */
    public void setListaOrdenesSanitariasPaciente7(List<OrdenSanitaria> listaOrdenesSanitariasPaciente7) {
        this.listaOrdenesSanitariasPaciente7 = listaOrdenesSanitariasPaciente7;
    }

    /**
     *
     * @param areaSalud
     */
    // Area de Salud.
    public void registrarAreaSalud(AreaSalud areaSalud){
        if ( verificarAreaSalud(areaSalud.getIdAreaSalud()) ){
            System.out.println("La Area de Salud ya se encuentra registrada.");
        }
        else{
            this.listaAreaSalud.add(areaSalud);
            System.out.println("La Area de Salud con el nombre de: " + areaSalud.getNombreArea() + " ha sido registrada correctamente");
        }
    }

    /**
     *
     * @param idAreaSalud
     * @return
     */
    private boolean verificarAreaSalud(int idAreaSalud){
        for (AreaSalud item : listaAreaSalud){
            if(item.getIdAreaSalud() == idAreaSalud){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idArea
     * @param idAreaSaludNuevo
     * @param nomAreaNuevo
     * @param nomPersonaNueva
     * @param telefonoNuevo
     * @param correoElectronicoNuevo
     * @param direccionNueva
     * @param areaAtraccionNueva
     */
    public void modificarAreaSalud(int idArea,int idAreaSaludNuevo, String nomAreaNuevo, String nomPersonaNueva, int telefonoNuevo, String correoElectronicoNuevo, String direccionNueva, String areaAtraccionNueva){
        for (AreaSalud item : listaAreaSalud) {
            if (item.getIdAreaSalud() == idArea) {
                item.setIdAreaSalud(idAreaSaludNuevo);
                item.setNombreArea(nomAreaNuevo);
                item.setNombrePersona(nomPersonaNueva);
                item.setTelefono(telefonoNuevo);
                item.setCorreoElectronico(correoElectronicoNuevo);
                item.setDireccion(direccionNueva);
                item.setAreaAtraccion(areaAtraccionNueva);
            }
            else{
                System.out.println("No se encuentra registrada");
            }
        }


    }

    /**
     *
     * @param sintoma
     * @param prueba
     * @param paciente1
     */
    // Paciente area 1
    public void registrarPaciente1(Sintoma sintoma,Prueba prueba, Paciente paciente1){
        if (verificarPaciente1(paciente1.getCedula())){
            System.out.println("El paciente ya se encuentra registrado.");
        }
        else {
            paciente1.agregarSintomas(sintoma);
            paciente1.registrarPrueba(prueba);
            listaPacientes1.add(paciente1);
            System.out.println("El paciente con el nombre de: " + paciente1.getNombre() + " ha sido registrado correctamente");
        }
    }

    /**
     *
     * @param idPaciente
     * @return
     */
    private boolean verificarPaciente1(int idPaciente){
        for(Paciente item : listaPacientes1){
            if (item.getCedula() == idPaciente){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idPaciente
     * @param cedulaNueva
     * @param nombreNuevo
     * @param edadNuevo
     * @param telefonoNuevo
     * @param correoElectronicoNuevo
     * @param lugarResidenciaNuevo
     */
    public void modificarPaciente1(int idPaciente, int cedulaNueva, String nombreNuevo, int edadNuevo, int telefonoNuevo, String correoElectronicoNuevo, String lugarResidenciaNuevo){
        for(Paciente item: listaPacientes1){
            if (item.getCedula() == idPaciente) {
                item.setCedula(cedulaNueva);
                item.setNombre(nombreNuevo);
                item.setEdad(edadNuevo);
                item.setTelefono(telefonoNuevo);
                item.setCorreoElectronico(correoElectronicoNuevo);
                item.setLugarResidencia(lugarResidenciaNuevo);
            }
            else{
                System.out.println("El paciente no se encuentra registrado.");
            }
        }
    }

    /**
     *
     * @param sintoma
     * @param prueba
     * @param paciente2
     */
    // Paciente area 2
    public void registrarPaciente2(Sintoma sintoma,Prueba prueba, Paciente paciente2){
        if (verificarPaciente2(paciente2.getCedula())){
            System.out.println("El paciente ya se encuentra registrado.");
        }
        else {
            paciente2.agregarSintomas(sintoma);
            paciente2.registrarPrueba(prueba);
            listaPacientes2.add(paciente2);
            System.out.println("El paciente con el nombre de: " + paciente2.getNombre() + " ha sido registrado correctamente");
        }
    }

    /**
     *
     * @param idPaciente
     * @return
     */
    private boolean verificarPaciente2(int idPaciente){
        for(Paciente item : listaPacientes2){
            if (item.getCedula() == idPaciente){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idPaciente
     * @param cedulaNueva
     * @param nombreNuevo
     * @param edadNuevo
     * @param telefonoNuevo
     * @param correoElectronicoNuevo
     * @param lugarResidenciaNuevo
     */
    public void modificarPaciente2(int idPaciente, int cedulaNueva, String nombreNuevo, int edadNuevo, int telefonoNuevo, String correoElectronicoNuevo, String lugarResidenciaNuevo){
        for(Paciente item: listaPacientes2){
            if (item.getCedula() == idPaciente) {
                item.setCedula(cedulaNueva);
                item.setNombre(nombreNuevo);
                item.setEdad(edadNuevo);
                item.setTelefono(telefonoNuevo);
                item.setCorreoElectronico(correoElectronicoNuevo);
                item.setLugarResidencia(lugarResidenciaNuevo);
            }
            else{
                System.out.println("El paciente no se encuentra registrado.");
            }
        }
    }

    /**
     *
     * @param sintoma
     * @param prueba
     * @param paciente3
     */
    // Paciente area 3.
    public void registrarPaciente3(Sintoma sintoma,Prueba prueba, Paciente paciente3){
        if (verificarPaciente3(paciente3.getCedula())){
            System.out.println("El paciente ya se encuentra registrado.");
        }
        else {
            paciente3.agregarSintomas(sintoma);
            paciente3.registrarPrueba(prueba);
            listaPacientes3.add(paciente3);
            System.out.println("El paciente con el nombre de: " + paciente3.getNombre() + " ha sido registrado correctamente");
        }
    }

    /**
     *
     * @param idPaciente
     * @return
     */
    private boolean verificarPaciente3(int idPaciente){
        for(Paciente item : listaPacientes3){
            if (item.getCedula() == idPaciente){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idPaciente
     * @param cedulaNueva
     * @param nombreNuevo
     * @param edadNuevo
     * @param telefonoNuevo
     * @param correoElectronicoNuevo
     * @param lugarResidenciaNuevo
     */
    public void modificarPaciente3(int idPaciente, int cedulaNueva, String nombreNuevo, int edadNuevo, int telefonoNuevo, String correoElectronicoNuevo, String lugarResidenciaNuevo){
        for(Paciente item: listaPacientes3){
            if (item.getCedula() == idPaciente) {
                item.setCedula(cedulaNueva);
                item.setNombre(nombreNuevo);
                item.setEdad(edadNuevo);
                item.setTelefono(telefonoNuevo);
                item.setCorreoElectronico(correoElectronicoNuevo);
                item.setLugarResidencia(lugarResidenciaNuevo);
            }
            else{
                System.out.println("El paciente no se encuentra registrado.");
            }
        }
    }

    /**
     *
     * @param sintoma
     * @param prueba
     * @param paciente4
     */
    // Paciente
    public void registrarPaciente4(Sintoma sintoma,Prueba prueba, Paciente paciente4){
        if (verificarPaciente4(paciente4.getCedula())){
            System.out.println("El paciente ya se encuentra registrado.");
        }
        else {
            paciente4.agregarSintomas(sintoma);
            paciente4.registrarPrueba(prueba);
            listaPacientes4.add(paciente4);
            System.out.println("El paciente con el nombre de: " + paciente4.getNombre() + " ha sido registrado correctamente");
        }
    }

    /**
     *
     * @param idPaciente
     * @return
     */
    private boolean verificarPaciente4(int idPaciente){
        for(Paciente item : listaPacientes4){
            if (item.getCedula() == idPaciente){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idPaciente
     * @param cedulaNueva
     * @param nombreNuevo
     * @param edadNuevo
     * @param telefonoNuevo
     * @param correoElectronicoNuevo
     * @param lugarResidenciaNuevo
     */
    public void modificarPaciente4(int idPaciente, int cedulaNueva, String nombreNuevo, int edadNuevo, int telefonoNuevo, String correoElectronicoNuevo, String lugarResidenciaNuevo){
        for(Paciente item: listaPacientes4){
            if (item.getCedula() == idPaciente) {
                item.setCedula(cedulaNueva);
                item.setNombre(nombreNuevo);
                item.setEdad(edadNuevo);
                item.setTelefono(telefonoNuevo);
                item.setCorreoElectronico(correoElectronicoNuevo);
                item.setLugarResidencia(lugarResidenciaNuevo);
            }
            else{
                System.out.println("El paciente no se encuentra registrado.");
            }
        }
    }

    /**
     *
     * @param sintoma
     * @param prueba
     * @param paciente5
     */
    // Paciente area 5
    public void registrarPaciente5(Sintoma sintoma,Prueba prueba, Paciente paciente5){
        if (verificarPaciente5(paciente5.getCedula())){
            System.out.println("El paciente ya se encuentra registrado.");
        }
        else {
            paciente5.agregarSintomas(sintoma);
            paciente5.registrarPrueba(prueba);
            listaPacientes5.add(paciente5);
            System.out.println("El paciente con el nombre de: " + paciente5.getNombre() + " ha sido registrado correctamente");
        }
    }

    /**
     *
     * @param idPaciente
     * @return
     */
    private boolean verificarPaciente5(int idPaciente){
        for(Paciente item : listaPacientes5){
            if (item.getCedula() == idPaciente){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idPaciente
     * @param cedulaNueva
     * @param nombreNuevo
     * @param edadNuevo
     * @param telefonoNuevo
     * @param correoElectronicoNuevo
     * @param lugarResidenciaNuevo
     */
    public void modificarPaciente5(int idPaciente, int cedulaNueva, String nombreNuevo, int edadNuevo, int telefonoNuevo, String correoElectronicoNuevo, String lugarResidenciaNuevo){
        for(Paciente item: listaPacientes5){
            if (item.getCedula() == idPaciente) {
                item.setCedula(cedulaNueva);
                item.setNombre(nombreNuevo);
                item.setEdad(edadNuevo);
                item.setTelefono(telefonoNuevo);
                item.setCorreoElectronico(correoElectronicoNuevo);
                item.setLugarResidencia(lugarResidenciaNuevo);
            }
            else{
                System.out.println("El paciente no se encuentra registrado.");
            }
        }
    }

    /**
     *
     * @param sintoma
     * @param prueba
     * @param paciente6
     */
    // Paciente area 6
    public void registrarPaciente6(Sintoma sintoma,Prueba prueba, Paciente paciente6){
        if (verificarPaciente6(paciente6.getCedula())){
            System.out.println("El paciente ya se encuentra registrado.");
        }
        else {
            paciente6.agregarSintomas(sintoma);
            paciente6.registrarPrueba(prueba);
            listaPacientes6.add(paciente6);
            System.out.println("El paciente con el nombre de: " + paciente6.getNombre() + " ha sido registrado correctamente");
        }
    }

    private boolean verificarPaciente6(int idPaciente){
        for(Paciente item : listaPacientes6){
            if (item.getCedula() == idPaciente){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idPaciente
     * @param cedulaNueva
     * @param nombreNuevo
     * @param edadNuevo
     * @param telefonoNuevo
     * @param correoElectronicoNuevo
     * @param lugarResidenciaNuevo
     */
    public void modificarPaciente6(int idPaciente, int cedulaNueva, String nombreNuevo, int edadNuevo, int telefonoNuevo, String correoElectronicoNuevo, String lugarResidenciaNuevo){
        for(Paciente item: listaPacientes6){
            if (item.getCedula() == idPaciente) {
                item.setCedula(cedulaNueva);
                item.setNombre(nombreNuevo);
                item.setEdad(edadNuevo);
                item.setTelefono(telefonoNuevo);
                item.setCorreoElectronico(correoElectronicoNuevo);
                item.setLugarResidencia(lugarResidenciaNuevo);
            }
            else{
                System.out.println("El paciente no se encuentra registrado.");
            }
        }
    }

    /**
     *
     * @param sintoma
     * @param prueba
     * @param paciente7
     */
    // Paciente area 7
    public void registrarPaciente7(Sintoma sintoma,Prueba prueba, Paciente paciente7){
        if (verificarPaciente7(paciente7.getCedula())){
            System.out.println("El paciente ya se encuentra registrado.");
        }
        else {
            paciente7.agregarSintomas(sintoma);
            paciente7.registrarPrueba(prueba);
            listaPacientes7.add(paciente7);
            System.out.println("El paciente con el nombre de: " + paciente7.getNombre() + " ha sido registrado correctamente");
        }
    }

    /**
     *
     * @param idPaciente
     * @return
     */
    private boolean verificarPaciente7(int idPaciente){
        for(Paciente item : listaPacientes7){
            if (item.getCedula() == idPaciente){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idPaciente
     * @param cedulaNueva
     * @param nombreNuevo
     * @param edadNuevo
     * @param telefonoNuevo
     * @param correoElectronicoNuevo
     * @param lugarResidenciaNuevo
     */
    public void modificarPaciente7(int idPaciente, int cedulaNueva, String nombreNuevo, int edadNuevo, int telefonoNuevo, String correoElectronicoNuevo, String lugarResidenciaNuevo){
        for(Paciente item: listaPacientes7){
            if (item.getCedula() == idPaciente) {
                item.setCedula(cedulaNueva);
                item.setNombre(nombreNuevo);
                item.setEdad(edadNuevo);
                item.setTelefono(telefonoNuevo);
                item.setCorreoElectronico(correoElectronicoNuevo);
                item.setLugarResidencia(lugarResidenciaNuevo);
            }
            else{
                System.out.println("El paciente no se encuentra registrado.");
            }
        }
    }

    /**
     *
     * @param ordenSanitaria1
     */
    // Orden Sanitaria Paciente 1
    public void agregarOrdenSanitariaPaciente1(OrdenSanitaria ordenSanitaria1) {
            if (verificarOrdenSanitariaPaciente1(ordenSanitaria1.getIdOrden())) {
                System.out.println("La Orden Sanitaria ya se encuentra registrada.");
            } else {
                listaOrdenesSanitariasPaciente1.add(ordenSanitaria1);
                System.out.println("La Orden Sanitaria: " + ordenSanitaria1.getIdOrden() + " ya se agrego exitosamente.");
            }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaPaciente1(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasPaciente1){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaPaciente1(int idOrden,int idPersonaN,String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasPaciente1){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria2
     */
    // Orden Sanitaria Paciente 2
    public void agregarOrdenSanitariaPaciente2(OrdenSanitaria ordenSanitaria2) {
        if (verificarOrdenSanitariaPaciente2(ordenSanitaria2.getIdOrden())) {
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        } else {
            listaOrdenesSanitariasPaciente2.add(ordenSanitaria2);
            System.out.println("La Orden Sanitaria: " + ordenSanitaria2.getIdOrden() + " ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaPaciente2(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasPaciente2){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaPaciente2(int idOrden,int idPersonaN,String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasPaciente2){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria3
     */
    // Orden Sanitaria Paciente 3
    public void agregarOrdenSanitariaPaciente3(OrdenSanitaria ordenSanitaria3) {
        if (verificarOrdenSanitariaPaciente3(ordenSanitaria3.getIdOrden())) {
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        } else {
            listaOrdenesSanitariasPaciente3.add(ordenSanitaria3);
            System.out.println("La Orden Sanitaria: " + ordenSanitaria3.getIdOrden() + " ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaPaciente3(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasPaciente3){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaPaciente3(int idOrden,int idPersonaN,String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasPaciente3){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria4
     */
    // Orden Sanitaria Paciente 4
    public void agregarOrdenSanitariaPaciente4(OrdenSanitaria ordenSanitaria4) {
        if (verificarOrdenSanitariaPaciente4(ordenSanitaria4.getIdOrden())) {
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        } else {
            listaOrdenesSanitariasPaciente4.add(ordenSanitaria4);
            System.out.println("La Orden Sanitaria: " + ordenSanitaria4.getIdOrden() + " ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaPaciente4(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasPaciente4){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaPaciente4(int idOrden,int idPersonaN,String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasPaciente4){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria5
     */
    // Orden Sanitaria Paciente 5
    public void agregarOrdenSanitariaPaciente5(OrdenSanitaria ordenSanitaria5) {
        if (verificarOrdenSanitariaPaciente5(ordenSanitaria5.getIdOrden())) {
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        } else {
            listaOrdenesSanitariasPaciente5.add(ordenSanitaria5);
            System.out.println("La Orden Sanitaria: " + ordenSanitaria5.getIdOrden() + " ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaPaciente5(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasPaciente5){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaPaciente5(int idOrden,int idPersonaN,String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasPaciente5){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria6
     */
    // Orden Sanitaria Paciente 6
    public void agregarOrdenSanitariaPaciente6(OrdenSanitaria ordenSanitaria6) {
        if (verificarOrdenSanitariaPaciente6(ordenSanitaria6.getIdOrden())) {
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        } else {
            listaOrdenesSanitariasPaciente1.add(ordenSanitaria6);
            System.out.println("La Orden Sanitaria: " + ordenSanitaria6.getIdOrden() + " ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaPaciente6(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasPaciente6){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaPaciente6(int idOrden,int idPersonaN,String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasPaciente6){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria7
     */
    // Orden Sanitaria Paciente 7
    public void agregarOrdenSanitariaPaciente7(OrdenSanitaria ordenSanitaria7) {
        if (verificarOrdenSanitariaPaciente7(ordenSanitaria7.getIdOrden())) {
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        } else {
            listaOrdenesSanitariasPaciente7.add(ordenSanitaria7);
            System.out.println("La Orden Sanitaria: " + ordenSanitaria7.getIdOrden() + " ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaPaciente7(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasPaciente7){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaPaciente7(int idOrden,int idPersonaN,String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasPaciente7){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria1
     */
    // Orden Sanitaria Contacto 1
    public void agregarOrdenSanitariaContacto1(OrdenSanitaria ordenSanitaria1){
                if(verificarOrdenSanitariaContacto1(ordenSanitaria1.getIdOrden())){
                    System.out.println("La Orden Sanitaria ya se encuentra registrada.");
                }
                else{
                    listaOrdenesSanitariasContacto1.add(ordenSanitaria1);
                    System.out.println("La Orden Sanitaria: "+ordenSanitaria1.getIdOrden()+" ya se agrego exitosamente.");
                }
            }

    /**
     *
      * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaContacto1(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasContacto1){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaContacto1(int idOrden,int idPersonaN, String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasContacto1){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria2
     */
    // Orden Sanitaria Contacto 2
    public void agregarOrdenSanitariaContacto2(OrdenSanitaria ordenSanitaria2){
        if(verificarOrdenSanitariaContacto2(ordenSanitaria2.getIdOrden())){
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        }
        else{
            listaOrdenesSanitariasContacto2.add(ordenSanitaria2);
            System.out.println("La Orden Sanitaria: "+ordenSanitaria2.getIdOrden()+" ya se agrego exitosamente.");
        }
    }
    private boolean verificarOrdenSanitariaContacto2(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasContacto2){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */

    public void modificarOrdenSanitariaContacto2(int idOrden,int idPersonaN, String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasContacto2){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria3
     */
    // Orden Sanitaria Contacto 3
    public void agregarOrdenSanitariaContacto3(OrdenSanitaria ordenSanitaria3){
        if(verificarOrdenSanitariaContacto3(ordenSanitaria3.getIdOrden())){
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        }
        else{
            listaOrdenesSanitariasContacto3.add(ordenSanitaria3);
            System.out.println("La Orden Sanitaria: "+ordenSanitaria3.getIdOrden()+" ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaContacto3(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasContacto3){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaContacto3(int idOrden,int idPersonaN, String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasContacto3){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria4
     */
    // Orden Sanitaria Contacto 4
    public void agregarOrdenSanitariaContacto4(OrdenSanitaria ordenSanitaria4){
        if(verificarOrdenSanitariaContacto4(ordenSanitaria4.getIdOrden())){
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        }
        else{
            listaOrdenesSanitariasContacto4.add(ordenSanitaria4);
            System.out.println("La Orden Sanitaria: "+ordenSanitaria4.getIdOrden()+" ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaContacto4(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasContacto4){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaContacto4(int idOrden,int idPersonaN, String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasContacto4){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria5
     */
    // Orden Sanitaria Contacto 5
    public void agregarOrdenSanitariaContacto5(OrdenSanitaria ordenSanitaria5){
        if(verificarOrdenSanitariaContacto5(ordenSanitaria5.getIdOrden())){
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        }
        else{
            listaOrdenesSanitariasContacto5.add(ordenSanitaria5);
            System.out.println("La Orden Sanitaria: "+ordenSanitaria5.getIdOrden()+" ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaContacto5(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasContacto5){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */

    public void modificarOrdenSanitariaContacto5(int idOrden,int idPersonaN, String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasContacto5){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria6
     */
    // Orden Sanitaria Contacto 6
    public void agregarOrdenSanitariaContacto6(OrdenSanitaria ordenSanitaria6){
        if(verificarOrdenSanitariaContacto6(ordenSanitaria6.getIdOrden())){
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        }
        else{
            listaOrdenesSanitariasContacto6.add(ordenSanitaria6);
            System.out.println("La Orden Sanitaria: "+ordenSanitaria6.getIdOrden()+" ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaContacto6(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasContacto6){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */
    public void modificarOrdenSanitariaContacto6(int idOrden,int idPersonaN, String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasContacto6){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param ordenSanitaria7
     */
    // Orden Sanitaria Contacto 7
    public void agregarOrdenSanitariaContacto7(OrdenSanitaria ordenSanitaria7){
        if(verificarOrdenSanitariaContacto7(ordenSanitaria7.getIdOrden())){
            System.out.println("La Orden Sanitaria ya se encuentra registrada.");
        }
        else{
            listaOrdenesSanitariasContacto7.add(ordenSanitaria7);
            System.out.println("La Orden Sanitaria: "+ordenSanitaria7.getIdOrden()+" ya se agrego exitosamente.");
        }
    }

    /**
     *
     * @param idOrden
     * @return
     */
    private boolean verificarOrdenSanitariaContacto7(int idOrden){
        for( OrdenSanitaria item : listaOrdenesSanitariasContacto7){
            if (item.getIdOrden() == idOrden) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param idOrden
     * @param idPersonaN
     * @param nombreN
     * @param idOrdenNueva
     * @param fechaInicialNueva
     * @param fechaFinalNueva
     * @param motivoNuevo
     * @param nombreFuncionarioNuevo
     */

    public void modificarOrdenSanitariaContacto7(int idOrden,int idPersonaN, String nombreN, int idOrdenNueva, String fechaInicialNueva, String fechaFinalNueva, String motivoNuevo, String nombreFuncionarioNuevo){
        for (OrdenSanitaria item : listaOrdenesSanitariasContacto7){
            if (item.getIdOrden() == idOrden){
                item.setIdPersona(idPersonaN);
                item.setNombre(nombreN);
                item.setIdOrden(idOrdenNueva);
                item.setFechaInicial(fechaInicialNueva);
                item.setFechaFinal(fechaFinalNueva);
                item.setMotivo(motivoNuevo);
                item.setNombreFuncionario(nombreFuncionarioNuevo);
            }
        }
    }

    /**
     *
     * @param idPaciente
     */
    //Metodos de imprimir.
    public void imprimirPaciente1(int idPaciente){
        for (Paciente paciente : listaPacientes1){
            if(paciente.getCedula() == idPaciente){
                System.out.println(paciente.toString());
            }
            else{
                System.out.println("Paciente no existe");
            }
        }
    }

    /**
     *
     * @param idPaciente2
     */
    public void imprimirPaciente2(int idPaciente2){
        for (Paciente paciente : listaPacientes2){
            if(paciente.getCedula() == idPaciente2){
                System.out.println(paciente.toString());
            }
            else{
                System.out.println("Paciente no existe");
            }
        }
    }

    /**
     *
     * @param idPaciente3
     */

    public void imprimirPaciente3(int idPaciente3){
        for (Paciente paciente : listaPacientes3){
            if(paciente.getCedula() == idPaciente3){
                System.out.println(paciente.toString());
            }
            else{
                System.out.println("Paciente no existe");
            }
        }
    }

    /**
     *
     * @param idPaciente4
     */

    public void imprimirPaciente4(int idPaciente4){
        for (Paciente paciente : listaPacientes4){
            if(paciente.getCedula() == idPaciente4){
                System.out.println(paciente.toString());
            }
            else{
                System.out.println("Paciente no existe");
            }
        }
    }

    /**
     *
     * @param idPaciente5
     */
    public void imprimirPaciente5(int idPaciente5){
        for (Paciente paciente : listaPacientes5){
            if(paciente.getCedula() == idPaciente5){
                System.out.println(paciente.toString());
            }
            else{
                System.out.println("Paciente no existe");
            }
        }
    }

    /**
     *
     * @param idPaciente6
     */
    public void imprimirPaciente6(int idPaciente6){
        for (Paciente paciente : listaPacientes6){
            if(paciente.getCedula() == idPaciente6){
                System.out.println(paciente.toString());
            }
            else{
                System.out.println("Paciente no existe");
            }
        }
    }

    /**
     *
     * @param idPaciente7
     */
    public void imprimirPaciente7(int idPaciente7){
        for (Paciente paciente : listaPacientes7){
            if(paciente.getCedula() == idPaciente7){
                System.out.println(paciente.toString());
            }
            else{
                System.out.println("Paciente no existe");
            }
        }
    }

    /**
     *
     * @param area1
     */

    public void personaCasosPositivos1(AreaSalud area1){
        if(area1.getListaPacientes1()!=null && area1.getListaOrdenesSanitariasContacto1()!=null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area1.getListaPacientes1().size());

            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area1.getListaOrdenesSanitariasContacto1().size());
        }
        if(area1.getListaPacientes1()!=null &&  area1.getListaOrdenesSanitariasContacto1()==null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area1.getListaPacientes1().size());
            System.out.println("No hay datos ingresados en las listas contactos ");
        }
        if(area1.getListaPacientes1()==null &&  area1.getListaOrdenesSanitariasContacto1()!=null){
            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area1.getListaOrdenesSanitariasContacto1().size());
            System.out.println("No hay datos ingresados en las listas pacientes ");
        }
    }

    /**
     *
     * @param area2
     */
    public void personaCasosPositivos2(AreaSalud area2){
        if(area2.getListaPacientes2()!=null && area2.getListaOrdenesSanitariasContacto2()!=null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area2.getListaPacientes2().size());

            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area2.getListaOrdenesSanitariasContacto2().size());
        }
        if(area2.getListaPacientes2()!=null &&  area2.getListaOrdenesSanitariasContacto2()==null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area2.getListaPacientes2().size());
            System.out.println("No hay datos ingresados en las listas contactos.");
        }
        if(area2.getListaPacientes2()==null &&  area2.getListaOrdenesSanitariasContacto2()!=null){
            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area2.getListaOrdenesSanitariasContacto2().size());
            System.out.println("No hay datos ingresados en las listas pacientes.");
        }
    }

    /**
     *
     * @param area3
     */
    public void personaCasosPositivos3(AreaSalud area3){
        if(area3.getListaPacientes3()!=null && area3.getListaOrdenesSanitariasContacto3()!=null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area3.getListaPacientes3().size());

            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area3.getListaOrdenesSanitariasContacto3().size());
        }
        if(area3.getListaPacientes3()!=null &&  area3.getListaOrdenesSanitariasContacto3()==null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area3.getListaPacientes3().size());
            System.out.println("No hay datos ingresados en las listas contactos ");
        }
        if(area3.getListaPacientes3()==null &&  area3.getListaOrdenesSanitariasContacto3()!=null){
            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area3.getListaOrdenesSanitariasContacto3().size());
            System.out.println("No hay datos ingresados en las listas pacientes ");
        }
    }

    /**
     *
     * @param area4
     */
    public void personaCasosPositivos4(AreaSalud area4){
        if(area4.getListaPacientes4()!=null && area4.getListaOrdenesSanitariasContacto4()!=null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area4.getListaPacientes4().size());

            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area4.getListaOrdenesSanitariasContacto4().size());
        }
        if(area4.getListaPacientes4()!=null &&  area4.getListaOrdenesSanitariasContacto4()==null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area4.getListaPacientes4().size());
            System.out.println("No hay datos ingresados en las listas contactos ");
        }
        if(area4.getListaPacientes4()==null &&  area4.getListaOrdenesSanitariasContacto4()!=null){
            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area4.getListaOrdenesSanitariasContacto4().size());
            System.out.println("No hay datos ingresados en las listas pacientes ");
        }
    }

    /**
     *
     * @param area5
     */
    public void personaCasosPositivos5(AreaSalud area5){
        if(area5.getListaPacientes5()!=null && area5.getListaOrdenesSanitariasContacto5()!=null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area5.getListaPacientes5().size());

            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area5.getListaOrdenesSanitariasContacto5().size());
        }
        if(area5.getListaPacientes5()!=null &&  area5.getListaOrdenesSanitariasContacto5()==null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area5.getListaPacientes5().size());
            System.out.println("No hay datos ingresados en las listas contactos ");
        }
        if(area5.getListaPacientes5()==null &&  area5.getListaOrdenesSanitariasContacto5()!=null){
            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area5.getListaOrdenesSanitariasContacto5().size());
            System.out.println("No hay datos ingresados en las listas pacientes ");
        }
    }

    /**
     *
     * @param area6
     */
    public void personaCasosPositivos6(AreaSalud area6){
        if(area6.getListaPacientes6()!=null && area6.getListaOrdenesSanitariasContacto6()!=null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area6.getListaPacientes6().size());

            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area6.getListaOrdenesSanitariasContacto6().size());
        }
        if(area6.getListaPacientes6()!=null &&  area6.getListaOrdenesSanitariasContacto6()==null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area6.getListaPacientes6().size());
            System.out.println("No hay datos ingresados en las listas contactos ");
        }
        if(area6.getListaPacientes6()==null &&  area6.getListaOrdenesSanitariasContacto6()!=null){
            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area6.getListaOrdenesSanitariasContacto6().size());
            System.out.println("No hay datos ingresados en las listas pacientes ");
        }
    }

    /**
     *
     * @param area7
     */
    public void personaCasosPositivos7(AreaSalud area7){
        if(area7.getListaPacientes7()!=null && area7.getListaOrdenesSanitariasContacto7()!=null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area7.getListaPacientes7().size());

            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area7.getListaOrdenesSanitariasContacto7().size());
        }
        if(area7.getListaPacientes7()!=null &&  area7.getListaOrdenesSanitariasContacto7()==null){
            System.out.println("Cantidad de pacientes positivos: ");
            System.out.println(area7.getListaPacientes7().size());
            System.out.println("No hay datos ingresados en las listas contactos ");
        }
        if(area7.getListaPacientes7()==null &&  area7.getListaOrdenesSanitariasContacto7()!=null){
            System.out.println("Cantidad de contactos positivos: ");
            System.out.println(area7.getListaOrdenesSanitariasContacto7().size());
            System.out.println("No hay datos ingresados en las listas pacientes ");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Area de Salud: {");
        sb.append("Id Area Salud=").append(idAreaSalud);
        sb.append("Nombre Area='").append(nombreArea).append('\n');
        sb.append("Nombre Persona='").append(nombrePersona).append('\n');
        sb.append("Telefono=").append(telefono);
        sb.append("Correo Electronico='").append(correoElectronico).append('\n');
        sb.append("Direccion='").append(direccion).append('\n');
        sb.append("Area Atraccion='").append(areaAtraccion).append('\n');
        sb.append('}');
        return sb.toString();
    }


}
