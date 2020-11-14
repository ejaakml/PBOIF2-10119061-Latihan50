/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan50.energikinetik;

/**
 *
 * @author Rheiza
 */
public class PBOIF210119061Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
        
        bola.setMassa(0.145);
        bola.setKecepatan(25);
        bola.setKecepatanAwal(0);
        System.out.println("Diketahui : ");
        System.out.println("Massa bola : " + bola.getMassa() + " gram");
        System.out.println("Kecepatan awal bola : " + bola.getKecepatanAwal() + " m/s");
        System.out.println("Kecepatan Bola setelah di lempar : " + bola.getKecepatan() + " m/s");
        System.out.println();
        System.out.println("===Hasil Perhitungan===");
        System.out.println("Energi Kinetik : " + bola.hitungEnergiKinetik(bola.getMassa(),bola.getKecepatan()) + " J");
        System.out.println("Besar Usaha : " + bola.hitungUsaha(bola.getMassa(), bola.getKecepatanAwal(), bola.getKecepatan()) + " J");
    }
    
}
