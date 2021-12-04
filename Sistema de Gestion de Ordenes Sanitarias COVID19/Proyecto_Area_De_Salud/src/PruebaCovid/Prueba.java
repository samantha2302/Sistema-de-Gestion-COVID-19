package PruebaCovid;

public class Prueba {
    private String tipo;
    private String fecha;
    private String hora;
    private String nombrePersona;

    /**
     *
     * @param tipo
     * @param fecha
     * @param hora
     * @param nombrePersona
     */
    public Prueba(String tipo, String fecha, String hora, String nombrePersona) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.nombrePersona = nombrePersona;
    }

    /**
     * constructor vacio
     */
    public Prueba() {
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public String getHora() {
        return hora;
    }

    /**
     *
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
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
    @Override
    public String toString() {
        return  "Tipo: " + tipo + '\n' +
                "Fecha: " + fecha + '\n' +
                "Hora: " + hora + '\n' +
                "Nombre del personal: " + nombrePersona;
    }
}
