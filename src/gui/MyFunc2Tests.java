package gui;

import java.io.*;
import java.util.StringTokenizer;

public class MyFunc2Tests {
  private String   fileName1   = "";
  private String   fileName2   = "";
  private boolean  file1IsOpen = false;
  private boolean  file2IsOpen = false;
  private int[][]  ar1         = null;
  private int[][]  ar2         = null;
  private int      questions   = 48;
  private int      students    = 51;
  private int      ticket1     = 0;
  private int      ticket2     = 0;
  private int      count       = 0;

  /**
 * @uml.property  name="arrStudents"
 * @uml.associationEnd  multiplicity="(0 -1)"
 */

  /**
 * @uml.property  name="arrQuestions"
 * @uml.associationEnd  multiplicity="(0 -1)"
 */
  private Question arrQuestions[];
  /**
 * @uml.property  name="arrStudents"
 * @uml.associationEnd  multiplicity="(0 -1)"
 */
private Student  arrStudents[];
/**
 */

  public class Question {
    int    number;
    double p = 0;
    public Question(int n) {
      int r = 0;
      int trial = 0;
      number = n;
      for (int i = 0; i < students; i++) {
        if (ar1[i][number] == 1)
          r++;
      }
      for (int i = 0; i < students; i++) {
        if (ar1[i][number] == 1 || ar1[i][number] == -1)
          trial++;
      }
      p = ((double) r) / trial;
    }
  }
  
  

/**
 * @author   Alex
 */
public class Student {
  /**
 * @uml.property  name="number"
 */
int number;
  int arrQuestions1[];
  int arrQuestions2[];
  int arrAnswers1[];
  int arrAnswers2[];
  int mark1;
  int mark2;
  Student(int number, int[] arrQuestions1, int[] arrQuestions2, int[] arrAnswers1, int[] arrAnswers2) 
  {
    this.number = number;
    this.arrQuestions1 = arrQuestions1;
    this.arrQuestions2 = arrQuestions2;
    this.arrAnswers1 = arrAnswers1;
    this.arrAnswers2 = arrAnswers2;
  }
  public Student()
  {
    number = 0;
    arrQuestions1 = null;
    arrQuestions2 = null;
    arrAnswers1 = null;
    arrAnswers2 = null;
    mark1 = 0;
    mark2 = 0;
  }
  public Student(int n)
  {
    number = n;
    arrQuestions1 = new int[ticket1];
    arrQuestions2 = new int[ticket2];
    arrAnswers1 = new int[ticket1];
    arrAnswers2 = new int[ticket2];
    mark1 = 0;
    mark2 = 0;
    int j = 0;
    if (ar1 != null)
    {
      for (int i = 0; i < ar1[0].length; i++) {
        if (ar1[number][i] != 0) {
          arrQuestions1[j] = i;
          arrAnswers1[j] = ar1[number][i];
          j++;
        }
      }
    }
    if (ar2 != null)
    {
      j = 0;
      for (int i = 0; i < ar2[0].length; i++) {
        if (ar2[number][i] != 0) {
          arrQuestions2[j] = i;
          arrAnswers2[j] = ar2[number][i];
          j++;
        }
      }
    }
    for (int i = 0; i < arrQuestions1.length; i++)
      if (arrAnswers1[i] == 1)
        mark1++;
    for (int i = 0; i < arrQuestions2.length; i++)
      if (arrAnswers2[i] == 1)
        mark2++;
  }
  
  /**
 * @return  Returns the mark1.
 * @uml.property  name="mark1"
 */
public int getMark1() {
    return mark1;
  }
  
  /**
 * @return  Returns the mark2.
 * @uml.property  name="mark2"
 */
public int getMark2() {
    return mark2;
  }

  /**
 * @param mark  The mark to set.
 * @uml.property  name="mark"
 */
  public void setMark1(int mark1) {
    this.mark1 = mark1;
  }
  
