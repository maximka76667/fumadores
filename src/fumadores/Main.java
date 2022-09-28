package fumadores;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Ingredientes
		ArrayList<String> ingredientes = new ArrayList<String>();

		ingredientes.add("papel");
		ingredientes.add("tabaco");
		ingredientes.add("cerillas");

		// Fumadores
		ArrayList<Fumador> fumadores = new ArrayList<Fumador>();

		for (int i = 0; i < 3; i++) {
			fumadores.add(new Fumador(i, ingredientes.get(i)));
		}

		// Agente pone los productos 5 veces
		for (int i = 0; i < 5; i++) {
			int numerofumador = getFumadorAleatorio();

			System.out.print("Agente pone en la mesa ");

			// Variable que se usa para escribir comma
			boolean fueIngredientePrimero = false;

			for (int j = 0; j < 3; j++) {
				/*
				 * Escribir solo ingredientes que no son iguales a numero (index) fumador
				 */
				if (numerofumador != j) {
					// Si es el primer ingrediente escribir comma
					if (!fueIngredientePrimero) {
						System.out.print(ingredientes.get(j) + ", ");
						fueIngredientePrimero = true;
						continue;
					}
					System.out.print(ingredientes.get(j));
				}
			}

			System.out.println();

			fumadores.get(numerofumador).run();

			System.out.println("\n");
		}

	}

	public static int getFumadorAleatorio() {
		return (int) Math.floor(Math.random() * 3);
	}

}
