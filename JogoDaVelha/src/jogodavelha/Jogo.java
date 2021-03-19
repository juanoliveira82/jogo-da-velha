// Autor: Juan Carlos Cardoso de Oliveira
package jogodavelha;

public class Jogo{
    // Instancia os jogadores.
    Jogador jog1 = new Jogador();
    Jogador jog2 = new Jogador(); 
    
    // Variável para indicar a vez do jogador.
    int turnoJogador;     
    
    String simboloJogada,     // Símbolo utilizado para representar o jogador.
    NomeJog1, NomeJog2,       // Variáveis para atribuir os nomes dos jogadores.
    simboloJog1, simboloJog2; // Variáveis para atribuir os simbolos dos jogadores.    
    
    // Variáveis utilizadas para marcar as casas jogadas.       
    int TopoEsqJog1, TopoMeioJog1, TopoDirJog1, // Marca as casas do topo, utilizadas pelo jogador 1. 
        BaseEsqJog1, BaseMeioJog1, BaseDirJog1, // Marca as casas da base, utilizadas pelo jogador 1.
        MeioEsqJog1, MeioMeioJog1, MeioDirJog1, // Marca as casas do meio, utilizadas pelo jogador 1.
        TopoEsqJog2, TopoMeioJog2, TopoDirJog2, // Marca as casas do topo, utilizadas pelo jogador 2.
        BaseEsqJog2, BaseMeioJog2, BaseDirJog2, // Marca as casas da base, utilizadas pelo jogador 2.
        MeioEsqJog2, MeioMeioJog2, MeioDirJog2; // Marca as casas do meio, utilizadas pelo jogador 2.    
    
    public Jogo(){
        turnoJogador=1;
        TopoEsqJog1=0; TopoMeioJog1=0; TopoDirJog1=0; 
        BaseEsqJog1=0; BaseMeioJog1=0; BaseDirJog1=0;
        MeioEsqJog1=0; MeioMeioJog1=0; MeioDirJog1=0;
        TopoEsqJog2=0; TopoMeioJog2=0; TopoDirJog2=0; 
        BaseEsqJog2=0; BaseMeioJog2=0; BaseDirJog2=0;
        MeioEsqJog2=0; MeioMeioJog2=0; MeioDirJog2=0;
    }
    
    // Reinicia as variáveis para um novo jogo.
    public void novoJogo(){
        turnoJogador=1;
        TopoEsqJog1=0; TopoMeioJog1=0; TopoDirJog1=0; 
        BaseEsqJog1=0; BaseMeioJog1=0; BaseDirJog1=0;
        MeioEsqJog1=0; MeioMeioJog1=0; MeioDirJog1=0;
        TopoEsqJog2=0; TopoMeioJog2=0; TopoDirJog2=0; 
        BaseEsqJog2=0; BaseMeioJog2=0; BaseDirJog2=0;
        MeioEsqJog2=0; MeioMeioJog2=0; MeioDirJog2=0;
    }
    
    // Método para definir o nome e o símbolo de cada jogador.
    public void definirNomeSimbolo(String nomeJogador1,String simboloJogador1,String nomeJogador2,String simboloJogador2){
        jog1.setNome(nomeJogador1);
        jog1.setSimbolo(simboloJogador1);
        jog2.setNome(nomeJogador2);        
        jog2.setSimbolo(simboloJogador2);
    }   
    
    // Realiza as jogadas invertendo os turnos dos jogadores.
    public void realizaJogada(){
        if(turnoJogador==1){
            simboloJogada=jog1.getSimbolo();
            turnoJogador=2;
        } else{
            simboloJogada=jog2.getSimbolo();
            turnoJogador=1;
        }
    }  
    
    // Deixa os botões habilitados e sem texto.
    public void iniciarJogo(){
        JanelaJogo.btnTopoEsq.setText("");
        JanelaJogo.btnTopoEsq.setEnabled(true);
        JanelaJogo.btnTopoMeio.setText("");
        JanelaJogo.btnTopoMeio.setEnabled(true);
        JanelaJogo.btnTopoDir.setText("");
        JanelaJogo.btnTopoDir.setEnabled(true);
        JanelaJogo.btnMeioEsq.setText("");
        JanelaJogo.btnMeioEsq.setEnabled(true);
        JanelaJogo.btnMeioMeio.setText("");
        JanelaJogo.btnMeioMeio.setEnabled(true);
        JanelaJogo.btnMeioDir.setText("");
        JanelaJogo.btnMeioDir.setEnabled(true);
        JanelaJogo.btnBaseEsq.setText("");
        JanelaJogo.btnBaseEsq.setEnabled(true);
        JanelaJogo.btnBaseMeio.setText("");
        JanelaJogo.btnBaseMeio.setEnabled(true);
        JanelaJogo.btnBaseDir.setText("");
        JanelaJogo.btnBaseDir.setEnabled(true);
    }

    // Verifica se o jogo acabou.
    public int verificaFimDeJogo() {
        // Por padrão o jogo continua.
        int continua = 1;
        
        if( JanelaJogo.btnTopoEsq.isEnabled() ||
            JanelaJogo.btnTopoMeio.isEnabled() ||
            JanelaJogo.btnTopoDir.isEnabled() ||
            JanelaJogo.btnMeioEsq.isEnabled() ||
            JanelaJogo.btnMeioMeio.isEnabled() ||
            JanelaJogo.btnMeioDir.isEnabled() ||
            JanelaJogo.btnBaseEsq.isEnabled() ||   
            JanelaJogo.btnBaseMeio.isEnabled() ||   
            JanelaJogo.btnBaseDir.isEnabled() ){            
            // Caso algum botão esteja habilitado, o jogo ainda não acabou.
            continua = 1;
        }
        else {
            // Caso nenhum botão eseja habilitado, o jogo acabou.
            continua = 0;
        }
        return continua;
    }
    
