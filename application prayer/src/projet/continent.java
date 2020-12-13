package projet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class continent {
	private JPanel pan_prin;
	private JLabel l,retour,image;	
	private JLabel amnr,amsd,af,as,aus,eu;
	private JFrame fen;
	public continent() {
		init();
		draw();
		
	}
	private void init() {
		fen=new JFrame();
		fen.setBounds(20, 20, 850, 650);
		fen.setDefaultCloseOperation(3);//exit on close val=3
		//this.setResizable(false);
		fen.setLayout(null);
		fen.setUndecorated(true);
		fen.setLocationRelativeTo(null);
		fen.setTitle("continent");
		pan_prin =new JPanel();
		pan_prin.setBounds(0, 0, 850,650);
		pan_prin.setBackground(Color.white);
		pan_prin.setLayout(null);
		image=new JLabel();
		Image img2=new ImageIcon(this.getClass().getResource("/back-01.png")).getImage().getScaledInstance(850,650,Image.SCALE_FAST);
		image.setIcon(new ImageIcon(img2));
		image.setBounds(0,0,850,650);
		/*titre*/
		l=new JLabel("Choose one");l.setBounds(850/2-100,10,300,40);
		l.setForeground(Color.green.darker());  
		Font police = new Font("Tempus Sans ITC", Font.BOLD,40);  //On l'applique au JLabel 
		l.setFont(police); 
		/*les cont*/
		amnr=new JLabel();
		Image an=new ImageIcon(this.getClass().getResource("/nordAm-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST);
		amnr.setIcon(new ImageIcon(an));
		
		amsd=new JLabel();
		Image asd=new ImageIcon(this.getClass().getResource("/sudAm-01-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
		amsd.setIcon(new ImageIcon(asd));
		af=new JLabel();
		Image afr=new ImageIcon(this.getClass().getResource("/afric-01-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
		af.setIcon(new ImageIcon(afr));
		
		as=new JLabel();
		Image asi=new ImageIcon(this.getClass().getResource("/asie-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
		as.setIcon(new ImageIcon(asi));
		
		aus=new JLabel();
		Image aust=new ImageIcon(this.getClass().getResource("/aust-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
		aus.setIcon(new ImageIcon(aust));
		eu=new JLabel();
		Image eur=new ImageIcon(this.getClass().getResource("/europe-01-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
		eu.setIcon(new ImageIcon(eur));
		
		
		amnr.setBounds(30,100,250,200);
		amsd.setBounds(30,150+180,250,200);
		af.setBounds(80+200,330,250,200);
		as.setBounds(550,100,250,200);
		aus.setBounds(550,330,250,200);
		eu.setBounds(280,100,250,200);
		retour=new JLabel();
		Image rt=new ImageIcon(this.getClass().getResource("/retour.png")).getImage().getScaledInstance(33, 33,Image.SCALE_FAST);
		retour.setIcon(new ImageIcon(rt));
		retour.setBounds(10,10,40,35);
		
		amnr.setFocusable(false);
		amsd.setFocusable(false);
		af.setFocusable(false);
		as.setFocusable(false);
		aus.setFocusable(false);
		eu.setFocusable(false);
		retour.setFocusable(false);
		retour.addMouseListener(new MouseListener() {
			
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
				new start();
				fen. dispose();
				
			}
		});
		amnr.addMouseListener(new MouseListener() {
			
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
				Image an=new ImageIcon(this.getClass().getResource("/nordAm-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST);
				amnr.setIcon(new ImageIcon(an));
				amnr.setBounds(30,100,250,200);
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Image an=new ImageIcon(this.getClass().getResource("/nordAm-01-01.png")).getImage().getScaledInstance(300,250,Image.SCALE_FAST);
				amnr.setIcon(new ImageIcon(an));
				amnr.setBounds(30,100,300,250);
			
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new amiriqueNr();
				fen.dispose();
				
			}
		});
amsd.addMouseListener(new MouseListener() {
			
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
				Image asd=new ImageIcon(this.getClass().getResource("/sudAm-01-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
				amsd.setIcon(new ImageIcon(asd));
				amsd.setBounds(30,150+180,250,200);
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Image asd=new ImageIcon(this.getClass().getResource("/sudAm-01-01-01.png")).getImage().getScaledInstance(300,250,Image.SCALE_FAST); 
				amsd.setIcon(new ImageIcon(asd));
				amsd.setBounds(30,150+180,300,250);
			
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new amiriqueSd();
				fen.dispose();
				
			}
		});

af.addMouseListener(new MouseListener() {
	
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
		Image afr=new ImageIcon(this.getClass().getResource("/afric-01-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
		af.setIcon(new ImageIcon(afr));
		af.setBounds(80+200,330,250,200);
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Image afr=new ImageIcon(this.getClass().getResource("/afric-01-01-01.png")).getImage().getScaledInstance(300,250,Image.SCALE_FAST); 
		af.setIcon(new ImageIcon(afr));
		af.setBounds(80+200,330,300,250);
	
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		new afrique();
		fen.dispose();
		
	}
});

as.addMouseListener(new MouseListener() {
	
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
		Image asi=new ImageIcon(this.getClass().getResource("/asie-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
		as.setIcon(new ImageIcon(asi));
		as.setBounds(550,100,250,200);
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Image asi=new ImageIcon(this.getClass().getResource("/asie-01-01.png")).getImage().getScaledInstance(300,250,Image.SCALE_FAST); 
		as.setIcon(new ImageIcon(asi));
		as.setBounds(550,100,300,250);
	
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		new asie();
		fen.dispose();
		
	}
});

aus.addMouseListener(new MouseListener() {
	
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
		Image aust=new ImageIcon(this.getClass().getResource("/aust-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
		aus.setIcon(new ImageIcon(aust));
		aus.setBounds(550,330,250,200);
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Image aust=new ImageIcon(this.getClass().getResource("/aust-01-01.png")).getImage().getScaledInstance(300,250,Image.SCALE_FAST); 
		aus.setIcon(new ImageIcon(aust));
		aus.setBounds(550,330,300,250);
	
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		new australie();
		fen.dispose();
		
	}
});
eu.addMouseListener(new MouseListener() {
	
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
		Image eur=new ImageIcon(this.getClass().getResource("/europe-01-01-01.png")).getImage().getScaledInstance(250,200,Image.SCALE_FAST); 
		eu.setIcon(new ImageIcon(eur));
		eu.setBounds(280,100,250,200);
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Image eur=new ImageIcon(this.getClass().getResource("/europe-01-01-01.png")).getImage().getScaledInstance(300,250,Image.SCALE_FAST); 
		eu.setIcon(new ImageIcon(eur));
		eu.setBounds(280,100,300,250);
	
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		new europe();
		fen.dispose();
		
	}
});
}
	
	void draw() {
		pan_prin.add(amnr);
		pan_prin.add(amsd);
		pan_prin.add(af);
		pan_prin.add(as);
		pan_prin.add(aus);
		pan_prin.add(eu);
		pan_prin.add(retour);
		pan_prin.add(l);
		pan_prin.add(image);
		fen.add(pan_prin);
		fen.setVisible(true);
	}
}
