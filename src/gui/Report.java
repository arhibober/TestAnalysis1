package gui;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author  Leo
 */
public class Report extends JPanel {

  private JScrollPane jScrollPane = null;
  private JEditorPane jEditorPane = null;
  private String fileName = "";

  /**
 * This method initializes jScrollPane	
 * @return  javax.swing.JScrollPane
 * @uml.property  name="jScrollPane"
 */
  private JScrollPane getJScrollPane() {
    if (jScrollPane == null) {
      jScrollPane = new JScrollPane();
      jScrollPane.setViewportView(getJEditorPane());
    }
    return jScrollPane;
  }

  /**
 * This method initializes jEditorPane	
 * @return  javax.swing.JEditorPane
 * @uml.property  name="jEditorPane"
 */
  private JEditorPane getJEditorPane() {
    if (jEditorPane == null) {
      jEditorPane = new JEditorPane();
      try {
        jEditorPane.setPage(new File(fileName).toURI().toURL());
      }
      catch (Exception e) {
        e.printStackTrace();
      }
      jEditorPane.setEditable(false);

    }
    return jEditorPane;
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
  public Report() {
    super();
    initialize();
  }
  
  public Report(String fileName) {
    super();
    this.fileName = fileName;
    initialize();
  }

  /**
   * This method initializes this
   * 
   * @return void
   */
  private void initialize() {
    this.setLayout(new BorderLayout());
    this.setSize(300, 200);
    this.add(getJScrollPane(), java.awt.BorderLayout.CENTER);
  }

}
