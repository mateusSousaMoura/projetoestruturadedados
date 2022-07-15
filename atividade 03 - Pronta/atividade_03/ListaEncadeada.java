package atividade_03;

import javax.swing.*;
import java.io.IOException;

public class ListaEncadeada {

	private No inicio, fim, excluido;
	
	
	
	public ListaEncadeada() {
		this.inicio = null;
		this.fim = null;
		this.excluido = null;
	}

	public void inserirNoInicio(String nome) throws IOException { // Para inserir no inicio preciso parar todos os
		boolean valor = false; // nenhum nome igual ao que está passado por parâmetro
		No novaPessoa = new No(nome); // Aloca espaço para o novo nó
		if(isEmpty() == false) //
			valor = buscaNome(novaPessoa.getName());
		if (valor == false) {
			if (isEmpty()) { // Se a lista estiver vazia o fim nó vai ser o nó atual.
				inicio = novaPessoa;
				fim = novaPessoa;
				novaPessoa.proximo = null;
			} else {
				novaPessoa.proximo = inicio;
				inicio = novaPessoa;
			}
			System.out.println("Nome cadastrado com sucesso!");
		} else {
			System.out.println(
					"Não possível cadastrar esse nome!\nNome já cadastrado!");
		}
	}

	private boolean buscaNome(String nome) {
		No aux = inicio;
		// aux.proximo != null
		while (aux!=null) {
			if (aux.getName().equalsIgnoreCase(nome)) {
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

	public void inserirNoFim(String nome) {
		boolean valor = false; // Vamos assumir inicialmente que o valor não está na lista
		No novaPessoa = new No(nome); // Aloca espaço para o novo nó
		if(isEmpty() == false)
			valor = buscaNome(novaPessoa.getName());
		if (valor == false) {// se o nome não foi encontrado no arquivo
			if (isEmpty()) {
				inicio = novaPessoa;
			} else {
				fim.proximo = novaPessoa; // O antigo ultimo nó agora aponta para o novo nó e esse novo nó será o novo último elemento da lista
			}
			fim = novaPessoa; // Declaramos oficialmente que a novaPessoa vai ser o último elemento da lista
			System.out.println("Nome cadastrado com sucesso!");
		} else {
			System.out.println("Não possível cadastrar esse nome!\nNome já cadastrado!");
		}
	}
	
	
	public void alterarNome(String nomeAntigo, String novoNome) {
		No auxiliar = inicio;
		boolean valor = false;
		if(isEmpty()) {
			System.out.println("Não é possível alterar nome\nLista vazia!");
		} else {
			valor = buscaNome(nomeAntigo);
			if(valor == true || auxiliar.excluido == true) {
				while(auxiliar!=null) {
					if(auxiliar.getName().equalsIgnoreCase(nomeAntigo)) {
						auxiliar.setName(novoNome);
						System.out.println("Nome alterado com sucesso!");
						break;
					} else {
						auxiliar = auxiliar.proximo;
					}
				}
			} else {
				System.out.println("Esse nome que você deseja alterar não foi encontrado na lista!");
			}
		}
	 	
	 }

	 public void listaNomes(ListaEncadeada lista){
		No auxiliar = inicio;
		 while(auxiliar != null) {
			 if (auxiliar.excluido == false){
				 System.out.println(auxiliar.getName());
		 }

			 auxiliar = auxiliar.proximo;

		 }
	 }

	public void listaNomesTelinha(ListaEncadeada lista){
		No auxiliar = inicio;
		String message = " ";
		while(auxiliar!=null) {
			if (auxiliar.getName() != null){
				message += auxiliar.getName();
				int dada = 1;
			}
			JOptionPane.showMessageDialog(null ,message);
			System.out.println(message);

			auxiliar = auxiliar.proximo;

		}
	}

	 public void excluiNomes(String nome){
		No auxiliar = inicio;

		 if(buscaNome(nome)){
			 while(auxiliar!= null) {
				 if(auxiliar.getName().equalsIgnoreCase(nome)){
					 auxiliar.excluido = true;
					 System.out.println("Nome excluído com sucesso!");
				 }
					 auxiliar = auxiliar.proximo;

			 }
		 } else {
			 System.out.println("Esse nome que você deseja exluir não foi encontrado na lista!");
		 }
	 }

	
	/*
	private boolean contains(String main, String Substring) {
		boolean flag=false;
	    if(main==null && main.trim().equals("")) {
	        return flag;
	    }
	    if(Substring==null) {
	        return flag;
	    }

	    char fullstring[]=main.toCharArray();
	    char sub[]=Substring.toCharArray();
	    int counter=0;
	    if(sub.length==0) {
	        flag=true;
	        return flag;
	    }

	    for(int i=0;i<fullstring.length;i++) {

	        if(fullstring[i]==sub[counter]) {
	            counter++;
	        } else {
	            counter=0;
	        }

	        if(counter==sub.length) {
	            flag=true;
	            return flag;
	        }

	    }
	    return flag;

	}*/

}
