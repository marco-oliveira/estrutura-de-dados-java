package conjunto;

public class TestaConjunto {
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("marco");

		conjunto.adiciona("maiza");

		conjunto.adiciona("marco a");

		conjunto.adiciona("joao");

		conjunto.adiciona("jose");

		conjunto.adiciona("pedro");
		System.out.println(conjunto);
		
		System.out.println(conjunto.pegatodas());
		System.out.println(conjunto.contem("marco"));
		conjunto.remove("marco");
		System.out.println(conjunto.pegatodas());
		System.out.println(conjunto.contem("marco"));
	}
}
