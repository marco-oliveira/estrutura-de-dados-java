package pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	List<String> nomes = new LinkedList<>();
	
	public void insere(String nome){
		nomes.add(nome);
	}
	
	public String remove(){
		return this.nomes.remove(this.nomes.size() - 1);
	}
	
	public boolean vazio(){
		return this.nomes.isEmpty();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nomes.toString();
	}
}
