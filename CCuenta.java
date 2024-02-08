package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {

    public String nombre;
    public String cuenta;
    public double saldo;
    public double tipoInteres;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
        // Constructor por defecto
    }

    /**
     * Constructor de la clase CCuenta que inicializa sus atributos con los valores proporcionados.
     *
     * @param nom     Nombre del titular de la cuenta.
     * @param cue     Número de cuenta.
     * @param sal     Saldo inicial de la cuenta.
     * @param tipo    Tipo de interés de la cuenta.
     */  
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Método que obtiene el saldo actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
    public double obtenerSaldo() {
        return saldo;
    }

    /**
     * Método que permite realizar un ingreso en la cuenta.
     *
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad a ingresar es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que permite realizar una retirada de dinero de la cuenta.
     *
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad a retirar es negativa o supera el saldo disponible.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (obtenerSaldo() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    // Métodos getter y setter para los atributos encapsulados

    /**
     * Método getter que obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter que establece el nombre del titular de la cuenta.
     *
     * @param nombre Nuevo nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter que obtiene el número de cuenta.
     *
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setter que establece el número de cuenta.
     *
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getter que obtiene el tipo de interés de la cuenta.
     *
     * @return Tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método setter que establece el tipo de interés de la cuenta.
     *
     * @param tipoInteres Nuevo tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Método que devuelve el estado de la cuenta (en este caso, se ha dejado siempre como 0 para demostración).
     *
     * @return Estado de la cuenta.
     */
    public float estado() {
        return 0;
    }
}


