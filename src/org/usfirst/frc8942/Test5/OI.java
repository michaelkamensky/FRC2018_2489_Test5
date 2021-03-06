// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc8942.Test5;

import org.usfirst.frc8942.Test5.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc8942.Test5.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick leftJoystick;
    public Joystick rightJoystick;
    public JoystickButton rightTrigger;
    public JoystickButton leftTrigger;    
    public JoystickButton rightButton12; 
    public JoystickButton rightButton11;
    public JoystickButton leftButton6;
    public JoystickButton rightButton5;
    public JoystickButton rightButton9;
    public JoystickButton rightButton10;
    public JoystickButton rightButton2;    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        rightJoystick = new Joystick(1);
        
        leftJoystick = new Joystick(0);
        
        rightTrigger = new JoystickButton(rightJoystick, 1);
        // button1.whenPressed(new DriveStraight(0.5, 1) );
        rightTrigger.whenPressed(new DriveInSquare() );
        
        leftTrigger = new JoystickButton(leftJoystick, 1);
        leftTrigger.whenPressed(new DriveWithJoysticks() );

        rightButton12 = new JoystickButton(rightJoystick, 12);
        // button1.whenPressed(new DriveStraight(0.5, 1) );
        rightButton12.whenPressed(new DriveZigZag(0.8, 0.9) );
        
        rightButton11 = new JoystickButton(leftJoystick, 11);
        rightButton11.whenPressed(new DriveTurnAngle2(-0.8, -90) );   
        
        rightButton5 = new JoystickButton(rightJoystick, 5);
        rightButton5.whenPressed(new DriveTurnAngle2(0.8, 90) );
        
        leftButton6 = new JoystickButton(leftJoystick, 6);
        leftButton6.whenPressed(new DriveTurnAngle2(-0.8, -90) );

        rightButton9 = new JoystickButton(rightJoystick, 9);
        rightButton9.whenPressed(new SolenoidControl(DoubleSolenoid.Value.kForward ) );
        
        rightButton10 = new JoystickButton(rightJoystick, 10);
        rightButton10.whenPressed(new SolenoidControl(DoubleSolenoid.Value.kReverse  ) ); 
        
        rightButton2 = new JoystickButton(rightJoystick, 2);
        rightButton2.whenPressed(new Punch() ); 
        
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveWithJoysticks", new DriveWithJoysticks());
        //SmartDashboard.putData("DriveStraight", new DriveStraight(0.5, 1.0));
        //SmartDashboard.putData("DriveTurn", new DriveTurn(0.5, 1.0));
        SmartDashboard.putData("DriveInSquare", new DriveInSquare());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

