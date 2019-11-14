/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

/**
 *
 * @author maiella.stefano
 */
public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContoBancario c1 = new ContoBancario("-",0);
        c1.setNomeConto("abc001");
        c1.setBilancio(10);
        c1.getBilancio();
        c1.getNomeConto();
        c1.preleva();
        c1.deposita();
        ContoEsteso c2 = new ContoEsteso(1000,"abc001",100);
        
        c2.preleva();
        
    }
    
}
