/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

import javax.swing.JOptionPane;

/**
 *
 * @author maiella.stefano
 */
public class ContoEsteso extends ContoBancario{
    private int bilancio;
    private int fido;

//    public ContoEsteso(int fido) {
//        this.fido = 1000;
//    }

    public ContoEsteso(int fido, String nomeConto) {
        super(nomeConto);
        this.fido = 1000;
    }

    public ContoEsteso(int fido, String nomeConto, int bilancio) {
        super(nomeConto, bilancio);
        this.fido = fido;
    }
    
    
    
    public ContoEsteso(String nomeConto) {
        super(nomeConto);
    }

       
    
    public ContoEsteso(String nomeConto, int bilancio) {
        super(nomeConto, bilancio);
    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
        this.fido = fido;
    }

    @Override
    public void preleva() {
        int denaro = 0;

        denaro = Integer.parseInt(JOptionPane.showInputDialog("Quanto vuoi prelevare(+fido)?", denaro));
        if (bilancio > denaro) {
            System.out.println("Hai prelevato " + denaro + " euro");
            bilancio = bilancio - denaro;
            System.out.println("Adesso hai " + bilancio + " euro");
        } else {
            System.out.println("Non hai abbstanza soldi, li prendo dal fido");
            if(bilancio + fido >= denaro){
                int insieme = bilancio + fido;
                insieme = insieme - denaro;
                System.out.println("hai prelevato " + denaro + " euro anche dal fido, perche avevi solo "+ bilancio);
            }
        }

    }
    
    
    
}
