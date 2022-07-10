package projetoestruturadedados;

import java.io.IOException;

public class ListaEncadeada {

	private No inicio, fim;

	public void inserirNoInicio(String nome) throws IOException { // Para inserir no inicio preciso parar todos os
																	// parâmetros do nó
		No novaPessoa = new No(nome); // Aloca espaço para o novo nó
		boolean valor = buscaNome(novaPessoa.getName());
		if (valor == false) {
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
		boolean valor = false;
		while(auxiliar.proximo != null) {
			valor = contains(auxiliar.getName(), nome);
			if(valor == true)
				System.out.println(auxiliar.getName());
			auxiliar = auxiliar.proximo;
		}
		
		if(valor==false) {
			System.out.println("Nenhuma pessoa com esse nome foi encontrado");
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
