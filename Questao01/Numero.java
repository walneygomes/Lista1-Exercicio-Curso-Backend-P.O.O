package Questao01;

public class Numero {
	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
		eParImpar("� Par", numero);
		eParImpar("� impar", numero);

	}

	private void eParImpar(String pergunta, int valor) {
		boolean ePar = false;

		if (("� Par".equals(pergunta)) && (valor % 2 == 0)) {
			ePar = true;
		} else if ("� impar".equals(pergunta) && (valor % 2 != 0)) {
			ePar = true;
		}
		System.out.println(pergunta+ "  "+ ePar);

	}

	private String veriricarPergunta(String[] pergunta) {
		String valor = "";

		for (int i = 0; i < pergunta.length; i++) {

		}
		return valor;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
