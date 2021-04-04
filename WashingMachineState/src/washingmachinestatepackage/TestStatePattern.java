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
public class TestStatePattern {
    
    public static void main(String[] args)
    {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.on();
        washingMachine.wash();
        washingMachine.dry();
        washingMachine.off();
        washingMachine.on();
        washingMachine.dry();
        washingMachine.off();
    }
    
}
