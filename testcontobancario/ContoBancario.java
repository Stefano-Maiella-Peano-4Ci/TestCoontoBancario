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
public class ContoBancario {

    private String nomeConto;
    private int bilancio;

    public ContoBancario(String nomeConto) {

        this.nomeConto = nomeConto;
    }

    public ContoBancario(String nomeConto, int bilancio) {

        this.nomeConto = nomeConto;
        this.bilancio = bilancio;
    }

    public String getNomeConto() {

        return nomeConto;
    }

    public int getBilancio() {

        return bilancio;
    }

    public void setNomeConto(String nomeConto) {
        this.nomeConto = nomeConto;
    }

    public void setBilancio(int bilancio) {
        this.bilancio = bilancio;
    }

    
    public void deposita() {
        int denaro = 0;
        denaro = Integer.parseInt(JOptionPane.showInputDialog("Quanto vuoi depositare?", denaro));
        System.out.println("Hai depositato " + denaro + " euro");
        bilancio = bilancio + denaro;
        System.out.println("Adesso hai " + bilancio + " euro");

    }

    public void preleva() {
        int denaro = 0;

        denaro = Integer.parseInt(JOptionPane.showInputDialog("Quanto vuoi prelevare", denaro));
        if (bilancio >= denaro) {
            System.out.println("Hai prelevato " + denaro + " euro");
            bilancio = bilancio - denaro;
            System.out.println("Adesso hai " + bilancio + " euro");
        } else {
            System.out.println("Sei povero mi dispiace");
        
        }

    }
}
