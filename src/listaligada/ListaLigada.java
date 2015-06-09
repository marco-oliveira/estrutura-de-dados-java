package listaligada;

public class ListaLigada {
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos = 0;
	
	@Override
	public String toString() {
		
		if(this.totalDeElementos == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		for (int i = 0; i < this.totalDeElementos -1; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProxima();
		}
		
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
	
	public void adiciona(Object elemento){
		if (this.totalDeElementos == 0) {
			adicionaNocomeco(elemento);
		}else {
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	private boolean posicaoOcupada(int posicao){
		return posicao >=0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao){
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posição invalida!");
		}
		Celula atual = primeira;
		
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}
	
	public void adiciona(int posicao, Object elemento){
		if (posicao == 0) {
			this.adicionaNocomeco(elemento);
		}else if (this.totalDeElementos == posicao){
			this.adiciona(elemento);
		}else{
			Celula anterior = this.pegaCelula(posicao -1);
			Celula proxima = anterior.getProxima();
			Celula nova = new Celula(anterior.getProxima(), elemento);
			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			
			this.totalDeElementos++;
		}
		
	}
	
	public void adicionaNocomeco(Object elemento){
		if (this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else{
			Celula nova = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.totalDeElementos ++;
	}
	
	public Object pega(int posicao){
		return this.pegaCelula(posicao).getElemento();
	}
	
	public void remove(int posicao){
		if (posicao == 0) {
			this.removeDoComeco();
		}else if(posicao == this.totalDeElementos - 1){
			this.removeDoFim();
		}else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProxima();
			Celula proxima = atual.getProxima();
			
			anterior.setProxima(proxima);;
			proxima.setAnterior(anterior);
			this.totalDeElementos--;
		}
		
	}
	
	public void removeDoComeco(){
		
		if (this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
		}
		
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	public void removeDoFim(){
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		}else {
			Celula penultimo = this.ultima.getAnterior();
			penultimo.setProxima(null);
			this.ultima.setProxima(penultimo);
			
			this.totalDeElementos--;
		}
		
	}
	
	public int tamanho(){
		return this.totalDeElementos;
	}
	
	public boolean contem(Object obj){
		Celula atual = this.primeira;
		while (atual != null) {
			if (atual.getElemento().equals(obj)) {
				return true;
			}
			atual = atual.getProxima();
		}
		return false;
	}
}
