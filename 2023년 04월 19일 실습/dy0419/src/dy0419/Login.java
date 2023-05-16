package dy0419;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;
 
public class Login extends JFrame {
 
    public Login() {
    	setTitle("LoginFORM");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	GridLayout grid =new GridLayout(3,2);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("이메일 : ");
        JTextField txtID= new JTextField(10);
        JLabel pswrd = new JLabel("비밀번호 : ");;
        JPasswordField txtPass = new JPasswordField(10);
        JButton logBtn = new JButton("로그인");
        JButton logCan = new JButton("취소");
 
 
        panel.add(label);
        panel.add(txtID);
        panel.add(pswrd);
        panel.add(txtPass);
        panel.add(logBtn);
        panel.add(logCan);
 
        logBtn.addActionListener( new ActionListener() {
 
                
           public void actionPerformed(ActionEvent e) {
 
                   String id = "hong@google.com";
                    String pass = "1234";
 
 
                    if(id.equals(txtID.getText()) &&  pass.equals(txtPass.getText())) {
 
         JOptionPane.showMessageDialog( null, "로그인 됐습니다." );
                 } else {
                   JOptionPane.showMessageDialog(null,"이메일과 비밀번호를 다시 입력하세요");
                    }
                        }
                } );
        logCan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtID.setText("");
				txtPass.setText("");
			}
		});
        add(panel);
        setVisible(true);
        setSize( 300 , 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}