package projetoestruturadedados;

public class No {
	
	Pessoa item;
	No proximo = null;
	public No(String nome) {
		item = new Pessoa(nome);
		proximo = null;
	}
	
	public String getName() {
        return item.getNome();
    }

}
