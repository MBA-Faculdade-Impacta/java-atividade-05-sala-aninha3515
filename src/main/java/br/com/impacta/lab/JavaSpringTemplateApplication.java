package br.com.impacta.lab;

import br.com.impacta.models.*;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Transforme a tabela produto em uma classe separadas
		 * no pacote br.com.impacta.models
		 * 
		 *  
		 *  Tabela de produto
		 *  
		 *  CodigoProduto	descrição do Produto		Valor do Produto
		 * 	1				Camisa						70.00
		 * 	2				Shorts						57.50
		 * 	3				Meia						9.99
		 * 	4				Toca						35.00
		 * 	5				Luvas						19.50
		 * 
		 * -----------------------------------------------------------------
		 * 
		 * Em seguida crie um método na classe Produto onde o mesmo tenho o nome de montarResumo
		 * Exemplo de um método:
		 * public String falar(String palavra) {
		 * 	System.out.println(palavra);
		 * }
		 * 
		 * receba como parametro um Produto e devolva uma String
		 * 
		 * O retorno deve ser no seguinte formato
		 * 
		 * "codigo: <produto.codigo>, descricao: <produto.descricao>, valor: <produto.valor>"
		 * 
		 * 
		 */
		
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;
		Produto Shorts = new Produto();
		Shorts.codigo = 2;
		Shorts.descricao = "Shorts";
		Shorts.valor = 57.50;
		
		Produto Meia = new Produto();
		Meia.codigo = 3;
		Meia.descricao = "Meia";
		Meia.valor = 9.99;
		
		Produto Toca = new Produto();
		Toca.codigo = 4;
		Toca.descricao = "Toca";
		Toca.valor = 35.00;
		
		Produto Luva = new Produto();
		Luva.codigo = 5;
		Luva.descricao = "Luva";
		Luva.valor = 19.50;
		
		String resumo = Camisa.montarResumo();
		
		System.out.println(resumo);
	}

}