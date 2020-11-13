/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan48.kalkulator;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class Kalkulator {
    private double value1, value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNamaProject () {
        System.out.println("PROJECT CALCULATOR");
    }
    
    public void setNoteProject (String note) {
        System.out.println("This project show you how to manage method in java");   
    }
    
    public double add (double value1, double value2) {
        return value1 + value2;
    }
    
    public double minus (double value1, double value2) {
        return value1 - value2;
    }
    
    public double multiplication (double value1, double value2) {
        return value1 * value2;
    }
    
    public double division (double value1, double value2) {
        return value1 / value2;
    }
}
