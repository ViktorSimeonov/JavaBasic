package MachineSoftware;

import MachineSoftware.Machine;

public class MachineTest {
    public static void main(String[] args) {
        Machine first = new Machine(1234, 1981, 234567, "SBZ130");
        System.out.println(first.getInfo());
        first.setSerialNumber(359);
        System.out.println(first.getSerialNumber());
        System.out.println(first.getInfo());
    }
}
