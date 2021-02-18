package frc.robot;

import frc.robot.commands.JoystickDrive;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {

    public static DriveSubsystem driveSubsystem = new DriveSubsystem();
    public static XboxController driveController = new XboxController(0);

    public RobotContainer() {

        configureButtonBindings();

        driveSubsystem.setDefaultCommand(
            new JoystickDrive(driveSubsystem)
        );
    }

    private void configureButtonBindings() {

    }
}