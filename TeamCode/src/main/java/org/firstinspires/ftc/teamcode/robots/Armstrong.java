package org.firstinspires.ftc.teamcode.robots;

import org.firstinspires.ftc.teamcode.newhardware.FXTServo;
import org.firstinspires.ftc.teamcode.newhardware.Motor;


public class Armstrong extends Robot {

    private Motor lifter;
    private FXTServo marker;
    private Motor driveL;
    private Motor driveR;

    public Armstrong() {
        super();
        lifter = new Motor("lifter");
        marker = new FXTServo("marker");
        driveR = new Motor("driveR");
        driveL = new Motor("driveL");
    }

    //setting direction for lifter
    public void lifterUp(){
        lifter.setPower(-1);
    }
    public void lifterDown(){ lifter.setPower(1); }
    public void lifterStop(){
        lifter.setPower(0);
    }

    //setting position for marker servo
    public void wallUp() {marker.setPosition(0.20);}
    public void wallDown() {marker.setPosition(0.75);}
}
