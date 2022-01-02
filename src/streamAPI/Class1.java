package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Class1 {
	
	List<Integer> list = new ArrayList<>();
	
	public void addToArray(int n) {
		list.add(n);
	}
	

	
	public static void main(String[] args) {
		
		Class1 c = new Class1();
		
		c.addToArray(1);
		c.addToArray(10);
		c.addToArray(8);
		c.addToArray(9);
		c.addToArray(6);
		c.addToArray(2);
		
		// Ordenar de forma crescente 
		// filtrar números entre 2 e 8
		// com cada elemento elevado ao quadrado
		
		List<Integer> newList = c.list.stream()//inicia a stream
				.sorted()//ordena em ordem crescente
				.filter(e -> e >= 2 && e <= 8).map(e -> e * e)//seleciona apenas os números entre 2 e 8 incusive
				.collect(Collectors.toList());//organiza em uma lista e devolve os dados
		
		for (Integer e : newList) {
			System.out.println(e);
		}
		
	}
	
}
