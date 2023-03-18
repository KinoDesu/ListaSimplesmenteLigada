/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author leonardo.nmfujimura
 */
import lista.*;
public class UsaLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Leonardo","123-333"));
        lista.inserir(new Contato("Gustavo","123-222"));
        lista.inserir(new Contato("Ian","121-111"));
        lista.inserir(new Contato("Henrick","123-444"));
        lista.inserir(new Contato("Igor","125-555"));
        
        lista.exibir();
        
    }
    
}
