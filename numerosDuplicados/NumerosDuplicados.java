package numerosDuplicados;

// DECLARAÇÃO DA CLASSE
public class NumerosDuplicados {

	// DECLARAÇÃO MÉTODO PRINCIPAL
	public static void main(String[] args) {

		// UM Array GENERICO, ENTÃO PODE TESTAR COM DIFERENTES VALORES
		int array[] = { 1, 2, 3, 4, 5 };

		// SE verificaDuplicados RETORNAR TRUE...
		if (verificaDuplicados(array)) {
			System.out.println("há números duplicados");
		// SE verificaDuplicados RETORNAR FALSE...
		} else {
			System.out.println("não há números duplicados");
		}
	}

	// DECLARAÇÃO DE FUNÇÃO PARA VERIFICAÇÃO DE NÚMEROS DUPLICADOS
	public static boolean verificaDuplicados(int array[]) {

		// VARIAVEL PARA ARMAZENAR UM POR UM DOS NUMEROS DO ARRAY
		// OU SEJA, AUXILIAR NA COMPARAÇÃO
		int verificaNumero = 0;

		// LAÇO DE REPETIÇÃO QUE ALTERA O VALOR DE verificaNumero
		for (int contadorVerificaNumero = 0; contadorVerificaNumero < array.length; contadorVerificaNumero++) {

			// verificaNumero RECEBE O NUMERO NA POSIÇÃO DO INDÍCE DO ARRAY
			verificaNumero = array[contadorVerificaNumero];

			// LAÇO QUE PERCORRE TODO O ARRAY
			for (int contadorArray = 1; contadorArray < array.length; contadorArray++) {
				
				// GARANTE QUE NÃO VAI COMPARAR OS NÚMEROS DO MESMO INDÍCE
				if (contadorVerificaNumero != contadorArray) {
					
					// VERIFICA SE APÓS A GARANTIA ACIMA, HÁ NÚMEROS EM INDÍCES DIFERENTES QUE POSSUEM O MESMO VALOR
					if (verificaNumero == array[contadorArray]) {
						
						// SE HOUVER, RETORNA TRUE, E A FUNÇÃO ACABA AQUI
						return true;
					}
				}
				
			}
		}

		// SE NÃO HOUVER INDÍCES DIFERENTES COM VALORES IGUAIS, RETORNA FALSE
		return false;
	}

}
