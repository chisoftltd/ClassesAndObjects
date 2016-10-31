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
public class Pressure {

    double value;
    String unit;
    double time;
    double PSI_TO_PA = 6894.8;
    double PA_TO_PSI = 0.000145038;

    public Pressure(double value, String unit, double time) {

        this.value = value;
        this.unit = unit;
        this.time = time;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public double getTime() {
        return time;
    }

    public double getPressureInPsi() {
        if (getUnit().equals("psi")) {
            setValue(0.0);
        }
        return getValue();
    }

    public double getPressureInPa() {
        if (getUnit().equals("pa")) {
            setValue(0.0);
        }
        return getValue();
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setUnit(String unit) {
        if (unit.equals("Pa")) {
            this.unit = "Pa";
        } else {
            this.unit = "Psi";
        }
    }

    @Override
    public String toString() {
        return "Pressure{" + "value=" + value + ", unit=" + unit + ", time=" + time + '}';
    }

    public double psiToPa(double psiTpa) {
        return 0;
    }

    public double paToPsi(double psiTpa) {
        return 0;
    }
}
