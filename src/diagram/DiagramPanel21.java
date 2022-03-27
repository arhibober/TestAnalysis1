package diagram;

import gui.MyFunc2Tests;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author  Alex
 */
public class DiagramPanel21 extends JPanel {
  private MyFunc2Tests func;

  /**
 * @return  Returns the func.
 * @uml.property  name="func"
 */
MyFunc2Tests getFunc() {
    return func;
  }

  /**
 * @param func  The func to set.
 * @uml.property  name="func"
 */
public void setFunc(MyFunc2Tests func) {
    this.func = func;
  }

  public DiagramPanel21() {
    super();
    initialize();
  }

  protected void paintComponent(Graphics g) {
    if (func == null)
      super.paintComponent(g);
    else {
      showGraph(g);
    }
  }

  public void showGraph(Graphics g) {
    final int width = getWidth();
    final int height = getHeight();
    g.setColor(new Color(255, 255, 255));
    g.fillRect(0, 0, width, height);
    final int y0 = height;
    final int step = width / (func.getTicket1());
    double yScale = (y0) / func.getTicket2();
    for (int i = 0; i <= func.getQuestions() + 1; i++) {
      g.setColor(new Color (153, 153, 153));
      g.drawLine(i * step, 0, i * step, y0);
      g.setColor(new Color (0, 0, 0));
      if (i > 0 && i != 8)
        g.drawString(i + "", i * step+2, y0 - 2);
    }
    for (int i = 0; i <= func.getQuestions() + 1; i++) {
      g.setColor(new Color (153, 153, 153));
      g.drawLine(0, y0 - (int) (i * yScale) - 1, width, y0 - (int) (i * yScale)
        - 1);
      g.setColor(new Color (0, 0, 0));
      if (i != 8)
        g.drawString(i + "", 6, y0 - (int) (i * yScale) - 2);
    }
    for (int i = 0; i < func.getStudents(); i++) {
      g.setColor(new Color (255, 0, 0));
      int e = func.getArrStudents()[i].getMark1() * step - 1;
      int ue = y0 - (int) (func.getArrStudents()[i].getMark2() * yScale) - 1;
      g.fillOval(e - 3, ue - 3, 8, 8);
    }
  }

  private void initialize() {
    this.setSize(300, 200);
  }

}

