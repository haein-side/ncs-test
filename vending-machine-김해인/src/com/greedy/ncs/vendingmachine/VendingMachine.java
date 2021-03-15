package com.greedy.ncs.vendingmachine;


import java.awt.Component;
import java.awt.GridLayout;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VendingMachine extends JFrame {

	public static void main(String[] args) {
		
		new VendingMachine();
	}
	
	
	public VendingMachine() {
	
			
		super("더조은 자판기");
		this.setVisible(true);
		
		this.setBounds(300,200,800,500);
		this.setLayout(new GridLayout(2,5));
		
		Set set = new LinkedHashSet();
		
		while(set.size() < 8) {
			set.add(new Integer((int)new Random().nextInt(8) + 1));
		}
		
		Object[] obj = set.toArray();
		Object[] juice = {"사이다", "환타", "콜라", "핫식스", "바카스", "우유", "레몬녹차", "오렌지주스"};
		
		for(int i = 0; i < obj.length; i ++) {
			obj[i] = juice[i];
		}
		
		
		
		for(int i = 0; i < obj.length; i++) {
			String str = obj[i].toString();
			this.add(new JButton(str));
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
}
