package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class FrameWork extends JFrame{
	
	JFrame frame=new JFrame();
	
	private JLabel label;
	private JTextField text;
	private JTextArea screen;
	private JPanel panel=new JPanel();
	double number1,number2,result;
	int add=0,substract=0,multi=0,division=0,square=0,sin=0,cos=0,tan=0,ln=0,log=0,power=0;
	private JButton button1=new JButton();
	private JButton button2=new JButton();
	private JButton button3=new JButton();
	private JButton button4=new JButton();
	private JButton button5=new JButton();
	private JButton button6=new JButton();
	private JButton button7=new JButton();
	private JButton button8=new JButton();
	private JButton button9=new JButton();
	private JButton button0=new JButton();
	private JButton buttonDot=new JButton();
	private JButton buttonAdd=new JButton();
	private JButton buttonSubstract=new JButton();
	private JButton buttonMulti=new JButton();
	private JButton buttonDivision=new JButton();
	private JButton buttonEqual=new JButton();
	private JButton buttonClear=new JButton();
	private JButton buttonSquareRoot=new JButton();
	private JButton buttonSin=new JButton();
	private JButton buttonCos=new JButton();
	private JButton buttonTan=new JButton();
	private JButton buttonLn=new JButton();
	private JButton buttonLog=new JButton();
	private JButton buttonPower=new JButton();
	
	public FrameWork()
	{
		setLayout(new FlowLayout());
		
		label=new JLabel();
		screen=new JTextArea(3,16);
		
		screen.setBackground(Color.BLACK);
		Border borderS=BorderFactory.createLineBorder(Color.green,4);
		screen.setBorder(borderS);
		
		Font font=new Font("arial",Font.ITALIC,22);
		screen.setFont(font);
		
		screen.setForeground(Color.WHITE);
		screen.setLineWrap(true);
		add(screen);
		
		button1.setPreferredSize(new Dimension(96,48));
		button1.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button1.png"));
		button2.setPreferredSize(new Dimension(96,48));
		button2.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button2.png"));
		button3.setPreferredSize(new Dimension(96,48));
		button3.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button3.png"));
		button4.setPreferredSize(new Dimension(96,48));
		button4.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button4.png"));
		button5.setPreferredSize(new Dimension(96,48));
		button5.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button5.png"));
		button6.setPreferredSize(new Dimension(96,48));
		button6.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button6.png"));
		button7.setPreferredSize(new Dimension(96,48));
		button7.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button7.png"));
		button8.setPreferredSize(new Dimension(96,48));
		button8.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button8.png"));
		button9.setPreferredSize(new Dimension(96,48));
		button9.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button9.png"));
		button0.setPreferredSize(new Dimension(96,48));
		button0.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\button0.png"));
		buttonDot.setPreferredSize(new Dimension(96,48));
		buttonDot.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttondot.png"));
		buttonAdd.setPreferredSize(new Dimension(96,48));
		buttonAdd.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonadd.png"));
		buttonSubstract.setPreferredSize(new Dimension(96,48));
		buttonSubstract.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonsubst.png"));
		buttonMulti.setPreferredSize(new Dimension(96,48));
		buttonMulti.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonmulti.png"));
		buttonDivision.setPreferredSize(new Dimension(96,48));
		buttonDivision.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttondiv.png"));
		buttonEqual.setPreferredSize(new Dimension(96,48));
		buttonEqual.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonequal.png"));
		buttonClear.setPreferredSize(new Dimension(96,48));
		buttonClear.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonclear.png"));
		buttonSquareRoot.setPreferredSize(new Dimension(96,48));
		buttonSquareRoot.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonroot.png"));
		buttonSin.setPreferredSize(new Dimension(96,48));
		buttonSin.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonsin1.png"));
		buttonCos.setPreferredSize(new Dimension(96,48));
		buttonCos.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttoncos1.png"));
		buttonTan.setPreferredSize(new Dimension(96,48));
		buttonTan.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttontan1.png"));
		buttonLn.setPreferredSize(new Dimension(96,48));
		buttonLn.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonln.png"));
		buttonLog.setPreferredSize(new Dimension(96,48));
		buttonLog.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonlog.png"));
		buttonPower.setPreferredSize(new Dimension(96,48));
		buttonPower.setIcon(new ImageIcon("E:\\Projects\\Calculator App\\data\\buttons\\buttonpower.png"));
		add(buttonSin);
		add(buttonCos);
		add(buttonTan);
		add(buttonLn);
		add(buttonLog);
		add(buttonPower);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(button0);
		add(buttonDot);
		add(buttonAdd);
		add(buttonSubstract);
		add(buttonMulti);
		add(buttonDivision);
		add(buttonSquareRoot);
		add(buttonEqual);
		add(buttonClear);
		
		theHandeler aHandeler=new theHandeler();
		button1.addActionListener(aHandeler);
		button2.addActionListener(aHandeler);
		button3.addActionListener(aHandeler);
		button4.addActionListener(aHandeler);
		button5.addActionListener(aHandeler);
		button6.addActionListener(aHandeler);
		button7.addActionListener(aHandeler);
		button8.addActionListener(aHandeler);
		button9.addActionListener(aHandeler);
		button0.addActionListener(aHandeler);
		buttonDot.addActionListener(aHandeler);
		buttonAdd.addActionListener(aHandeler);
		buttonSubstract.addActionListener(aHandeler);
		buttonMulti.addActionListener(aHandeler);
		buttonDivision.addActionListener(aHandeler);
		buttonSquareRoot.addActionListener(aHandeler);
		buttonEqual.addActionListener(aHandeler);
		buttonClear.addActionListener(aHandeler);	
		buttonSin.addActionListener(aHandeler);
		buttonCos.addActionListener(aHandeler);
		buttonTan.addActionListener(aHandeler);
		buttonLog.addActionListener(aHandeler);
		buttonLn.addActionListener(aHandeler);
		buttonPower.addActionListener(aHandeler);
	}
	private class theHandeler implements ActionListener{
		public void actionPerformed(ActionEvent act)
		{
			Object source=act.getSource();
			if(source==buttonClear) {
				number1=0.0;
				number2=0.0;
				screen.setText("");
			}
			if(source==button1) {
				screen.append("1");
			}
			if(source==button2) {
				screen.append("2");
			}
			if(source==button3) {
				screen.append("3");
			}
			if(source==button4) {
				screen.append("4");
			}
			if(source==button5) {
				screen.append("5");
			}
			if(source==button6) {
				screen.append("6");
			}
			if(source==button7) {
				screen.append("7");
			}
			if(source==button8) {
				screen.append("8");
			}
			if(source==button9) {
				screen.append("9");
			}
			if(source==button0) {
				screen.append("0");
			}
			if(source==buttonAdd) {
				number1=number_reader();
				screen.setText(" ");
				add=1;
				substract=0;
				multi=0;
				division=0;
				square=0;
				sin=0;
				cos=0;
				tan=0;
				log=0;
				ln=0;
				power=0;
			}
			if(source==buttonSubstract) {
				number1=number_reader();
				screen.setText(" ");
				add=0;
				substract=1;
				multi=0;
				division=0;
				square=0;
				sin=0;
				cos=0;
				tan=0;
				log=0;
				ln=0;
				power=0;
			}
			if(source==buttonMulti) {
				number1=number_reader();
				screen.setText(" ");
				add=0;
				substract=0;
				multi=1;
				division=0;
				square=0;
				sin=0;
				cos=0;
				tan=0;
				log=0;
				ln=0;
				power=0;
			}
			if(source==buttonDivision) {
				number1=number_reader();
				screen.setText(" ");
				add=0;
				substract=0;
				multi=0;
				division=1;
				square=0;
				sin=0;
				cos=0;
				tan=0;
				log=0;
				ln=0;
				power=0;
			}
			if(source==buttonDot) {
				screen.append(".");
			}
			if(source==buttonSquareRoot)
			{
				screen.setText(" ");
				add=0;
				substract=0;
				multi=0;
				division=0;
				square=1;
				sin=0;
				cos=0;
				tan=0;
				log=0;
				ln=0;
				power=0;
			}
			if(source==buttonSin)
			{
				screen.setText(" ");
				add=0;
				substract=0;
				multi=0;
				division=0;
				square=0;
				sin=1;
				cos=0;
				tan=0;
				log=0;
				ln=0;
				power=0;
			}
			if(source==buttonCos)
			{
				screen.setText(" ");
				add=0;
				substract=0;
				multi=0;
				division=0;
				square=0;
				sin=0;
				cos=1;
				tan=0;
				log=0;
				ln=0;
				power=0;
			}
			if(source==buttonTan)
			{
				screen.setText(" ");
				add=0;
				substract=0;
				multi=0;
				division=0;
				square=0;
				sin=0;
				cos=0;
				tan=1;
				log=0;
				ln=0;
				power=0;
			}
			if(source==buttonLog)
			{
				screen.setText(" ");
				add=0;
				substract=0;
				multi=0;
				division=0;
				square=0;
				sin=0;
				cos=0;
				tan=0;
				log=1;
				ln=0;
				power=0;
			}
			if(source==buttonLn)
			{
				screen.setText(" ");
				add=0;
				substract=0;
				multi=0;
				division=0;
				square=0;
				sin=0;
				cos=0;
				tan=0;
				log=0;
				ln=1;
				power=0;
			}
			if(source==buttonPower)
			{
				number1=number_reader();
				screen.setText(" ");
				add=0;
				substract=0;
				multi=0;
				division=0;
				square=0;
				sin=0;
				cos=0;
				tan=0;
				log=0;
				ln=0;
				power=1;
			}
			if(source==buttonEqual)
			{
				number2=number_reader();
				if(add>0)
				{
					result=number1+number2;
					screen.setText(Double.toString(result));
				}
				if(substract>0)
				{
					result=number1-number2;
					screen.setText(Double.toString(result));
				}
				if(multi>0)
				{
					result=number1*number2;
					screen.setText(Double.toString(result));
				}
				if(division>0)
				{
					result=number1/number2;
					screen.setText(Double.toString(result));
				}
				if(square>0)
				{
					result=Math.sqrt(number2);
					screen.setText(Double.toString(result));
				}
				if(sin>0) {
					double x=Math.toRadians(number2);
					result=Math.sin(x);
					screen.setText(Double.toString(result));
				}
				if(cos>0) {
					double y=Math.toRadians(number2);
					result=Math.cos(y);
					screen.setText(Double.toString(result));
				}
				if(tan>0) {
					double z=Math.toRadians(number2);
					result=Math.tan(z);
					screen.setText(Double.toString(result));
				}
				if(log>0)
				{
					result=Math.log10(number2);
					screen.setText(Double.toString(result));
				}
				if(ln>0)
				{
					result=Math.log(number2);
					screen.setText(Double.toString(result));
				}
				if(power>0)
				{
					result=Math.pow(number1, number2);
					screen.setText(Double.toString(result));
				}
			}
		}
	}
	public double number_reader() {
		double num1;
		String s;
		s=screen.getText();
		num1=Double.valueOf(s);
		return num1;	
	}

}