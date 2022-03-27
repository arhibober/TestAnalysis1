package gui;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JFrameHelp extends JFrame {

  private JPanel jContentPane = null;
  private JTextArea jTextArea = null;

  /**
   * This method initializes jTextArea	
   * 	
   * @return javax.swing.JTextArea	
   */
  private JTextArea getJTextArea() {
    if (jTextArea == null) {
      jTextArea = new JTextArea();
      jTextArea.setText("О программе\n"+
          "Программа разработана в 2011 году\n"+
          "на языке Java\n"+
          "Автор: Алексей Иванов");
    }
    return jTextArea;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  /**
   * This is the default constructor
   */
  public JFrameHelp() {
    super();
    initialize();
  }

  /**
   * This method initializes this
   * 
   * @return void
   */
  private void initialize() {
    this.setSize(300, 200);
    this.setContentPane(getJContentPane());
    this.setTitle("Справка");
  }

  /**
   * This method initializes jContentPane
   * 
   * @return javax.swing.JPanel
   */
  private JPanel getJContentPane() {
    if (jContentPane == null) {
      jContentPane = new JPanel();
      jContentPane.setLayout(new BorderLayout());
      jContentPane.add(getJTextArea(), java.awt.BorderLayout.CENTER);
    }
    return jContentPane;
  }

}
