/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan48.kalkulator;

/**
 *
 * @author 
 * Nama     : Reihan Wiyanda
 * Kelas    : IF-1
 * Nim      : 10119011
 */
public class IF110119011Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kl = new Kalkulator();
        kl.setValue1(7);
        kl.setValue2(5);
        
        System.out.println("Value 1 = " + kl.getValue1());
        System.out.println("Value 2 = " + kl.getValue2());
        
        kl.setNamaProject();
        kl.setNoteProject("");
        
        System.out.println("Result Add = " + kl.add(kl.getValue1(), kl.getValue2()));
        System.out.println("Result Minus = " + kl.minus(kl.getValue1(), kl.getValue2()));
        System.out.println("Result Multiple = " + kl.multiplication(kl.getValue1(), kl.getValue2()));
        System.out.println("Result Division = " + kl.division(kl.getValue1(), kl.getValue2()));
    }
    
}
