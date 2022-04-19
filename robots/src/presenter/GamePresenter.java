package presenter;

import gui.GameVisualizer;
import model.GameState;
import model.Robot;
import model.RobotMovement;
import model.TargetData;

import java.awt.event.MouseEvent;
import java.util.TimerTask;

public class GamePresenter {

    public GamePresenter(GameVisualizer visualizer){
        visualizer.addMouseEventListener(this::setNewTarget);
        visualizer.addTaskOnUpdatePanel(new TimerTask() {
            @Override
            public void run() {
                updateModel();
            }
        });
    }
    private final GameState gameState = new GameState(100,100,0);
    private  TargetData targetData;

    public void updateModel(){
        gameState.updateGameState();
    }

    public void setNewTarget(MouseEvent event){
        targetData = new TargetData(event.getX(),event.getY());
        gameState.setRobotCommand(new RobotMovement(targetData));
    }

    public Robot getRobotInfo(){
        return gameState.getRobot();
    }
    public TargetData getTargetData(){
        return targetData;
    }
}
