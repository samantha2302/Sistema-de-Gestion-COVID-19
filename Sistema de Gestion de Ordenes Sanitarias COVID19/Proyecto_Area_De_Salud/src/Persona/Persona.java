package Persona;

public abstract class Persona {
    private int cedula;
    private String nombre;
    private int edad;
    private int telefono;
    private String correoElectronico;

    /**
     *
     * @param cedula
     * @param nombre
     * @param edad
     * @param telefono
     * @param correoElectronico
     */

    public Persona(int cedula, String nombre, int edad, int telefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Constructor vacio
     */
    public Persona() {
    }

    /**
     *
     * @return
     */
    public int getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
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
    @Override
    public String toString() {
        return "Persona= " +
                "Cedula: " + cedula + '\n' +
                "Nombre: " + nombre + '\n' +
                "Edad: " + edad + '\n' +
                "Telefono: " + telefono + '\n' +
                "Correo Electronico: " + correoElectronico ;
    }
}
