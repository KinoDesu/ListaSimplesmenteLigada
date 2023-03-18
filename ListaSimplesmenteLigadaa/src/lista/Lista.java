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
    
    private Elemento inicio, atual,aux;
    private int cont=1;
    
    public void inserir(Object objeto){
        Contato contato=(Contato)objeto;
        contato.setId(cont++);
        if(inicio == null){ //verifica lista vazia
            inicio=new Elemento(objeto, null);
            
            aux=inicio;
           
        }else{
            atual=new Elemento(objeto,null);
            aux.setProx(atual);
            aux=atual;//fica junto do atual
            
        }
    }
    
    public void exibir(){
        
        Elemento i =inicio; 
        
        while(i!=null){
            System.out.println(i.getObjeto());
            i=i.getProx();
        }
    }
    
    
    
}
