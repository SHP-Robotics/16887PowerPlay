package org.firstinspires.ftc.teamcode.shplib.hardware.drive;
//hello
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.shplib.hardware.sensors.SHPIMU;

public class SHPMecanumDrive extends SHPFourWheelDrive {
    private SHPIMU imu;

    public SHPMecanumDrive(HardwareMap hardwareMap, String[] deviceNames) {
        super(hardwareMap, deviceNames);
    }

    public void mecanum(double drive, double strafe, double turn) {

        /*double angle = Math.atan2(drive, strafe) + imu.getYaw(); //angles.firstAngle
        drive = drive * Math.cos(angle) + strafe * Math.sin(angle);
        strafe = -drive * Math.sin(angle) + strafe * Math.cos(angle);*/

        //strafe = strafe*Math.cos(imu.getYaw())-drive*Math.sin(imu.getYaw());
        //drive = strafe*Math.sin(imu.getYaw()) + drive*Math.cos(imu.getYaw());

        double[] powers = {

                //left front
                drive + strafe + turn,
                //left back
                drive - strafe + turn,
                // right front
                drive - strafe - turn,
                //right back
                drive + strafe - turn,
        };

        setAll(powers);


                /*//left rear
                drive - strafe + turn,
                //left front
                drive + strafe + turn,
                // right front
                drive - strafe - turn,
                //right rear
                drive + strafe - turn, */

    }


    public void tankanum(double leftY, double rightY, double rightX) {
        double[] powers = {
                leftY - rightX,
                leftY + rightX,
                rightY + rightX,
                rightY - rightX
        };

        setAll(powers);
    }


}
