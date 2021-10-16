package derivada;

import base.CajeroAutomatico;

public class CajeroAutomaticoLink extends CajeroAutomatico {
	
	private double saldo;
	
	public CajeroAutomaticoLink(double saldo){
		this.saldo = saldo;
	}

	@Override
	public String extraerDinero(Cliente cliente, double montoAExtraer) {

		if (saldo >= montoAExtraer) {
			if (cliente.getRed().equalsIgnoreCase("LINK")) {
				
				cliente.setSaldo(cliente.getSaldo() + montoAExtraer * 0.98);
				
				saldo = saldo - montoAExtraer;
				
				return "La operación se ha realizado con éxito";
				
			}else {
				
				cliente.setSaldo(cliente.getSaldo() + montoAExtraer * 0.88);
				
				saldo = saldo - montoAExtraer;
				
				return "La operación se ha realizado con éxito";
			}
		}else {
			return "El cajero no tiene saldo disponible";
		}
		
	}

	@Override
	public String transferirDinero(Cliente cliente, double montoATransferir, Cliente clienteDestino) {
		
		if (cliente.getSaldo() >= montoATransferir) {
			if (cliente.getRed().equalsIgnoreCase("LINK") && clienteDestino.getRed().equalsIgnoreCase("LINK")) {
				
				clienteDestino.setSaldo(clienteDestino.getSaldo() + montoATransferir);
				cliente.setSaldo(cliente.getSaldo() - montoATransferir);
				
				return "La transferencia se ha realizado con éxito";
				
			}else {
				return "La red del cliente origen y/o cliente destino no son LINK";
			}
		}else {
			return "El cliente de origen no tiene saldo suficiente para realizar la transferencia";
		}
		
	}

}
