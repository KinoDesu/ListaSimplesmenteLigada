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
public class Lista {

    private Elemento inicio, atual, aux, inicioProduto, atualProduto;
    private int cont = 1, contProduto = 1;

    public void inserir(Object objeto) {
        Contato contato = (Contato) objeto;
        contato.setId(cont++);
        if (inicio == null) { //verifica lista vazia
            inicio = new Elemento(objeto, null);

            aux = inicio;

        } else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;//fica junto do atual

        }
    }

    public void exibir() {

        Elemento i = inicio;

        while (i != null) {
            System.out.println(i.getObjeto());
            i = i.getProx();
        }

    }

    public Object pesquisarId(int id) {
        Elemento e = inicio;
        Contato c;
        while (e != null) {
            c = (Contato) e.getObjeto();
            if (id == c.getId()) {
                return c;
            }

            e = e.getProx();

        }
        return null;
    }

    //
    //Produto
    //
    public void inserirProduto(Object objeto) {
        Produto produto = (Produto) objeto;
        produto.setId(contProduto++);
        if (inicioProduto == null) { //verifica lista vazia
            inicioProduto = new Elemento(objeto, null);

            aux = inicioProduto;

        } else {
            atualProduto = new Elemento(objeto, null);
            aux.setProx(atualProduto);
            aux = atualProduto;//fica junto do atual

        }
    }

    public void exibirProduto() {
        Elemento i = inicioProduto;

        while (i != null) {
            System.out.println(i.getObjeto());
            i = i.getProx();
        }

    }

    public Object pesquisarIdProduto(int id) {
        Elemento e = inicioProduto;
        Produto p;
        while (e != null) {
            p = (Produto) e.getObjeto();
            if (id == p.getId()) {
                return p;
            }

            e = e.getProx();

        }
        return null;
    }

    public void descontoProduto(String categoria, double percent) {
        boolean verifica = false;
        Elemento elementoProdutoDesconto = inicioProduto;
        Produto produtoDesconto;

        while (elementoProdutoDesconto != null) {
            produtoDesconto = (Produto) elementoProdutoDesconto.getObjeto();

            double convertedPercent = percent / 100;
            double desconto = produtoDesconto.getPreco() * convertedPercent;

            if (produtoDesconto.getCategoria().equalsIgnoreCase(categoria)) {
                produtoDesconto.setPreco(produtoDesconto.getPreco() - desconto);
                verifica=true;
            }
            
            elementoProdutoDesconto = elementoProdutoDesconto.getProx();
        }
        
        if(!verifica){
            System.err.println("Categoria inexistente");
        }else{
            System.out.println("Produtos atualizados");
        }

    }

}
