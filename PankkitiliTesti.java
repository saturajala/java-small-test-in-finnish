

package pankkitili;

import java.util.Scanner;

/**
 *
 * @author h3859
 */
public class PankkitiliTesti {


    public static void main(String[] args) {

        //Luodaan olio "tili" luokasta "Pankkitili"
        Pankkitili tili = new Pankkitili();
        
        //Lisätään skanneri
        Scanner scan = new Scanner(System.in);
        
        // Näin toimittaisiin, jos ei olisi ApuMetodit.javaa:
        //System.out.println("Kerro nimesi: ");
        //String nimi = scan.nextLine();
        //tili.setTilinomistaja(nimi);
        
        String tilinomistaja = ApuMetodit.kysyMjono("Anna nimesi: ");
        String tilinumero = ApuMetodit.kysyMjono("Anna tilinumerosi: ");
        tili.setTilinomistaja(tilinomistaja);
        tili.setTilinumero(tilinumero);
                
        
        //System.out.println("Kerro tilinumerosi: ");
        //String tilinumero = scan.nextLine();
        //tili.setTilinumero(tilinumero);
        String tunnussana;
        //String vastaus;
        
        while(true){
        System.out.println("Anna tunnussana: ");
        tunnussana = scan.next();
        if (tili.tarkistaTunnussana(tunnussana))
        {
            break;
        }
        }
        
        System.out.println("Kerro saldosi: ");
        double saldo = scan.nextDouble();
        tili.setSaldo(saldo);
        
        
        
        String nosta = "nosta";
        String lisaa = "lisaa";
        
        System.out.println("Haluatko nostaa vai lisätä tilillesi rahaa?");
        String vastaus = scan.next();
        
        //jos käyttäjä kirjoitti "lisaa":
        if(vastaus.equals(lisaa)){
        
        System.out.println("Paljon haluat lisätä rahaa tilillesi: (kirjoita nosta tai lisaa)");
        double summa2 = scan.nextDouble();
        tili.tallennaRahaa(summa2);
        }
        
        //jos käyttäjä kirjoitti"nosta"
        else if(vastaus.equals(nosta)) {
        System.out.println("Paljon haluat nostaa rahaa: ");
        double summa = scan.nextDouble();
        tili.nostaRahaa(summa, tunnussana);
        }
        
        //jos käyttäjä ei kirjoittanut kumpaakaan tai kirjoitti virheellisesti:
        else {
        System.out.println("Tapahtui virhe");
        }

        //lopuksi tulostetaan olio.
        tili.tulosta();
        
        
        
    
    }
}
