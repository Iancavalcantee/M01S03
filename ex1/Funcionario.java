package com.devinhouse.ex1;

public class Funcionario {
	
	private Long cpf;
	private String nomecompleto;
	private float salario;
	
	
	public float getCpf() {
		
		return cpf;
		
		
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
		
	}
	
	
	public String getNomecompleto() {
		
		return nomecompleto;
		
	}
	
	public void setNomecompleto(String nomecompleto) {
		
		this.nomecompleto = nomecompleto;
		
	}
	
	public float getSalario() {
		
		return salario;
		
	}
	
	public void setSalario(int salario) {
		
		this.salario = salario;
		
	}
	
	
	public float promover(float percentual) {
		float aumento = (this.salario * percentual)/100;
		return this.salario += aumento;
		
	}
	
	/*
	 * Crie uma classe 'Funcionario' para representar um 
	 * empregado de uma empresa,
	 * contendo os atributos cpf, nome completo e salário. 
	 * Implemente também um
	 * método 'promover' que recebe como parâmetro um percentual
	 *  (float), devendo o
	 * salário ser aumentado pelo percentual indicado no argumento 
	 * do método. Crie e
	 * utilize um objeto desta classe para testar a implementação
	 * 
	 * 
	 * 
	 * 
	 */

}
