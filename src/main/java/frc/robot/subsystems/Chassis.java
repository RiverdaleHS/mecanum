/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.JoystickDrive;
import jaci.pathfinder.*;
/**
 * Add your docs here.
 */
public class Chassis extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  TalonSRX leftFrontMotor = new TalonSRX(RobotMap.leftFrontMotor);
  TalonSRX leftRearMotor = new TalonSRX(RobotMap.leftRearMotor);
  TalonSRX rightFrontMotor = new TalonSRX(RobotMap.rightFrontMotor);
  TalonSRX rightReartMotor = new TalonSRX(RobotMap.rightRearMotor);

  
  public void setMotors(double leftFront, double leftRear, double rightFront, double rightRear){
    leftFrontMotor.set(ControlMode.PercentOutput, leftFront);
    leftRearMotor.set(ControlMode.PercentOutput, leftRear);
    rightFrontMotor.set(ControlMode.PercentOutput, rightFront);
    rightReartMotor.set(ControlMode.PercentOutput, rightRear);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new JoystickDrive());
  }

}
