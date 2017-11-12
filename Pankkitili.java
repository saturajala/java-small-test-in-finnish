
package pankkitili;

/**
 *
 * @author h3859
 */
public class Pankkitili {
    
    private String tilinumero;
    private String tilinomistaja;
    private double saldo;
    private String tunnussana;
    
    public Pankkitili () {
    
    System.out.println("Pankkitili luotu");
    
        
    this.tilinumero = "";
    this.tilinomistaja = "";
    this.saldo = 0.0;
    this.tunnussana = "1234";
        
    }
    
    public String getTilinumero() {
    
    return this.tilinumero;
    }
    
    //Getterit:
    public String getTilinomistaja() {
    
    return this.tilinomistaja;
    }
    
    public double getSaldo() {
    
        return this.saldo;
    }
    
    //Setterit:
    public boolean setTilinumero(String tilinumero){
        
        if (tilinumero.matches("^([0-9]{6})-([0-9]{6})$")) {
        this.tilinumero = tilinumero;
        return true;
        }
        
        else {
        System.out.println("Laitoit väärän tilinumeron!");
        return false;
        }
    }
    
    public void setTilinomistaja(String tilinomistaja){
        this.tilinomistaja = tilinomistaja;
    }
    
    public boolean setSaldo(double saldo){
        
        if (saldo >= 0){
            
            this.saldo = saldo;
            return true;
        }
          
        else {
        
        System.out.println("Saldo ei voi mennä miinuksen puolelle.");
        return false;
        
        }
        
    }
    
    public boolean tarkistaTunnussana(String tunnussana) {
    
    if (tunnussana.equals(this.tunnussana)){
        return true;
    
    }
    
    else {
        return false;
    }
    
    }
    
    public void nostaRahaa (double summa, String tunnussana) {
        
            
        if (this.tunnussana.equals(tunnussana))
        {
        double uusiSaldo = this.saldo - summa;
        setSaldo(uusiSaldo);
        }
        
        else
        {
        System.out.println("Tunnussana meni väärin.");
        }
        
    }
    
    public void tallennaRahaa (double summa2) {
    
        setSaldo(getSaldo() + summa2);
        
    }
    
    public void tulosta() {
    
    System.out.println("Nimesi on " + this.tilinomistaja);
    System.out.println("Tilinumerosi on " + this.tilinumero);
    System.out.println("Saldosi " + this.saldo);
    
    }
    

    
}
