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
public class WashingMachineOff implements WashingMachineState {
    
    private final WashingMachine washingMachine;
    
    public WashingMachineOff(WashingMachine washingMachine)
    {
        this.washingMachine = washingMachine;
    }
    
    @Override
    public void on()
    {
        System.out.println("Machine is turned on");
        washingMachine.setMachineState(washingMachine.getMachineOn());
    }
    
    @Override
    public void wash() {
        System.out.println("Machine is off");
    }

    @Override
    public void dry() {
        System.out.println("Machine is off");
    }

    @Override
    public void off() {
        System.out.println("Machine is already off");
    }
    
}
