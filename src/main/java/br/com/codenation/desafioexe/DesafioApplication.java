package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
	public static final int FIBONACCI_LIMIT = 350;

	public static List<Integer> fibonacci() {
		List<Integer> fibonacciList = new ArrayList<>();

		int fib1 = 0, fib2 = 1, aux = 0;
		while (fib1 < FIBONACCI_LIMIT) {
			if (aux == 0) {
				fibonacciList.add(aux);
			}

			aux = fib1 + fib2;
			fib1 = fib2;
			fib2 = aux;

			fibonacciList.add(fib1);
		}

		return fibonacciList;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}