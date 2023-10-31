import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener{
    
    JFrame frame = new JFrame("Takvim");
    JTextField kullaniciGiris = new JTextField();
    JPasswordField parolaGiris = new JPasswordField();
    JLabel kullaniciAdi = new JLabel("Kullanıcı Adı :");
    JLabel parola = new JLabel("           Parola:");
    JButton b1 = new JButton("Giriş Yap");
    JButton b2 = new JButton("Kayıt Ol");
    JLabel fotoLabel = new JLabel();
    ImageIcon img = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\java\\girisekranresmi.png");
    
    
    Login(){
      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);
      frame.setLayout(null);
      frame.setVisible(true);
      frame.setLocation(500, 140);
      frame.add(kullaniciGiris);
      frame.add(parolaGiris);
      frame.add(kullaniciAdi);
      frame.add(parola);
      frame.add(b1);
      frame.add(b2);
      frame.add(fotoLabel);
      kullaniciGiris.setBounds(150, 200, 200, 30);
      parolaGiris.setBounds(150, 250, 200, 30);
      kullaniciAdi.setBounds(70, 200, 100, 30);
      parola.setBounds(70, 250, 100, 30);
      b1.setBounds(150, 290, 100, 30);
      b2.setBounds(245, 290, 100, 30);
      fotoLabel.setIcon(img);
      fotoLabel.setBounds(210, 100, 80, 80);
      b2.addActionListener(this);
      b1.addActionListener(this);     
     
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b2){
        Kayit kayit = new Kayit();       
        frame.setVisible(false);        
        
      }
      if(e.getSource()==b1){     
        String a = kullaniciGiris.getText();
        String b = getK_adi(); 
        String c = parolaGiris.getText();
        String d = getP_la();       
        if(a.equals(b) && c.equals(d)){                     
          Takvim takvim = new Takvim();
          frame.setVisible(false); 
        }else{
          JOptionPane.showMessageDialog(frame,"hatalı şifre veya kullanıcı adı !"); 
        }
      }   
    }
    
    public String K_adi;
    public String P_la;
    
    public void setK_adi(String K_adi){
      this.K_adi = K_adi;
    }
    public String getK_adi(){
      return K_adi;
    }
    public void setP_la(String P_la){
      this.P_la = P_la;
    }
    public String getP_la(){
      return P_la;
    }

    
}
    
