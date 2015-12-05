package com.j2.state.gumballstate;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter(true);
        gumballMachine.turnCrank();
        gumballMachine.releaseBall();

        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter(false);
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter(true);
        gumballMachine.turnCrank();
        gumballMachine.releaseBall();
        

        System.out.println(gumballMachine);
}
}