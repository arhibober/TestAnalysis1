package diagram;

import java.awt.Graphics;
import java.awt.Color;
import gui.MyFunc;

import javax.swing.JPanel;

public class DiagramPanel extends JPanel
{
  private MyFunc func;

  MyFunc getFunc()
  {
    return func;
  }

  public void setFunc(MyFunc func) {
    this.func = func;
  }

  public DiagramPanel() {
    super();
    initialize();
  }

  private void initialize() {
    this.setSize(300, 200);
  }

  public void showGraph(Graphics g) {

    final int width = getWidth();
    final int height = getHeight();
 
    g.setColor(new Color (255, 255, 255));
    g.fillRect(0, 0, width, height);
    final int y0 = height - 20;
    final int yMax = 20;
    final int step = width / (func.getOften().length + 1);
    double yScale = (y0 - yMax) / func.max();
    g.setColor(new Color (0, 0, 0));
    g.drawLine(0, y0, width, y0);
    if (step <= 10)
      return;
    for (int i = 0; i < func.getOften().length; i++) {
      int x1 = (i + 1) * step - 10;
      int y1 = y0 - (int) (func.getOften()[i] * yScale);
      g.setColor(new Color (0, 0, 255));
      g.fillRect(x1, y1, 10, y0 - y1);
      g.setColor(new Color (0, 0, 0));
      int y = func.getOften()[i];
      if (y != 0)
        g.drawString(y + "", x1, y1 - 5);
      g.drawString(i + "", x1, y0 + 15);
    }
  }

  protected void paintComponent(Graphics g) {
    if (func == null)
      super.paintComponent(g);
    else {
      showGraph(g);
    }
  }

}

