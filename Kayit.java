import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Kayit implements ActionListener{
    JFrame frame = new JFrame("Takvim"); 
    JTextField kullaniciGiris = new JTextField();
    JLabel kullaniciAdi = new JLabel("Kullanıcı Adı :");
    JLabel parola = new JLabel("          Parola :");
   
    JLabel AD = new JLabel("          Adınız :");
    JTextField adGiris = new JTextField();
    JLabel SoyAD = new JLabel("    SoyAdınız :");
    JTextField SoyadGiris = new JTextField();
    
    JPasswordField parolaGiris = new JPasswordField();
    JLabel TC = new JLabel("          TC No :");
    JTextField tcText = new JTextField();
    JLabel telefon = new JLabel("  Telefon No :");
    JTextField telefonText = new JTextField();
    JLabel email = new JLabel("Email Adresi :");
    JTextField emailText = new JTextField();
    JLabel adres = new JLabel("           Adres :");
    JTextField adresText = new JTextField();     
    JRadioButton j1 = new JRadioButton("Admin");
    JRadioButton j2 = new JRadioButton("Üye");
    ButtonGroup bg = new ButtonGroup();
    JButton kayitOl = new JButton("KAYIT OL");
    JLabel girisYazisi = new JLabel("Takvim Uygulamasına Üye Olun");
    String a ;
    
    Kayit(){
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setLocation(500, 140);
    frame.add(kullaniciAdi);
    frame.add(parola);
    frame.add(kullaniciGiris);
    frame.add(parolaGiris);
    frame.add(TC);
    frame.add(tcText);
    frame.add(telefon);
    frame.add(telefonText);
    frame.add(email);
    frame.add(emailText);
    frame.add(adres);
    frame.add(adresText);
    frame.add(AD);
    frame.add(SoyAD);
    frame.add(adGiris);
    frame.add(SoyadGiris);
    bg.add(j1);
    bg.add(j2);
    frame.add(j1);
    frame.add(j2);
    frame.add(kayitOl);
    frame.add(girisYazisi);
   
    kullaniciAdi.setBounds(70, 100, 100, 30);
    kullaniciGiris.setBounds(150, 100, 200, 30);
    
    AD.setBounds(70, 130, 100, 30);
    adGiris.setBounds(150, 130,200,  30);
   
    SoyAD.setBounds(70, 160, 100, 30);
    SoyadGiris.setBounds(150, 160, 200, 30);
    
   
    parola.setBounds(70, 190, 100, 30);    
    parolaGiris.setBounds(150, 190, 200, 30);
    
    TC.setBounds(70, 220, 100, 30);
    tcText.setBounds(150, 220, 200, 30);
    
    telefon.setBounds(70, 250, 100, 30);
    telefonText.setBounds(150, 250, 200, 30);
    
    email.setBounds(70, 280, 100, 30);
    emailText.setBounds(150, 280, 200, 30);
    
    adres.setBounds(70, 310, 100, 30);
    adresText.setBounds(150, 310, 200, 30);
    
    j1.setBounds(150, 350, 100, 30);
    j2.setBounds(250, 350, 100, 30);
    
    kayitOl.setBounds(185, 390, 100, 30);    
    kayitOl.addActionListener(this);
   
    girisYazisi.setFont(new Font("sansserif", Font.BOLD, 25));  
    girisYazisi.setBounds(70, 30, 400, 50); 
     
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==kayitOl){
            Login login = new Login();           
            login.setK_adi(kullaniciGiris.getText());
            login.setP_la(parolaGiris.getText());
            frame.setVisible(false);         
            
        }
    }
    
    
      
                
   
   
    
}
