package gui;

import diagram.DiagramPanel;
import diagram.DiagramPanel1;
import diagram.DiagramPanel21;
import gui.MyTableModel;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JMainFrame extends JFrame {

  private JPanel jContentPane = null;
  private JMenuBar jMainMenu = null;
  private JMenu jMenuFile = null;
  private JMenuItem jMenuItemExit = null;
  private JTabbedPane jTabbedPane = null;
  private JPanel jPanelOne = null;
  private JPanel jPanelTwo = null;
  private JMenuItem jMenuInput = null;
  private JMenuItem jMenuSave = null;
  private JMenu jMenuHelp = null;
  private JMenuItem jMenuProgram = null;
  private JMenuItem jMenuInput2 = null;
  private JButton jButtonInput = null;
  private JButton jButtonSave = null;
  private JButton jButtonInput21 = null;
  private JButton jButtonInput22 = null;
  private JButton jButtonSave1 = null;
  private JPanel jPanelTwoLeft = null;
  private JSplitPane jSplitPane = null;
  private JScrollPane jScrollPane = null;
  private JTabbedPane jTabbedPaneGraphs = null;
  private JPanel jPanelOneLeft = null;
  private JScrollPane jScrollPane1 = null;
  private JTable jTable1 = null;
  private JSplitPane jSplitPane1 = null;
  private JTabbedPane jTabbedPane2 = null;
  private JEditorPane jTabbedPaneReliability = null;
  private JEditorPane jTabbedPanePresentation = null;
  private JEditorPane jTabbedPaneFrequency = null;
  private JTabbedPane jTabbedPaneTables = null;
  private JScrollPane jScrollPaneFirst = null;
  private JTable jTableFirst = null;
  private JScrollPane jScrollPaneSecond = null;
  private JTable jTableSecond = null;
  private JLabel jLabelStudents = null;
  private JTextArea jTextAreaStudents = null;
  private JLabel jLabelQuiestions = null;
  private JTextArea jTextAreaQuestions = null;
  private JLabel jLabelStudents1 = null;
  private JTextArea jTextAreaStudents1 = null;
  private JLabel jLabelQuestions1 = null;
  private JTextArea jTextAreaQuestions1 = null;
  private JButton jButtonCount = null;
  private JButton jButtonCount1 = null;
  private JFileChooser jFileChooser    = null;
  private MyFunc myFunc = null;
  private MyFunc2Tests myFunc1 = null;
  boolean isTwo = false;
  private DiagramPanel diagramPanel = null;
  private DiagramPanel1 diagramPanel1 = null;
  private DiagramPanel21 diagramPanel21 = null;
  private MyTableModel myTableModel = null;
  private JButton jButtonApply = null;
  private JButton jButtonApply1 = null;
  boolean isFileOpen = false;
  boolean isFile21Open = false;
  boolean isFile22Open = false;
  private JButton jButtonSaveText = null;
  private JButton jButtonSaveText21 = null;
  private JButton jButtonSaveText22 = null;
  private JMenuItem jMenuItemSaveText = null;
  private JLabel jLabelProbability = null;
  private JLabel jLabelProbability1 = null;
  private Report report;
  private JTabbedPane jTabbedPanePresentation1 = null;
  private JEditorPane jTabbedPaneG = null;
  private JMenuItem jMenuProgram1 = null;
  private JButton jButtonFree1 = null;
  private JButton jButtonFree = null;
  private JMenuItem jMenuItemClear = null;
  /**
 * @param diagramPanel  The diagramPanel to set.
 * @uml.property  name="diagramPanel"
 */
 public void setDiagramPanel(DiagramPanel diagramPanel)
 {
    this.diagramPanel = diagramPanel;
  }

  /**
 * @param diagramPanel1  The diagramPanel1 to set.
 * @uml.property  name="diagramPanel1"
 */
  public void setDiagramPanel1(DiagramPanel1 diagramPanel1)
  {
    this.diagramPanel1 = diagramPanel1;
  }

  /**
 * @param diagramPanel21  The diagramPanel21 to set.
 * @uml.property  name="diagramPanel21"
 */
  public void setDiagramPanel21(DiagramPanel21 diagramPanel21)
  {
    this.diagramPanel21 = diagramPanel21;
    diagramPanel21.setToolTipText("");
  }
  
  /**
 * @return  Returns the jLabelProbability.
 * @uml.property  name="jLabelProbability"
 */
public JLabel getJLabelProbability() {
    return jLabelProbability;
  }

  /**
 * @return  Returns the jLabelProbability1.
 * @uml.property  name="jLabelProbability1"
 */
  public JLabel getJLabelProbability1()
  {
    return jLabelProbability1;
  }

    /**
	 * @param isFileOpen  The isFileOpen to set.
	 * @uml.property  name="isFileOpen"
	 */
  public void setFileOpen(boolean isFileOpen)
  {
    this.isFileOpen = isFileOpen;
  }

  /**
 * @param isTwo  The isTwo to set.
 * @uml.property  name="isTwo"
 */
  public void setTwo(boolean isTwo)
  {
    this.isTwo = isTwo;
  }

  /**
 * @param jButtonApply  The jButtonApply to set.
 * @uml.property  name="jButtonApply"
 */
  public void setJButtonApply(JButton buttonApply)
  {
    jButtonApply = buttonApply;
  }

  /**
 * @param jButtonApply1  The jButtonApply1 to set.
 * @uml.property  name="jButtonApply1"
 */
  public void setJButtonApply1(JButton buttonApply1)
  {
    jButtonApply1 = buttonApply1;
  }

  /**
 * @param jButtonCount  The jButtonCount to set.
 * @uml.property  name="jButtonCount"
 */
  public void setJButtonCount(JButton buttonCount)
  {
    jButtonCount = buttonCount;
  }

  /**
 * @param jButtonCount1  The jButtonCount1 to set.
 * @uml.property  name="jButtonCount1"
 */
  public void setJButtonCount1(JButton buttonCount1)
  {
    jButtonCount1 = buttonCount1;
  }

  /**
 * @param jButtonInput  The jButtonInput to set.
 * @uml.property  name="jButtonInput"
 */
  public void setJButtonInput(JButton buttonInput)
  {
    jButtonInput = buttonInput;
  }

  /**
 * @param jButtonInput21  The jButtonInput21 to set.
 * @uml.property  name="jButtonInput21"
 */
  public void setJButtonInput21(JButton buttonInput21)
  {
    jButtonInput21 = buttonInput21;
  }

  /**
 * @param jButtonInput22  The jButtonInput22 to set.
 * @uml.property  name="jButtonInput22"
 */
  public void setJButtonInput22(JButton buttonInput22)
  {
    jButtonInput22 = buttonInput22;
  }

  /**
 * @param jButtonSave  The jButtonSave to set.
 * @uml.property  name="jButtonSave"
 */
  public void setJButtonSave(JButton buttonSave)
  {
    jButtonSave = buttonSave;
  }

  /**
 * @param jButtonSave1  The jButtonSave1 to set.
 * @uml.property  name="jButtonSave1"
 */
  public void setJButtonSave1(JButton buttonSave1)
  {
    jButtonSave1 = buttonSave1;
  }

  /**
 * @param jButtonSaveText  The jButtonSaveText to set.
 * @uml.property  name="jButtonSaveText"
 */
  public void setJButtonSaveText(JButton buttonSaveText)
  {
    jButtonSaveText = buttonSaveText;
  }

  /**
 * @param jButtonSaveText21  The jButtonSaveText21 to set.
 * @uml.property  name="jButtonSaveText21"
 */
  public void setJButtonSaveText21(JButton buttonSaveText21) {
    jButtonSaveText21 = buttonSaveText21;
  }

  /**
 * @param jButtonSaveText22  The jButtonSaveText22 to set.
 * @uml.property  name="jButtonSaveText22"
 */
public void setJButtonSaveText22(JButton buttonSaveText22) {
    jButtonSaveText22 = buttonSaveText22;
  }

  /**
 * @param jContentPane  The jContentPane to set.
 * @uml.property  name="jContentPane"
 */
public void setJContentPane(JPanel contentPane) {
    jContentPane = contentPane;
  }

  /**
 * @param jFileChooser  The jFileChooser to set.
 * @uml.property  name="jFileChooser"
 */
public void setJFileChooser(JFileChooser fileChooser) {
    jFileChooser = fileChooser;
  }

  /**
 * @param jLabelQuestions1  The jLabelQuestions1 to set.
 * @uml.property  name="jLabelQuestions1"
 */
public void setJLabelQuestions1(JLabel labelQuestions1) {
    jLabelQuestions1 = labelQuestions1;
  }

  /**
 * @param jLabelQuiestions  The jLabelQuiestions to set.
 * @uml.property  name="jLabelQuiestions"
 */
public void setJLabelQuiestions(JLabel labelQuiestions) {
    jLabelQuiestions = labelQuiestions;
  }

  /**
 * @param jLabelStudents  The jLabelStudents to set.
 * @uml.property  name="jLabelStudents"
 */
public void setJLabelStudents(JLabel labelStudents) {
    jLabelStudents = labelStudents;
  }

  /**
 * @param jLabelStudents1  The jLabelStudents1 to set.
 * @uml.property  name="jLabelStudents1"
 */
public void setJLabelStudents1(JLabel labelStudents1) {
    jLabelStudents1 = labelStudents1;
  }

  /**
 * @param jMainMenu  The jMainMenu to set.
 * @uml.property  name="jMainMenu"
 */
public void setJMainMenu(JMenuBar mainMenu) {
    jMainMenu = mainMenu;
  }

  /**
 * @param jMenuFile  The jMenuFile to set.
 * @uml.property  name="jMenuFile"
 */
public void setJMenuFile(JMenu menuFile) {
    jMenuFile = menuFile;
  }

  /**
 * @param jMenuHelp  The jMenuHelp to set.
 * @uml.property  name="jMenuHelp"
 */
public void setJMenuHelp(JMenu menuHelp) {
    jMenuHelp = menuHelp;
  }

  /**
 * @param jMenuInput  The jMenuInput to set.
 * @uml.property  name="jMenuInput"
 */
public void setJMenuInput(JMenuItem menuInput) {
    jMenuInput = menuInput;
  }

  /**
 * @param jMenuInput2  The jMenuInput2 to set.
 * @uml.property  name="jMenuInput2"
 */
public void setJMenuInput2(JMenuItem menuInput2) {
    jMenuInput2 = menuInput2;
  }

  /**
 * @param jMenuItemExit  The jMenuItemExit to set.
 * @uml.property  name="jMenuItemExit"
 */
public void setJMenuItemExit(JMenuItem menuItemExit) {
    jMenuItemExit = menuItemExit;
  }

  /**
 * @param jMenuItemSaveText  The jMenuItemSaveText to set.
 * @uml.property  name="jMenuItemSaveText"
 */
public void setJMenuItemSaveText(JMenuItem menuItemSaveText) {
    jMenuItemSaveText = menuItemSaveText;
  }

  /**
 * @param jMenuProgram  The jMenuProgram to set.
 * @uml.property  name="jMenuProgram"
 */
public void setJMenuProgram(JMenuItem menuProgram) {
    jMenuProgram = menuProgram;
  }

  /**
 * @param jMenuSave  The jMenuSave to set.
 * @uml.property  name="jMenuSave"
 */
public void setJMenuSave(JMenuItem menuSave) {
    jMenuSave = menuSave;
  }

  /**
 * @param jPanelOne  The jPanelOne to set.
 * @uml.property  name="jPanelOne"
 */
public void setJPanelOne(JPanel panelOne) {
    jPanelOne = panelOne;
  }

  /**
 * @param jPanelOneLeft  The jPanelOneLeft to set.
 * @uml.property  name="jPanelOneLeft"
 */
public void setJPanelOneLeft(JPanel panelOneLeft) {
    jPanelOneLeft = panelOneLeft;
  }

  /**
 * @param jPanelTwo  The jPanelTwo to set.
 * @uml.property  name="jPanelTwo"
 */
public void setJPanelTwo(JPanel panelTwo) {
    jPanelTwo = panelTwo;
  }

  /**
 * @param jPanelTwoLeft  The jPanelTwoLeft to set.
 * @uml.property  name="jPanelTwoLeft"
 */
public void setJPanelTwoLeft(JPanel panelTwoLeft) {
    jPanelTwoLeft = panelTwoLeft;
  }

  /**
 * @param jScrollPane  The jScrollPane to set.
 * @uml.property  name="jScrollPane"
 */
public void setJScrollPane(JScrollPane scrollPane) {
    jScrollPane = scrollPane;
  }

  /**
 * @param jScrollPane1  The jScrollPane1 to set.
 * @uml.property  name="jScrollPane1"
 */
public void setJScrollPane1(JScrollPane scrollPane1) {
    jScrollPane1 = scrollPane1;
  }

  /**
 * @param jScrollPaneFirst  The jScrollPaneFirst to set.
 * @uml.property  name="jScrollPaneFirst"
 */
public void setJScrollPaneFirst(JScrollPane scrollPaneFirst) {
    jScrollPaneFirst = scrollPaneFirst;
  }

  /**
 * @param jScrollPaneSecond  The jScrollPaneSecond to set.
 * @uml.property  name="jScrollPaneSecond"
 */
public void setJScrollPaneSecond(JScrollPane scrollPaneSecond) {
    jScrollPaneSecond = scrollPaneSecond;
  }

  /**
 * @param jSplitPane  The jSplitPane to set.
 * @uml.property  name="jSplitPane"
 */
public void setJSplitPane(JSplitPane splitPane) {
    jSplitPane = splitPane;
  }

  /**
 * @param jSplitPane1  The jSplitPane1 to set.
 * @uml.property  name="jSplitPane1"
 */
public void setJSplitPane1(JSplitPane splitPane1) {
    jSplitPane1 = splitPane1;
  }

  /**
 * @param jTabbedPane  The jTabbedPane to set.
 * @uml.property  name="jTabbedPane"
 */
public void setJTabbedPane(JTabbedPane tabbedPane) {
    jTabbedPane = tabbedPane;
    jTabbedPane.setToolTipText("Графическая интерпретация надёжности теста");
  }

  /**
 * @param jTabbedPane2  The jTabbedPane2 to set.
 * @uml.property  name="jTabbedPane2"
 */
public void setJTabbedPane2(JTabbedPane tabbedPane2) {
    jTabbedPane2 = tabbedPane2;
  }

  /**
 * @param jTabbedPaneFrequency  The jTabbedPaneFrequency to set.
 * @uml.property  name="jTabbedPaneFrequency"
 */
public void setJTabbedPaneFrequency(JEditorPane tabbedPaneFrequency) {
    jTabbedPaneFrequency = tabbedPaneFrequency;
  }

  /**
 * @param jTabbedPaneGraphs  The jTabbedPaneGraphs to set.
 * @uml.property  name="jTabbedPaneGraphs"
 */
public void setJTabbedPaneGraphs(JTabbedPane tabbedPaneGraphs) {
    jTabbedPaneGraphs = tabbedPaneGraphs;
  }

  /**
 * @param jTabbedPanePresentation  The jTabbedPanePresentation to set.
 * @uml.property  name="jTabbedPanePresentation"
 */
public void setJTabbedPanePresentation(JEditorPane tabbedPanePresentation) {
    jTabbedPanePresentation = tabbedPanePresentation;
  }

  /**
 * @param jTabbedPaneReliability  The jTabbedPaneReliability to set.
 * @uml.property  name="jTabbedPaneReliability"
 */
public void setJTabbedPaneReliability(JEditorPane tabbedPaneReliability) {
    jTabbedPaneReliability = tabbedPaneReliability;
  }

  /**
 * @param jTabbedPaneTables  The jTabbedPaneTables to set.
 * @uml.property  name="jTabbedPaneTables"
 */
public void setJTabbedPaneTables(JTabbedPane tabbedPaneTables) {
    jTabbedPaneTables = tabbedPaneTables;
  }

  /**
 * @param jTable1  The jTable1 to set.
 * @uml.property  name="jTable1"
 */
public void setJTable1(JTable table1) {
    jTable1 = table1;
  }

  /**
 * @param jTableFirst  The jTableFirst to set.
 * @uml.property  name="jTableFirst"
 */
public void setJTableFirst(JTable tableFirst) {
    jTableFirst = tableFirst;
  }

  /**
 * @param jTableSecond  The jTableSecond to set.
 * @uml.property  name="jTableSecond"
 */
public void setJTableSecond(JTable tableSecond) {
    jTableSecond = tableSecond;
  }

  /**
 * @param jTextAreaQuestions  The jTextAreaQuestions to set.
 * @uml.property  name="jTextAreaQuestions"
 */
public void setJTextAreaQuestions(JTextArea textAreaQuestions) {
    jTextAreaQuestions = textAreaQuestions;
  }

  /**
 * @param jTextAreaQuestions1  The jTextAreaQuestions1 to set.
 * @uml.property  name="jTextAreaQuestions1"
 */
public void setJTextAreaQuestions1(JTextArea textAreaQuestions1) {
    jTextAreaQuestions1 = textAreaQuestions1;
  }

  /**
 * @param jTextAreaStudents  The jTextAreaStudents to set.
 * @uml.property  name="jTextAreaStudents"
 */
public void setJTextAreaStudents(JTextArea textAreaStudents) {
    jTextAreaStudents = textAreaStudents;
  }

  /**
 * @param jTextAreaStudents1  The jTextAreaStudents1 to set.
 * @uml.property  name="jTextAreaStudents1"
 */
public void setJTextAreaStudents1(JTextArea textAreaStudents1) {
    jTextAreaStudents1 = textAreaStudents1;
  }

  /**
 * @param myFunc  The myFunc to set.
 * @uml.property  name="myFunc"
 */
public void setMyFunc(MyFunc myFunc) {
    this.myFunc = myFunc;
  }

  /**
 * @param myFunc1  The myFunc1 to set.
 * @uml.property  name="myFunc1"
 */
public void setMyFunc1(MyFunc2Tests myFunc1) {
    this.myFunc1 = myFunc1;
  }

  /**
 * @param myTableModel  The myTableModel to set.
 * @uml.property  name="myTableModel"
 */
public void setMyTableModel(MyTableModel myTableModel) {
    this.myTableModel = myTableModel;
  }

  /**
 * @param report  The report to set.
 * @uml.property  name="report"
 */
public void setReport(Report report) {
    this.report = report;
  }
  
  /**
 * @return
 * @uml.property  name="isFile21Open"
 */
public boolean isFile21Open() {
    return isFile21Open;
  }

  /**
 * @param isFile21Open  The isFile21Open to set.
 * @uml.property  name="isFile21Open"
 */
public void setFile21Open(boolean isFile21Open) {
    this.isFile21Open = isFile21Open;
  }

  /**
 * @return
 * @uml.property  name="isFile22Open"
 */
public boolean isFile22Open() {
    return isFile22Open;
  }

  /**
 * @param isFile22Open  The isFile22Open to set.
 * @uml.property  name="isFile22Open"
 */
public void setFile22Open(boolean isFile22Open) {
    this.isFile22Open = isFile22Open;
  }

  /**
 * @return  Returns the diagramPanel21.
 * @uml.property  name="diagramPanel21"
 */
public DiagramPanel21 getDiagramPanel21() {
    if (diagramPanel21 == null) {
      diagramPanel21 = new DiagramPanel21();
    }
    return diagramPanel21;
  }

  /**
 * @return
 * @uml.property  name="isFileOpen"
 */
public boolean isFileOpen() {
    return isFileOpen;
  }

  /**
 * @return
 * @uml.property  name="isTwo"
 */
public boolean isTwo() {
    return isTwo;
  }

  /**
 * @return  Returns the jLabelQuiestions.
 * @uml.property  name="jLabelQuiestions"
 */
public JLabel getJLabelQuiestions() {
    return jLabelQuiestions;
  }

  /**
 * @return  Returns the jLabelQuestions1.
 * @uml.property  name="jLabelQuestions1"
 */
public JLabel getJLabelQuestions1() {
    return jLabelQuestions1;
  }

  /**
 * @return  Returns the jLabelStudents.
 * @uml.property  name="jLabelStudents"
 */
public JLabel getJLabelStudents() {
    return jLabelStudents;
  }

  /**
 * @return  Returns the jLabelStudents1.
 * @uml.property  name="jLabelStudents1"
 */
public JLabel getJLabelStudents1() {
    return jLabelStudents1;
  }

  /**
 * This method initializes jMainMenu	
 * @return  javax.swing.JMenuBar
 * @uml.property  name="jMainMenu"
 */
  private JMenuBar getJMainMenu() {
    if (jMainMenu == null) {
      jMainMenu = new JMenuBar();
      jMainMenu.add(getJMenuFile());
      jMainMenu.add(getJMenuHelp());
    }
    return jMainMenu;
  }

  /**
 * This method initializes jMenuFile	
 * @return  javax.swing.JMenu
 * @uml.property  name="jMenuFile"
 */
  private JMenu getJMenuFile() {
    if (jMenuFile == null) {
      jMenuFile = new JMenu();
      jMenuFile.setText("Файл");
      jMenuFile.setPreferredSize(new java.awt.Dimension(45,40));
      jMenuFile.add(getJMenuInput());
      jMenuFile.add(getJMenuInput2());
      jMenuFile.add(getJMenuSave());
      jMenuFile.add(getJMenuItemSaveText());
      jMenuFile.add(getJMenuItemClear());
      jMenuFile.add(getJMenuItemExit());
    }
    return jMenuFile;
  }

  /**
 * This method initializes jMenuItemExit	
 * @return  javax.swing.JMenuItem
 * @uml.property  name="jMenuItemExit"
 */
  private JMenuItem getJMenuItemExit() {
    if (jMenuItemExit == null) {
      jMenuItemExit = new JMenuItem();
      jMenuItemExit.setToolTipText("Выход");
      jMenuItemExit.setText("Выход");
      jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          dispose(); // TODO Auto-generated Event stub actionPerformed()
        }
      });
    }
    return jMenuItemExit;
  }

  /**
 * This method initializes jTabbedPane	
 * @return  javax.swing.JTabbedPane
 * @uml.property  name="jTabbedPane"
 */
  private JTabbedPane getJTabbedPane() {
    if (jTabbedPane == null) {
      jTabbedPane = new JTabbedPane();
      jTabbedPane.addTab("Обработка одного теста", null, getJPanelOne(), null);
      jTabbedPane.addTab("Сравнение двух тестов", null, getJPanelTwo(), "");
      jTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
        public void stateChanged(javax.swing.event.ChangeEvent e) {
          isTwo = !isTwo;
          getJMenuInput2().setVisible(isTwo);
          if (isTwo)
            getJMenuInput().setText("Загрузить файл с данными о первом тесте");
          else
            getJMenuInput().setText("Загрузить файл с тестовыми данными");
        }
      });
    }
    return jTabbedPane;
  }
  
  /**
 * @return  Returns the myFunc.
 * @uml.property  name="myFunc"
 */
  private MyFunc getMyFunc()
  {
    if (myFunc == null) {
      myFunc = new MyFunc();
    }
    return myFunc;
  }

  /**
 * This method initializes jPanelOne	
 * @return  javax.swing.JPanel
 * @uml.property  name="jPanelOne"
 */
  private JPanel getJPanelOne() {
    if (jPanelOne == null) {
      jPanelOne = new JPanel();
      jPanelOne.setLayout(new BorderLayout());
      jPanelOne.add(getJPanelOneLeft(), java.awt.BorderLayout.WEST);
      jPanelOne.add(getJSplitPane1(), java.awt.BorderLayout.CENTER);
    }
    return jPanelOne;
  }

  /**
 * This method initializes jPanelTwo	
 * @return  javax.swing.JPanel
 * @uml.property  name="jPanelTwo"
 */
  private JPanel getJPanelTwo()
  {
    if (jPanelTwo == null) {
      jPanelTwo = new JPanel();
      jPanelTwo.setLayout(new BorderLayout());
      jPanelTwo.setPreferredSize(new java.awt.Dimension(1,300));
      jPanelTwo.add(getJPanelTwoLeft(), java.awt.BorderLayout.WEST);
      jPanelTwo.add(getJSplitPane(), java.awt.BorderLayout.CENTER);
    }
    return jPanelTwo;
  }

  /**
 * This method initializes jMenuOpen	
 * @return  javax.swing.JMenuItem
 * @uml.property  name="jMenuInput"
 */
  private JMenuItem getJMenuInput()
  {
    if (jMenuInput == null) {
      jMenuInput = new JMenuItem();
      jMenuInput.setText("Загрузить файл с тестовыми данными");
      jMenuInput.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          if (isTwo)
            open21();
          else
            open(); // TODO Auto-generated Event stub actionPerformed()
        }
      });
    }
    return jMenuInput;
  }

  /**
 * This method initializes jMenuSave	
 * @return  javax.swing.JMenuItem
 * @uml.property  name="jMenuSave"
 */
  private JMenuItem getJMenuSave() {
    if (jMenuSave == null) {
      jMenuSave = new JMenuItem();
      jMenuSave.setText("Сохранить отчёт в формате HTML");
      jMenuSave.setActionCommand("Сохранить отчёт");
      jMenuSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          save(); // TODO Auto-generated Event stub actionPerformed()
        }
      });
    }
    return jMenuSave;
  }

  /**
 * This method initializes jMenuHelp	
 * @return  javax.swing.JMenu
 * @uml.property  name="jMenuHelp"
 */
  private JMenu getJMenuHelp() {
    if (jMenuHelp == null) {
      jMenuHelp = new JMenu();
      jMenuHelp.setText("Помощь");
      jMenuHelp.add(getJMenuProgram());
      jMenuHelp.add(getJMenuProgram1());
    }
    return jMenuHelp;
  }

  /**
 * This method initializes jMenuProgram	
 * @return  javax.swing.JMenuItem
 * @uml.property  name="jMenuProgram"
 */
  private JMenuItem getJMenuProgram() {
    if (jMenuProgram == null) {
      jMenuProgram = new JMenuItem();
      jMenuProgram.setText("О программе");
      
      jMenuProgram.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          new JFrameHelp().setVisible(true);
        }
      });
      
    }
    return jMenuProgram;
  }

  /**
 * This method initializes jMenuOpen2	
 * @return  javax.swing.JMenuItem
 * @uml.property  name="jMenuInput2"
 */
  private JMenuItem getJMenuInput2() {
    if (jMenuInput2 == null) {
      jMenuInput2 = new JMenuItem();
      jMenuInput2.setText("Загрузить файл с данными о втором тесте");
      jMenuInput2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          open22(); // TODO Auto-generated Event stub actionPerformed()
        }
      });
    }
    return jMenuInput2;
  }

  /**
 * This method initializes jButtonInput	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonInput"
 */
  private JButton getJButtonInput() {
    if (jButtonInput == null) {
      jButtonInput = new JButton();
      jButtonInput.setText("Загрузить файл с данными");
      jButtonInput.setBounds(new java.awt.Rectangle(10,10,300,20));
      jButtonInput.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          open();
          
        }
      });
    }
    return jButtonInput;
  }
  
  private void open() {
    getJFileChooser().setFileFilter(new FileNameExtensionFilter("txt", "txt"));
    if (JFileChooser.APPROVE_OPTION == getJFileChooser().showOpenDialog(this)) {
      try {
        getMyFunc().setFileName(getJFileChooser().getSelectedFile().getPath());
        getMyFunc().readFromFile(getJFileChooser().getSelectedFile().getPath());
        getMyFunc().setFileIsOpen(true);
        getJTextAreaStudents().setText(getMyFunc().getStudents() + "");
        getJTextAreaQuestions().setText(getMyFunc().getQuestions() + "");
        isFileOpen = true;
        getJTable1().setModel(new MyTableModel(Integer.parseInt(getJTextAreaStudents().getText()),
            Integer.parseInt(getJTextAreaQuestions().getText()) + 1));
        if (isFileOpen)
          for (int i = 0; i < Integer.parseInt(getJTextAreaStudents().getText()); i++)
            for (int j = 0; j < Integer.parseInt(getJTextAreaQuestions().getText()); j++)
              if (getMyFunc().getElement(i, j) == 1)
                getJTable1().setValueAt(Boolean.TRUE, i, j+1);
        getJTable1().revalidate();
        getJTable1().repaint();
        getJButtonCount().setEnabled(true);
      }
      catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка чтения из файла!");
      }

    }
  }
  
  private void open21() {
    getJFileChooser().setFileFilter(new FileNameExtensionFilter("txt", "txt"));
    if (JFileChooser.APPROVE_OPTION == getJFileChooser().showOpenDialog(this)) {
      try {
        getMyFunc1().setFileName1(getJFileChooser().getSelectedFile().getPath());
        getMyFunc1().readFromFile1(getJFileChooser().getSelectedFile().getPath());
        getMyFunc1().setFile1IsOpen(true);
        getJTextAreaStudents1().setText(getMyFunc1().getStudents() + "");
        getJTextAreaQuestions1().setText(getMyFunc1().getQuestions() + "");
        isFile21Open = true;
        getJTableFirst().setModel(new MyTableModel(Integer.parseInt(getJTextAreaStudents1().getText()),
            Integer.parseInt(getJTextAreaQuestions1().getText())+1));
        if (isFile21Open)
          for (int i = 0; i < Integer.parseInt(getJTextAreaStudents1().getText()); i++)
            for (int j = 0; j < Integer.parseInt(getJTextAreaQuestions1().getText()); j++)
              if (getMyFunc1().getElement1(i, j) == 1)
                getJTableFirst().setValueAt(Boolean.TRUE, i, j+1);
        getJTableFirst().revalidate();
        getJTableFirst().repaint();
        if (isFile22Open)
          getJButtonCount1().setEnabled(true);
      }
      catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка чтения из файла!");
      }

    }
  }

  /**
 * This method initializes jButtonSave	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonSave"
 */
  private JButton getJButtonSave() {
    if (jButtonSave == null) {
      jButtonSave = new JButton();
      jButtonSave.setText("Сохранить отчёт в формате HTML");
      jButtonSave.setBounds(new java.awt.Rectangle(10,70,300,20));
      jButtonSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          save();
        }
      });
    }
    return jButtonSave;
  }

  /**
 * This method initializes jButtonInput21	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonInput21"
 */
  private JButton getJButtonInput21() {
    if (jButtonInput21 == null) {
      jButtonInput21 = new JButton();
      jButtonInput21.setText("Загрузить файл с данными о первом тесте");
      jButtonInput21.setBounds(new java.awt.Rectangle(10,10,390,20));
      jButtonInput21.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          open21();
        }
      });
    }
    return jButtonInput21;
  }

  /**
 * This method initializes jButtonInput22	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonInput22"
 */
  private JButton getJButtonInput22() {
    if (jButtonInput22 == null) {
      jButtonInput22 = new JButton();
      jButtonInput22.setText("Загрузить файл с данными о втором тесте");
      jButtonInput22.setBounds(new java.awt.Rectangle(10,40,390,20));
      jButtonInput22.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        open22();
      }
      });
    }
    return jButtonInput22;
  }

  /**
 * This method initializes jButtonSave1	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonSave1"
 */
  private JButton getJButtonSave1() {
    if (jButtonSave1 == null) {
      jButtonSave1 = new JButton();
      jButtonSave1.setText("Сохранить отчёт в формате HTML");
      jButtonSave1.setBounds(new java.awt.Rectangle(10,100,390,20));
      jButtonSave1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          saveComp();
        }
        });
    }
    return jButtonSave1;
  }

  /**
 * This method initializes jPanelTwoLeft	
 * @return  javax.swing.JPanel
 * @uml.property  name="jPanelTwoLeft"
 */
  private JPanel getJPanelTwoLeft() {
    if (jPanelTwoLeft == null) {
      jLabelQuestions1 = new JLabel();
      jLabelQuestions1.setBounds(new java.awt.Rectangle(10,160,120,20));
      jLabelQuestions1.setText("Число вопросов:");
      jLabelStudents1 = new JLabel();
      jLabelStudents1.setBounds(new java.awt.Rectangle(10,130,120,20));
      jLabelStudents1.setText("Число студентов:");
      jPanelTwoLeft = new JPanel();
      jPanelTwoLeft.setLayout(null);
      jPanelTwoLeft.setPreferredSize(new java.awt.Dimension(410,1));
      jPanelTwoLeft.add(getJButtonInput21(), null);
      jPanelTwoLeft.add(getJButtonInput22(), null);
      jPanelTwoLeft.add(getJButtonSave1(), null);
      jPanelTwoLeft.add(jLabelStudents1, null);
      jPanelTwoLeft.add(getJTextAreaStudents1(), null);
      jPanelTwoLeft.add(jLabelQuestions1, null);
      jPanelTwoLeft.add(getJTextAreaQuestions1(), null);
      jPanelTwoLeft.add(getJButtonCount1(), null);
      jPanelTwoLeft.add(getJButtonApply1(), null);
      jPanelTwoLeft.add(getJButtonSaveText21(), null);
      jPanelTwoLeft.add(getJButtonSaveText22(), null);
      jPanelTwoLeft.add(getJButtonFree1(), null);
    }
    return jPanelTwoLeft;
  }

  /**
 * This method initializes jSplitPane	
 * @return  javax.swing.JSplitPane
 * @uml.property  name="jSplitPane"
 */
  private JSplitPane getJSplitPane() {
    if (jSplitPane == null) {
      jSplitPane = new JSplitPane();
      jSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
      jSplitPane.setDividerLocation(150);
      jSplitPane.setBottomComponent(getJTabbedPaneGraphs());
      jSplitPane.setTopComponent(getJScrollPane());
    }
    return jSplitPane;
  }

  /**
 * This method initializes jScrollPane	
 * @return  javax.swing.JScrollPane
 * @uml.property  name="jScrollPane"
 */
  private JScrollPane getJScrollPane() {
    if (jScrollPane == null) {
      jScrollPane = new JScrollPane();
      jScrollPane.setViewportView(getJTabbedPaneTables());
    }
    return jScrollPane;
  }

  
  /**
 * This method initializes jTabbedPaneGraphs	
 * @return  javax.swing.JTabbedPane
 * @uml.property  name="jTabbedPaneGraphs"
 */
  private JTabbedPane getJTabbedPaneGraphs() {
    if (jTabbedPaneGraphs == null) {
      jTabbedPaneGraphs = new JTabbedPane();
      jTabbedPaneGraphs.addTab("Графическая интерпретация надёжности тестов", null,
        getJTabbedPaneG(), null);
      jTabbedPaneGraphs.addTab("Презентация отчёта", null, getJTabbedPanePresentation1(),
    	null);
    }
    return jTabbedPaneGraphs;
  }
  
  void drawDiagram() 
  {    
    getMyFunc().calcMarks();
    try
    {
      getMyFunc().setFrom(0);
      getMyFunc().setTo(getMyFunc().getTicket() + 1);
      int count = getMyFunc().getTicket() + 1;
      int step = getDiagramPanel().getWidth() / (count + 1);
      if (step <= 10) {
        JOptionPane.showMessageDialog(null, "Надто багато точок!");
        return;
      }
      getMyFunc().setCount(count);
    }
    catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "Невірні дані!");
    }
  }
  
  void drawDiagram1() 
  {    
    try
    {
      int count = getMyFunc1().getTicket1() + 1;
      int step = getDiagramPanel1().getWidth() / (count + 1);
      if (step <= 10) {
        JOptionPane.showMessageDialog(null, "Надто багато точок!");
        return;
      }
      getMyFunc1().setCount(count);
    }
    catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "Невірні дані!");
    }
  }

  /**
 * This method initializes jPanelOneLeft	
 * @return  javax.swing.JPanel
 * @uml.property  name="jPanelOneLeft"
 */
  private JPanel getJPanelOneLeft() {
    if (jPanelOneLeft == null) {
      jLabelQuiestions = new JLabel();
      jLabelQuiestions.setBounds(new java.awt.Rectangle(10,130,150,20));
      jLabelQuiestions.setText("Число вопросов в тесте:");
      jLabelStudents = new JLabel();
      jLabelStudents.setBounds(new java.awt.Rectangle(10,100,110,20));
      jLabelStudents.setText("Число студентов:");
      jPanelOneLeft = new JPanel();
      jPanelOneLeft.setPreferredSize(new java.awt.Dimension(320,1));
      jPanelOneLeft.setLayout(null);
      jPanelOneLeft.add(getJButtonInput(), null);
      jPanelOneLeft.add(getJButtonSave(), null);
      jPanelOneLeft.add(jLabelStudents, null);
      jPanelOneLeft.add(getJTextAreaStudents(), null);
      jPanelOneLeft.add(jLabelQuiestions, null);
      jPanelOneLeft.add(getJTextAreaQuestions(), null);
      jPanelOneLeft.add(getJButtonCount(), null);
      jPanelOneLeft.add(getJButtonApply(), null);
      jPanelOneLeft.add(getJButtonSaveText(), null);
      jPanelOneLeft.add(getJButtonFree(), null);
    }
    return jPanelOneLeft;
  }

  /**
 * This method initializes jScrollPane1	
 * @return  javax.swing.JScrollPane
 * @uml.property  name="jScrollPane1"
 */
  private JScrollPane getJScrollPane1() {
    if (jScrollPane1 == null) {
      jScrollPane1 = new JScrollPane();
      jScrollPane1.setViewportView(getJTable1());
    }
    return jScrollPane1;
  }

  /**
 * This method initializes jTable1	
 * @return  javax.swing.JTable
 * @uml.property  name="jTable1"
 */
  private JTable getJTable1() {
    if (jTable1 == null) {
      jTable1 = new JTable();
      jTable1.setModel(getMyTableModel());
    }
    return jTable1;
  }

  /**
 * This method initializes jSplitPane1	
 * @return  javax.swing.JSplitPane
 * @uml.property  name="jSplitPane1"
 */
  private JSplitPane getJSplitPane1() {
    if (jSplitPane1 == null) {
      jSplitPane1 = new JSplitPane();
      jSplitPane1.setDividerLocation(150);
      jSplitPane1.setPreferredSize(new java.awt.Dimension(455,438));
      jSplitPane1.setTopComponent(getJScrollPane1());
      jSplitPane1.setBottomComponent(getJTabbedPane2());
      jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
    }
    return jSplitPane1;
  }

  /**
 * This method initializes jTabbedPane1	
 * @return  javax.swing.JTabbedPane
 * @uml.property  name="jTabbedPane2"
 */
  private JTabbedPane getJTabbedPane2() {
    if (jTabbedPane2 == null) {
      jTabbedPane2 = new JTabbedPane();
      jTabbedPane2.setToolTipText("Графическая интерпретация надежности теста");
      jTabbedPane2.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
      getJTabbedPaneReliability().setBounds(5, 25, jTabbedPane2.getWidth()-5, jTabbedPane2.getHeight()-50);
      jTabbedPane2.addTab("Графическая интерпретация надежности теста", null, getJTabbedPaneReliability(), null);
      jTabbedPane2.addTab("Гистограмма частот тестовых баллов", null, getJTabbedPaneFrequency(), null);
      jTabbedPane2.addTab("Презентация отчёта", null, getJTabbedPanePresentation(), null);
    }
    return jTabbedPane2;
  }

  /**
 * This method initializes jTabbedPane2	
 * @return  javax.swing.JTabbedPane
 * @uml.property  name="jTabbedPaneReliability"
 */
  private JEditorPane getJTabbedPaneReliability() {
    if (jTabbedPaneReliability == null) {
      jTabbedPaneReliability = new JEditorPane();
      jTabbedPaneReliability.setBackground(new java.awt.Color(238,238,238));

      jTabbedPaneReliability.setLayout(new BorderLayout());
      jTabbedPaneReliability.add(getDiagramPanel1(), new BorderLayout().CENTER);
    }
    return jTabbedPaneReliability;
  }
  
  /**
 * @return  Returns the jTabbedPanePresentation.
 * @uml.property  name="jTabbedPanePresentation"
 */
