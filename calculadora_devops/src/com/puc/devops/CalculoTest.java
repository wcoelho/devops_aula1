package com.puc.devops;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class CalculoTest {
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	private Calculo calculo;
	
	@Test
	void retornaSomaComSucesso_QuandoPassadosDoisNumeros() {
		
		Double resultado = calculo.somar(2, 2);
		
		assertEquals(5, resultado);		
	}
			
	@Test
	void retornaSubtracaoComSucesso_QuandoPassadosDoisNumeros() {
		
		Double resultado = calculo.subtrair(4, 2);
		
		assertEquals(2, resultado);		
	}
	
	@Test
	void retornaException_QuandoNaoInformadosDoisNumeros() {
		exceptionRule.expect(RuntimeException.class);					
		
		calculo.somar(2, null);
	}
}