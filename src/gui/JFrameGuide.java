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

      String s = "Основные входные данные программы представляют собой \n результаты проведения одного или двух \n(для сравнения друг с другом) тестов в группе студентов. \n\nРезультаты  каждого из тестов задаются \nв  матрице результатов тестирования, \n"

          + "которая представляет собой таблицу, \nстроки, которой соответствуют испытуемым, \nа столбцы – индикаторным переменным.\n\nНа пересечении строк и столбцов находится число, \nсоответствующее ответу данного испытуемого на данное задание \n(1, если студент ответил на вопрос, \n-1 - в противном случае). \n\n"
          + "Матрица может быть введена как в виде текстового файла, \nтак и непосредственно задана в окне программы.\n\n"

          + "Список выводимых выходных данных программы:\n\n"

          + "- количество студентов;\n"
          + "- количество вопросов в базе вопросов по данному тесту;\n"
          + "- количество вопросов в билете;\n"
          + "- количество типов оценок;\n"
          + "- оценки студентов;\n"
          + "- частоты тестовых баллов;\n"
          + "- средний балл, полученный по каждому вопросу;\n"
          + "- меры центральной тенденции (среднее значение, мода и медиана);\n"
          + "- гисторамма частот тестовых баллов;\n"
          + "- индивидуальные баллы студентов по двум различным тестам (или половинам расщеплённого теста);\n"
          + "- доля правильных ответов на каждое задание;\n"
          + "- доля неправильных ответов на каждое задание;\n"
          + "- вариация тестовых баллов для каждого задания\n"
          + "- графическая интерпретация надёжности теста;\n"
          + "- дисперсия;\n"
          + "- стандартное отклонение;\n"
          + "- коэффициент корреляции Пирсона;\n"
          + "- надежность теста по двум половинам расщепленного теста (по формуле Спирмена-Брауна);\n"
          + "- коэффициент KR-20;\n"
          + "- оценка теста по критерию Пирсона;\n"
          + "- оценка теста по критерию Спирмена-Брауна;\n"
          + "- оценка теста по критерию KR-20;\n"
          + "- стандартное отклонение индивидуальных баллов в тесте;\n"
          + "- оценкa стандартной ошибки индивидуального балла студента;\n"
          + "- оценка надежности критериально-ориентированного теста;\n"
          + "- таблица сопряжения 2х2;\n"
          + "- коэффициент корреляции Rf;\n"
          + "- коэффициент корреляции Rtet;\n"
          + "- вероятность принятия согласованного решения P;\n"
          + "- вероятность случайного принятия согласованного решения Pc;\n"
          + "- коэффициент каппа Kae;\n"
          + "- стандартная ошибка тестовых измерений\n"
          + "- корелляционная матрица тестовых заданий;\n"
          + "- рекомендации по связи между собой тестовых заданий;\n"
          + "- точечный бисериальный коэффициент корреляции по каждому вопросу;\n"
          + "- рекомендации по связи каждого задания с тестовыми баллами испытуемых;\n"
          + "- стандартная ошибка измерений;\n"
          + "- половина доверительного интервала;\n"
          + "- границы тестового балла студентов.\n\n"
          + "- Отчет, содержащий выходные данные, генерируется в формате HTML.";
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
    this.setTitle("Руководство пользователя");
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