    // Verifica o vencedor do jogo.
    public void verificaCampeao(){
        // Verifica se o topo esta todo preenchido pelo símbolo do jogador 1
        if(TopoEsqJog1==1 && TopoMeioJog1==1 && TopoDirJog1== 1){
            JanelaJogo.lblLogs.setText("O jogador "+jog1.getNome()+" foi vencedor.");
            desabilitaBotoes();
        }
        // Verifica se o topo esta todo preenchido pelo símbolo do jogador 2
        else if(TopoEsqJog2==1 && TopoMeioJog2==1 && TopoDirJog2== 1){
            JanelaJogo.lblLogs.setText("O jogador "+jog2.getNome()+" foi vencedor.");
            desabilitaBotoes();
        }
        // Verifica se a lateral esquerda esta toda preenchido pelo símbolo do jogador 1
        else if(TopoEsqJog1==1 && MeioEsqJog1==1 && BaseEsqJog1==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog1.getNome()+" foi vencedor.");
            desabilitaBotoes();
        }
        // Verifica se a lateral esquerda esta toda preenchido pelo símbolo do jogador 2
        else if(TopoEsqJog2==1 && MeioEsqJog2==1 && BaseEsqJog2==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog2.getNome()+" foi vencedor.");
            desabilitaBotoes();
        }
        // Verifica se a diagonal esquerda esta toda preenchido pelo símbolo do jogador 1
        else if(TopoEsqJog1==1 && MeioMeioJog1==1 && BaseDirJog1==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog1.getNome()+" foi vencedor.");
            desabilitaBotoes();
        }
        // Verifica se a diagonal esquerda esta toda preenchido pelo símbolo do jogador 2
        else if(TopoEsqJog2==1 && MeioMeioJog2==1 && BaseDirJog2==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog2.getNome()+" foi vencedor.");
            desabilitaBotoes();
        }
        // Verifica se a lateral direita esta toda preenchido pelo símbolo do jogador 1
        else if(TopoDirJog1==1 && MeioDirJog1==1 && BaseDirJog1==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog1.getNome()+" foi vencedor.");
            desabilitaBotoes();
        }
        // Verifica se a lateral direita esta toda preenchido pelo símbolo do jogador 2
        else if(TopoDirJog2==1 && MeioDirJog2==1 && BaseDirJog2==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog2.getNome()+" foi vencedor.");
            desabilitaBotoes();
        }
        // Verifica se a base esta toda preenchida pelo símbolo do jogador 1
        else if(BaseEsqJog1==1 && BaseMeioJog1==1 && BaseDirJog1==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog1.getNome()+" foi vencedor.");
            desabilitaBotoes();
        }
        // Verifica se a base esta toda preenchida pelo símbolo do jogador 2
        else if(BaseEsqJog2==1 && BaseMeioJog2==1 && BaseDirJog2==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog2.getNome()+" foi campeão.");
            desabilitaBotoes();
        }
        // Verifica se o meio horizontal esta todo preenchido pelo símbolo do jogador 1
        else if(MeioEsqJog1==1 && MeioMeioJog1==1 && MeioDirJog1==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog1.getNome()+" foi campeão.");
            desabilitaBotoes();
        }
        // Verifica se o meio meio horizontal esta todo preenchido pelo símbolo do jogador 2
        else if(MeioEsqJog2==1 && MeioMeioJog2==1 && MeioDirJog2==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog2.getNome()+" foi campeão.");
            desabilitaBotoes();
        }
        // Verifica se o meio meio vertical esta todo preenchido pelo símbolo do jogador 1
        else if(TopoMeioJog1==1 && MeioMeioJog1==1 && BaseMeioJog1==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog1.getNome()+" foi campeão.");
            desabilitaBotoes();
        }
        // Verifica se o meio meio vertical esta todo preenchido pelo símbolo do jogador 1
        else if(TopoMeioJog2==1 && MeioMeioJog2==1 && BaseMeioJog2==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog2.getNome()+" foi campeão.");
            desabilitaBotoes();
        }
        // Verifica se a diagonal direita esta toda preenchida pelo símbolo do jogador 1
        else if(TopoDirJog1==1 && MeioMeioJog1==1 && BaseEsqJog1==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog1.getNome()+" foi campeão.");
            desabilitaBotoes();
        }
        // Verifica se a diagonal direita esta toda preenchida pelo símbolo do jogador 1
        else if(TopoDirJog2==1 && MeioMeioJog2==1 && BaseEsqJog2==1){
            JanelaJogo.lblLogs.setText("O jogador "+jog2.getNome()+" foi campeão.");
            desabilitaBotoes();
        }
        // Fim de jogo, deu velha
        else if(verificaFimDeJogo()==0){
            JanelaJogo.lblLogs.setText("Deu velha");
        }
    }
    
    // Desabilita todos os botões para finalizar o jogo.
    public void desabilitaBotoes(){
        JanelaJogo.btnTopoEsq.setEnabled(false);
        JanelaJogo.btnTopoMeio.setEnabled(false);
        JanelaJogo.btnTopoDir.setEnabled(false);
        JanelaJogo.btnMeioEsq.setEnabled(false);
        JanelaJogo.btnMeioMeio.setEnabled(false);
        JanelaJogo.btnMeioDir.setEnabled(false);
        JanelaJogo.btnBaseEsq.setEnabled(false);
        JanelaJogo.btnBaseMeio.setEnabled(false);
        JanelaJogo.btnBaseDir.setEnabled(false);
    }
}