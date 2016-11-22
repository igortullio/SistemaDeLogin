
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Pintar extends JPanel {
    
    private Color cor;
    private int ctPonto = 0;
    private Point points[] = new Point[10000];
    private JButton btLimpar;
    private boolean limpar = false;

    public Pintar() {
        btLimpar = new JButton("Limpar");
        btLimpar.setToolTipText("Limpar desenho");
        add(btLimpar);
        
        ButtonHandler handlerBt = new ButtonHandler();
        btLimpar.addActionListener(handlerBt);
        
        MouseHandlerAdapter handler = new MouseHandlerAdapter();
        addMouseMotionListener(handler);
        addMouseListener(handler);
        
    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btLimpar){
                ctPonto = 0;
                repaint();
            }
        }

        
    }

    private class MouseHandlerAdapter extends MouseAdapter {

       @Override
       public void mouseDragged(MouseEvent e){
            if (ctPonto < points.length) {
                points[ctPonto] = e.getPoint();
                ctPonto++;
                repaint();
            }      
       }
       
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < ctPonto; i++){
            g.setColor(Color.BLACK);
            g.fillOval(points[i].x, points[i].y, 6, 6);
        }
    }

}
