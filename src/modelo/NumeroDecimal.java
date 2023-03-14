package modelo;

public class NumeroDecimal {
	private int numeroDecimal;
	private long numeroBinario;
	private int numeroOctal;
	private int numeroHexadecimal;

	public int getNumeroDecimal() {
		return numeroDecimal;
	}

	public long getNumeroBinario() {
		return numeroBinario;
	}

	public void setNumeroBinario(long numeroBinario) {
		this.numeroBinario = numeroBinario;
	}

	public int getNumeroOctal() {
		return numeroOctal;
	}

	public void setNumeroOctal(int numeroOctal) {
		this.numeroOctal = numeroOctal;
	}

	public int getNumeroHexadecimal() {
		return numeroHexadecimal;
	}

	public void setNumeroHexadecimal(int numeroHexadecimal) {
		this.numeroHexadecimal = numeroHexadecimal;
	}

	public void setNumeroDecimal(int numeroDecimal) {
		this.numeroDecimal = numeroDecimal;
	}

	// metodos
	public Long convertirDecimalABinario(long numeroDecimal) {
		this.numeroBinario = Long.parseLong(Long.toBinaryString(numeroDecimal));
		return this.numeroBinario;
	}

	public int convertirDecimalAOctal(int decimal) {
		int residuo;
		String octal = "";
		char[] caracteresOctales = { '0', '1', '2', '3', '4', '5', '6', '7' };
		while (decimal > 0) {
			residuo = decimal % 8;
			char caracter = caracteresOctales[residuo];
			octal = caracter + octal;
			decimal = decimal / 8;
		}
		this.numeroOctal = Integer.parseInt(octal);
		return this.numeroOctal;
	}

	public int decimalAHexadecimal(int decimal) {
		String hexadecimal = "";
		String caracteresHexadecimales = "0123456789abcdef";
		while (decimal > 0) {
			int residuo = decimal % 16;
			hexadecimal = caracteresHexadecimales.charAt(residuo) + hexadecimal; // Agregar a la izquierda
			decimal /= 16;
		}
		this.numeroHexadecimal = Integer.parseInt(hexadecimal);
		return this.numeroHexadecimal;
	}
	
}
