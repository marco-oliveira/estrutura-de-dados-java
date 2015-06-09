package vetor;


public class Vetor {

	private int tamanho = 0;
	
	private Object[] obj = new Object[100];
	
	private void garanteEspaco(){
		if (this.tamanho == this.obj.length) {
			Object [] novoArray = new Object[this.obj.length * 2];
			for (int i = 0; i < obj.length; i++) {
				novoArray[i] = this.obj[i];
			}
			this.obj = novoArray;
		}
	}
	
    public void adiciona(Object obj) {
    	garanteEspaco();
    	this.obj[this.tamanho] = obj;
    	this.tamanho++;
       /*for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }
        }*/
    }
	
    private boolean posicaoValida(int posicao){
    	return posicao >= 0 && posicao <= this.tamanho;
    }
    
	public void adiciona(int posicao, Object obj){
		garanteEspaco();
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("posição invalida!");
		}
		
		for (int i = this.tamanho - 1; i >= posicao; i-=1) {
			this.obj[i + 1] = this.obj[i];
		}
		
		this.obj[posicao] = obj;
		this.tamanho++;
	}
	
	public void remove(int posicao){
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posiçao invalida!");
		}
		
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.obj[i] = this.obj[i+1];
		}
		this.tamanho--;
	}
	
	public boolean contem(Object obj){
		for (int i = 0; i < this.tamanho; i++) {
			if (obj.equals(this.obj[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.tamanho;
	}
	
	public Object pega(int posicao){
		if(!posicaoOcupada(posicao)){
			 throw new IllegalArgumentException("posicão ilegal!");
		}else{
			return this.obj[posicao];
		}
	}
	
	public int tamanho(){
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (this.tamanho == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("[");
		for (int i = 0; i < this.tamanho-1; i++) {
			builder.append(this.obj[i]);
			builder.append(",");
		}
		builder.append(obj[tamanho-1]);
		
		builder.append("]");
		return builder.toString();
	}

}
