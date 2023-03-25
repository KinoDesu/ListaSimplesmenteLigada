/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author leonardo.nmfujimura
 */
public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + ", id=" + id + '}';
    }
    
    
    
}
