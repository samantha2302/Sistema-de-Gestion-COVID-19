package PruebaCovid;

public class Sintoma {

    private String fiebre;
    private String escalofrio;
    private String tos;
    private String dificultadRespiratoria;
    private String fatiga;
    private String dolorMuscular;
    private String dolorCorporal;
    private String dolorCabeza;
    private String perdidaOlfato;
    private String perdidaGusto;
    private String dolorGarganta;

    /**
     *
     * @param fiebre
     * @param escalofrio
     * @param tos
     * @param dificultadRespiratoria
     * @param fatiga
     * @param dolorMuscular
     * @param dolorCorporal
     * @param dolorCabeza
     * @param perdidaOlfato
     * @param perdidaGusto
     * @param dolorGarganta
     */

    public Sintoma(String fiebre, String escalofrio, String tos, String dificultadRespiratoria, String fatiga, String dolorMuscular, String dolorCorporal, String dolorCabeza, String perdidaOlfato, String perdidaGusto, String dolorGarganta) {
        this.fiebre = fiebre;
        this.escalofrio = escalofrio;
        this.tos = tos;
        this.dificultadRespiratoria = dificultadRespiratoria;
        this.fatiga = fatiga;
        this.dolorMuscular = dolorMuscular;
        this.dolorCorporal = dolorCorporal;
        this.dolorCabeza = dolorCabeza;
        this.perdidaOlfato = perdidaOlfato;
        this.perdidaGusto = perdidaGusto;
        this.dolorGarganta = dolorGarganta;
    }

    /**
     *
     * @return
     */


    public String getFiebre() {
        return fiebre;
    }

    /**
     *
     * @param fiebre
     */

    public void setFiebre(String fiebre) {
        this.fiebre = fiebre;
    }

    /**
     *
     * @return
     */
    public String getEscalofrio() {
        return escalofrio;
    }

    /**
     *
     * @param escalofrio
     */
    public void setEscalofrio(String escalofrio) {
        this.escalofrio = escalofrio;
    }

    /**
     *
     * @return
     */
    public String getTos() {
        return tos;
    }

    /**
     *
     * @param tos
     */
    public void setTos(String tos) {
        this.tos = tos;
    }

    /**
     *
     * @return
     */
    public String getDificultadRespiratoria() {
        return dificultadRespiratoria;
    }

    /**
     *
     * @param dificultadRespiratoria
     */
    public void setDificultadRespiratoria(String dificultadRespiratoria) {
        this.dificultadRespiratoria = dificultadRespiratoria;
    }

    /**
     *
     * @return
     */
    public String getFatiga() {
        return fatiga;
    }

    /**
     *
     * @param fatiga
     */
    public void setFatiga(String fatiga) {
        this.fatiga = fatiga;
    }

    /**
     *
     * @return
     */
    public String getDolorMuscular() {
        return dolorMuscular;
    }

    public void setDolorMuscular(String dolorMuscular) {
        this.dolorMuscular = dolorMuscular;
    }

    /**
     *
     * @return
     */
    public String getDolorCorporal() {
        return dolorCorporal;
    }

    /**
     *
     * @param dolorCorporal
     */
    public void setDolorCorporal(String dolorCorporal) {
        this.dolorCorporal = dolorCorporal;
    }

    /**
     *
     * @return
     */
    public String getDolorCabeza() {
        return dolorCabeza;
    }

    /**
     *
     * @param dolorCabeza
     */
    public void setDolorCabeza(String dolorCabeza) {
        this.dolorCabeza = dolorCabeza;
    }

    /**
     *
     * @return
     */
    public String getPerdidaOlfato() {
        return perdidaOlfato;
    }

    /**
     *
     * @param perdidaOlfato
     */
    public void setPerdidaOlfato(String perdidaOlfato) {
        this.perdidaOlfato = perdidaOlfato;
    }

    /**
     *
     * @return
     */
    public String getPerdidaGusto() {
        return perdidaGusto;
    }

    /**
     *
     * @param perdidaGusto
     */
    public void setPerdidaGusto(String perdidaGusto) {
        this.perdidaGusto = perdidaGusto;
    }

    /**
     *
     * @return
     */
    public String getDolorGarganta() {
        return dolorGarganta;
    }

    /**
     *
     * @param dolorGarganta
     */
    public void setDolorGarganta(String dolorGarganta) {
        this.dolorGarganta = dolorGarganta;
    }

    /**
     *
     * @return
     */

    @Override
    public String toString() {
        return "Sintomas: " + '\n' +
                "Fiebre: " + fiebre + '\n' +
                "Escalofrio: " + escalofrio + '\n' +
                "Tos: " + tos + '\n' +
                "Dificultad Respiratoria: " + dificultadRespiratoria + '\n' +
                "Fatiga: " + fatiga + '\n' +
                "Dolor Muscular: " + dolorMuscular + '\n' +
                "Dolor Corporal: " + dolorCorporal + '\n' +
                "Dolor Cabeza: " + dolorCabeza + '\n' +
                "Perdida Olfato: " + perdidaOlfato + '\n' +
                "Perdida Gusto: " + perdidaGusto + '\n' +
                "Dolor Garganta: " + dolorGarganta ;
    }
}