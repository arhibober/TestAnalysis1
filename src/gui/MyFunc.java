package gui;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author  Alex
 */
public class MyFunc {
  /**
 * @uml.property  name="fileName"
 */
private String   fileName   = "";
  /**
 * @uml.property  name="fileIsOpen"
 */
private boolean  fileIsOpen = false;
  /**
 * @uml.property  name="often"
 */
private int      often[]    = null;
  /**
 * @uml.property  name="from"
 */
private double   from       = 0;
  /**
 * @uml.property  name="to"
 */
private double   to         = 1;
  private int[][]  ar         = null;
  /**
 * @uml.property  name="questions"
 */
private int      questions  = 48;
  /**
 * @uml.property  name="students"
 */
private int      students   = 51;
  /**
 * @uml.property  name="ticket"
 */
private int      ticket     = 0;
  /**
 * @uml.property  name="count"
 */
private int      count      = 0;

  /**
 * @uml.property  name="arrStudents"
 * @uml.associationEnd  multiplicity="(0 -1)"
 */
private Student  arrStudents[];
  /**
 * @uml.property  name="arrQuestions"
 * @uml.associationEnd  multiplicity="(0 -1)"
 */
private Question arrQuestions[];

  public class Question {
    int    number;
    double p = 0;

    public Question(int n) {
      int r = 0;
      int trial = 0;
      number = n;

      for (int i = 0; i < students; i++) {
        if (ar[i][number] == 1)
          r++;
      }

      for (int i = 0; i < students; i++) {
        if (ar[i][number] == 1 || ar[i][number] == -1)
          trial++;
      }
      p = ((double) r) / trial;
    }
  }

  /**
 * @author  Alex
 */
public class Student {
    /**
	 * @uml.property  name="number"
	 */
    int number;
    /**
	 * @uml.property  name="arrQuestions"
	 */
    int arrQuestions[];
    /**
	 * @uml.property  name="arrAnswers"
	 */
    int arrAnswers[];
    /**
	 * @uml.property  name="mark"
	 */
    int mark;
    /**
	 * @uml.property  name="even"
	 */
    int even;
    /**
	 * @uml.property  name="uneven"
	 */
    int uneven;

    Student(int number, int[] arrQuestions, int[] arrAnswers) {
      this.number = number;
      this.arrQuestions = arrQuestions;
      this.arrAnswers = arrAnswers;
    }
    public Student()
    {
      number = 0;
      arrQuestions = null;
      arrAnswers = null;
      mark = 0;
      even = 0;
      uneven = 0;
    }

    public Student(int n) {
      number = n;
      arrQuestions = new int[ticket];
      arrAnswers = new int[ticket];
      mark = 0;
      int j = 0;
      for (int i = 0; i < ar[0].length; i++) {
        if (ar[number][i] != 0) {
          arrQuestions[j] = i;
          arrAnswers[j] = ar[number][i];
          j++;
        }
      }
      for (int i = 0; i < arrQuestions.length; i++)
        if (arrAnswers[i] == 1)
          mark++;
      for (int i = 0; i < arrQuestions.length; i += 2)
        if (arrAnswers[i] == 1)
          uneven++;
      for (int i = 1; i < arrQuestions.length; i += 2)
        if (arrAnswers[i] == 1)
          even++;
    }

    /**
   * @return  Returns the even.
   * @uml.property  name="even"
   */
    public int getEven() {
      return even;
    }

    /**
   * @param even  The even to set.
   * @uml.property  name="even"
   */
    public void setEven(int even) {
      this.even = even;
    }

    /**
   * @return  Returns the mark.
   * @uml.property  name="mark"
   */
    public int getMark() {
      return mark;
    }

    /**
   * @param mark  The mark to set.
   * @uml.property  name="mark"
   */
    public void setMark(int mark) {
      this.mark = mark;
    }

    /**
   * @return  Returns the number.
   * @uml.property  name="number"
   */
    public int getNumber() {
      return number;
    }

    /**
   * @param number  The number to set.
   * @uml.property  name="number"
   */
    public void setNumber(int number) {
      this.number = number;
    }

    /**
   * @return  Returns the uneven.
   * @uml.property  name="uneven"
   */
    public int getUneven() {
      return uneven;
    }

    /**
   * @param uneven  The uneven to set.
   * @uml.property  name="uneven"
   */
    public void setUneven(int uneven) {
      this.uneven = uneven;
    }

    /**
   * @return  Returns the arrAnswers.
   * @uml.property  name="arrAnswers"
   */
    public int[] getArrAnswers() {
      return arrAnswers;
    }

    /**
   * @param arrAnswers  The arrAnswers to set.
   * @uml.property  name="arrAnswers"
   */
    public void setArrAnswers(int[] arrAnswers) {
      this.arrAnswers = arrAnswers;
    }

