package projet;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class start {
	private JPanel pan_prin;
	private JLabel st,ex;
	JLabel image;
	private JFrame fen_pre;

	public start() {
		init();
		draw();
	}
	private void init() {
		fen_pre =new JFrame();
		fen_pre.setBounds(0,0, 850, 650);
		fen_pre.setDefaultCloseOperation(3);//exit on close val=3
		//this.setResizable(false);
		fen_pre.setUndecorated(true);
		fen_pre.setLayout(null);
	
		fen_pre.setTitle("times prayer");
		fen_pre.setLocationRelativeTo(null);
		pan_prin=new JPanel();
		pan_prin.setBounds(0, 0, 850,650);
		pan_prin.setBackground(Color.white);
		pan_prin.setLayout(null);
		image=new JLabel();
		
		Image img2=new ImageIcon(this.getClass().getResource("/bg-01-01.png")).getImage().getScaledInstance(850,650,Image.SCALE_FAST);
		image.setIcon(new ImageIcon(img2));
		image.setBounds(0,0,850,650);
		st=new JLabel();
		Image str=new ImageIcon(this.getClass().getResource("/btn-01-01.png")).getImage().getScaledInstance(250,120,Image.SCALE_FAST);
		st.setIcon(new ImageIcon(str));
		st.setBounds(290,450,250,120);
	
			st.setFocusable(false);
			

			st.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					st.setBounds(290,450,250,120);
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
					st.setBounds(290,450,250,150);
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					new continent();
					fen_pre.dispose();
					
				}
			});
			ex=new JLabel();
			Image ext=new ImageIcon(this.getClass().getResource("/exit-01.png")).getImage().getScaledInstance(33, 33,Image.SCALE_FAST);
			ex.setIcon(new ImageIcon(ext));
			ex.setBounds(800,10,40,35);ex.setFocusable(false);
			ex.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					fen_pre.dispose();
					
				}
			});

		
	}
	public void draw() {
	 
		pan_prin.add(st);
		pan_prin.add(ex);
		pan_prin.add(image);
		
		
		fen_pre.add(pan_prin);
		fen_pre.setVisible(true);
		
	}
	
}
