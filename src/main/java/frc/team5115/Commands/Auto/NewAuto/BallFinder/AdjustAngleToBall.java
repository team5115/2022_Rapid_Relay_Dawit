package frc.team5115.Commands.Auto.NewAuto.BallFinder;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.team5115.Subsystems.Limelight.*;
import frc.team5115.Subsystems.Drivetrain.*;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.team5115.Subsystems.*;
import static frc.team5115.Constants.*;
import frc.team5115.Robot.*;

public class AdjustAngleToBall extends CommandBase{

    Drivetrain drivetrain;
    public AdjustAngleToBall(Drivetrain drivetrain){
        addRequirements(drivetrain);
        this.drivetrain = drivetrain;
    }


    @Override
        public void execute() {
            drivetrain.adjustAngleToBall();
        }
    @Override
        public boolean isFinished() {
            return drivetrain.ballFullyDetected;
        }
}