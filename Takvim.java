import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.table.TableColumn;

public class Takvim implements ActionListener{
    JFrame frame = new JFrame("Takvim");  
    JLabel yazi = new JLabel();
    JComboBox<String> saat = new JComboBox<>();
    JComboBox<String> tarih1 = new JComboBox<>();
    JComboBox<String> tarih2 = new JComboBox<>();
    JComboBox<String> tarih3 = new JComboBox<>();
    JComboBox<String> evethayir = new JComboBox<>();
    JButton hatirlatici = new JButton("CHECK");
    String data [][] ={ {"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""}};
    String column[] = {"Yıl","Ay","Gün","Baslangıç Zamanı ","Olayın Tanımlanması","Olayın tipi","Olay Açıklaması"};    
    JTable tablo = new JTable(data, column);
    JLabel hatir_Yazisi = new JLabel("Günlük toplantı kontrol butonu ! ");
    Calendar calendar = Calendar.getInstance();
    Takvim(){   
    frame.setSize(1000,600);
    frame.setLayout(null);
    frame.setVisible(true); 
    frame.setLocation(280, 90);
    saat.addItem("");saat.addItem("9.00");saat.addItem("10.00");saat.addItem("11.00");saat.addItem("12.00");saat.addItem("13.00");
    saat.addItem("14.00");saat.addItem("15.00");saat.addItem("16.00");saat.addItem("17.00");  
    tarih1.addItem("");tarih1.addItem("2023");tarih1.addItem("2024");tarih1.addItem("2025");tarih1.addItem("2026");
    tarih2.addItem(""); tarih2.addItem("1"); tarih2.addItem("2"); tarih2.addItem("3"); tarih2.addItem("4"); tarih2.addItem("5");
    tarih2.addItem("6"); tarih2.addItem("7"); tarih2.addItem("8"); tarih2.addItem("9"); tarih2.addItem("10"); tarih2.addItem("11"); tarih2.addItem("12");
    tarih3.addItem("");tarih3.addItem("1");tarih3.addItem("2");tarih3.addItem("3");tarih3.addItem("4");tarih3.addItem("5");tarih3.addItem("6");tarih3.addItem("7");tarih3.addItem("8");tarih3.addItem("9");tarih3.addItem("10");tarih3.addItem("11");tarih3.addItem("12");tarih3.addItem("13");tarih3.addItem("14");tarih3.addItem("15");tarih3.addItem("16");tarih3.addItem("17");tarih3.addItem("18");
    tarih3.addItem("19");tarih3.addItem("20");tarih3.addItem("21");tarih3.addItem("22");tarih3.addItem("23");tarih3.addItem("24");tarih3.addItem("25");tarih3.addItem("26");tarih3.addItem("27");tarih3.addItem("28");tarih3.addItem("29");tarih3.addItem("30");
    evethayir.addItem(""); evethayir.addItem("istiyorum"); evethayir.addItem("istemiyorum");
    frame.add(tablo);
    tablo.setBounds(60, 100, 900, 344);  
    tablo.setSize(50, 50);
    tablo.setRowHeight(70);
    tablo.setBackground(Color.yellow);
    tablo.setForeground(Color.black);
    JScrollPane sp = new JScrollPane(tablo);
    sp.setBounds(60, 100, 900, 344);
    frame.add(sp); 
    TableColumn testColumn = tablo.getColumnModel().getColumn(3);
    TableColumn testColumn2 = tablo.getColumnModel().getColumn(4);
    TableColumn testColumn3 = tablo.getColumnModel().getColumn(0);
    TableColumn testColumn4 = tablo.getColumnModel().getColumn(1);
    TableColumn testColumn5 = tablo.getColumnModel().getColumn(2);
    testColumn.setCellEditor(new DefaultCellEditor(saat));
    testColumn2.setCellEditor(new DefaultCellEditor(saat));
    testColumn3.setCellEditor(new DefaultCellEditor(tarih1));
    testColumn4.setCellEditor(new DefaultCellEditor(tarih2));
    testColumn5.setCellEditor(new DefaultCellEditor(tarih3));
    frame.add(yazi);
    yazi.setText("Hoşgeldiniz ...");
    yazi.setBounds(60, 50, 200, 50);
    yazi.setFont(new Font("sansserif", Font.BOLD, 25));
    frame.add(hatirlatici);
    hatirlatici.setBounds(870, 450, 90, 30);
    hatirlatici.addActionListener(this);    
    frame.add(hatir_Yazisi);
    hatir_Yazisi.setBounds(610, 450, 450, 30); 
    hatir_Yazisi.setFont(new Font("sansserif", Font.BOLD, 15));
    
    
   } 
    int gün = calendar.get(Calendar.DATE);
    String gün_CHECK = String.valueOf(gün);
   @Override
   public void actionPerformed(ActionEvent e) {
    if(e.getSource()==hatirlatici){
            
                
                if(tablo.getModel().getValueAt(0,2).equals(gün_CHECK)) {
                JOptionPane.showMessageDialog(frame,"Bugün Bir Görüşmeniz Var !");  
                
                }if(tablo.getModel().getValueAt(1,2).equals(gün_CHECK)) {
                    JOptionPane.showMessageDialog(frame,"Bugün Bir Görüşmeniz Var !");  
                    
                    }if(tablo.getModel().getValueAt(2,2).equals(gün_CHECK)) {
                        JOptionPane.showMessageDialog(frame,"Bugün Bir Görüşmeniz Var !");  
                        
                        }if(tablo.getModel().getValueAt(3,2).equals(gün_CHECK)) {
                            JOptionPane.showMessageDialog(frame,"Bugün Bir Görüşmeniz Var !");  
                            
                            }if(tablo.getModel().getValueAt(4,2).equals(gün_CHECK)) {
                                JOptionPane.showMessageDialog(frame,"Bugün Bir Görüşmeniz Var !");  
                                
                                }if(tablo.getModel().getValueAt(5,2).equals(gün_CHECK)) {
                                    JOptionPane.showMessageDialog(frame,"Bugün Bir Görüşmeniz Var !");  
                                    
                                    }if(tablo.getModel().getValueAt(6,2).equals(gün_CHECK)) {
                                        JOptionPane.showMessageDialog(frame,"Bugün Bir Görüşmeniz Var !");  
                                        
                                        }
                
                
                
                else {
                    JOptionPane.showMessageDialog(frame,"Bugün Bir Görüşmeniz Yok !"); 
                }
             
       }
    }
   
}    

 

    
        
    
     