    /**
   * @return  Returns the arrQuestions.
   * @uml.property  name="arrQuestions"
   */
    public int[] getArrQuestions() {
      return arrQuestions;
    }

    /**
   * @param arrQuestions  The arrQuestions to set.
   * @uml.property  name="arrQuestions"
   */
    public void setArrQuestions(int[] arrQuestions) {
      this.arrQuestions = arrQuestions;
    }
  }

  public MyFunc() {
    initialize();
  }

  public static double round(double d, int digitsCount) {
    if (digitsCount > 0 && digitsCount < 15) {
      double dC10 = 1;
      for (int i = 0; i < digitsCount; i++)
        dC10 *= 10;
      long n = (long) (d * dC10 + (d > 0 ? 0.5 : -0.5));
      d = n / dC10;
    }
    return d;
  }

  public void readFromFile(String fileName) throws IOException {

    BufferedReader in = new BufferedReader(new FileReader(fileName));

    String s = in.readLine();
    if (s == null)
      throw new IOException();
    StringTokenizer st = new StringTokenizer(s);
    questions = st.countTokens();
    int size = 1;
    while (in.readLine() != null) {
      size++;
    }

    in.close();
    students = size;

    ar = new int[students][questions];
    in = new BufferedReader(new FileReader(fileName));
    try {
      for (int i = 0; i < ar.length; i++) {
        s = in.readLine();
        st = new StringTokenizer(s);
        for (int j = 0; j < ar[i].length; j++) {
          ar[i][j] = Integer.parseInt(st.nextToken());
        }
      }

      in.close();

      ticket = 0;
      for (int j = 0; j < ar[0].length; j++)
        if (ar[0][j] != 0)
          ticket++;
      for (int i = 0; i < ar.length; i++) {
        for (int j = 0; j < ar[i].length; j++) {
          System.out.printf("%3d", ar[i][j]);
        }
        System.out.println();
      }
      arrStudents = new Student[students];
      for (int i = 0; i < arrStudents.length; i++) {
        arrStudents[i] = new Student(i);
      }
      arrQuestions = new Question[questions];
      for (int i = 0; i < arrQuestions.length; i++) {
        arrQuestions[i] = new Question(i);
      }
    }
    catch (NumberFormatException e) {
      throw new IOException();
    }
  }

  public void calcMarks() {
    often = new int[ticket + 1];

    for (int i = 0; i < often.length; i++)
      often[i] = 0;

    for (int i = 0; i < students; i++)
      often[arrStudents[i].mark]++;
  }

  private void initialize() {

  }

  public int max() {
    int max = often[0];
    for (int i = 0; i < often.length; i++) {
      if (often[i] > max)
        max = often[i];
    }
    return max;
  }

  /**
 * @return  Returns the from.
 * @uml.property  name="from"
 */
public double getFrom() {
    return from;
  }

  /**
 * @param from  The from to set.
 * @uml.property  name="from"
 */
public void setFrom(double from) {
    this.from = from;
    initialize();
  }

  /**
 * @return  Returns the to.
 * @uml.property  name="to"
 */
public double getTo() {
    return to;
  }

  /**
 * @param to  The to to set.
 * @uml.property  name="to"
 */
public void setTo(double to) {
    this.to = to;
    initialize();
  }

