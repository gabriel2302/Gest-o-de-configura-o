package aplicacao;
import java.util.Scanner;


public class Compra {
    CompraModel compra;
    Calculo desc;

    public void RealizarCompra(){
        compra = new CompraModel();

        Scanner dados = new Scanner(System.in);
        System.out.println("Informe o valor da compra: ");
        compra.setValor(dados.nextInt());

        System.out.println("Informe a Idade: ");
        compra.setIdade(dados.nextInt());

        desc = new Calculo();
        compra.setDesconto(desc.calcularDesconto(compra.getValor(), compra.getIdade()));
        compra.setTotal(desc.calcularTotal(compra.getValor(), compra.getDesconto()));

        System.out.println("Valor do Desconto: " + compra.getDesconto());
        System.out.println("Valor a pagar: " + compra.getTotal());
    }
}