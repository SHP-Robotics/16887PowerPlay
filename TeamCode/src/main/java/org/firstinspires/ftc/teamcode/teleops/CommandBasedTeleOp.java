package org.firstinspires.ftc.teamcode.teleops;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.BaseRobot;
import org.firstinspires.ftc.teamcode.shplib.commands.RunCommand;
import org.firstinspires.ftc.teamcode.shplib.commands.Trigger;

//Hello There
@TeleOp
public class CommandBasedTeleOp extends BaseRobot {

    @Override
    public void init() {
        super.init();
        drive.setDefaultCommand(
                new RunCommand(
                        () -> drive.mecanum(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x)
                )
        );
//        scoop.setDefaultCommand(
//                new RunCommand(() -> {
//                    scoop.setState(ScoopSubsystem.State.BOTTOM);
//                })
//        );
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void loop() {
        // Allows CommandScheduler.run to be called - DO NOT DELETE!
        super.loop();


    }
}