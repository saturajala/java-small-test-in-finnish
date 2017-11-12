package pankkitili;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author h3859
 */
public class ApuMetodit {
    
    public static String kysyMjono(String kysymys){
    
     Scanner lukija = new Scanner(System.in);
     String vastaus;
     while(true) {
     try
       {
        System.out.print(kysymys);
        vastaus = lukija.nextLine();
        break;
        }
        catch (Exception e)
        {
        System.out.println("Sattui virhe");

        //lukijan siirto seuraavalle riville
        //lukija.nextLine();
        }
      }
      return vastaus;
    
    }
    
}
