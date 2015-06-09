package listaligada;

public class TesteListaLigada {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		System.out.println(lista);
		lista.adiciona("marco");
		System.out.println(lista);
		lista.adiciona("maria");
		System.out.println(lista);
		lista.adiciona("pedro");
		System.out.println(lista);
		lista.adiciona("joao");
		System.out.println(lista);
		lista.adicionaNocomeco("maiza");
		System.out.println(lista);
		lista.adiciona(1, "marco a");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		System.out.println(lista.pega(1));
		System.out.println(lista.contem("marco"));
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		lista.removeDoFim();
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
	}
}
