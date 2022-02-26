package cuentasBanco;

/**
 * @author ALI HUSEYNOV
 * @version 0.1
 * 
 *
 */
public class CCuenta {


    
    /**
     * Variable del tipo String que almacena el nombre.
     */
    private String nombre;
    /**
     * Variable del tipo String que almacena el "numero de cuenta".
     */
    private String cuenta;
    /**
     * Variable del tipo double que almacena la cantidad de saldo en cuenta.
     */
    private double saldo;
    /**
     * Variable del tipo double que almacena el tipoInterés al que se somete el saldo y la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor vacío de la clase CCuenta, que nos permite crear nuevos objetos en la clase Main.
     */
    public CCuenta()
    {
    }

    /**
     * Método que nos va a permitir establecer valores a las variables nombre, cuenta y saldo. 
     * @param nom Abreviatura de NOMBRE, establecerá el valor de NOMBRE.
     * @param cue Abreviatura de CUENTA, establecerá el valor de CUENTA.
     * @param sal Abreviatura de SALDO, establecerá el valor de SALDO.
     * @param tipo Abreviatura de TIPOINTERES, establecerá el valor de TIPOINTERES
     * Al ser diferente el nombre del parámetro al nombre de los atributos, evitamos el uso de this. 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método publico que nos permite obtener el valor de nombre
     * @return Nos devuelve el valor de NOMBRE, previamente establecido.
     */
    public String getNombre() {
		return nombre;
	}

	/**
	 * Método público que nos permite modificar el valor de nombre individualmente
	 *
	 * @param nombre .Valor del tipo String que hay que introducir para modificarlo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método público que nos permite obtener el valor de cuenta,
	 * @return Nos devuelve el valor de NOMBRE, previamente establecido
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método público que nos permite modificar el valor de cuenta individualmente.
	 * @param cuenta .Valor del tipo String que hay que introducir para modificarlo
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método público que nos permite obtener el valor de saldo.
	 * @return Nos devuelve el valor de SALDO, previamente establecido.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método público que nos permite modificar el valor de saldo individualmente
	 * @param saldo .Valor del tipo double que hay que introducir para modificarlo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método público que nos permite ver el estado de nuestra cuenta, obteniendo por tanto el saldo total.
	 * @return Nos devuelve el saldo disponible en la cuenta. 
	 */
	public double estado()
    {
        return saldo;
    }

    /**
     * Método público del tipo void dispuesto para ingresar saldo en la cuenta. 
     * @param cantidad Valor del tipo double, que debe ser mayor que 0, en caso contrario se lanzará una excepción.
     * 					Si el saldo es positivo, el saldo en cuenta será el mismo más el valor de cantidad
     * @throws Exception Mensaje que se lanzará en caso de que el parámetro obtenido sea negativo. 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método publico del tipo void dispuesto para retirar saldo de la cuenta.
     * @param cantidad Valor del tipo double, que fijará la cantidad a descontar del saldo de la cuenta
     * 					Si el saldo a retirar es <0, lanzará una excepción.
     * 					En caso contrario (>0), el saldo en cuenta será el mismo menos el valor de cantidad.
     * @throws Exception Mensaje que se lanzará en caso de que la cnatidad introducida sea <0.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