private JEditorPane getJTabbedPanePresentation() {
    if (jTabbedPanePresentation == null) {
      jTabbedPanePresentation = new JEditorPane();
    }
    return jTabbedPanePresentation;
  }

  /**
 * This method initializes jTabbedPane3	
 * @return  javax.swing.JTabbedPane
 * @uml.property  name="jTabbedPaneFrequency"
 */
  private JEditorPane getJTabbedPaneFrequency() {
    if (jTabbedPaneFrequency == null) {
      jTabbedPaneFrequency = new JEditorPane();
      jTabbedPaneFrequency.setLayout(new BorderLayout());
      jTabbedPaneFrequency.add(getDiagramPanel(), new BorderLayout().CENTER);
    }
    return jTabbedPaneFrequency;
  }

  /**
 * This method initializes jTabbedPaneTables	
 * @return  javax.swing.JTabbedPane
 * @uml.property  name="jTabbedPaneTables"
 */
  private JTabbedPane getJTabbedPaneTables() {
    if (jTabbedPaneTables == null) {
      jTabbedPaneTables = new JTabbedPane();
      jTabbedPaneTables.addTab("Данные о проведении первого теста", null, getJScrollPaneFirst(), null);
      jTabbedPaneTables.addTab("Данные о проведении второго теста", null, getJScrollPaneSecond(), null);
    }
    return jTabbedPaneTables;
  }

  /**
 * This method initializes jScrollPaneFirst	
 * @return  javax.swing.JScrollPane
 * @uml.property  name="jScrollPaneFirst"
 */
  private JScrollPane getJScrollPaneFirst() {
    if (jScrollPaneFirst == null) {
      jScrollPaneFirst = new JScrollPane();
      jScrollPaneFirst.setToolTipText("");
      jScrollPaneFirst.setViewportView(getJTableFirst());
    }
    return jScrollPaneFirst;
  }

  /**
 * This method initializes jTableFirst	
 * @return  javax.swing.JTable
 * @uml.property  name="jTableFirst"
 */
  private JTable getJTableFirst() {
    if (jTableFirst == null) {
      jTableFirst = new JTable();
      jTableFirst.setModel(getMyTableModel());
    }
    return jTableFirst;
  }

  /**
 * This method initializes jScrollPaneSecond	
 * @return  javax.swing.JScrollPane
 * @uml.property  name="jScrollPaneSecond"
 */
  private JScrollPane getJScrollPaneSecond() {
    if (jScrollPaneSecond == null) {
      jScrollPaneSecond = new JScrollPane();
      jScrollPaneSecond.setViewportView(getJTableSecond());
    }
    return jScrollPaneSecond;
  }

  /**
 * This method initializes jTableSecond	
 * @return  javax.swing.JTable
 * @uml.property  name="jTableSecond"
 */
  private JTable getJTableSecond() {
    if (jTableSecond == null) {
      jTableSecond = new JTable();
      jTableSecond.setModel(getMyTableModel());
    }
    return jTableSecond;
  }

  /**
 * This method initializes jTextAreaStudents	
 * @return  javax.swing.JTextArea
 * @uml.property  name="jTextAreaStudents"
 */
  private JTextArea getJTextAreaStudents() {
    if (jTextAreaStudents == null) {
      jTextAreaStudents = new JTextArea();
      jTextAreaStudents.setBounds(new java.awt.Rectangle(180,100,20,20));
    }
    return jTextAreaStudents;
  }

  /**
 * This method initializes jTextArea	
 * @return  javax.swing.JTextArea
 * @uml.property  name="jTextAreaQuestions"
 */
  private JTextArea getJTextAreaQuestions() {
    if (jTextAreaQuestions == null) {
      jTextAreaQuestions = new JTextArea();
      jTextAreaQuestions.setBounds(new java.awt.Rectangle(180,130,20,20));
    }
    return jTextAreaQuestions;
  }

  /**
 * This method initializes jTextAreaЫегвутеы1	
 * @return  javax.swing.JTextArea
 * @uml.property  name="jTextAreaStudents1"
 */
  private JTextArea getJTextAreaStudents1() {
    if (jTextAreaStudents1 == null) {
      jTextAreaStudents1 = new JTextArea();
      jTextAreaStudents1.setBounds(new java.awt.Rectangle(140,130,20,20));
    }
    return jTextAreaStudents1;
  }

  /**
 * This method initializes jTextAreaQuiestions21	
 * @return  javax.swing.JTextArea
 * @uml.property  name="jTextAreaQuestions1"
 */
  private JTextArea getJTextAreaQuestions1() {
    if (jTextAreaQuestions1 == null) {
      jTextAreaQuestions1 = new JTextArea();
      jTextAreaQuestions1.setBounds(new java.awt.Rectangle(140,160,20,20));
    }
    return jTextAreaQuestions1;
  }

  /**
 * This method initializes jButtonCount	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonCount"
 */
  private JButton getJButtonCount() {
    if (jButtonCount == null) {
      jButtonCount = new JButton();
      jButtonCount.setBounds(new java.awt.Rectangle(10,40,300,20));
      jButtonCount.setText("Рассчитать показатели анализа теста");
      jButtonCount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          count();
        }
      });
    }
    return jButtonCount;
  }

  /**
 * This method initializes jButtonCount1	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonCount1"
 */
  private JButton getJButtonCount1() {
    if (jButtonCount1 == null) {
      jButtonCount1 = new JButton();
      jButtonCount1.setBounds(new java.awt.Rectangle(10,70,390,20));
      jButtonCount1.setText("Рассчитать показатели анализа теста");
      jButtonCount1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          count1();
        }
      });
    }
    return jButtonCount1;
  }

  /**
 * This method initializes jButtonApply	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonApply"
 */
  private JButton getJButtonApply() {
    if (jButtonApply == null) {
      jButtonApply = new JButton();
      jButtonApply.setBounds(new java.awt.Rectangle(10,160,300,20));
      jButtonApply.setText("Применить введённые данные");
      jButtonApply.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          apply();
        }
      });
    }
    return jButtonApply;
  }

  /**
 * This method initializes jButtonApply1	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonApply1"
 */
  private JButton getJButtonApply1() {
    if (jButtonApply1 == null) {
      jButtonApply1 = new JButton();
      jButtonApply1.setBounds(new java.awt.Rectangle(10,190,390,20));
      jButtonApply1.setText("Применить введённые данные");
      jButtonApply1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          apply1();
        }
      });
    }
    return jButtonApply1;
  }

  /**
 * This method initializes jButtonSaveText	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonSaveText"
 */
  private JButton getJButtonSaveText() {
    if (jButtonSaveText == null) {
      jButtonSaveText = new JButton();
      jButtonSaveText.setBounds(new java.awt.Rectangle(10,190,300,20));
      jButtonSaveText.setText("Сохранить исходные данные в виде файла");
      jButtonSaveText.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          saveText();
        }
      });
    }
    return jButtonSaveText;
  }

  /**
 * This method initializes jButtonSaveText21	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonSaveText21"
 */
  private JButton getJButtonSaveText21() {
    if (jButtonSaveText21 == null) {
      jButtonSaveText21 = new JButton();
      jButtonSaveText21.setBounds(new java.awt.Rectangle(10,220,390,20));
      jButtonSaveText21.setText("Сохранить исходные данные о первом тесте в виде файла");
      jButtonSaveText21.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          saveText21();
        }
      });
    }
    return jButtonSaveText21;
  }

  /**
 * This method initializes jButtonSaveText22	
 * @return  javax.swing.JButton
 * @uml.property  name="jButtonSaveText22"
 */
  private JButton getJButtonSaveText22() {
    if (jButtonSaveText22 == null) {
      jButtonSaveText22 = new JButton();
      jButtonSaveText22.setBounds(new java.awt.Rectangle(10,250,390,20));
      jButtonSaveText22.setText("Сохранить исходные данные о втором тесте в виде файла");
      jButtonSaveText22.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          saveText22();
        }
      });
    }
    return jButtonSaveText22;
  }

  /**
 * This method initializes jMenuItemSaveText	
 * @return  javax.swing.JMenuItem
 * @uml.property  name="jMenuItemSaveText"
 */
  private JMenuItem getJMenuItemSaveText() {
    if (jMenuItemSaveText == null) {
      jMenuItemSaveText = new JMenuItem();
      jMenuItemSaveText.setText("Сохранить исходные данные в виде файла");
      jMenuItemSaveText.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          saveText();
        }
      });
    }
    return jMenuItemSaveText;
  }

  /**
 * This method initializes jTabbedPanePresentation1	
 * @return  javax.swing.JTabbedPane
 * @uml.property  name="jTabbedPanePresentation1"
 */
  private JTabbedPane getJTabbedPanePresentation1() {
    if (jTabbedPanePresentation1 == null) {
      jTabbedPanePresentation1 = new JTabbedPane();
    }
    return jTabbedPanePresentation1;
  }

  /**
 * This method initializes jTabbedPaneG	
 * @return  javax.swing.JTabbedPane
 * @uml.property  name="jTabbedPaneG"
 */
  private JEditorPane getJTabbedPaneG() {
    if (jTabbedPaneG == null) {
      jTabbedPaneG = new JEditorPane();
      jTabbedPaneG.setToolTipText("");
      jTabbedPaneG.setLayout(new BorderLayout());
      jTabbedPaneG.add(getDiagramPanel21(), new BorderLayout().CENTER);
    }
    return jTabbedPaneG;
  }

  /**
 * This method initializes jMenuProgram1	
 * @return  javax.swing.JMenuItem
 * @uml.property  name="jMenuProgram1"
 */
  private JMenuItem getJMenuProgram1() {
    if (jMenuProgram1 == null) {
      jMenuProgram1 = new JMenuItem();
      jMenuProgram1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          new JFrameGuide().setVisible(true);
        }
      });
      jMenuProgram1.setText("Руководство пользователя");
    }
    return jMenuProgram1;
  }

  /**
   * This method initializes jButtonFree	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getJButtonFree1() {
    if (jButtonFree1 == null) {
      jButtonFree1 = new JButton();
      jButtonFree1.setBounds(new java.awt.Rectangle(10,280,390,20));
      jButtonFree1.setText("Очистить все данные");
      jButtonFree1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          clear();
        }
      });
    }
    return jButtonFree1;
  }

  /**
   * This method initializes jButton	
   * 	
   * @return javax.swing.JButton	
   */
  private JButton getJButtonFree() {
    if (jButtonFree == null) {
      jButtonFree = new JButton();
      jButtonFree.setBounds(new java.awt.Rectangle(10,220,300,20));
      jButtonFree.setText("Очистить все данные");
      jButtonFree.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          clear();
        }
      });
    }
    return jButtonFree;
  }

  /**
   * This method initializes jMenuItemClear	
   * 	
   * @return javax.swing.JMenuItem	
   */
  private JMenuItem getJMenuItemClear() {
    if (jMenuItemClear == null) {
      jMenuItemClear = new JMenuItem();
      jMenuItemClear.setToolTipText("Очистить все данные");
      jMenuItemClear.setText("Очистить все данные");
      jMenuItemClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          clear();
        }
      });
     
      
     
    }
    return jMenuItemClear;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    new JMainFrame().setVisible(true);
  }

  /**
   * This is the default constructor
   */
  public JMainFrame() {
    super();
    initialize();
  }

  /**
   * This method initializes this
   * 
   * @return void
   */
  private void initialize() {
    this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    this.setPreferredSize(new java.awt.Dimension(1100,540));
    this.setBounds(new java.awt.Rectangle(0,0,1100,540));
    this.setJMenuBar(getJMainMenu());
    this.setContentPane(getJContentPane());
    this.setTitle("Анализ качества педагогических тестов");
    this.getJMenuInput2().setVisible(false);
    isFileOpen = false;
    isFile21Open = false;
    isFile22Open = false;
    this.getJButtonCount().setEnabled(false);
    this.getJButtonCount1().setEnabled(false);
    this.getJButtonSave().setEnabled(false);
    this.getJButtonSave1().setEnabled(false);
    this.getJButtonSaveText().setEnabled(false);
    this.getJButtonSaveText21().setEnabled(false);
    this.getJButtonSaveText22().setEnabled(false);
    getJTextAreaStudents().setText("");
    getJTextAreaQuestions().setText("");
    getJTextAreaStudents1().setText("");
    getJTextAreaQuestions1().setText("");
  }
  
  public void clear() {
    this.getJMenuInput2().setVisible(false);
    isFileOpen = false;
    isFile21Open = false;
    isFile22Open = false;
    this.getJButtonCount().setEnabled(false);
    this.getJButtonCount1().setEnabled(false);
    this.getJButtonSave().setEnabled(false);
    this.getJButtonSave1().setEnabled(false);
    this.getJButtonSaveText().setEnabled(false);
    this.getJButtonSaveText21().setEnabled(false);
    this.getJButtonSaveText22().setEnabled(false);
    getJTextAreaStudents().setText("");
    getJTextAreaQuestions().setText("");
    getJTextAreaStudents1().setText("");
    getJTextAreaQuestions1().setText("");
    getJTable1().setModel(new MyTableModel());  
    getJTable1().revalidate();
    getJTable1().repaint();
    getJTableFirst().setModel(new MyTableModel());  
    getJTableFirst().revalidate();
    getJTableFirst().repaint();
    getJTableSecond().setModel(new MyTableModel());  
    getJTableSecond().revalidate();
    getJTableSecond().repaint();
    setMyFunc(null);
    getDiagramPanel1().setFunc(null);
    getDiagramPanel1().revalidate();
    getDiagramPanel1().repaint();
    getDiagramPanel().setFunc(null);
    getDiagramPanel().revalidate();
    getDiagramPanel().repaint();
    getDiagramPanel21().setFunc(null);
    getDiagramPanel21().revalidate();
    getDiagramPanel21().repaint();
    setReport(null);
    if (getJTabbedPanePresentation().getComponentCount()>0)
      getJTabbedPanePresentation().getComponent(getJTabbedPanePresentation().
    	getComponentCount()-1).setVisible(false);
      getJTabbedPanePresentation().repaint();
  }

  /**
 * This method initializes jContentPane
 * @return  javax.swing.JPanel
 * @uml.property  name="jContentPane"
 */
  private JPanel getJContentPane() {
    if (jContentPane == null) {
      jContentPane = new JPanel();
      jContentPane.setLayout(new BorderLayout());
      jContentPane.setPreferredSize(new java.awt.Dimension(780,500));
      jContentPane.add(getJTabbedPane(), java.awt.BorderLayout.CENTER);
    }
    return jContentPane;
  }
  
  /**
 * @return  Returns the jFileChooser.
 * @uml.property  name="jFileChooser"
 */
