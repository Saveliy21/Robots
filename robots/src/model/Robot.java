package model;

public class Robot {

    private volatile double robotPositionX;//100
    private volatile double robotPositionY; //100
    private volatile double robotDirection; //0

    public Robot(double posX, double posY, double dir){
        this.robotPositionX = posX;
        this.robotPositionY = posY;
        this.robotDirection = dir;
    }

    public synchronized void setRobotPositionX(double robotPositionX){
            this.robotPositionX = robotPositionX;
    }

    public synchronized void setRobotPositionY(double robotPositionY){
        this.robotPositionY = robotPositionY;
    }

    public synchronized void setRobotDirection(double robotDirection){
        this.robotDirection = robotDirection;
    }

    public synchronized double getRobotPositionX(){
        return this.robotPositionX;
    }

    public synchronized double getRobotPositionY(){
        return this.robotPositionY;
    }

    public synchronized double getRobotDirection(){
        return this.robotDirection;
    }

}
