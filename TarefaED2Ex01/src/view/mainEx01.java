package view;

import javax.swing.JOptionPane;

import controller.Ex01;


public class mainEx01 {
	public static void main (String args[]) {
		Ex01 m = new Ex01();
		
		int a =0; 
		int b = 0;
		int resp = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o b"));
		
		resp = m.Multiplica(a, b, 1, 0);
		System.out.println(resp);
		
		
	}

}
