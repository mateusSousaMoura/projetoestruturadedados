package atividade_03;

public class No {

	public boolean excluido;
	Pessoa item;
	No proximo = null;
	public No(String nome) {
		item = new Pessoa(nome);
		proximo = null;
		boolean excluido = false;
	}
	
	public String getName() {
        return item.getNome();
    }
	
	public void setName(String name) {
		this.item.setNome(name);
	}

}
