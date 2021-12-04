package PruebaCovid;

public class OrdenSanitaria {
    private int idPersona;
    private String nombre;
    private int idOrden;
    private String fechaInicial;
    private String fechaFinal;
    private String motivo;
    private String nombreFuncionario;

    /**
     *
     * @param idPersona
     * @param nombre
     * @param idOrden
     * @param fechaInicial
     * @param fechaFinal
     * @param motivo
     * @param nombreFuncionario
     */
    public OrdenSanitaria(int idPersona, String nombre, int idOrden, String fechaInicial, String fechaFinal, String motivo, String nombreFuncionario) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.idOrden = idOrden;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.motivo = motivo;
        this.nombreFuncionario = nombreFuncionario;
    }

    /**
     * Constructor vacio
     */
    public OrdenSanitaria() {
    }

    /**
     *
     * @return
     */

    public int getIdPersona() {
        return idPersona;
    }

    /**
     *
     * @param idPersona
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
    public int getIdOrden() {
        return idOrden;
    }

    /**
     *
     * @param idOrden
     */
    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    /**
     *
     * @return
     */
    public String getFechaInicial() {
        return fechaInicial;
    }

    /**
     *
     * @param fechaInicial
     */
    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     *
     * @return
     */
    public String getFechaFinal() {
        return fechaFinal;
    }

    /**
     *
     * @param fechaFinal
     */
    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     *
     * @return
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     *
     * @param motivo
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     *
     * @return
     */
    public String getNombreFuncionario() {
        return nombreFuncionario;
    }

    /**
     *
     * @param nombreFuncionario
     */
    public void setNombreFuncionario(String nombreFuncionario) {
        this.nombreFuncionario = nombreFuncionario;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "OrdenSanitaria= " +
                "Id Persona: " + idPersona + '\n' +
                "Nombre: " + nombre + '\n' +
                "Id Orden: " + idOrden + '\n' +
                "Fecha Inicial: " + fechaInicial + '\n' +
                "Fecha Final: " + fechaFinal + '\n' +
                "Motivo: " + motivo + '\n' +
                "Nombre Funcionario: " + nombreFuncionario;
    }
}
