package projetoestruturadedados;


import java.io.IOException;

import projetoestruturadedados.gerenciadorarquivo.ArquivoManager;

public class ListaEncadeada {
	
	 private No inicio, fim;
	
	public void inserirNoInicio(String nome) throws IOException { // Para inserir no inicio preciso parar todos os parâmetros do nó
        No novaPessoa = new No(nome); // Aloca espaço para o novo nó
		boolean valor = buscaNome(novaPessoa.getName());
		if(valor==false) {
	        if (isEmpty()) { // Se a list estiver vazia o fim nó vai ser o nó atual.
	        	inicio = novaPessoa; 
	            fim = novaPessoa;
	            novaPessoa.proximo = null; 
	        } else {
	        	novaPessoa.proximo = inicio;
	        	inicio = novaPessoa;
	        }
	        System.out.println("Nome cadastrado com sucesso!");
		} else {
			System.out.println("Não possível cadastrar esse nome!\nNome já encontrado no arquivo!\nNão é permitido nomes repetidos!");
		}
	}
		
	private boolean buscaNome(String nome) {
		No aux = inicio;
		while(aux.proximo != null) {
			if(aux.getName().equalsIgnoreCase(nome)) {
				return true;
			} else {
				aux = aux.proximo;
			}
		}
		return false;
	}

	public boolean isEmpty() { 
        return inicio == null;
    }
	
	
	/*
	 public void inserirNoFim(String nome) {
	        Tipono no = new Tipono(nome); // Instanciacao do novo nó
	        String path = "Local do  meu arquivo";
			boolean valor = buscaNome(novaPessoa.getNome(), path);
			if(valor==false) {// se o nome não foi encontrado no arquivo
		        if (isEmpty()) {
		            inicio = no;
		        } else {
		        	fim.prox = no;
		        }
		        fim = no;
		    } else {
		    	mostre("Não possível cadastrar esse nome!\nNome já encontrado no arquivo!");
		    }
	    }
	*/
	
	/* public void alterarNome(String nome) {
	 *  String path = "Local do  meu arquivo";
		boolean valor = buscaNome(novaPessoa.getNome(), path);
		if(valor==false) {
			mostre("Nenhum nome "Mateus" foi encontrado");
		} else {
		}
	 	
	 }
	 */
	
}
