package MachineSoftware;


public class Machine {
    //полета
    private int serialNumber;
    private int yearOfProduction;
    private double workingHour;
    private String machineType;

    // това е контсруктора на обекта !!!!!
    // работата му е да даде стойност на плетата
    // казва се по същия начин като класа
    // вика се с new Machinte

    Machine(int serialNumber, int yearOfProduction, double workingHour, String machineType) {
        this.serialNumber = serialNumber;
        this.yearOfProduction = yearOfProduction;
        this.workingHour = workingHour;
        this.machineType = machineType;
    }
    Machine( double workingHour, String machineType) {

        this.workingHour = workingHour;
        this.machineType = machineType;
    }

    void setSerialNumber(int serialNumber) {

        this.serialNumber = serialNumber;
    }
    int getSerialNumber(){
        return this.serialNumber;
    }

    String getInfo() {
        return ("The machine: " + this.machineType + "% with serialNumber: " + this.serialNumber + " Year of Production: " + this.yearOfProduction + " is " + this.workingHour + " working hour");

    }

}
