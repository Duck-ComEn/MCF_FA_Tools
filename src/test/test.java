/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mcf_fa_tools.*;

/**
 *
 * @author Mr.Piyanan
 */
public class test {

    public static void main(String args[]) {
        testtesterclass();

    }
    private static void testtesterclass() {
         Tester t1 = new Tester();
        Tester t2 = new Tester();
        t1.setName("tester1");
        t2.setName("tester2");
        String[] cells = new String[2];
        cells[0] = "Cell1";
        cells[1] = "Cell2";

        t1.setStringCellID(cells);
        t2.setStringCellID(cells);

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t2.getStringCellID()[0]);
        System.out.println(t2.getStringCellID()[1]);
    }
}
