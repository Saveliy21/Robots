package gui;

import model.GameState;
import model.MoleculeMovement;
import presenter.GamePresenter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;



public class GameVisualizer extends JPanel
{
    private final Timer m_timer = initTimer();
    private final GamePresenter presenter;

    private static Timer initTimer()
    {
        Timer timer = new Timer("events generator", true);
        return timer;
    }
    
    public GameVisualizer() 
    {

        presenter = new GamePresenter(this);
        m_timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                onRedrawEvent();
            }
        }, 0, 50);
        setDoubleBuffered(true);
    }

    public void addTaskOnUpdatePanel(TimerTask task){
        m_timer.schedule(task,0,10);
    }

    //анонимные классы в java и лямды, принцип работы графических фреймворков
    public void addMouseEventListener(Consumer<MouseEvent> listener){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                listener.accept(e);
                repaint();
            }
        });
    }
     protected void onRedrawEvent()
    {
        EventQueue.invokeLater(this::repaint);
    }
    @Override
    public void paint(Graphics g)
    {
        int[][] array = presenter.getField();
        super.paint(g);
        for(int i=0;i<400; i+=20){
            for(int j=0;j<400; j+=20){
                g.setColor(Color.BLACK);
                g.drawRect(i,j,20,20);
                //g.drawString(String.valueOf(array[i/20][j/20]),i+8,j+13);
                if (array[i/20][j/20] == 1){
                    g.setColor(Color.GREEN);
                    g.fillRect(i+3,j+3,15,15);
                }
                if (array[i/20][j/20] == 2){
                    g.setColor(Color.BLACK);
                    g.fillRect(i,j,20,20);
                }
                if (array[i/20][j/20] == 3){
                    g.setColor(Color.RED);
                    g.fillRect(i+3,j+3,15,15);
                }
            }
        }
    }
}


