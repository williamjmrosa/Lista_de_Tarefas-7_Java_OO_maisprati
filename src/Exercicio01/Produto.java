package Exercicio01;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome deve ser informado.");
        }else {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        if(preco <= 0){
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }else {
            this.preco = preco;
        }

    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque)  {
        if(quantidadeEmEstoque < 0){
            throw new IllegalArgumentException("Quantidade em estoque deve ser maior ou igual a zero.");
        }else{
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }
}
