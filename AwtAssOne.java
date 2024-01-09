package trial;
import java.awt.*;
public class AwtAssOne extends Frame {
    AwtAssOne(){
    setSize(400,400);
    setLayout(null);
    setTitle("Login Page");
    setVisible(true);
    setResizable(false);
    Label label1=new Label("USERNAME");
    add(label1);
    label1.setBounds(20, 80, 80, 30);
    TextField txtfld1=new TextField();
    add(txtfld1);
    txtfld1.setBounds(140, 80, 100, 30);
    Label label2=new Label("PASSWORD");
    add(label2);
    label2.setBounds(20, 120, 80, 30);
    TextField txtfld2=new TextField();
    add(txtfld2);
  txtfld2.setBounds(140, 120, 100, 30);
  Button button=new Button("Login");
  add(button);
  button.setBounds(140, 155, 100, 30);
    }
    
    
    public static void main(String[] args) {
        AwtAssOne obj=new AwtAssOne();
    }
}
