import aplicacao.Calculo;
import aplicacao.CompraModel;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.Assert;

public class TestCompra extends TestCase {
    Calculo calc;
    CompraModel compra1;
    CompraModel compra;
    
    
    public void test(){
        
        
        compra1 = new CompraModel();
        compra = new CompraModel();
        calc = new Calculo();
        
       compra1.setValor(2000);
       compra1.setIdade(87);
       
       compra1.setDesconto(calc.calcularDesconto(compra1.getValor(), compra1.getIdade()));
       compra1.setTotal(calc.calcularTotal(compra1.getValor(), compra1.getDesconto()));
       
      
   
      Assert.assertEquals(1800, compra1.getTotal());
        
//       compra.setValor(1950);
//       compra.setIdade(52);
//       
//       compra.setDesconto(calc.calcularDesconto(compra.getValor(), compra.getIdade()));
//       compra.setTotal(calc.calcularTotal(compra.getValor(), compra.getDesconto()));
//
//        Assert.assertEquals(70, compra.getTotal());
    }

}