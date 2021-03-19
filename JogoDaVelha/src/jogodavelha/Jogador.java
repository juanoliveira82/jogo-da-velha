// Autor: Juan Carlos Cardoso de Oliveira
package jogodavelha;

public class Jogador{
    private String Nome;
    private String Simbolo;    
    public Jogador(){
        Nome = " ";
        Simbolo = " ";
    }
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    public String getSimbolo(){
        return Simbolo;
    }
    public void setSimbolo(String simbolo){
        this.Simbolo = simbolo;
    }   
}
