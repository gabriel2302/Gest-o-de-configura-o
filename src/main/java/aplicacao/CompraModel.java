package aplicacao;

public class CompraModel{
    private int valor;
    private int idade;
    private int desconto;
    private int total;

    public CompraModel(int valor,int idade, int desconto, int total){
        this.valor = valor;
        this.idade = idade;
        this.desconto = desconto;
        this.total= total;
    }

    public CompraModel(){}
    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}