package calculator;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Calculator {

	public static void main(String[] args) {
		FrameWork obj=new FrameWork();
		obj.setSize(340,570);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setVisible(true);
		obj.setLocationRelativeTo(null);
		obj.setResizable(false);
		obj.setTitle("Calculator");
	}

}
