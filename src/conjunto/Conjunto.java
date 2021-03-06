package conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	
	
	List<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	public Conjunto(){
		for (int i = 0; i < 26; i++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);
		}
	}
	
	private int calculaIndiceDaTabela(String palavra){
		return palavra.toLowerCase().charAt(0)%26;
	}
	
	public void adiciona(String palavra){
		if (!this.contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.add(palavra);
		}
	}
	
	public void remove(String palavra){
		if (this.contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
		}
	}
	
	public boolean contem (String palavra){
		int indice = this.calculaIndiceDaTabela(palavra);
		List <String> lista = this.tabela.get(indice);
		return lista.contains(palavra);
	}
	
	public List<String> pegatodas(){
		List<String> palavras = new ArrayList<String>();
		for (int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tabela.toString();
	}
}
