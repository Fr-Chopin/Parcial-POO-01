package derivada;

public class Cliente {
	private String nombre;
	private String red;
	private double saldo;
	
	public Cliente(String nombre, String red, double saldo) {
		this.nombre = nombre;
		this.red = red;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRed() {
		return red;
	}
	
}
