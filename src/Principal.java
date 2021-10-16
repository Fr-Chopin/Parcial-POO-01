import derivada.*;

public class Principal {

	public static void main(String[] args) {
		
		CajeroAutomaticoLink cajeroLink = new CajeroAutomaticoLink(19000);
		CajeroAutomaticoBanelco cajeroBanelco = new CajeroAutomaticoBanelco(7500);
		
		Cliente guadalupe = new Cliente("Guadalupe", "LINK", 1050);
		Cliente leandro = new Cliente("Leandro", "BANELCO", 1100);
		Cliente santino = new Cliente("Santino", "BANELCO", 700);
		
		System.out.println(cajeroLink.extraerDinero(guadalupe, 500));
		System.out.println("Cliente: " + guadalupe.getNombre() + "\nNuevo saldo: " + guadalupe.getSaldo());
		
		System.out.println("\n----------\n");
		
		System.out.println(cajeroLink.extraerDinero(santino, 10000));
		
		System.out.println("\n----------\n");
		
		System.out.println(cajeroBanelco.extraerDinero(guadalupe, 650));
		System.out.println("Nuevo saldo: " + guadalupe.getSaldo());
		
		System.out.println("\n----------\n");

		System.out.println(cajeroBanelco.extraerDinero(santino, 110));
		System.out.println("Nuevo saldo: " + santino.getSaldo());
		
		System.out.println("\n----------\n");

		System.out.println(cajeroBanelco.transferirDinero(guadalupe, 210, leandro));
		
		System.out.println("\n----------\n");
		
		System.out.println(cajeroBanelco.transferirDinero(santino, 520, leandro));
		System.out.println("Cliente: " + santino.getNombre() + "\nNuevo saldo: " + santino.getSaldo());
		System.out.println("\nCliente: " + leandro.getNombre() + "\nNuevo saldo: " + leandro.getSaldo());


	}

}
