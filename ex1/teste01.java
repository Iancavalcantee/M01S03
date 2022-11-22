package com.devinhouse.ex1;

public class teste01 {

	public static void main(String[] args) {

		
		Funcionario joao = new Funcionario();
		
		joao.setSalario(1000);
		
		joao.setCpf(123459L);

		joao.setNomecompleto("joao oliveira");
		
		
		System.out.println(joao.getCpf());
		
		System.out.println(joao.getNomecompleto());

		System.out.println(joao.getSalario());
		
		joao.promover(10);
		
		
		System.out.println(joao.getSalario());

		
		
		
		
	}

}