  public void fileCount(PrintWriter out, String name) {
    out.println("<table border = '1'>");
    out.println("<tr><td>Количество студентов</td><td>" + students + "</td></tr>");
    out
        .println("<tr><td>Количество вопросов в базе вопросов по данному тесту</td><td>"
            + questions + "</td></tr>");
    /*out.println("<tr><td>Количество вопросов в билете</td><td>" + ticket
        + "</td></tr>");*/
    out.println("<tr><td>Количество типов оценок</td><td>" + often.length
        + "</td></tr>");
    out.println("</table>");
    out.println("<h3>Оценки студентов:</h3>");
    for (int j = 0; j < (students + 1) / 20; j++) {
      out.println("<table border = '1'>");
      out.println("<tr>");
      for (int i = 0; i < 20; i++)
        out.print("<th width = 30 align = 'center'>" + (j * 20 + i + 1) + "</th>");
      out.println("</tr><tr>");
      for (int i = 0; i < 20; i++)
        out.print("<td align = 'center'>" + arrStudents[j * 20 + i].mark + "</td>");
      out.println("</tr>");
      out.println("</table>");
      out.println("<br/>");
    }
    out.println("<table border = '1'>");
    out.println("<tr>");
    for (int i = students - (students % 20); i < students; i++)
      out.print("<th width = 30 align = 'center'>" + i + "</th>");
    out.println("</tr><tr>");
    for (int i = students - (students % 20); i < students; i++)
      out.print("<td align = 'center'>" + arrStudents[i].mark + "</td>");
    out.println("</tr>");
    out.println("</table>");
    out.println("<br/>");
    out.println(" <h3>Частоты тестовых баллов:</h3>");
    //int k = 0;
    for (int j = 0; j < (often.length + 1) / 20; j++) {
      out.println("<table border = '1'>");
      out.println("<tr>");
      for (int i = 0; i < 20; i++)
        out.println("<th width = 30 align = 'center'>" + (j * 20 + i) + "</th>");
      out.println("</tr><tr>");
      for (int i = 0; i < 20; i++)
        out.println("<td align = 'center'>" + often[j * 20 + i] + "</td>");
      out.println("</tr>");
      out.println("</table>");
      out.println("<br>");
    }
    out.println("<table border = '1'>");
    out.println("<tr>");
    for (int i = often.length - (often.length % 20); i < often.length; i++)
      out.print("<th width = 30 align = 'center'>" + i + "</th>");
    out.println("</tr><tr>");
    for (int i = often.length - (often.length % 20); i < often.length; i++)
      out.print("<td align = 'center'>" + often[i] + "</td>");
    out.println("</tr>");
    out.println("</table>");
    out.println("<br/>");
    out.println("<h3>Средний балл, полученный по каждому вопросу:</h3> ");
    for (int j = 0; j < (questions + 1) / 10; j++) {
      out.println("<table border = '1'>");
      out.println("<tr>");
      for (int i = 0; i < 10; i++)
        out.println("<th width = 90 align = 'center'>" + (j * 10 + i + 1) + "</th>");
      out.println("</tr><tr>");
      for (int i = 0; i < 10; i++)
        out.println("<td align = 'center'>" + round(arrQuestions[j * 10 + i].p, 5)
            + "</td>");
      out.println("</tr>");
      out.println("</table>");
      out.println("<br/>");
    }
    out.println("<table border = '1'>");
    out.println("<tr>");
    for (int i = questions - (questions % 10); i < questions; i++)
      out.print("<th width = 90 align = 'center'>" + i + "</th>");
    out.println("</tr><tr>");
    for (int i = questions - (questions % 10); i < questions; i++)
      out.print("<td align = 'center'>" + round(arrQuestions[i].p, 5) + "</td>");
    out.println("</tr>");
    out.println("</table>");
    out.println("<br/>");
    double averageMark = 0;
    for (int i = 0; i < students; i++) {
      averageMark += arrStudents[i].getMark();
    }
    averageMark /= students;
    double moda[] = null;
    int max = often[0];
    int k = 0;
    for (int i = 0; i < often.length; i++) {
      if (often[i] > max) {
        max = often[i];
        k = i;
      }
    }
    int rk = 0;
    int r0 = 0;
    for (int i = 0; i < often.length; i++) {
      if (often[i] == max)
        rk++;
      if (often[i] == 0)
        r0++;
    }
    if (rk + r0 == often.length)
      moda = null;
    else {
      if (rk == 1) {
        moda = new double[1];
        moda[0] = k;
      }
      if (rk > 1) {
        boolean b = true;
        int j = k;
        while (often[k] == max) {
          k++;
          if (k == often.length)
            break;
        }
        for (int i = k + 1; i < often.length; i++)
          if (often[i] == max)
            b = false;
        if (b) {
          moda = new double[1];
          moda[0] = ((double) (k - 1 + j)) / 2;
        }
        else {
          k = 0;
          moda = new double[rk];
          for (int i = j; i < often.length; i++)
            if (often[i] == max) {
              moda[k] = i;
              k++;
            }
        }
      }
    }

    double mediana = 0;
    int sum = 0;
    int l = 0;
    while (sum < students / 2) {
      sum += often[l];
      l++;
    }
    if (students % 2 == 1)
      mediana = l - 1;
    else if (students / 2 == sum - often[l - 1])
      mediana = l - 1.5;
    else
      mediana = l - 1;

    out.println("<h3>Меры центральной тенденции</h3>");
    out.println("<table border = '1'>");
    out.println("<tr><td>Мода </td><td>");
    if (moda == null)
      out.println("Мода отсутствует.");
    else
      for (int i = 0; i < moda.length; i++) {
        out.println(round(moda[i], 5) + ", ");
      }
    out.println("</td></tr>");
    out.println("<tr><td>Медиана </td><td>" + round(mediana, 5) + "</td></tr>");
    out.println("<tr><td>Среднее арифметическое </td><td>" + round(averageMark, 5)
        + "</td></tr>");
    out.println("</table>");
    out.println("<br>");
    out.println("<h3>Гистограмма частот тестовых баллов</h3>");
    out.println("<img src="+name+"1.png>");

    int se = 0;
    for (int i = 0; i < students; i++) {
      se += arrStudents[i].even;
    }

    int su = 0;
    for (int i = 0; i < students; i++) {
      su += arrStudents[i].uneven;
    }

    int se2 = 0;
    for (int i = 0; i < students; i++) {
      se2 += (arrStudents[i].even * arrStudents[i].even);
    }

    int su2 = 0;
    for (int i = 0; i < students; i++) {
      su2 += (arrStudents[i].uneven * arrStudents[i].uneven);
    }

    int seu = 0;
    for (int i = 0; i < students; i++) {
      seu += (arrStudents[i].even * arrStudents[i].uneven);
    }
    out
        .println("<h3>Oценкa надежности теста по двум половинам расщепленного теста</h3> ");
    out.println("<table border = '1'>");
    out
        .println("<tr><th>№ студента</th><th>Инд. балл<br>по нечетным заданиям</th><th>Инд. балл<br>по четным заданиям</th><th>X*Y</th><th>X*X</th><th>Y*Y</th></tr>");

    for (int i = 0; i < students; i++) {
      out.println("<tr><td>" + (i + 1) + "</td><td>" + arrStudents[i].uneven
          + "</td><td>" + arrStudents[i].even + "</td><td>" + arrStudents[i].even
          * arrStudents[i].uneven + "</td><td>" + arrStudents[i].even
          * arrStudents[i].even + "</td><td>" + arrStudents[i].uneven
          * arrStudents[i].uneven + "</td></tr>");
    }
    out.println("</tr>");
    out.println("<tr><td>сумма:</td><td>" + su + "</td><td>" + se + "</td><td>"
        + seu + "</td><td>" + se2 + "</td><td>" + su2 + "</td></tr>");
    out.println("</table>");

    out.println("<br/>");
    out.println("<table border = '1'><tr>");
    out
        .println("<th>№ задания</th><th>Доля правильных ответов p<sub>j</sub></th><th>Доля неправильных ответов q<sub>j</sub></th><th>Bариация тестовых баллов p<sub>j</sub>q<sub>j</sub></th></tr>");
    for (int i = 0; i < questions; i++) {
      out.println("<tr><td>" + i + "</td><td>" + round(arrQuestions[i].p, 5)
          + "</td><td>" + round((1 - arrQuestions[i].p), 5) + "</td><td>"
          + round(arrQuestions[i].p * (1 - arrQuestions[i].p), 5) + "</td></tr>");
    }
    out.println("</table>");

    double sumMarks = 0;
    double sumMarks2 = 0;
    for (int i = 0; i < students; i++)
      sumMarks += arrStudents[i].mark;

    for (int i = 0; i < students; i++)
      sumMarks2 += (arrStudents[i].mark * arrStudents[i].mark);
    double ds = 0;
    if (students > 1)
      ds = (sumMarks2 - sumMarks * sumMarks / (double) students) / (students - 1);

    out.println("<br/>");

    out.println("<h3>Графическая интерпретация надежности теста</h3>");
    out.println("<img src="+name+"2.png>");

    out.println("<br/>");
    out.println("<br/>");
    out.println("<table border = '1'>");
    out.println("<tr><td>Дисперсия </td><td>" + round(ds, 5) + "</td></tr>");
    if (ds >= 0)
      out.println("<tr><td>Стандартное отклонение</td><td>"
          + round(Math.sqrt(ds), 5) + "</td></tr>");
    double sum_pq = 0;
    for (int i = 0; i < questions; i++) {
      sum_pq += (arrQuestions[i].p * (1 - arrQuestions[i].p));
    }
    double pirson = 0;
    double spirman_brown = 0;
    if ((se2 - se * se / students) * (su2 - su * su / students) != 0) {
      pirson = ((double) seu - se * su / students)
          / Math.sqrt((se2 - se * se / students) * (su2 - su * su / students));
      spirman_brown = 2 * pirson / (1 + pirson);

      out.println("<tr><td>Коэффициент корреляции Пирсона: </td><td>"
          + round(pirson, 5) + "</td></tr>");

      out.println();
      out
          .println("<tr><td>Надежность теста по двум половинам расщепленного теста (по формуле Спирмена-Брауна): </td><td>"
              + round(spirman_brown, 5) + "</td></tr>");
    }
    double kr20 = 0;
    if (questions > 1 && ds > 0) {
      kr20 = (questions / (questions - 1)) * (1 - sum_pq / ds);

      out.println("<tr><td>Коэффициент KR-20: </td><td>" + round(kr20, 5)
          + "</td></tr>");
    }
    out.println("</table>");
    out.println("<br/>");
    out.println("<table border = '1'>");
    if (pirson != 0) {
      out.println("<tr><td>Оценка теста по критерию Пирсона: </td>");
      if (pirson >= 0.9 && pirson <= 1) {
        out.println("<td>Tест имеет отличную оценку надежности</td></tr>");
      }
      if (pirson >= 0.8 && pirson < 0.9) {
        out.println("<td>Tест имеет хорошую оценку надежности</td></tr>");
      }
      if (pirson >= 0.7 && pirson < 0.8) {
        out
            .println("<td>Tест имеет удовлетворительную оценку надежности </td></tr>");
      }
      if (pirson < 0.7) {
        out
            .println("<td>Tест имеет неудовлетворительную оценку надежности </td></tr>");
      }
    }
    else
      out.println("<tr><td>Коэффициент Пирсона не расчитывается</td></tr>");
    if (spirman_brown != 0) {
      out.println("<tr><td>Оценка теста по критерию Спирмена-Брауна: </td>");
      if (spirman_brown >= 0.9 && spirman_brown <= 1) {
        out.println("<td>Tест имеет отличную оценку надежности </td></tr>");
      }
      if (spirman_brown >= 0.8 && spirman_brown < 0.9) {
        out.println("<td>Tест имеет хорошую оценку надежности </td></tr>");
      }
      if (spirman_brown >= 0.7 && spirman_brown < 0.8) {
        out
            .println("<td>Tест имеет удовлетворительную оценку надежности </td></tr>");
      }
      if (spirman_brown < 0.7) {
        out
            .println("<td>Tест имеет неудовлетворительную оценку надежности </td></tr>");
      }
    }
    else
      out.println("<tr><td>Критерий Спирмена-Брауна не расчитывается</td></tr>");
    if (spirman_brown != 0) {
      out.println("<tr><td>Оценка теста по критерию KR-20: </td>");
      if (kr20 >= 0.9 && kr20 <= 1) {
        out.println("<td>Tест имеет отличную оценку надежности </td></tr>");
      }
      if (kr20 >= 0.8 && kr20 < 0.9) {
        out.println("<td>Tест имеет хорошую оценку надежности </td></tr>");
      }
      if (kr20 >= 0.7 && kr20 < 0.8) {
        out
            .println("<td>Tест имеет удовлетворительную оценку надежности </td></tr>");
      }
      if (kr20 < 0.7) {
        out
            .println("<td>Tест имеет неудовлетворительную оценку надежности </td></tr>");
      }
    }
    else
      out.println("<tr><td>Критерий KR-20 не расчитывается</td></tr>");
    out.println("</table>");
    out.println("<br/>");

    if (kr20 != 0) {
      out.println("<table border = '1'>");
      out
          .println("<tr><td>Cтандартное отклонение индивидуальных баллов в тесте:</td><td>"
              + round(Math.sqrt(ds), 5) + "</td>");
      double de = Math.sqrt(ds) * Math.sqrt(1 - kr20);
      out
          .println("<tr><td>Oценкa стандартной ошибки индивидуального балла студента:</td><td>"
              + round(de, 5) + "<br/>");
      out.println("где надежность теста - KR-20</td></tr>");
      out.println("</table>");
    }
    else
      out
          .println("<tr><td>Cтандартное отклонение индивидуальных баллов в тесте и  оценкa стандартной ошибки индивидуального балла студента не расчитываются</td></tr>");
    out.println("<h3>Оценка надежности критериально-ориентированного теста</h3> ");
    double a = 0;
    double b = 0;
    double c = 0;
    double d = 0;
    for (int i = 0; i < students; i++) {
      if (arrStudents[i].even < ticket / 4 && arrStudents[i].uneven < ticket / 4)
        a++;
      if (arrStudents[i].even < ticket / 4 && arrStudents[i].uneven >= ticket / 4)
        b++;
      if (arrStudents[i].even >= ticket / 4 && arrStudents[i].uneven < ticket / 4)
        c++;
      if (arrStudents[i].even >= ticket / 4 && arrStudents[i].uneven >= ticket / 4)
        d++;
    }
    a /= students;
    b /= students;
    c /= students;
    d /= students;
    out.println("<p>Tаблица сопряжения '2х2'</p>");
    out.println("<table border = '1'>");
    out.println("<tr><th>X\\Y</th><th>Незачет</th><th>Зачет</th><tr>");
    out.println("<tr><th>Незачет</th><td>a = " + round(a, 5) + "</td><td>b = "
        + round(b, 5) + "</td></tr>");
    out.println("<tr><th>Зачет</th><td>c = " + round(c, 5) + "</td><td>d = "
        + round(d, 5) + "</td></tr>");
    out.println("</table>");
    double rf = 0;
    rf = (a + c) * (b + d) * (a + b) * (c + d);
    if (rf > 0)
      rf = (a * d - b * c) / Math.sqrt(rf);
    double rtet = 0;
    if (b * c != 0)
      if ((a * d) / (b * c) > 0)
        if (1 + Math.sqrt((a * d) / (b * c)) != 0)
          rtet = Math.cos(Math.PI / (1 + Math.sqrt((a * d) / (b * c))));
    double p = a + d;
    double pc = (c + d) * (b + d) + (a + b) * (a + c);
    double kkappa = (p - pc) / (1 - pc);

    double dse = 0;
    double koef = 0;
    if (kr20 > 0)
      koef = kr20;
    else if (spirman_brown > 0)
      koef = spirman_brown;
    else if (pirson > 0)
      koef = pirson;

    if (pirson != 0 && (1 - koef) >= 0 && ds >= 0)
      dse = Math.sqrt(ds) * Math.sqrt(1 - koef);
    out.println("<br>");
    out.println("<table border = '1'>");
    out.println("<tr><td>Kоэффициент корреляции R<sub>f</sub></td><td>"
        + round(rf, 5) + "</td><tr>");
    out.println("<tr><td>Kоэффициент корреляции R<sub>tet</sub></td><td>"
        + round(rtet, 5) + "</td></tr>");
    out.println("<tr><td>Bероятность принятия согласованного решения P</td><td>"
        + round(p, 5) + "</td></tr>");
    out
        .println("<tr><td>Bероятность случайного<br>принятия согласованного решения P<sub>c</sub></td><td>"
            + round(pc, 5) + "</td></tr>");
    if (pc != 1)
      out.println("<tr><td>Kоэффициент каппа K<sub>ae</sub></td><td>"
          + round(kkappa, 5) + "</td></tr>");
    else
      out
          .println("<tr><td>Kоэффициент каппа K<sub>ae</sub> не расчитывается</td><td></td></tr>");
    if (pirson != 0 && (1 - koef) >= 0 && ds >= 0)
      out.println("<tr><td>Стандартная ошибка тестовых измерений</td><td>"
          + round(dse, 5) + "</td></tr>");
    else
      out
          .println("<tr><td>Стандартная ошибка тестовых измерений не расчитывается</td><td></td></tr>");
    out.println("</table>");
    int[] power = new int[questions];
    int[] not_power = new int[questions];
    double[] id = new double[questions];
    int[] sort = new int[students];
    for (int i = 0; i < students; i++) {
      sort[i] = i;
      for (int j = i + 1; j < students; j++)
        if (arrStudents[j].mark < arrStudents[sort[i]].mark)
          sort[i] = j;
    }
    for (int i = 0; i < questions; i++) {
      not_power[i] = 0;
      power[i] = 0;
      for (int j = 0; j < students / 3; j++) {
        not_power[i] += (ar[sort[j]][i]);
        power[i] += (ar[sort[j + (students * 2 / 3)]][i]);
      }
      id[i] = (power[i] - not_power[i]) / students;
    }
    double x1[] = new double[questions];
    double x0[] = new double[questions];
    double rpb[] = new double[questions];
    for (int n = 0; n < questions; n++) {
      x1[n] = 0;
      x0[n] = 0;
      rpb[n] = 0;
    }
    double x1Av = 0;
    double x0Av = 0;

    for (int i = 0; i < questions; i++) {
      int n1 = 0;
      int n0 = 0;
      for (int j = 0; j < students; j++) {
        if (ar[j][i] == 1) {
          x1[i] += arrStudents[j].getMark();
          n1++;
        }
        if (ar[j][i] == -1) {
          x0[i] += arrStudents[j].getMark();
          n0++;
        }
      }
      if (n0 > 0)
        x0Av = x0[i] / (double) n0;
      if (n1 > 0)
        x1Av = x1[i] / (double) n1;
      if ((n1 == 0) || (n0 == 0))
        rpb[i] = 0;
      else {
        if (ds > 0)
          rpb[i] = ((x1Av - x0Av) / Math.sqrt(ds))
              * Math.sqrt(n1 * n0 / (double) ((n1 + n0) * (n1 + n0 - 1)));
      }
    }
    double[][] pmk = new double[questions][questions];
    for (int i = 0; i < questions; i++) {
      for (int j = 0; j < questions; j++) {
        pmk[i][j] = 0;
      }
    }
    for (int i = 0; i < questions; i++) {
      for (int j = 0; j < questions; j++) {
        for (int index = 0; index < students; index++) {
          if (ar[index][i] == 1 && ar[index][j] == 1) {
            pmk[i][j]++;
          }

        }
      }
    }
    for (int i = 0; i < questions; i++) {
      for (int j = 0; j < questions; j++) {
        pmk[i][j] /= students;
      }
    }
    double[][] fi = new double[questions][questions];
    for (int i = 0; i < questions; i++) {
      for (int j = 0; j < questions; j++) {
        fi[i][j] = 0;
      }
    }
   // boolean fi_0[] = false;
    for (int i = 0; i < questions; i++) {
      for (int j = 0; j < questions; j++) {
        fi[i][j] = (pmk[i][j] - arrQuestions[i].p * arrQuestions[j].p);
        if (arrQuestions[i].p * arrQuestions[j].p * (1 - arrQuestions[i].p)
            * (1 - arrQuestions[j].p) > 0) 
          fi[i][j] /= Math.sqrt(arrQuestions[i].p * arrQuestions[j].p
              * (1 - arrQuestions[i].p) * (1 - arrQuestions[j].p));
        else  fi[i][j]=-100;
          
       
      }
    }
    out.println("<br/>");
    out.println("<h3>Корреляционная матрица тестовых заданий</h3>");
    out.println("<table border = '1'>");
    out.println("<tr><td>i/j</td>");
    for (int j = 0; j < questions; j++)
      out.println("<td align = 'center'>" + j + "</td>");
    out.println("</tr>");
    for (int i = 0; i < questions; i++)
    {
      out.println("<tr>");
      out.println("<td align = 'center'>" + i + "</td>");
      for (int j = 0; j < questions; j++)
      {
        if(fi[i][j]!=-100)
        out.println("<td align = 'center'>" + round(fi[i][j], 5) + "</td>");
        else out.println("<td align = 'center'>не корр.</td>");
      }
      out.println("</tr>");
    }
    out.println("</table>");
    out.println("<br/>");
    boolean fi_small = false;
    for (int i = 0; i < questions; i++)
      for (int j = 0; j < questions; j++)
      {
        if (fi[i][j] > 0.3)
        fi_small = true;
      }
    if (fi_small)
    {
      out.println("Связь между следующими вопросами слишком сильная: <br>");
      for (int i = 0; i < questions; i++)
        for (int j = i + 1; j < questions; j++)
        {
          if (fi[i][j] > 0.35)
          out.println(i + ", " + j + "<br>");
        }
    }
    boolean fi_ = false;
    for (int i = 0; i < questions; i++)
      for (int j = 0; j < questions; j++) {
        if (fi[i][j] < 0 && fi[i][j] >-100)
          fi_ = true;
      }
    if (fi_)
    {
      out.println("Наблюдается отрицательная корреляция между следующими вопросами:<br>");
      for (int i = 0; i < questions; i++)
        for (int j = i + 1; j < questions; j++)
        {
          if (fi[i][j] < 0 && fi[i][j] >-100)
            out.println(i + ", " + j + "<br>");
        }
    }
    if (ds != 0)
    {
      out.println("<h3>Tочечный бисериальный коэффициент корреляции по каждому вопросу</h3>");
      for (int j = 0; j < (questions + 1) / 10; j++) {
        out.println("<table border = '1'>");
        out.println("<tr>");
        for (int i = 0; i < 10; i++)
          out.println("<th width = 90 align = 'center'>" + (j * 10 + i) + "</th>");
        out.println("</tr><tr>");
        for (int i = 0; i < 10; i++) {
          if (rpb[j * 10 + i] == 0)
            out.println("<td align = 'center'>не корр.</td>");
          else
            out.println("<td align = 'center'>" + round(rpb[j * 10 + i], 5)
                + "</td>");
        }
        out.println("</tr>");
        out.println("</table>");
        out.println("<br/>");
      }
      out.println("<table border = '1'>");
      out.println("<tr>");
      for (int i = questions - (questions % 10); i < questions; i++)
        out.print("<th width = 90 align = 'center'>" + i + "</th>");
      out.println("</tr><tr>");
      for (int i = questions - (questions % 10); i < questions; i++) {
        if (rpb[i] == 0)
          out.println("<td align = 'center'>не корр.</td>");
        else
          out.print("<td align = 'center'>" + round(rpb[i], 5) + "</td>");
      }
      out.println("</tr>");
      out.println("</table>");
      out.println("<br/>");
      boolean rpb_small = false;
      for (int i = 0; i < rpb.length; i++) {
        if (rpb[i] < 0.5)
          rpb_small = true;
      }
      if (rpb_small) {
        out.println("Kорреляция результатов по заданию и индивидуальными баллами недостаточно"
          +	" высока:<br>");
        for (int i = 0; i < rpb.length; i++) {
          if (rpb[i] < 0.5)
            out.println(i + "<br>");
        }
      }
    }
    else
      out.println("Tочечный бисериальный коэффициент корреляции по каждому вопросу не" +
        " расчитывается");
    double dser=0;
    if (ds>=0 && spirman_brown<=1)
      dser=Math.sqrt(ds)*Math.sqrt(1-spirman_brown);
    out.println("Стандартная ошибка измерения: "+round(dser, 5));
    double sigmax =0;
    sigmax = 1.96*dser;
    out.println("<br>Половина доверительного интервала: "+round(sigmax, 5));
    out.println("<h3>Границы тестового балла студентов:</h3>");
    out.println("<table border = '1'><tr><th>?</th><th>Наблюдаемая оценка</th><th>Нижняя" +
      " граница</th><th>Верхняя граница" +  "</th></tr>");
    for (int i = 0; i < students; i++)
      out.print("<tr><td align = 'center'>" + (i + 1) + "</td><td>"+ arrStudents[i].mark +
      "</td><td>" + round((arrStudents[i].mark - sigmax), 5)+"</td><td>"+ round((
      arrStudents[i].mark + sigmax), 5)+ "</td></tr>");
    out.println("</table>");
    out.println("<br/>");
    if (kr20 < 0.7)
      out.println("<b>Рекомендованный коэффициент увеличения длины теста</b> <br/>" +
        "(для достижения удовлетворительной оценки надежности по формуле KR-20): " 
        + round((0.7 * (1 - kr20) / kr20 / 0.3), 2) );
  }
  

