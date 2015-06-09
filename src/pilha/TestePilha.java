package pilha;

public class TestePilha {
	public static void main(String[] args) {
		Pilha nome = new Pilha();
		nome.insere("marco");
		nome.insere("maiza");
		nome.insere("marco a");
		
		System.out.println(nome);
		
		nome.remove();
		System.out.println(nome);
		nome.remove();
		System.out.println(nome);
		nome.remove();
		System.out.println(nome);
		System.out.println(nome.vazio());
		
	}
}
