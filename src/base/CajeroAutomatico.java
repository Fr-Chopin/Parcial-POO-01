package base;

import derivada.Cliente;

public abstract class CajeroAutomatico {
	
	public abstract String extraerDinero(Cliente cliente, double montoAExtraer);
	public abstract String transferirDinero(Cliente cliente, double montoATransferir, Cliente clienteDestino);
}