  void writeToFile(String fileName, String loc) throws IOException
  {
    PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileName),
      "Windows-1251"));
    out.println("<html><head><title>Результаты анализа качества педагогических тестов" +
      "</title>");
    out.println("<meta http-equiv='Content-Type' content='text/html'; charset=" +
      "'Windows-1251'>");
    out.println("</head><body>");
    out.println("<h2>Результаты вычислений:</h2>");
    fileCount(out, loc);
    out.println("</body></html>");
    out.close();
  }

  public static void main(String[] args)
  {
    MyFunc func = new MyFunc();
    func.setCount(9);
    func.setFrom(0);
    func.setTo(4);
  }

  /**
 * @return  Returns the ticket.
 * @uml.property  name="ticket"
 */
public int getTicket() {
    return ticket;
  }

  /**
 * @param ticket  The ticket to set.
 * @uml.property  name="ticket"
 */
public void setTicket(int ticket) {
    this.ticket = ticket;
  }

  /**
 * @return  Returns the fileName.
 * @uml.property  name="fileName"
 */
public String getFileName() {
    return fileName;
  }

  /**
 * @param fileName  The fileName to set.
 * @uml.property  name="fileName"
 */
public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
 * @return  Returns the fileIsOpen.
 * @uml.property  name="fileIsOpen"
 */
