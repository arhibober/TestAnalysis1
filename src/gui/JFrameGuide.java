package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFrameGuide extends JFrame {

  private JPanel      jContentPane = null;
  private JScrollPane jScrollPane  = null;
  private JTextArea   jTextArea    = null;

  /**
 * This method initializes jScrollPane	
 * @return  javax.swing.JScrollPane
 * @uml.property  name="jScrollPane"
 */
  private JScrollPane getJScrollPane() {
    if (jScrollPane == null) {
      jScrollPane = new JScrollPane();
      jScrollPane.setViewportView(getJTextArea());
    }
    return jScrollPane;
  }

  /**
 * This method initializes jTextArea	
 * @return  javax.swing.JTextArea
 * @uml.property  name="jTextArea"
 */
  private JTextArea getJTextArea() {
    if (jTextArea == null) {
      jTextArea = new JTextArea();

      String s = "�������� ������� ������ ��������� ������������ ����� \n ���������� ���������� ������ ��� ���� \n(��� ��������� ���� � ������) ������ � ������ ���������. \n\n����������  ������� �� ������ �������� \n�  ������� ����������� ������������, \n"

          + "������� ������������ ����� �������, \n������, ������� ������������� ����������, \n� ������� � ������������ ����������.\n\n�� ����������� ����� � �������� ��������� �����, \n��������������� ������ ������� ����������� �� ������ ������� \n(1, ���� ������� ������� �� ������, \n-1 - � ��������� ������). \n\n"
          + "������� ����� ���� ������� ��� � ���� ���������� �����, \n��� � ��������������� ������ � ���� ���������.\n\n"

          + "������ ��������� �������� ������ ���������:\n\n"

          + "- ���������� ���������;\n"
          + "- ���������� �������� � ���� �������� �� ������� �����;\n"
          + "- ���������� �������� � ������;\n"
          + "- ���������� ����� ������;\n"
          + "- ������ ���������;\n"
          + "- ������� �������� ������;\n"
          + "- ������� ����, ���������� �� ������� �������;\n"
          + "- ���� ����������� ��������� (������� ��������, ���� � �������);\n"
          + "- ���������� ������ �������� ������;\n"
          + "- �������������� ����� ��������� �� ���� ��������� ������ (��� ��������� ������������ �����);\n"
          + "- ���� ���������� ������� �� ������ �������;\n"
          + "- ���� ������������ ������� �� ������ �������;\n"
          + "- �������� �������� ������ ��� ������� �������\n"
          + "- ����������� ������������� ��������� �����;\n"
          + "- ���������;\n"
          + "- ����������� ����������;\n"
          + "- ����������� ���������� �������;\n"
          + "- ���������� ����� �� ���� ��������� ������������� ����� (�� ������� ��������-������);\n"
          + "- ����������� KR-20;\n"
          + "- ������ ����� �� �������� �������;\n"
          + "- ������ ����� �� �������� ��������-������;\n"
          + "- ������ ����� �� �������� KR-20;\n"
          + "- ����������� ���������� �������������� ������ � �����;\n"
          + "- �����a ����������� ������ ��������������� ����� ��������;\n"
          + "- ������ ���������� ������������-���������������� �����;\n"
          + "- ������� ���������� 2�2;\n"
          + "- ����������� ���������� Rf;\n"
          + "- ����������� ���������� Rtet;\n"
          + "- ����������� �������� �������������� ������� P;\n"
          + "- ����������� ���������� �������� �������������� ������� Pc;\n"
          + "- ����������� ����� Kae;\n"
          + "- ����������� ������ �������� ���������\n"
          + "- �������������� ������� �������� �������;\n"
          + "- ������������ �� ����� ����� ����� �������� �������;\n"
          + "- �������� ������������ ����������� ���������� �� ������� �������;\n"
          + "- ������������ �� ����� ������� ������� � ��������� ������� ����������;\n"
          + "- ����������� ������ ���������;\n"
          + "- �������� �������������� ���������;\n"
          + "- ������� ��������� ����� ���������.\n\n"
          + "- �����, ���������� �������� ������, ������������ � ������� HTML.";
      jTextArea.setText(s);
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
  public JFrameGuide() {
    super();
    initialize();
  }

  /**
   * This method initializes this
   * 
   * @return void
   */
  private void initialize() {
    this.setSize(408, 355);
    this.setContentPane(getJContentPane());
    this.setTitle("����������� ������������");
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
      jContentPane.add(getJScrollPane(), java.awt.BorderLayout.CENTER);
    }
    return jContentPane;
  }

}
