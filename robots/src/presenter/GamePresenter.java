package presenter;

import gui.GameVisualizer;
import model.*;

import java.awt.event.MouseEvent;
import java.util.TimerTask;

public class GamePresenter {

    public GamePresenter(GameVisualizer visualizer){
        visualizer.addMouseEventListener(this::setNewTarget);
        visualizer.addTaskOnUpdatePanel(new TimerTask() {
            @Override
            public void run() {
                visualizer.repaint();
            }
        });
    }
    private final GameState gameState = new GameState();
    private MoleculeMovement movement = new MoleculeMovement(this);

    public int[][] getField(){ return gameState.array;}

    public void setNewTarget(MouseEvent event){
        movement.getMoleculeAction();
    }

}
