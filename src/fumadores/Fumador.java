package fumadores;

public class Fumador extends Thread {

	private int numero;
	private String ingrediente;

	public Fumador(int numero, String ingrediente) {
		this.numero = numero;
		this.ingrediente = ingrediente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Fumador " + numero + " (que tiene " + ingrediente + ") fuma una cigarette");
			Thread.sleep(3000);
			System.out.println("Fumador acabó de fumar cigarette");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
