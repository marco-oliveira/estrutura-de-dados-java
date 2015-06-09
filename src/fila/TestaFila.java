package fila;

public class TestaFila {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		fila.adiciona("marco");
		fila.adiciona("maiza");
		
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		fila.remove();
		System.out.println(fila);
		System.out.println(fila.vazio());
	}
}
