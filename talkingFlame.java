	package elizaTalk;
	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

	public class talkingFlame {
	    static JFrame myframe= new JFrame("GUItest");
	    static JTextField mytextfield = new JTextField();
	    static JButton mybutton= new JButton("OK");
	    static JTextArea mytextarea= new JTextArea();
	    static Eliza myEliza=new Eliza();
	 
	    public static void main(String[] args) {
	        
	        myframe.setBounds(100, 100, 640, 480);
	        myframe.setVisible(true);
	        myframe.setLayout(null);
	        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        myframe.add(mytextfield);
	        mytextfield.setBounds(10, 10, 500, 50);
	 
	        myframe.add(mytextarea);
	        mytextarea.setBounds(10, 70,600,360);
	       
	        myframe.add(mybutton);
	        mybutton.setBounds(520, 10, 100, 50);
	        mybutton.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	              //ここにボタンをクリックした場合の処理
	          mytextarea.setText(mytextarea.getText()+"\n"
	           + mytextfield.getText()+"\n"
	           +"Eliza:「"
	           +myEliza. hanasu(mytextfield.getText())+"」");
            }
          }
        );
    }   
}


