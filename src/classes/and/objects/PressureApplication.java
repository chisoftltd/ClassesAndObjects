/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.and.objects;

/**
 *
 * @author 1609963
 */
public class PressureApplication {

    public static void main(String[] args) {

        Pressure pressure = new Pressure(0.0, "psi", 13.01);
        System.out.println(pressure.toString());
        System.out.println(Pressure.psiToPa(2091));
        System.out.println(pressure.getPressureInPa());

        Pressure p1 = new Pressure(2000, "psi", 0);
        System.out.println(p1.toString());
        System.out.println(Pressure.psiToPa(2000));
        System.out.println(p1.getPressureInPa());

        Pressure p2 = new Pressure(2500000, "Pa", 1);
        System.out.println(p2.toString());
        System.out.println(Pressure.paToPsi(2500000));
        System.out.println(p2.getPressureInPsi());
    }
}