private JFileChooser getJFileChooser() {
    if (jFileChooser == null) {
      jFileChooser = new JFileChooser();
      jFileChooser.setCurrentDirectory(new java.io.File("."));
    }
    return jFileChooser;
  }
  
  private void open22() {
    getJFileChooser().setFileFilter(new FileNameExtensionFilter("txt", "txt"));
    if (JFileChooser.APPROVE_OPTION == getJFileChooser().showOpenDialog(this)) {
      try {
        getMyFunc1().setFileName2(getJFileChooser().getSelectedFile().getPath());
        getMyFunc1().readFromFile2(getJFileChooser().getSelectedFile().getPath());
        getMyFunc1().setFile2IsOpen(true);
        getJTextAreaStudents1().setText(getMyFunc1().getStudents() + "");
        getJTextAreaQuestions1().setText(getMyFunc1().getQuestions() + "");
        isFile22Open = true;
        getJTableSecond().setModel(new MyTableModel(Integer.parseInt(getJTextAreaStudents1().getText()),
            Integer.parseInt(getJTextAreaQuestions1().getText())+1));
        if (isFile22Open)
          for (int i = 0; i < Integer.parseInt(getJTextAreaStudents1().getText()); i++)
            for (int j = 0; j < Integer.parseInt(getJTextAreaQuestions1().getText()); j++)
              if (getMyFunc1().getElement2(i, j) == 1)
                getJTableSecond().setValueAt(Boolean.TRUE, i, j+1);
        getJTableSecond().revalidate();
        getJTableSecond().repaint();
        if (isFile21Open)
          getJButtonCount1().setEnabled(true);
      }
      catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка чтения из файла!");
      }

    }
  }
  
  /**
 * @return  Returns the myTableModel.
 * @uml.property  name="myTableModel"
 */
