package gui;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
  Object[][] data;
  String[] col;
  String[] columnNames = null;
  public MyTableModel() {
    this(1,1);
  }

  public MyTableModel(int rows, int columns)
  {
    super();
      data = new Object[rows][columns+1];
      for (int i = 0; i < rows; i++) {
        data[i] = new Object[columns];
        data[i][0]= i+1 + "";
        for (int j = 1; j < columns; j++)
          data[i][j]=Boolean.FALSE;
    }     
    columnNames = new String[columns];
    columnNames[0] = "Студ/Вопр";
    for (int i = 1; i < columns; i++)
      columnNames [i] = (i ) + "";
  }

  public int getColumnCount() {
    return columnNames.length;
  }

  public int getRowCount() {
    return data.length;
  }

  public String getColumnName(int col) {
    if (columnNames == null) {
      columnNames = new String[col];
      columnNames[0] = "Студ/Вопр";
    for (int i = 1; i < col; i++) {
      columnNames[i] = "q "+(i+1);
    }}
    return columnNames[col];
  }
  
 

  public Object getValueAt(int row, int col) {
    return data[row][col];
  }

  public void setValueAt(Object value, int row, int col) {
    data[row][col] = value;
    fireTableCellUpdated(row, col);
  }

  @Override
  public Class<?> getColumnClass(int columnIndex) {

    return data[0][columnIndex].getClass();

  }

  public boolean isCellEditable(int row, int col) {
    return true;
  }
  
}

