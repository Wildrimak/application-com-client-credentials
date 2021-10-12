package br.com.wildrimak.minibanco.dtos.responses;

public class ContaResponse {

	private String codigoBanco;
	private String agencia;
	private String numero;
	private Character verificador;
	private String nomeCliente;

	public ContaResponse(String codigoBanco, String agencia, String numero, Character verificador, String nomeCliente) {
		this.codigoBanco = codigoBanco;
		this.agencia = agencia;
		this.numero = numero;
		this.verificador = verificador;
		this.nomeCliente = nomeCliente;
	}

	public String getCodigoBanco() {
		return codigoBanco;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public Character getVerificador() {
		return verificador;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

}
