package projet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.jdom2.Document;
import org.jdom2.Element;


public class amiriqueNr {

	private JPanel pan_prin;
	private JLabel retour,image,cl,co,ci,ex;	
	private JLabel l1,l2,l3,l4,l5,l11,l22,l33,l44,l55;
	private JLabel b1,b2;
	private JFrame fen;
	private JComboBox <String>CB1;
	private JComboBox<String> CB2;
	double lati ;
	double longi;
	double time ;
	String Con ;
	String Cit ;
	JPanel panel = new JPanel();
	int lat,longu;
	 PrayTime prayers;
	 ArrayList<String> prayerTimes;
	Date date;
	
	Calendar cal;
	SimpleDateFormat sdf ;
	public amiriqueNr(){
		init();
		draw();
		
	}
	private void init(){
		fen=new JFrame();
		fen.setBounds(20, 20, 850, 650);
		fen.setDefaultCloseOperation(3);//exit on close val=3
		//this.setResizable(false);
		fen.setLayout(null);
		fen.setUndecorated(true);
		fen.setLocationRelativeTo(null);
		
		pan_prin =new JPanel();
		pan_prin.setBounds(0, 0, 850,650);
		pan_prin.setBackground(Color.white);
		pan_prin.setLayout(null);
		 date = new Date();
		 cal = Calendar.getInstance();
		 sdf = new SimpleDateFormat(" dd / MM / yyyy ");
		 
		 
		 
		image=new JLabel();
		Image img2=new ImageIcon(this.getClass().getResource("/862.jpg")).getImage().getScaledInstance(850,650,Image.SCALE_FAST);
		image.setIcon(new ImageIcon(img2));
		image.setBounds(0,0,850,650);
		l1 =new JLabel("Fajr :");
		l1.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l1.setForeground(Color.white);
		l1.setBounds(60,120,160,40);
		l2 =new JLabel("Dhuhr :");
		l2.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l2.setForeground(Color.white);
		l2.setBounds(60,200-30,160,40);
		l3 =new JLabel("Asr :");
		l3.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l3.setForeground(Color.white);
		l3.setBounds(60,250-30,160,40);
		l4 =new JLabel("Maghrib :");
		l4.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l4.setForeground(Color.white);
		l4.setBounds(60,300-30,160,40);
		l5 =new JLabel("Isha :");
		l5.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l5.setForeground(Color.white);
		l5.setBounds(60,320,160,40);
		
		l11 =new JLabel();
		l11.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l11.setForeground(Color.white);
		l11.setBounds(220,150-30,150,40);
		l22 =new JLabel();
		l22.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l22.setForeground(Color.white);
		l22.setBounds(220,200-30,150,40);
		l33 =new JLabel();
		l33.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l33.setForeground(Color.white);
		l33.setBounds(220,250-30,150,40);
		l44 =new JLabel();
		l44.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l44.setForeground(Color.white);
		l44.setBounds(220,300-30,150,40);
		l55 =new JLabel();
		l55.setFont(new Font("Tempus Sans ITC", Font.BOLD,35));
		l55.setForeground(Color.white);
		l55.setBounds(220,350-30,150,40);
		
		
		 cl = new JLabel();
		cl.setText(sdf.format(date));
		cl.setHorizontalAlignment(SwingConstants.CENTER);
		cl.setForeground(Color.white);
		cl.setFont(new Font("Tempus Sans ITC", Font.BOLD,27));
		
		cl.setBounds(80,60,250, 41);
		
		 co = new JLabel("Country : ");
			co.setHorizontalAlignment(SwingConstants.CENTER);
			co.setForeground(Color.white);
			co.setFont(new Font("Tempus Sans ITC", Font.BOLD,24));			
			co.setBounds(450,70,120, 41);
			
			ci = new JLabel("City : ");
			ci.setHorizontalAlignment(SwingConstants.CENTER);
			ci.setForeground(Color.white);
			ci.setFont(new Font("Tempus Sans ITC", Font.BOLD,24));
			ci.setBounds(470,150,100, 41);
		
		b1=new JLabel();
		Image b11=new ImageIcon(this.getClass().getResource("/right-chevron.png")).getImage().getScaledInstance(33, 33,Image.SCALE_FAST);
		b1.setIcon(new ImageIcon(b11));
		b1.setBounds(75+270-20,60,33,33);b1.setFocusable(false);
		b2=new JLabel();
		Image b22=new ImageIcon(this.getClass().getResource("/left-chevron.png")).getImage().getScaledInstance(33, 33,Image.SCALE_FAST);
		b2.setIcon(new ImageIcon(b22));
		b2.setBounds(75-20,60,33,33);b2.setFocusable(false);
		b1.addMouseListener(new MouseListener() {
			
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
			
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				date.setDate(date.getDate() + 1);
				cl.setText(sdf.format(date));
				cal.set(date.getYear(), date.getMonth(), date.getDay());
				aff();
				
			}
		});
b2.addMouseListener(new MouseListener() {
			
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
			
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				date.setDate(date.getDate() - 1);
				cl.setText(sdf.format(date));
				cal.set(date.getYear(), date.getMonth(), date.getDay());
				aff();
				
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
		fen.dispose();
		
	}
});
		
		retour=new JLabel();
		Image rt=new ImageIcon(this.getClass().getResource("/retour.png")).getImage().getScaledInstance(33, 33,Image.SCALE_FAST);
		retour.setIcon(new ImageIcon(rt));
		retour.setBounds(10,10,40,35);retour.setFocusable(false);
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
				new continent();
				fen. dispose();
				
			}
		});
		Vector<String> a = new Vector<String>();

		SAXBuilder sxb = new SAXBuilder();
		// getClass().getResource("A.png")
		
		Document doc = null;
		try {
			doc = sxb.build(new File("amNr.xml"));
		} catch (JDOMException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Element racin = doc.getRootElement();
		List<?> cont = racin.getChildren("country");
		Iterator<?> i = cont.iterator();

		while (i.hasNext()) {
			Element el = (Element) i.next();
			if (el.getAttributeValue("name").contains("--")) {
				int n = el.getAttributeValue("name").indexOf("--");
				String s = el.getAttributeValue("name").substring(0, n - 1);
				a.add(s);
			} else {
				a.add(el.getAttributeValue("name"));
			}

		}

		CB1 = new JComboBox<String>(a);
		CB1.setFont(new Font("Tempus Sans ITC", Font.BOLD,18));
		CB1.setBounds(570,70, 200, 46);
		CB1.setBackground(Color.white);
		CB1.setForeground(Color.blue.darker());
		CB1.setSelectedIndex(1);
		

		CB1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Con = CB1.getSelectedItem().toString();
				CB2.removeAllItems();

				SAXBuilder sxb2 = new SAXBuilder();
				String s2 = CB1.getSelectedItem().toString();
				if (s2.contains(" "))
				{
					s2=s2.replace(' ', '_');
				}
				s2 = s2.toLowerCase();
				Document doc2;
				try {
					
					doc2 = sxb2.build(new File(s2 + ".xml"));
					Element racin2 = doc2.getRootElement();
					List<?> cont2 = racin2.getChildren("city");
					Iterator<?> i2 = cont2.iterator();

					while (i2.hasNext()) {
						Element el2 = (Element) i2.next();
						if (el2.getAttributeValue("name").contains("--")) {
							int n = el2.getAttributeValue("name").indexOf("--");
							String s = el2.getAttributeValue("name").substring(0, n - 1);
							CB2.addItem(s);
						} else {
							CB2.addItem(el2.getAttributeValue("name"));
						}

					}
				} catch (JDOMException | IOException e1) {
					e1.printStackTrace();
				}

			}
		});

		Vector<String> a2 = new Vector<String>();

		SAXBuilder sxb2 = new SAXBuilder();
		String s2 = CB1.getSelectedItem().toString();
		if(s2.contains(" "))
		{
			s2.replace(' ', '_');
		}
		s2= s2.toLowerCase();
		Document doc2 = null;
		try {
			doc2 = sxb2.build(new File(s2 + ".xml"));
		} catch (JDOMException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Element racin2 = doc2.getRootElement();
		List<?> cont2 = racin2.getChildren("city");
		Iterator<?> i2 = cont2.iterator();

		while (i2.hasNext()) {
			Element el2 = (Element) i2.next();
			if (el2.getAttributeValue("name").contains("--")) {
				int n = el2.getAttributeValue("name").indexOf("--");
				String s = el2.getAttributeValue("name").substring(0, n - 1);
				a2.add(s);
			} else {
				a2.add(el2.getAttributeValue("name"));
			}
		}

		CB2 = new JComboBox<String>(a2);
		CB2.setFont(new Font("Tempus Sans ITC", Font.BOLD,18));
		CB2.setBounds(570,150, 200, 46);
		CB2.setBackground(Color.white);
		CB2.setForeground(Color.blue.darker());
		CB2.setEnabled(true);
		CB2.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				SAXBuilder sxb2 = new SAXBuilder();
				String s2 = CB1.getSelectedItem().toString();
				if(s2.contains(" "))
				{
					s2=s2.replace(' ', '_');
				}
				s2= s2.toLowerCase();
				
				Document doc2;
				try {
					s2=s2.toLowerCase();
					doc2 = sxb2.build(new File(s2 + ".xml"));
					Element racin2 = doc2.getRootElement();
					List<?> cont2 = racin2.getChildren("city");
					Iterator<?> i2 = cont2.iterator();

					while (i2.hasNext()) {
						Element el2 = (Element) i2.next();
						if (el2.getAttributeValue("name").contains("--")) {
							int n = el2.getAttributeValue("name").indexOf("--");
							String s = el2.getAttributeValue("name").substring(0, n - 1);
							if (s.equals(CB2.getSelectedItem())) {
								lati = Double.valueOf(el2.getChild("latitude").getText()) / 10000;
								longi = Double.valueOf(el2.getChild("longitude").getText()) / 10000;
								time = Double.valueOf(el2.getChild("timezone").getText()) / 100;
								
							}
							
						}
						
					
					}
				
				} catch (JDOMException | IOException e1) {
					e1.printStackTrace();
				}
				aff();
			}
			
		});
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	public void aff() {
		PrayTime prayers = new PrayTime();

		prayers.setTimeFormat(prayers.Time24);
		prayers.setCalcMethod(prayers.MWL);

		prayers.setAsrJuristic(prayers.Hanafi);
		prayers.setAdjustHighLats(prayers.AngleBased);
		
		int[] offsets = { 0, 0, 0, 0, 0, 0, 0 }; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
		prayers.tune(offsets);

//      Date now = new Date();
//      Calendar cal = Calendar.getInstance();
//      cal.setTime(now);
		ArrayList<String> prayerTimes = prayers.getPrayerTimes(cal,lati,longi,time);

		for (int i = 0; i < prayerTimes.size(); i++) {
			switch (i) {
			case 0:
				l11.setText(prayerTimes.get(i));
				break;
			case 2:
				l22.setText(prayerTimes.get(i));
				break;
			case 3:
				l33.setText(prayerTimes.get(i));
				break;
			case 5:
				l44.setText(prayerTimes.get(i));
				break;
			case 6:
				l55.setText(prayerTimes.get(i));
				break;
			}
			// System.out.println(prayerNames.get(i) + " - " + prayerTimes.get(i));
		}
	}
		

		




void draw() {
	
	pan_prin.add(retour);
	pan_prin.add(b1);
	pan_prin.add(b2);
	pan_prin.add(cl);
	pan_prin.add(l1);
	pan_prin.add(l2);
	pan_prin.add(l3);
	pan_prin.add(l4);
	pan_prin.add(l5);
	pan_prin.add(l11);
	pan_prin.add(l22);
	pan_prin.add(l33);
	pan_prin.add(l44);
	pan_prin.add(l55);
	pan_prin.add(co);
	pan_prin.add(ci);
	pan_prin.add(CB1);
	pan_prin.add(CB2);
	pan_prin.add(ex);
	pan_prin.add(image);
	fen.add(pan_prin);
	fen.setVisible(true);
}}