public boolean isFileIsOpen() {
    return fileIsOpen;
  }

  /**
 * @param fileIsOpen  The fileIsOpen to set.
 * @uml.property  name="fileIsOpen"
 */
public void setFileIsOpen(boolean fileIsOpen) {
    this.fileIsOpen = fileIsOpen;
  }

  /**
 * @return  Returns the students.
 * @uml.property  name="students"
 */
public int getStudents() {
    return students;
  }

  /**
 * @param students  The students to set.
 * @uml.property  name="students"
 */
public void setStudents(int students) {
    this.students = students;
  }

  /**
 * @return  Returns the questions.
 * @uml.property  name="questions"
 */
public int getQuestions() {
    return questions;
  }

  /**
 * @param questions  The questions to set.
 * @uml.property  name="questions"
 */
public void setQuestions(int questions) {
    this.questions = questions;
  }

  /**
 * @return  Returns the often.
 * @uml.property  name="often"
 */
public int[] getOften() {
    return often;
  }

  /**
 * @param often  The often to set.
 * @uml.property  name="often"
 */
public void setOften(int[] often) {
    this.often = often;
  }

  /**
 * @return  Returns the count.
 * @uml.property  name="count"
 */
public int getCount() {
    return count;
  }

  /**
 * @param count  The count to set.
 * @uml.property  name="count"
 */
