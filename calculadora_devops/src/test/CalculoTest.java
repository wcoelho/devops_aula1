package test;

import com.puc.devops.Calculo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class CalculoTest {

    @Test
	public void retornaSomaComSucesso_QuandoPassadosDoisNumeros() {
        Double resultado = Calculo.somar(2, 2);
        assertEquals(Double.valueOf(4), resultado);
    }

    @Test
	public void retornaSubtracaoComSucesso_QuandoPassadosDoisNumeros() {
        Double resultado = Calculo.subtrair(4, 2);
        assertEquals(Double.valueOf(2), resultado);
    }

}