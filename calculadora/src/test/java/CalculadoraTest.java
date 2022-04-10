import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest{
    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros() {
        //arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado =  5;
        //act
        calculadora.soma(4, 1);
        //assert
        Assert.assertEquals(resultadoEsperado, calculadora.resultado, 0.01);
    }
    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemInteiros() {
        //arrange
        Calculadora calculadora = new Calculadora();
        int subtracaoEsperada = 1;
        //act
        calculadora.subtracao(3, 2);
        //assert
        Assert.assertEquals(subtracaoEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros() {
        //arrange
        Calculadora calculadora = new Calculadora();
        int divisaoInteiraEsperada = 3;
        //act
        calculadora.divisao(9,3);
        //assert
        Assert.assertEquals(divisaoInteiraEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes() {
        //arrange
        Calculadora calculadora = new Calculadora();
        double divisaoFlutuanteEsperado = 1.8;
        //act
        calculadora.divisao(9, 5);
        //assert
        Assert.assertEquals(divisaoFlutuanteEsperado, calculadora.resultado, 0.01);
    }
    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros() {
        //arrange
        Calculadora calculadora = new Calculadora();
        int multiplicacaoEsperada = 4;
        //act
        calculadora.multiplicacao(2,2);
        //assert
        Assert.assertEquals(multiplicacaoEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveRetornarCorretamenteAExponenciacao() {
        //arrange
        Calculadora calculadora = new Calculadora();
        int exponenciacaoEsperada = 9;
        //act
        calculadora.exponeciacao(3);
        //assert
        Assert.assertEquals(exponenciacaoEsperada, calculadora.resultado, 0.01);

    }
    @Test
    public void deveRetornarCorretamenteARaizQuadrada() {
        //arrange
        Calculadora calculadora = new Calculadora();
        int raizQuadradaEsperada = 12;
        //act
        calculadora.raizQuadrada(144);
        //assert
        Assert.assertEquals(raizQuadradaEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveRetornarASomaDosXInteiras() {
        //arrange
        Calculadora calculadora = new Calculadora();
        int resultadoDeXEsperado = -12;

        //act
        calculadora.baskara(-1,6,5);

        //arrange
        Assert.assertEquals(resultadoDeXEsperado, calculadora.resultado, 0.01);
    }
    @Test
    public void deveRetornarFalseQuandoTiverUmaRaizNegativaEmBaskara() {
        //arrange
        Calculadora calculadora = new Calculadora();

        //act
        calculadora.baskara(1,-1,15);

        //assert
        Assert.assertFalse(calculadora.existeRaiz(calculadora.resultado));
    }
}
