package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.LinkedList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menjacnica.Kurs;
import menjacnica.model.MenjacnicaTableModel;

public class GUIKontroler extends JFrame {

	private JPanel contentPane;
	private static MenjacnicaGUI menjacnica;
	public static LinkedList<Kurs> kursevi = new LinkedList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menjacnica = new MenjacnicaGUI();
					menjacnica.setVisible(true);
					menjacnica.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIKontroler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public static void otvoriProzorZaUcitavanje() {
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(menjacnica.getParent());
		if(returnVal == jfc.APPROVE_OPTION){
			File file = jfc.getSelectedFile();
			menjacnica.ispisiStatus("Ucitaj fajl: "+file.getAbsolutePath());
		}

		
	}

	public static void otvoriProzorZaCuvanje() {
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showSaveDialog(menjacnica.getParent());
		if(returnVal == jfc.APPROVE_OPTION){
			File file = jfc.getSelectedFile();
			menjacnica.ispisiStatus("Sacuvaj fajl: "+file.getAbsolutePath());
		}
	}

	public static void ugasiAplikaciju() {
		int vrednost = JOptionPane.showConfirmDialog(menjacnica.getParent(), "Da li želite da izađete iz programa?", "EXIT", JOptionPane.YES_NO_CANCEL_OPTION);
		if(vrednost == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}

	public static void dodajUTabelu() {
		// TODO Auto-generated method stub
		menjacnica.osveziTabelu();
		
	}

	public static void otvoriProzorZaDodavanje() {
		// TODO Auto-generated method stub
		DodajKursGUI dodaj = new DodajKursGUI();
		dodaj.setVisible(true);
		dodaj.setLocationRelativeTo(null);
	}

	
	
	

}