private MyTableModel getMyTableModel() {
    if (myTableModel == null) {
      myTableModel = new MyTableModel();
    }
    return myTableModel;
  }
  
  void apply()
  {
    System.out.println("Число студентов"+getJTextAreaStudents().getText());
    try{
    getJTable1().setModel(new MyTableModel(Integer.parseInt(getJTextAreaStudents().getText()),
      Integer.parseInt(getJTextAreaQuestions().getText())+1));    
    if (isFileOpen)
      for (int i = 0; i < Integer.parseInt(getJTextAreaStudents().getText()); i++)
        for (int j = 0; j < Integer.parseInt(getJTextAreaQuestions().getText()); j++)
          if (getMyFunc().getElement(i, j) == 1)
            getJTable1().setValueAt(Boolean.TRUE, i, j+1);
    getJTable1().revalidate();
    getJTable1().repaint();
    getJButtonCount().setEnabled(true);
    }
    catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Неверно введено количество студентов и/или вопросов!");
    }
    catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Ошибка в исходных данных!");
    }
  }
  
  void apply1()
  {
    try{
    getJTableFirst().setModel(new MyTableModel(Integer.parseInt(getJTextAreaStudents1().
      getText()), Integer.parseInt(getJTextAreaQuestions1().getText())+1));
    if (isFile21Open)
      for (int i = 0; i < Integer.parseInt(getJTextAreaStudents1().getText()); i++)
        for (int j = 0; j < Integer.parseInt(getJTextAreaQuestions1().getText()); j++)
          if (getMyFunc1().getElement1(i, j) == 1)
            getJTableFirst().setValueAt(Boolean.TRUE, i, j+1);
    getJTableFirst().revalidate();
    getJTableFirst().repaint();    
    getJTableSecond().setModel(new MyTableModel(Integer.parseInt(getJTextAreaStudents1().
    getText()), Integer.parseInt(getJTextAreaQuestions1().getText())+1));
    if (isFile22Open)
      for (int i = 0; i < Integer.parseInt(getJTextAreaStudents1().getText()); i++)
        for (int j = 0; j < Integer.parseInt(getJTextAreaQuestions1().getText()); j++)
          if (getMyFunc1().getElement2(i, j) == 1)
            getJTableSecond().setValueAt(Boolean.TRUE, i, j+1);
    getJTableSecond().revalidate();
    getJTableSecond().repaint();
    getJButtonCount1().setEnabled(true);
    }
    catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Неверно введено количество студентов и/или вопросов!");
    }
    catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Ошибка в исходных данных!");
    }
  }
  
  /**
 * This method initializes diagramPanel1  
 * @return  diagram.DiagramPanel1
 * @uml.property  name="diagramPanel1"
 */
  private DiagramPanel1 getDiagramPanel1() {
    if (diagramPanel1 == null) {
      diagramPanel1 = new DiagramPanel1();
    }
    return diagramPanel1;
  }
  
  /**
 * @return  Returns the diagramPanel.
 * @uml.property  name="diagramPanel"
 */
