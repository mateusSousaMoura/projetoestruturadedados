package dojomedia.dojomedia;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		ListaEncadeada minhaLista = new ListaEncadeada();
		minhaLista.inserirNoFim("Mateus"); // Caso com lista vazia
		//minhaLista.inserirNoInicio("Mateus"); // Caso com lista não vazia e nome repetido
		minhaLista.inserirNoFim("Célia Pereira");
		minhaLista.inserirNoFim("Flavio do pneu");// Caso para inserir no inicio com lista não vazia
		minhaLista.inserirNoInicio("Tiago");
		minhaLista.inserirNoFim("Pedro Pereira Pedrosa");
		//minhaLista.alterarNome("Mateus", "Mateus Weslley");
		minhaLista.excluiNomes("Flavio do pneu");
		minhaLista.listaNomes(minhaLista);

		
	}
}
