import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class CalculatorEvent extends JFrame{
    
    private JTextField Screen = new JTextField("");
    private JButton btn_CE = new JButton("CE");
    private JButton btn_C = new JButton("C");
    private JButton btn_Del = new JButton("Del");
    private JButton btn_Divide = new JButton("/");
    private JButton btn_Seven = new JButton("7");
    private JButton btn_Eight = new JButton("8");
    private JButton btn_Nine = new JButton("9");
    private JButton btn_Multiply = new JButton("*");
    private JButton btn_Four = new JButton("4");
    private JButton btn_Five = new JButton("5");
    private JButton btn_Six = new JButton("6");
    private JButton btn_Subtract = new JButton("-");
    private JButton btn_One = new JButton("1");
    private JButton btn_Two = new JButton("2");
    private JButton btn_Three = new JButton("3");
    private JButton btn_Addition = new JButton("+");
    private JButton btn_Zero = new JButton("0");
    private JButton btn_Decimal = new JButton(".");
    private JButton btn_Equal = new JButton("=");
    private int num1 = 0, num2 = 0, total = 0, totalcount = 0;
    private String operator;
    
    public CalculatorEvent(){
        //Font Styles
        Font ScreenFont = new Font("Arial",Font.BOLD, 45);
        Font ButtonFont = new Font("Arial",Font.PLAIN, 20);
        //Font Styles End		

        //Background Color and Button Colors
        Color BackgroundColor = new Color(28,28,28);
        Color ButtonHover = new Color(69,69,69);
        Color BorderColor = new Color(255,153,51);
        //Background Color and Button Colors End

        //Formula/Screen
        Screen.setBounds(10,10,300,60);
        Screen.setEditable(false);
        Screen.setHorizontalAlignment(SwingConstants.RIGHT);
        Screen.setFont(ScreenFont);
        Screen.setBorder(new LineBorder(BorderColor,1));
        Screen.setBackground(BackgroundColor);
        Screen.setForeground(Color.white);
        add(Screen);
        //Formula/Screen End

        //Clear Entity Button/btn_CE Button Start
        btn_CE.setBounds(10,80,75,50);
        btn_CE.setFont(ButtonFont);
        btn_CE.setBorder(null);
        btn_CE.setBackground(BackgroundColor);
        btn_CE.setForeground(BorderColor);
        //Button Hover Part
        btn_CE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CE.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CE.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_CE);
        //Clear Entity Button/btn_CE Button End

        //Clear Button/C Button Start
        btn_C.setBounds(85,80,75,50);
        btn_C.setFont(ButtonFont);
        btn_C.setBorder(null);
        btn_C.setBackground(BackgroundColor);
        btn_C.setForeground(BorderColor);
        //Button Hover Part
        btn_C.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                        btn_C.setBackground(ButtonHover);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                        btn_C.setBackground(BackgroundColor);
                }
        });
        //Button Hover Part End
        add(btn_C);
        //Clear Button/C Button End

        //Backspace Button/Delete Button Start
        btn_Del.setBounds(160,80,75,50);
        btn_Del.setFont(ButtonFont);
        btn_Del.setBorder(null);
        btn_Del.setBackground(BackgroundColor);
        btn_Del.setForeground(BorderColor);
        //Button Hover Part
        btn_Del.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                        btn_Del.setBackground(ButtonHover);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                        btn_Del.setBackground(BackgroundColor);
                }
        });
        //Button Hover Part End
        add(btn_Del);
        //Backspace Button/Delete Button End

        //Divide Button Start
        btn_Divide.setBounds(235,80,75,50);
        btn_Divide.setFont(ButtonFont);
        btn_Divide.setBorder(null);
        btn_Divide.setBackground(BackgroundColor);
        btn_Divide.setForeground(BorderColor);
        //Button Hover Part
        btn_Divide.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                        btn_Divide.setBackground(ButtonHover);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                        btn_Divide.setBackground(BackgroundColor);
                }
        });
        //Button Hover Part End
        add(btn_Divide);
        //Divide Button End

        //Number Seven Button Start
        btn_Seven.setBounds(10,130,75,50);
        btn_Seven.setFont(ButtonFont);
        btn_Seven.setBorder(null);
        btn_Seven.setBackground(BackgroundColor);
        btn_Seven.setForeground(BorderColor);
        //Button Hover Part
        btn_Seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Seven.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Seven.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Seven);
        //Number Seven Button Start

        //Number Eight Button Start
        btn_Eight.setBounds(85,130,75,50);
        btn_Eight.setFont(ButtonFont);
        btn_Eight.setBorder(null);
        btn_Eight.setBackground(BackgroundColor);
        btn_Eight.setForeground(BorderColor);
        //Button Hover Part
        btn_Eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Eight.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Eight.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Eight);
        //Number Eight Button Start

        //Number Nine Button Start
        btn_Nine.setBounds(160,130,75,50);
        btn_Nine.setFont(ButtonFont);
        btn_Nine.setBorder(null);
        btn_Nine.setBackground(BackgroundColor);
        btn_Nine.setForeground(BorderColor);
        //Button Hover Part
        btn_Nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Nine.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Nine.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Nine);
        //Number Nine Button Start

        //Multiply Button Start
        btn_Multiply.setBounds(235,130,75,50);
        btn_Multiply.setFont(ButtonFont);
        btn_Multiply.setBorder(null);
        btn_Multiply.setBackground(BackgroundColor);
        btn_Multiply.setForeground(BorderColor);
        //Button Hover Part
        btn_Multiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Multiply.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Multiply.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Multiply);
        //Multiply Button End

        //Number Four Button Start
        btn_Four.setBounds(10,180,75,50);
        btn_Four.setFont(ButtonFont);
        btn_Four.setBorder(null);
        btn_Four.setBackground(BackgroundColor);
        btn_Four.setForeground(BorderColor);
        //Button Hover Part
        btn_Four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Four.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Four.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Four);
        //Number Four Button Start

        //Number Five Button Start
        btn_Five.setBounds(85,180,75,50);
        btn_Five.setFont(ButtonFont);
        btn_Five.setBorder(null);
        btn_Five.setBackground(BackgroundColor);
        btn_Five.setForeground(BorderColor);
        //Button Hover Part
        btn_Five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Five.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Five.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Five);
        //Number Five Button Start

        //Number Six Button Start
        btn_Six.setBounds(160,180,75,50);
        btn_Six.setFont(ButtonFont);
        btn_Six.setBorder(null);
        btn_Six.setBackground(BackgroundColor);
        btn_Six.setForeground(BorderColor);
        //Button Hover Part
        btn_Six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Six.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Six.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Six);
        //Number Six Button Start

        //Subtract Button Start
        btn_Subtract.setBounds(235,180,75,50);
        btn_Subtract.setFont(ButtonFont);
        btn_Subtract.setBorder(null);
        btn_Subtract.setBackground(BackgroundColor);
        btn_Subtract.setForeground(BorderColor);
        //Button Hover Part
        btn_Subtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Subtract.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Subtract.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Subtract);
        //Subtract Button End

        //Number One Button Start
        btn_One.setBounds(10,230,75,50);
        btn_One.setFont(ButtonFont);
        btn_One.setBorder(null);
        btn_One.setBackground(BackgroundColor);
        btn_One.setForeground(BorderColor);
        //Button Hover Part
        btn_One.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_One.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_One.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_One);
        //Number One Button Start

        //Number Two Button Start
        btn_Two.setBounds(85,230,75,50);
        btn_Two.setFont(ButtonFont);
        btn_Two.setBorder(null);
        btn_Two.setBackground(BackgroundColor);
        btn_Two.setForeground(BorderColor);
        //Button Hover Part
        btn_Two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Two.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Two.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Two);
        //Number Two Button Start

        //Number Three Button Start
        btn_Three.setBounds(160,230,75,50);
        btn_Three.setFont(ButtonFont);
        btn_Three.setBorder(null);
        btn_Three.setBackground(BackgroundColor);
        btn_Three.setForeground(BorderColor);
        //Button Hover Part
        btn_Three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Three.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Three.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Three);
        //Number Three Button Start

        //Addition Button Start
        btn_Addition.setBounds(235,230,75,50);
        btn_Addition.setFont(ButtonFont);
        btn_Addition.setBorder(null);
        btn_Addition.setBackground(BackgroundColor);
        btn_Addition.setForeground(BorderColor);
        //Button Hover Part
        btn_Addition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Addition.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Addition.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Addition);
        //Addition Button End

        //Number Zero Button Start
        btn_Zero.setBounds(10,280,75,50);
        btn_Zero.setFont(ButtonFont);
        btn_Zero.setBorder(null);
        btn_Zero.setBackground(BackgroundColor);
        btn_Zero.setForeground(BorderColor);
        //Button Hover Part
        btn_Zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Zero.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Zero.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Zero);
        //Number Zero Button Start

        //Decimal Button Start
        btn_Decimal.setBounds(85,280,75,50);
        btn_Decimal.setFont(ButtonFont);
        btn_Decimal.setBorder(null);
        btn_Decimal.setBackground(BackgroundColor);
        btn_Decimal.setForeground(BorderColor);
        //Button Hover Part
        btn_Decimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Decimal.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Decimal.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Decimal);
        //Decimal Button Start

        //Equal Button Start
        btn_Equal.setBounds(160,280,150,50);
        btn_Equal.setFont(ButtonFont);
        btn_Equal.setBorder(null);
        btn_Equal.setBackground(BackgroundColor);
        btn_Equal.setForeground(BorderColor);
        //Button Hover Part
        btn_Equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Equal.setBackground(ButtonHover);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Equal.setBackground(BackgroundColor);
            }
        });
        //Button Hover Part End
        add(btn_Equal);
        //Equal Button Start
        
        getContentPane().setBackground(BackgroundColor);
                
        //Add action listener
        btn_CE.addActionListener(new CEListener());
        btn_C.addActionListener(new CEListener());
        btn_Seven.addActionListener(new NumSevenListener());
        btn_Eight.addActionListener(new NumEightListener());
        btn_Nine.addActionListener(new NumNineListener());
        btn_Four.addActionListener(new NumFourListener());
        btn_Five.addActionListener(new NumFiveListener());
        btn_Six.addActionListener(new NumSixListener());
        btn_One.addActionListener(new NumOneListener());
        btn_Two.addActionListener(new NumTwoListener());
        btn_Three.addActionListener(new NumThreeListener());
        btn_Zero.addActionListener(new NumZeroListener());
        btn_Addition.addActionListener(new AddListener());
        btn_Subtract.addActionListener(new SubtractListener());
        btn_Multiply.addActionListener(new MultiplyListener());
        btn_Divide.addActionListener(new DivideListener());
        btn_Equal.addActionListener(new EqualListener());
    }
    
    public static void main(String [] args) {
        JFrame frame = new CalculatorEvent();
                
        //Frame Start
        frame.setTitle("Calculator with Events");
        frame.setSize(335,380);
        frame.setLocation(500, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        //Frame End
    }
    
    //    EVENT LISTENER
    class CEListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText("");
            num1 = 0;
            num2 = 0;
            total = 0;
            totalcount = 0;
            operator = "";
        }
    }
    class NumSevenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText(Screen.getText()+"7");
        }
    }
    class NumEightListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText(Screen.getText()+"8");
        }
    }
    class NumNineListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText(Screen.getText()+"9");
        }
    }
    class NumFourListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText(Screen.getText()+"4");
        }
    }
    class NumFiveListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText(Screen.getText()+"5");
        }
    }
    class NumSixListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText(Screen.getText()+"6");
        }
    }
    class NumOneListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText(Screen.getText()+"1");
        }
    }
    class NumTwoListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText(Screen.getText()+"2");
        }
    }
    class NumThreeListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Screen.setText(Screen.getText()+"3");
        }
    }
    class NumZeroListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(Screen.getText().isEmpty()){
                Screen.setText("");
            }
            else{
                Screen.setText(Screen.getText()+"0");
            }
        }
    }
    class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if( !(Screen.getText().isEmpty()) ){
                if(totalcount == 0){
                    num1 = Integer.parseInt(Screen.getText());
                }
                else{
                    switch(operator){
                        case "+":
                            num1 = num1 + Integer.parseInt(Screen.getText());
                        break;
                        case "-":
                            num1 = num1 - Integer.parseInt(Screen.getText());
                        break;
                        case "/":
                            num1 = num1 / Integer.parseInt(Screen.getText());
                        break;
                        case "*":
                            num1 = num1 * Integer.parseInt(Screen.getText());
                        break;
                    }  
                }
                Screen.setText("");     
                operator = "+"; 
                totalcount++;
            }else{
                Screen.setText(""); 
            }    
        }
    }
    class SubtractListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if( !(Screen.getText().isEmpty()) ){
                if(totalcount == 0){
                    num1 = Integer.parseInt(Screen.getText());
                }
                else{
                    switch(operator){
                        case "+":
                            num1 = num1 + Integer.parseInt(Screen.getText());
                        break;
                        case "-":
                            num1 = num1 - Integer.parseInt(Screen.getText());
                        break;
                        case "/":
                            num1 = num1 / Integer.parseInt(Screen.getText());
                        break;
                        case "*":
                            num1 = num1 * Integer.parseInt(Screen.getText());
                        break;
                    }  
                }
                Screen.setText("");     
                operator = "-"; 
                totalcount++;
            }else{
                Screen.setText(""); 
            }            
        }
    }
    class DivideListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if( !(Screen.getText().isEmpty()) ){
                if(totalcount == 0){
                    num1 = Integer.parseInt(Screen.getText());
                }
                else{
                    switch(operator){
                        case "+":
                            num1 = num1 + Integer.parseInt(Screen.getText());
                        break;
                        case "-":
                            num1 = num1 - Integer.parseInt(Screen.getText());
                        break;
                        case "/":
                            num1 = num1 / Integer.parseInt(Screen.getText());
                        break;
                        case "*":
                            num1 = num1 * Integer.parseInt(Screen.getText());
                        break;
                    }  
                }
                Screen.setText("");     
                operator = "/"; 
                totalcount++;
            }else{
                Screen.setText(""); 
            }    
        }
    }
    class MultiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if( !(Screen.getText().isEmpty()) ){
                if(totalcount == 0){
                    num1 = Integer.parseInt(Screen.getText());
                }
                else{
                    switch(operator){
                        case "+":
                            num1 = num1 + Integer.parseInt(Screen.getText());
                        break;
                        case "-":
                            num1 = num1 - Integer.parseInt(Screen.getText());
                        break;
                        case "/":
                            num1 = num1 / Integer.parseInt(Screen.getText());
                        break;
                        case "*":
                            num1 = num1 * Integer.parseInt(Screen.getText());
                        break;
                    }  
                }
                Screen.setText("");     
                operator = "*"; 
                totalcount++;
            }else{
                Screen.setText(""); 
            }                
        }
    }
    class EqualListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(totalcount == 0){
                Screen.setText("");
            }else{
                num2 = Integer.parseInt(Screen.getText());
                switch(operator){
                    case "+":
                        total = num1 + num2;
                        Screen.setText(total+"");  
                    break;
                    case "-":
                        total = num1 - num2;
                        Screen.setText(total+""); 
                    break;
                    case "/":
                        total = num1 / num2;
                        Screen.setText(total+""); 
                    break;
                    case "*":
                        total = num1 * num2;
                        Screen.setText(total+""); 
                    break;
                }  
            }          
        }
    }
}
