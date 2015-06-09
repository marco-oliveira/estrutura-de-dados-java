package vetor;


public class TesteVetor {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("joao");
		Aluno a2 = new Aluno();
		a2.setNome("jose");
		Aluno a3 = new Aluno();
		a3.setNome("tiao");
		Aluno a4 = new Aluno();
		a4.setNome("marco");
		
		Vetor lista = new Vetor();
		System.out.println(lista);
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		System.out.println(lista);
		System.out.println(lista.tamanho());
		System.out.println(lista.contem(a1));
		System.out.println(lista.pega(0));
		lista.adiciona(1, a4);
		System.out.println(lista);
		lista.remove(1);
		System.out.println(lista);
	}
}
