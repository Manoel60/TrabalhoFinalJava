/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoprincipal;

import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Manoel
 */
public class ContraMaquina extends JPanel implements ModoDeJogo{
    Random escRand = new Random();
    
    //Constante para facilitar 
    private static final int PEDRA=1,
                             PAPEL=2,
                             TESOURA=3,
                             SPOCK=4,
                             LAGARTO=5;
    @Override
    public String[] escolha(int escolhaJog) {
        
        int escMaq = (1 + escRand.nextInt(5));
        
        String resul[] = new String[3];
        
        switch(escMaq)
        {
            case PEDRA:
            {
                if(escolhaJog == TESOURA || escolhaJog == LAGARTO )
                {
                    resul[0]= "Perdeu";  
                    resul[2]="1";
                }else if(escolhaJog == PAPEL || escolhaJog == SPOCK)
                {
                    resul[0] ="Ganhou!!";
                    //Essa informação ira sercir para contar os pontos
                    resul[2]="2";
                }
                resul[1] = ("Pedra");
                break;
            }
            case PAPEL:{
                if(escolhaJog == SPOCK || escolhaJog == PEDRA )
                {
                    resul[0]= "Perdeu";
                    resul[2]="1";
                    
                }else if(escolhaJog == TESOURA || escolhaJog == LAGARTO)
                {
                    resul[0] ="Ganhou!!";                    
                    resul[2]="2";
                }
                resul[1] = "Papel";
                break;
            }
            case TESOURA:{
                if(escolhaJog == PAPEL || escolhaJog == LAGARTO )
                {
                    resul[0]= "Perdeu";
                    resul[2]="1";
                }else if(escolhaJog == PEDRA || escolhaJog == SPOCK)
                {
                    resul[0] ="Ganhou!!";
                    resul[2]="2";
                   
                }
                resul[1] = "Tesoura";
                break;
            }
            case SPOCK:{
                if(escolhaJog == PEDRA || escolhaJog == TESOURA )
                {
                    resul[0]= "Perdeu";
                    resul[2]="1";
                   
                }else if(escolhaJog == PAPEL || escolhaJog == LAGARTO)
                {
                    resul[0] ="Ganhou!!";
                    resul[2]="2";
                    
                }
                resul[1] = "SPOOK!";
                break;
            }
            case LAGARTO:{
                if(escolhaJog == SPOCK || escolhaJog == PAPEL )
                {
                    resul[0]= "Perdeu";
                    resul[2]="1";
                    
                }else if(escolhaJog == PEDRA || escolhaJog == TESOURA)
                {
                    resul[0] ="Ganhou!!";
                    resul[2]="2";
                    
                }
                resul[1] = "Lagarto";
                break;
            }
        }
        if(escolhaJog == escMaq)
        {
            resul[0]= "Empate";
            resul[2]="0";
        }
        return resul;
    }
    
}
