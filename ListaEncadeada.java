package projetoestruturadedados;

import java.io.IOException;
import java.util.Scanner;

public class ListaEncadeada {

	private No inicio, fim;
	
	
	
	public ListaEncadeada() {
		this.inicio = null;
		this.fim = null;
	}

	public void inserirNoInicio(String nome) throws IOException { // Para inserir no inicio preciso parar todos os
		boolean valor = false; 
		No novaPessoa = new No(nome); // Aloca espaço para o novo nó
		if(isEmpty() == false)
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
					"Não possível cadastrar esse nome!\nNome já encontrado no arquivo!\nNão é permitido nomes repetidos!");
		}
	}

	private boolean buscaNome(String nome) {
		No aux = inicio;
		while (aux.proximo != null) {
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
		No novaPessoa = new No(nome); // Instanciacao do novo nó
		boolean valor = buscaNome(novaPessoa.getName());
		if (valor == false) {// se o nome não foi encontrado no arquivo
			if (isEmpty()) {
				inicio = novaPessoa;
			} else {
				fim.proximo = novaPessoa;
			}
			fim = novaPessoa;
		} else {
			System.out.println("Não possível cadastrar esse nome!\nNome já encontrado no arquivo!");
		}
	}
	
	
	public void alterarNome(String nome) {
		No auxiliar = inicio;
		No nomes[] = null;
		int i = 0;
		boolean valor = false;
		while(auxiliar.proximo != null) {
			valor = contains(auxiliar.getName(), nome);
			if(valor == true) {
				System.out.println(auxiliar.getName());
				nomes[i] = auxiliar;
				i++;
			}
			auxiliar = auxiliar.proximo;
		}
		
		if(nomes.length==0) {
			System.out.println("Nenhuma pessoa com esse nome foi encontrado");
		} else {
			for(int c = 0; c < nomes.length; c++) {
				System.out.println(nomes[c].getName());
			}
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			System.out.println("Digite um novo nome para " + nomes[choice].getName());
			String novoNome = sc.nextLine();
			nomes[choice].setName(novoNome);
			System.out.println("Novo nome " + nomes[choice].getName() + " atualizado com sucesso!");
		}
	 	
	 }

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

	}

}
