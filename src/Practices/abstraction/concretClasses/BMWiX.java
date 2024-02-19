package Practices.abstraction.concretClasses;

import Practices.abstraction.abstractClasses.Car;
import Practices.abstraction.interfaces.Chargeable;
import Practices.abstraction.interfaces.ElectricCharge;
import Practices.abstraction.interfaces.SelfDrive;

public class BMWiX
        extends Car
        implements Chargeable, SelfDrive, ElectricCharge {

    @Override
    protected void start() {

    }

    @Override
    protected void shift() {

    }

    @Override
    protected void brake() {

    }

    @Override
    protected void drive() {

    }

    @Override
    public void chargeTurbo() {

    }

    @Override
    public void electricCharge() {

    }

    @Override
    public void selfDrive() {

    }
}
