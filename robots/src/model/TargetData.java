package model;

public class TargetData {

    private final int targetPositionX;//= 150;
    private final int targetPositionY;// = 100;

    public TargetData(int targetPositionX, int targetPositionY){
        this.targetPositionX = targetPositionX;
        this.targetPositionY = targetPositionY;
    }

    public int getTargetPositionX(){
        return this.targetPositionX;
    }

    public int getTargetPositionY(){
        return this.targetPositionY;
    }

}
