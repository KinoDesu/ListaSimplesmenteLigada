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
    
    public boolean verificar(){
        return inicio == null;
    }

    public void inserir(Object objeto) {
        Contato contato = (Contato) objeto;
        contato.setId(cont++);
        if (verificar()) { //verifica lista vazia
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
        System.out.println("=====");
        while (i != null) {
            System.out.println(i.getObjeto());
            if(i.getProx()!=null){
                System.out.println("-");
            }
            i = i.getProx();
            
        }
        System.out.println("=====");
    }
    
    /**
     * Realiza a busca linear em uma lista simplesmente ligada
     * Retornando um Array do tipo Object, onde:
     * 
     * Índice 0 - Endereço do elemento a ser removido
     * Índice 1 - Endereço do elemento anterior
     * Índice 2 - Tipo abstrato de dados no elemento
     * 
     * @param id int
     * @return Object[]
     */

    public Object[] pesquisarId(int id) {
        Object[] v = new Object[3];
        Elemento e = inicio;
        Elemento auxRem = null;
        Contato c;
        while (e != null) {
            c = (Contato) e.getObjeto();
            if (id == c.getId()) {
                v[0] = e;
                v[1] = auxRem;
                v[2] = c;

                return v;
            }
            auxRem = e;
            e = e.getProx();

        }
        return null;
    }

    /**
     * Remove um elemento da lista simplesmente ligada, considerando 3 casos:
     * 
     * 1- Remoção do primeiro elemento,
     * 2- Remoção do último elemento,
     * 3- Remoção de qualquer elemento
     * 
     * @param id int
     * @return boolean
     */
    
    public boolean remover(int id) {
        Object[] obj = pesquisarId(id);
        Contato c;
        if (obj != null) {
            Elemento e = (Elemento) obj[0];
            Elemento auxRem = (Elemento) obj[1];
            if (e == inicio) {//1 - remoção do primeiro elemento
                inicio = e.getProx();
                e.setProx(null);
            } else if (e.getProx() == null) {//2 - Remover o último elemento
                atual = auxRem;
                aux = atual;
                atual.setProx(null);
            } else {
                auxRem.setProx(e.getProx());
                e.setProx(null);
            }
            c = (Contato) e.getObjeto();
            System.out.println(c.getNome() + "("+c.getId()+") foi deletado");
            return true;
        } else {
            System.out.println("ID Inexistente");
            return false;
        }
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
                verifica = true;
            }

            elementoProdutoDesconto = elementoProdutoDesconto.getProx();
        }

        if (!verifica) {
            System.err.println("Categoria inexistente");
        } else {
            System.out.println("Produtos atualizados");
        }

    }

}