private DiagramPanel getDiagramPanel() {
    if (diagramPanel == null) {
      diagramPanel = new DiagramPanel();
    }
    return diagramPanel;
  }
  
  private void count()
  {
    if (getJTable1().getModel().getRowCount() > 0)
    {
      getMyFunc().newAr(getJTable1().getModel().getRowCount(), getJTable1().getModel().getColumnCount());
      for (int i = 0; i < getJTable1().getModel().getRowCount(); i++)
        for (int j = 1; j < getJTable1().getModel().getColumnCount(); j++)
          if (getJTable1().getModel().getValueAt(i, j) == Boolean.TRUE)
            getMyFunc().setElement(i, j-1, 1);
          else
            getMyFunc().setElement(i, j-1, -1);
      getMyFunc().setQuestions(getJTable1().getModel().getColumnCount()-1);
      getMyFunc().setStudents(getJTable1().getModel().getRowCount());
      getMyFunc().initData();
      drawDiagram();
      getDiagramPanel().setFunc(getMyFunc());
      getDiagramPanel().revalidate();
      getDiagramPanel().repaint();
      getDiagramPanel1().setFunc(getMyFunc());
      getDiagramPanel1().revalidate();
      getDiagramPanel1().repaint();
      String name = "temp.htm";
      getJFileChooser().setSelectedFile(new File(name));
      try
      {
        BufferedImage bi = new BufferedImage(getDiagramPanel().getWidth(), 
        getDiagramPanel().getHeight(), BufferedImage.TYPE_INT_BGR);
        getDiagramPanel().showGraph(bi.getGraphics());
        ImageIO.write(bi, "png", new File(name+"1.png"));
        bi = new BufferedImage(getDiagramPanel1().getWidth(), 
          getDiagramPanel1().getHeight(), BufferedImage.TYPE_INT_BGR);
        getDiagramPanel1().showGraph(bi.getGraphics());
        ImageIO.write(bi, "png", new File(name+"2.png"));
        getMyFunc().writeToFile(getJFileChooser().getSelectedFile().getPath(), name);
        report = new Report("temp.htm");
        jTabbedPanePresentation.setLayout(new BorderLayout());
        jTabbedPanePresentation.add(report, new BorderLayout().CENTER);
          getJButtonSave().setEnabled(true);
          getJButtonSaveText().setEnabled(true);
        }
        catch (IOException e) {
          JOptionPane.showMessageDialog(null, "Ошибка записи в файл!");
        }
      }
  }
  
  private void save() {
    String name = "";
    if (isFileOpen)
    {
      name = getJFileChooser().getSelectedFile().getPath();
      if (name.indexOf(".txt") >= 0){
        name = name.replace(".txt", ".html");
      }
    }
    getJFileChooser().setSelectedFile(new File(name));
    getJFileChooser().setFileFilter(new FileNameExtensionFilter("html", "html")); 
    if (JFileChooser.APPROVE_OPTION == getJFileChooser().showSaveDialog(this))
    {
      try
      {
        BufferedImage bi = new BufferedImage(getDiagramPanel().getWidth(), 
            getDiagramPanel().getHeight(), BufferedImage.TYPE_INT_BGR);
        getDiagramPanel().showGraph(bi.getGraphics());
        ImageIO.write(bi, "png", new File(name+"1.png"));
        bi = new BufferedImage(getDiagramPanel1().getWidth(), 
            getDiagramPanel1().getHeight(), BufferedImage.TYPE_INT_BGR);
        getDiagramPanel1().showGraph(bi.getGraphics());
        ImageIO.write(bi, "png", new File(name+"2.png"));
        getMyFunc().writeToFile(getJFileChooser().getSelectedFile().getPath(), name);
        JOptionPane.showMessageDialog(this, "Результаты вычислений сохранены");

      }
      catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка записи в файл!");
      }
    }
  }
  
  private void saveComp()
  {
    String name = "";
    getJFileChooser().setSelectedFile(new File(name));
    getJFileChooser().setFileFilter(new FileNameExtensionFilter("html", "html")); 
    if (JFileChooser.APPROVE_OPTION == getJFileChooser().showSaveDialog(this)) {
      try
      {
        BufferedImage bi = new BufferedImage(getDiagramPanel21().getWidth(), 
            getDiagramPanel21().getHeight(), BufferedImage.TYPE_INT_BGR);
        getDiagramPanel21().showGraph(bi.getGraphics());
        ImageIO.write(bi, "png", new File(name + "1.png"));
        getMyFunc1().writeToFile(getJFileChooser().getSelectedFile().getPath(), name);
        JOptionPane.showMessageDialog(this, "Результаты вычислений сохранены");

      }
      catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка записи в файл!");
      }
    }
  }
  
  void saveText()
  {
    
    String name = "";
    getJFileChooser().setSelectedFile(new File(name));
    getJFileChooser().setFileFilter(new FileNameExtensionFilter("txt", "txt")); 
   
    if (JFileChooser.APPROVE_OPTION == getJFileChooser().showSaveDialog(this)) {
      try {
        String name1 = getJFileChooser().getSelectedFile().getPath();
        if (name1.substring(name1.length()-5, name1.length())!=".txt"){
          name1 += ".txt";
        }
          
        PrintWriter out = new PrintWriter(
          new OutputStreamWriter(new FileOutputStream(name1), "Windows-1251"));
        for (int i = 0; i < getMyFunc().getStudents(); i++)
        {
          for (int j = 0; j < getMyFunc().getQuestions(); j++)
            out.print(getMyFunc().getElement(i, j) + " ");
          out.println();
        }
        JOptionPane.showMessageDialog(this, "Данные сохранены");
        out.close();
      }
      catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка записи в файл!");
      }
    }
  }
  
  /**
 * @return  Returns the myFunc1.
 * @uml.property  name="myFunc1"
 */
