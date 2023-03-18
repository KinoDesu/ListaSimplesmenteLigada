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
public class Contato {
    
    private String nome;
    private String cel;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato( String nome, String cel) {
      
        this.nome = nome;
        this.cel = cel;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", cel=" + cel + ", id=" + id + '}';
    }
    
   
    
}
