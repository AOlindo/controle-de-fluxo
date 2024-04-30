package br.com.aolindo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int primeiroParametro = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		int segundoParametro = entrada.nextInt();

		try {
			contar(primeiroParametro, segundoParametro);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}

	}

	static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

		if (segundoParametro > primeiroParametro) {
			int contagem = segundoParametro - primeiroParametro;
			for (int x = 1; x <= contagem; x++) {
				System.out.println("Imprimindo parametro " + x);
			}
		} else {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
		}

	}
}