  /**
 * @param mark2  The mark2 to set.
 * @uml.property  name="mark2"
 */
public void setMark2(int mark2) {
    this.mark2 = mark2;
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
 * @return  Returns the arrAnswers1.
 * @uml.property  name="arrAnswers1"
 */
public int[] getArrAnswers1() {
    return arrAnswers1;
  }
  
  /**
 * @return  Returns the arrAnswers2.
 * @uml.property  name="arrAnswers2"
 */
public int[] getArrAnswers2() {
    return arrAnswers2;
  }

  /**
 * @param arrAnswers  The arrAnswers to set.
 * @uml.property  name="arrAnswers"
 */
  public void setArrAnswers1(int[] arrAnswers1) {
    this.arrAnswers1 = arrAnswers1;
  }
  
  /**
 * @param arrAnswers2  The arrAnswers2 to set.
 * @uml.property  name="arrAnswers2"
 */
public void setArrAnswers2(int[] arrAnswers2) {
    this.arrAnswers2 = arrAnswers2;
  }

  /**
 * @return  Returns the arrQuestions.
 * @uml.property  name="arrQuestions"
 */
  public int[] getArrQuestions1() {
    return arrQuestions1;
  }
  
  /**
 * @return  Returns the arrQuestions2.
 * @uml.property  name="arrQuestions2"
 */
public int[] getArrQuestions2() {
    return arrQuestions2;
  }

  /**
 * @param arrQuestions  The arrQuestions to set.
 * @uml.property  name="arrQuestions"
 */
  public void setArrQuestions1(int[] arrQuestions1) {
    this.arrQuestions1 = arrQuestions1;
  }
  
  /**
 * @param arrQuestions2  The arrQuestions2 to set.
 * @uml.property  name="arrQuestions2"
 */
public void setArrQuestions2(int[] arrQuestions2) {
    this.arrQuestions2 = arrQuestions2;
  }
}

/**
 * @return  Returns the ar1.
 * @uml.property  name="ar1"
 */
public int[][] getAr1() {
  return ar1;
}

/**
 * @return  Returns the ar2.
 * @uml.property  name="ar2"
 */
public int[][] getAr2() {
  return ar2;
}

/**
 * @return  Returns the arrQuestions.
 * @uml.property  name="arrQuestions"
 */
public Question[] getArrQuestions() {
  return arrQuestions;
}

/**
 * @return  Returns the arrStudents.
 * @uml.property  name="arrStudents"
 */
public Student[] getArrStudents() {
  return arrStudents;
}

/**
 * @return  Returns the count.
 * @uml.property  name="count"
 */
public int getCount() {
  return count;
}

/**
 * @return  Returns the file1IsOpen.
 * @uml.property  name="file1IsOpen"
 */
public boolean isFile1IsOpen() {
  return file1IsOpen;
}

/**
 * @return  Returns the file2IsOpen.
 * @uml.property  name="file2IsOpen"
 */
public boolean isFile2IsOpen() {
  return file2IsOpen;
}

/**
 * @return  Returns the questions.
 * @uml.property  name="questions"
 */
public int getQuestions() {
  return questions;
}

/**
 * @return  Returns the students.
 * @uml.property  name="students"
 */
public int getStudents() {
  return students;
}

/**
 * @return  Returns the ticket1.
 * @uml.property  name="ticket1"
 */
public int getTicket1() {
  return ticket1;
}

/**
 * @return  Returns the ticket2.
 * @uml.property  name="ticket2"
 */
public int getTicket2() {
  return ticket2;
}

/**
 * @param ar1  The ar1 to set.
 * @uml.property  name="ar1"
 */
public void setAr1(int[][] ar1) {
  this.ar1 = ar1;
}

/**
 * @param ar2  The ar2 to set.
 * @uml.property  name="ar2"
 */
public void setAr2(int[][] ar2) {
  this.ar2 = ar2;
}

/**
 * @param arrQuestions  The arrQuestions to set.
 * @uml.property  name="arrQuestions"
 */
public void setArrQuestions(Question[] arrQuestions) {
  this.arrQuestions = arrQuestions;
}


/**
 * @param arrStudents  The arrStudents to set.
 * @uml.property  name="arrStudents"
 */
public void setArrStudents(Student[] arrStudents) {
  this.arrStudents = arrStudents;
}

/**
 * @param count  The count to set.
 * @uml.property  name="count"
 */
public void setCount(int count) {
  this.count = count;
}

/**
 * @param file1IsOpen  The file1IsOpen to set.
 * @uml.property  name="file1IsOpen"
 */
public void setFile1IsOpen(boolean file1IsOpen) {
  this.file1IsOpen = file1IsOpen;
}

/**
 * @param file2IsOpen  The file2IsOpen to set.
 * @uml.property  name="file2IsOpen"
 */
public void setFile2IsOpen(boolean file2IsOpen) {
  this.file2IsOpen = file2IsOpen;
}

/**
 * @param questions  The questions to set.
 * @uml.property  name="questions"
 */
public void setQuestions(int questions) {
  this.questions = questions;
}

/**
 * @param students  The students to set.
 * @uml.property  name="students"
 */
public void setStudents(int students) {
  this.students = students;
}

/**
 * @param ticket1  The ticket1 to set.
 * @uml.property  name="ticket1"
 */
public void setTicket1(int ticket1) {
  this.ticket1 = ticket1;
}

/**
 * @param ticket2  The ticket2 to set.
 * @uml.property  name="ticket2"
 */
public void setTicket2(int ticket2) {
  this.ticket2 = ticket2;
}

public MyFunc2Tests() {
  initialize();
}

public void readFromFile1(String fileName) throws IOException {

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

  ar1 = new int[students][questions];
  in = new BufferedReader(new FileReader(fileName));
  try {
    for (int i = 0; i < ar1.length; i++) {
      s = in.readLine();
      st = new StringTokenizer(s);
      //st.countTokens();
      for (int j = 0; j < ar1[i].length; j++) {
        ar1[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    in.close();

    ticket1 = 0;
    for (int j = 0; j < ar1[0].length; j++)
      if (ar1[0][j] != 0)
        ticket1++;
    for (int i = 0; i < ar1.length; i++) {
      for (int j = 0; j < ar1[i].length; j++) {
        System.out.printf("%3d", ar1[i][j]);
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

public void readFromFile2(String fileName) throws IOException {

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

  ar2 = new int[students][questions];
  in = new BufferedReader(new FileReader(fileName));
  try {
    for (int i = 0; i < ar2.length; i++) {
      s = in.readLine();
      st = new StringTokenizer(s);
      //st.countTokens();
      for (int j = 0; j < ar2[i].length; j++) {
        ar2[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    in.close();

    ticket2 = 0;
    for (int j = 0; j < ar2[0].length; j++)
      if (ar2[0][j] != 0)
        ticket2++;
    for (int i = 0; i < ar2.length; i++) {
      for (int j = 0; j < ar2[i].length; j++) {
        System.out.printf("%3d", ar2[i][j]);
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

private void initialize() {

}

/**
 * @return  Returns the fileName1.
 * @uml.property  name="fileName1"
 */
public String getFileName1() {
  return fileName1;
}

/**
 * @return  Returns the fileName2.
 * @uml.property  name="fileName2"
 */
public String getFileName2() {
  return fileName2;
}

/**
* @param fileName  The fileName to set.
* @uml.property  name="fileName"
*/
public void setFileName1(String fileName1) {
  this.fileName1 = fileName1;
}

/**
 * @param fileName2  The fileName2 to set.
 * @uml.property  name="fileName2"
 */
public void setFileName2(String fileName2) {
  this.fileName2 = fileName2;
}

public void setElement1 (int student, int question, int value)
{
  ar1[student][question]=value;
}

public int getElement1 (int student, int question)
{
  return ar1[student][question];
}

public void setElement2 (int student, int question, int value)
{
  ar2[student][question]=value;
}

public int getElement2 (int student, int question)
{
  return ar2[student][question];
}

public void newAr1 (int students, int questions)
{
  ar1 = new int[students][questions];
}

public void newAr2 (int students, int questions)
{
  ar2 = new int[students][questions];
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

public void fileCount(PrintWriter out, String name) {
  out.println("<table border = '1'>");
  out.println("<tr><td>Количество студентов</td><td>" + students + "</td></tr>");
  out
      .println("<tr><td>Количество вопросов в базе вопросов по данному тесту</td><td>"
          + questions + "</td></tr>");
  /*out.println("<tr><td>Количество вопросов в билете</td><td>" + ticket1
      + "</td></tr>");*/
  out.println("<tr><td>Количество типов оценок</td><td>" + (questions + 1)
      + "</td></tr>");
  out.println("</table>");
  
  int s1 = 0;
  for (int i = 0; i < students; i++) {
    s1 += arrStudents[i].mark1;
  }

  int s2 = 0;
  for (int i = 0; i < students; i++) {
    s2 += arrStudents[i].mark2;
  }

  int s11 = 0;
  for (int i = 0; i < students; i++) {
    s11 += (arrStudents[i].mark1 * arrStudents[i].mark1);
  }
  
  int s22 = 0;
  for (int i = 0; i < students; i++) {
    s22 += (arrStudents[i].mark2 * arrStudents[i].mark2);
  }

  int s12 = 0;
  for (int i = 0; i < students; i++) {
    s12 += (arrStudents[i].mark1 * arrStudents[i].mark2);
  }
  out
      .println("<h3>Oценкa надежности паралеллельных форм теста</h3> ");
  out.println("<table border = '1'>");
  out
      .println("<tr><th>№ студента</th><th>Инд. балл<br>по первому тесту</th><th>Инд. балл<br>по второму тесту</th><th>X*Y</th><th>X*X</th><th>Y*Y</th></tr>");

  for (int i = 0; i < students; i++) {
    out.println("<tr><td>" + (i + 1) + "</td><td>" + arrStudents[i].mark1
        + "</td><td>" + arrStudents[i].mark2 + "</td><td>" + arrStudents[i].mark1
        * arrStudents[i].mark2 + "</td><td>" + arrStudents[i].mark1
        * arrStudents[i].mark1 + "</td><td>" + arrStudents[i].mark2
        * arrStudents[i].mark2 + "</td></tr>");
  }
  out.println("</tr>");
  out.println("<tr><td>сумма:</td><td>" + s2 + "</td><td>" + s1 + "</td><td>"
      + s12 + "</td><td>" + s11 + "</td><td>" + s22 + "</td></tr>");
  out.println("</table>");

  out.println("<br/>");

  double sumMarks1 = 0;
  double sumMarks2 = 0;
  double sumMarks11 = 0;
  double sumMarks22 = 0;
  for (int i = 0; i < students; i++)
    sumMarks1 += arrStudents[i].mark1;
  for (int i = 0; i < students; i++)
    sumMarks2 += arrStudents[i].mark2;

  for (int i = 0; i < students; i++)
    sumMarks11 += (arrStudents[i].mark1 * arrStudents[i].mark1);
  for (int i = 0; i < students; i++)
    sumMarks22 += (arrStudents[i].mark2 * arrStudents[i].mark2);
  double ds1 = 0;
  double ds2 = 0;
  if (students > 1)
  {
    ds1 = (sumMarks11 - sumMarks1 * sumMarks1 / (double) students) / (students - 1);
    ds2 = (sumMarks22 - sumMarks2 * sumMarks2 / (double) students) / (students - 1);
  }

  out.println("<br/>");

  out.println("<h3>Графическая интерпретация надежности теста</h3>");
  out.println("<img src='"+name+"1.png'>");

  out.println("<br/>");
  out.println("<br/>");
  out.println("<table border = '1'>");
  
  double pirson = 0;
  if ((s11 - s1 * s1 / students) * (s22 - s2 * s2 / students) != 0) {
    pirson = ((double) s12 - s1 * s2 / students)
        / Math.sqrt((s11 - s1 * s1 / students) * (s22 - s2 * s2 / students));
    
    out.println("<tr><td>Коэффициент корреляции Пирсона: </td><td>"
        + round(pirson, 5) + "</td></tr>");

    
  }
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
  
  out.println("</table>");
  out.println("<br/>");

  out.println("<h3>Оценка надежности критериально-ориентированного теста</h3> ");
  double a = 0;
  double b = 0;
  double c = 0;
  double d = 0;
  for (int i = 0; i < students; i++) {
    if (arrStudents[i].mark1 < ticket1 / 2 && arrStudents[i].mark2 < ticket2 / 2)
      a++;
    if (arrStudents[i].mark1 < ticket1 / 2 && arrStudents[i].mark2 >= ticket2 / 2)
      b++;
    if (arrStudents[i].mark1 >= ticket1 / 2 && arrStudents[i].mark2 < ticket2 / 2)
      c++;
    if (arrStudents[i].mark1 >= ticket1 / 2 && arrStudents[i].mark2 >= ticket2 / 2)
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

  double dse1 = 0;
  double dse2 = 0;
  double koef = 0;
  if (pirson > 0)
    koef = pirson;

  if (pirson != 0 && (1 - koef) >= 0 && ds1 >= 0)
    dse1 = Math.sqrt(ds1) * Math.sqrt(1 - koef);
  if (pirson != 0 && (1 - koef) >= 0 && ds2 >= 0)
    dse2 = Math.sqrt(ds2) * Math.sqrt(1 - koef);
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
  if (pirson != 0 && (1 - koef) >= 0 && ds1 >= 0)
    out.println("<tr><td>Стандартная ошибка тестовых измерений для первого теста</td><td>"
        + round(dse1, 5) + "</td></tr>");
  else
    out
        .println("<tr><td>Стандартная ошибка тестовых измерений не расчитывается</td><td></td></tr>");
  if (pirson != 0 && (1 - koef) >= 0 && ds2 >= 0)
    out.println("<tr><td>Стандартная ошибка тестовых измерений для второго теста</td><td>"
        + round(dse2, 5) + "</td></tr>");
  else
    out
        .println("<tr><td>Стандартная ошибка тестовых измерений не расчитывается</td><td></td></tr>");
  out.println("</table>");
  if (pirson < 0.7)
    out.println("<b>Рекомендованный коэффициент увеличения длины теста</b> <br/>"+
        "(для достижения удовлетворительной оценки надежности по формуле Пирсона): " 
        + round((0.7 * (1 - pirson) / pirson / 0.3), 2) );
}


void writeToFile(String fileName, String loc) throws IOException {
  PrintWriter out = new PrintWriter(
      new OutputStreamWriter(new FileOutputStream(fileName), "Windows-1251"));
  out.println("<html><head><title>Результаты анализа качества педагогических тестов</title>");
  out.println("<meta http-equiv='Content-Type' content='text/html'; charset='Windows-1251'>");
  out.println("</head><body>");

  out.println("<h2>Результаты вычислений:</h2>");
  fileCount(out, loc);
  out.println("</body></html>");
  out.close();
}

public static void main(String[] args) {
  MyFunc func = new MyFunc();
  func.setCount(9);
  func.setFrom(0);
  func.setTo(4);

}

public void initData()
{
  ticket1 = 0;
  ticket2 = 0;
  for (int j = 0; j < ar1[0].length; j++)
    if (ar1[0][j] != 0)
      ticket1++;
  for (int j = 0; j < ar2[0].length; j++)
    if (ar2[0][j] != 0)
      ticket2++;
  for (int i = 0; i < ar1.length; i++) {
    for (int j = 0; j < ar1[i].length; j++) {
      System.out.printf("%3d", ar1[i][j]);
    }
    System.out.println();
  }
  System.out.println();
  for (int i = 0; i < ar2.length; i++) {
    for (int j = 0; j < ar2[i].length; j++) {
      System.out.printf("%3d", ar2[i][j]);
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
