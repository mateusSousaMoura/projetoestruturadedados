package projetoestruturadedados;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		ListaEncadeada minhaLista = new ListaEncadeada();
		minhaLista.inserirNoInicio("Mateus"); // Caso com lista vazia
		//minhaLista.inserirNoInicio("Mateus"); // Caso com lista não vazia e nome repetido
		minhaLista.inserirNoFim("Pablo"); // Caso para inserir no inicio com lista não vazia
		minhaLista.inserirNoInicio("Pablo");
		minhaLista.alterarNome("Mateus", "Mateus Weslley");		
		
	}
}