public void setCount(int count) {
    this.count = count;
  }

  /**
 * @return  Returns the arrStudents.
 * @uml.property  name="arrStudents"
 */
public Student[] getArrStudents() {
    return arrStudents;
  }

  /**
 * @param arrStudents  The arrStudents to set.
 * @uml.property  name="arrStudents"
 */
public void setArrStudents(Student[] arrStudents) {
    this.arrStudents = arrStudents;
  }

public void setElement (int row, int col, int value)
{
  ar [row][col] = value; 
}

public int getElement (int row, int col)
{
  return ar [row][col]; 
}

public void newAr (int row, int col)
{
  ar = new int [row][col];
}

public void setMark (int i)
{
  arrStudents [i].mark = 0;
  for (int j = 0; j < questions; j++)
    if (ar [i][j] == 1)
      arrStudents [i].mark++;
}

public int getMarkStudent (int i)
{
  return arrStudents[i].getMark();
}

public void setStudent (int i)
{
  arrStudents[i] = new Student();
}

public void initStudents ()
{
  arrStudents = new Student [students];
}

public void initData()
{
  ticket = 0;
  for (int j = 0; j < ar[0].length; j++)
    if (ar[0][j] != 0)
      ticket++;
  for (int i = 0; i < ar.length; i++) {
    for (int j = 0; j < ar[i].length; j++) {
      System.out.printf("%3d", ar[i][j]);
    }
    System.out.println();
  }
  arrStudents = new Student[students];
  for (int i = 0; i < arrStudents.length; i++) {
    arrStudents[i] = new Student(i);
  }
  arrQuestions = new Question[questions];
  for (int i = 0; i < arrQuestions.length; i++) {
    arrQuestions[i] = new Question(i);
  }
}

}