private MyFunc2Tests getMyFunc1() {
    if (myFunc1 == null) {
      myFunc1 = new MyFunc2Tests();
    }
    return myFunc1;
  }
  
  void count1()
  {
    if (getJTableFirst().getModel().getRowCount() > 0)
    {
      getMyFunc1().newAr1(getJTableFirst().getModel().getRowCount(), getJTableFirst().getModel().getColumnCount());
      for (int i = 0; i < getJTableFirst().getModel().getRowCount(); i++)
        for (int j = 1; j < getJTableFirst().getModel().getColumnCount(); j++)
          if (getJTableFirst().getModel().getValueAt(i, j) == Boolean.TRUE)
            getMyFunc1().setElement1(i, j-1, 1);
          else
            getMyFunc1().setElement1(i, j-1, -1);
      getMyFunc1().setQuestions(getJTableFirst().getModel().getColumnCount()-1);
      getMyFunc1().setStudents(getJTableFirst().getModel().getRowCount());
    }
    if (getJTableSecond().getModel().getRowCount() > 0)
    {
      getMyFunc1().newAr2(getJTableSecond().getModel().getRowCount(), getJTableSecond().getModel().getColumnCount());
      for (int i = 0; i < getJTableSecond().getModel().getRowCount(); i++)
        for (int j = 1; j < getJTableSecond().getModel().getColumnCount(); j++)
          if (getJTableSecond().getModel().getValueAt(i, j) == Boolean.TRUE)
            getMyFunc1().setElement2(i, j-1, 1);
          else
            getMyFunc1().setElement2(i, j-1, -1);
      getMyFunc1().setQuestions(getJTableSecond().getModel().getColumnCount()-1);
      getMyFunc1().setStudents(getJTableSecond().getModel().getRowCount());
    }
    getMyFunc1().initData();
    drawDiagram1();
    getDiagramPanel21().setFunc(getMyFunc1());
    getDiagramPanel21().revalidate();
    getDiagramPanel21().repaint();
    getJButtonSaveText21().setEnabled(true);
    getJButtonSaveText22().setEnabled(true);
    String name = "temp.htm";
    getJFileChooser().setSelectedFile(new File(name));
    try
    {
      BufferedImage bi = new BufferedImage(getDiagramPanel21().getWidth(), 
        getDiagramPanel21().getHeight(), BufferedImage.TYPE_INT_BGR);
      getDiagramPanel21().showGraph(bi.getGraphics());
      ImageIO.write(bi, "png", new File(name+"1.png"));
      getMyFunc1().writeToFile(getJFileChooser().getSelectedFile().getPath(), name);
      report = new Report("temp.htm");
      jTabbedPanePresentation1.setLayout(new BorderLayout());
      jTabbedPanePresentation1.add(report, new BorderLayout().CENTER);
      getJButtonSave1().setEnabled(true);
    }
    catch (IOException e) {
      JOptionPane.showMessageDialog(null, "Ошибка записи в файл!");
    }
  }  
  
  void saveText21()
  {
    String name = "";
    getJFileChooser().setSelectedFile(new File(name));
    getJFileChooser().setFileFilter(new FileNameExtensionFilter("txt", "txt")); 
    if (JFileChooser.APPROVE_OPTION == getJFileChooser().showSaveDialog(this)) {
      try {
    	  String name1 = getJFileChooser().getSelectedFile().getPath();
          if (name1.substring(name1.length()-5, name1.length())!=".txt"){
            name1 += ".txt";
          }
        PrintWriter out = new PrintWriter(
          new OutputStreamWriter(new FileOutputStream(name1), "Windows-1251"));
        for (int i = 0; i < getMyFunc1().getStudents(); i++)
        {
          for (int j = 0; j < getMyFunc1().getQuestions(); j++)
            out.print(getMyFunc1().getElement1(i, j) + " ");
          out.println();
        }
        JOptionPane.showMessageDialog(this, "Данные сохранены");
        out.close();
      }
      catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка записи в файл!");
      }
    }
  }
  
  void saveText22()
  {
    String name = "";
    getJFileChooser().setSelectedFile(new File(name)); 
    if (JFileChooser.APPROVE_OPTION == getJFileChooser().showSaveDialog(this)) {
      try {
    	  String name1 = getJFileChooser().getSelectedFile().getPath();
          if (name1.substring(name1.length()-5, name1.length())!=".txt"){
            name1 += ".txt";
          }
        PrintWriter out = new PrintWriter(
          new OutputStreamWriter(new FileOutputStream(name1), "Windows-1251"));
        for (int i = 0; i < getMyFunc1().getStudents(); i++)
        {
          for (int j = 0; j < getMyFunc1().getQuestions(); j++)
            out.print(getMyFunc1().getElement2(i, j) + " ");
          out.println();
        }
        out.close();
      }
      catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка записи в файл!");
      }
    }
  }
  
  /**
 * @return  Returns the report.
 * @uml.property  name="report"
 */
  Report getReport()
  {
    if (report == null)
      report = new Report();
    return report;
  }

}