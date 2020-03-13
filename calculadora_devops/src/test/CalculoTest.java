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

    @Test
   	public void retornaMultiplicacaoComSucesso_QuandoPassadosDoisNumeros() {
        Double resultado = Calculo.multiplicar(2, 2);
        assertEquals(Double.valueOf(4), resultado);
    }

    @Test
   	public void retornaSubtracaoComSucesso_QuandoPassadosDoisNumeros() {
        Double resultado = Calculo.dividir(4, 2);
        assertEquals(Double.valueOf(2), resultado);
    }
    
    @Test
   	public void retornaRaizComSucesso_QuandoNumeroValido() {
        Double resultado = Calculo.raiz(144);
        assertEquals(Double.valueOf(12), resultado);
    }
    
    @Test
    public void retornaPercentualComSucesso_QuandoPassadosDoisNumeros() {
        Double resultado = Calculo.percentual(80, 100);
        assertEquals(Double.valueOf(80), resultado);
    }
    
    @Test
    public void retornaPotenciaComSucesso_QuandoPassadosDoisNumeros() {
        Double resultado = Calculo.potencia(3, 3);
        assertEquals(Double.valueOf(27), resultado);
    }
    
    @Test
    public void retornaMediaSucesso_QuandoPassadosDoisNumeros() {
        Double resultado = Calculo.media(0, 10);
        assertEquals(Double.valueOf(5), resultado);
    }
}