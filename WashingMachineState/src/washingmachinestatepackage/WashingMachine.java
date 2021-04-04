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
public class WashingMachine implements WashingMachineState {

    private WashingMachineState washingMachineWash;
    private WashingMachineState washingMachineDry;
    private WashingMachineState washingMachineOff;
    private WashingMachineState washingMachineOn;
    private WashingMachineState state;
    
    public WashingMachine()
    {
        this.washingMachineOn = new WashingMachineOn(this);
        this.washingMachineDry = new WashingMachineDry(this);
        this.washingMachineWash = new WashingMachineWash(this);
        this.washingMachineOff = new WashingMachineOff(this);
        this.state = washingMachineOn;
    }
   
    
    public void setMachineState(WashingMachineState state)
    {
        this.state = state;
    }

    @Override
    public void on()
    {
        state.on();
    }
    
    @Override
    public void wash() {
        state.wash();
    }

    @Override
    public void dry() {
        state.dry();
    }

    @Override
    public void off() {
        state.off();
    }
    
    public WashingMachineState getMachineOn()
    {
        return washingMachineOn;
    }
    
    public void setMachineOn(WashingMachineState washingMachineOn)
    {
        this.washingMachineOn = washingMachineOn;
    }
    
    public WashingMachineState getMachineWash()
    {
        return washingMachineWash;
    }
    
    public void setMachineWash(WashingMachineState washingMachineWash)
    {
        this.washingMachineWash = washingMachineWash;
    }
    
    public WashingMachineState getMachineDry()
    {
        return washingMachineDry;
    }
    
    public void setMachineDry(WashingMachineState washingMachineDry)
    {
        this.washingMachineDry = washingMachineDry;
    }
    
    public WashingMachineState getMachineOff()
    {
        return washingMachineOff;
    }
    
    public void setMachineOff(WashingMachineState washingMachineOff)
    {
        this.washingMachineOff = washingMachineOff;
    }
    
    public WashingMachineState getState()
    {
        return state;
    }
    
    public void setState(WashingMachineState state)
    {
        this.state = state;
    }


}
