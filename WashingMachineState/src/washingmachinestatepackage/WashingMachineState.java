/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package washingmachinestatepackage;

/**
 *
 * @author erins
 */
public interface WashingMachineState {
    public void on();
    public void wash();
    public void dry();
    public void off();
}
