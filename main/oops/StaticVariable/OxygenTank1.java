package main.oops.StaticVariable;

class OxygenTank {
    static int totalOxygen = 10000;  // (in liters)
    int tankId;
    int currentOxygen;

    OxygenTank(int id) {
        this.tankId = id;
        this.currentOxygen = 1000;
        totalOxygen -= 1000;
    }

    void useOxygen(int amount) {
        if (amount <= currentOxygen) {
            currentOxygen -= amount;
            totalOxygen -= amount;
        }
    }

    static void emergencyRefill() {
        totalOxygen += 5000;
    }
}

class OxygenTank1 {
    public static void main(String[] args) {
        OxygenTank tank1 = new OxygenTank(1);
        OxygenTank tank2 = new OxygenTank(2);

        tank1.useOxygen(200);
        OxygenTank.emergencyRefill();
        tank2.useOxygen(300);

        System.out.println("Tank2: " + tank2.currentOxygen);
        System.out.println("Total: " + OxygenTank.totalOxygen);
    }
}
