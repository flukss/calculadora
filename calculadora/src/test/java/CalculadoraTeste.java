import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {
    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros() {
        //arrange
        Calculadora calculadora = new Calculadora();
        double somaEsperada =  5;
        //act
        calculadora.soma(4, 1);
        //assert
        Assert.assertEquals(somaEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveSomarCorretamenteQuandoNumerosPossuemPontoFlutuantes() {
        //arrange
        Calculadora calculadora = new Calculadora();
        double somaFlutuanteEsperada =  3.5;
        //act
        calculadora.soma(2.5, 1);
        //assert
        Assert.assertEquals(somaFlutuanteEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemInteiros() {
        //arrange
        Calculadora calculadora = new Calculadora();
        double subtracaoEsperada = 1;
        //act
        calculadora.subtracao(3, 2);
        //assert
        Assert.assertEquals(subtracaoEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveSubtrairCorretamenteQuandoNumerosPossuemPontoFlutuantes() {
        //arrange
        Calculadora calculadora = new Calculadora();
        double subtracaoEsperada = 1.8;
        //act
        calculadora.subtracao(3.8, 2);
        //assert
        Assert.assertEquals(subtracaoEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros() {
        //arrange
        Calculadora calculadora = new Calculadora();
        double divisaoInteiraEsperada = 3;
        //act
        calculadora.divisao(9, 3);
        //assert
        Assert.assertEquals(divisaoInteiraEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontoFlutuantes() {
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
        double multiplicacaoEsperada = 4;
        //act
        calculadora.multiplicacao(2, 2);
        //assert
        Assert.assertEquals(multiplicacaoEsperada, calculadora.resultado, 0.01);
    }
    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosPossuemPontoFlutuantes() {
        //arrange
        Calculadora calculadora = new Calculadora();
        double multiplicacaoFlutuanteEsperada = 9.6;
        //act
        calculadora.multiplicacao(3, 3.2);
        //assert
        Assert.assertEquals(multiplicacaoFlutuanteEsperada, calculadora.resultado, 0.01);
    }
}
