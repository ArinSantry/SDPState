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
public class WashingMachineWash implements WashingMachineState {

    private final WashingMachine washingMachine;
    
    public WashingMachineWash(WashingMachine washingMachine)
    {
        this.washingMachine = washingMachine;
    }
    
    @Override
    public void on()
    {
        System.out.println("Machine is already on");
    }
    
    @Override
    public void wash() {
        System.out.println("Washing...");
        washingMachine.setMachineState(washingMachine.getMachineWash());
    }

    @Override
    public void dry() {
        System.out.println("Cannot dry while washing");
    }

    @Override
    public void off() {
        washingMachine.setState(washingMachine.getMachineOff());
        System.out.println("Maching is turned off");
    }
    
}
