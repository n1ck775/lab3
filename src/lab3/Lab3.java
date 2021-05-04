/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Никита
 */
public class Lab3 extends javax.swing.JFrame {

    /**
     * Creates new form Lab
     */
    public Lab3() {
        initComponents();
    this.getContentPane().setBackground(java.awt.Color.WHITE);
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с визуальными табл. данными в JAVA");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Заполнить случ. числами");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 110, 180, 40);

        jButton2.setText("Выполнить задание");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 160, 180, 40);

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0)},
                { new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0)},
                { new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0)},
                { new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0)}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jTable1.setTableHeader(null
        );
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Title 5");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 370, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab3/lab.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 20, 470, 70);
        getContentPane().add(jLabel_2);
        jLabel_2.setBounds(20, 210, 480, 30);

        jButton3.setText("Выход");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 240, 73, 23);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 250, 480, 30);

        setSize(new java.awt.Dimension(628, 331));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int max, maxI, maxJ, min, minI, minJ;
        int matrix[][] = new int[jTable1.getRowCount()][jTable1.getColumnCount()];
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                if (jTable1.getValueAt(i, j) == null) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Проверьте правильность заполнения таблицы", "Ошибка ввода",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        //максимальный элемент
        max = Integer.parseInt(jTable1.getValueAt(0, 0).toString());
        maxI = 0;
        maxJ = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                matrix[i][j] = Integer.parseInt(jTable1.getValueAt(i, j).toString());
                if (matrix[i][j] > max) {
                    max = Integer.parseInt(jTable1.getValueAt(i, j).toString());
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        
       //минимальный элемент
        min = Integer.parseInt(jTable1.getValueAt(0, 0).toString());
        minI = 0;
        minJ = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                matrix[i][j] = Integer.parseInt(jTable1.getValueAt(i, j).toString());
                if (matrix[i][j] < min) {
                    min = Integer.parseInt(jTable1.getValueAt(i, j).toString());
                    minI = i;
                    minJ = j;
                }
            }
        }
        int sum = 0;
         for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                sum = sum + matrix[i][j];//считаем сумму
            }
        }
         if(sum > 100){
             int temp = matrix[minI][minJ];
             matrix[minI][minJ] = matrix[maxI][maxJ]; //меняем местами максимальный и минимальный элемент
             matrix[maxI][maxJ] = temp;
             
         }
         for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                jTable1.setValueAt(matrix[i][j], i, j);
            }
        }
        jLabel_2.setText("Макс элемент: " + max +  " [" + (maxI + 1) + "," + (maxJ + 1) + "]");
        jLabel2.setText("Мин элемент: " + min +  " [" + (minI + 1) + "," + (minJ + 1) + "]");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // Случайные числа
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                jTable1.setValueAt(Math.round(Math.random() * 100), i, j);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
