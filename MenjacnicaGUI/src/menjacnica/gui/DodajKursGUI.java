package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menjacnica.Kurs;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblSifra;
	private JTextField jtfSifra;
	private JTextField jtfNaziv;
	private JLabel lblNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField jtfProdajni;
	private JTextField jtfKupovni;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraeniNaziv;
	private JTextField jtfSrednji;
	private JTextField jtfSkraceniNaziv;
	private JButton btnDodajKurs;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblSifra());
			panel.add(getJtfSifra());
			panel.add(getJtfNaziv());
			panel.add(getLblNaziv());
			panel.add(getLblProdajniKurs());
			panel.add(getLblKupovniKurs());
			panel.add(getJtfProdajni());
			panel.add(getJtfKupovni());
			panel.add(getLblSrednjiKurs());
			panel.add(getLblSkraeniNaziv());
			panel.add(getJtfSrednji());
			panel.add(getJtfSkraceniNaziv());
			panel.add(getBtnDodajKurs());
			panel.add(getBtnOdustani());
		}
		return panel;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("\u0160ifra");
			lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblSifra.setBounds(10, 13, 102, 18);
		}
		return lblSifra;
	}
	private JTextField getJtfSifra() {
		if (jtfSifra == null) {
			jtfSifra = new JTextField();
			jtfSifra.setMinimumSize(new Dimension(100, 25));
			jtfSifra.setMaximumSize(new Dimension(100, 25));
			jtfSifra.setPreferredSize(new Dimension(100, 25));
			jtfSifra.setBounds(10, 40, 138, 25);
			jtfSifra.setColumns(10);
		}
		return jtfSifra;
	}
	private JTextField getJtfNaziv() {
		if (jtfNaziv == null) {
			jtfNaziv = new JTextField();
			jtfNaziv.setPreferredSize(new Dimension(100, 25));
			jtfNaziv.setMinimumSize(new Dimension(100, 25));
			jtfNaziv.setMaximumSize(new Dimension(100, 25));
			jtfNaziv.setColumns(10);
			jtfNaziv.setBounds(169, 40, 138, 25);
		}
		return jtfNaziv;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(169, 13, 46, 14);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 78, 90, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(169, 76, 84, 18);
		}
		return lblKupovniKurs;
	}
	private JTextField getJtfProdajni() {
		if (jtfProdajni == null) {
			jtfProdajni = new JTextField();
			jtfProdajni.setPreferredSize(new Dimension(100, 25));
			jtfProdajni.setMinimumSize(new Dimension(100, 25));
			jtfProdajni.setMaximumSize(new Dimension(100, 25));
			jtfProdajni.setColumns(10);
			jtfProdajni.setBounds(10, 107, 138, 25);
		}
		return jtfProdajni;
	}
	private JTextField getJtfKupovni() {
		if (jtfKupovni == null) {
			jtfKupovni = new JTextField();
			jtfKupovni.setPreferredSize(new Dimension(100, 25));
			jtfKupovni.setMinimumSize(new Dimension(100, 25));
			jtfKupovni.setMaximumSize(new Dimension(100, 25));
			jtfKupovni.setColumns(10);
			jtfKupovni.setBounds(169, 107, 138, 25);
		}
		return jtfKupovni;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 143, 84, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraeniNaziv() {
		if (lblSkraeniNaziv == null) {
			lblSkraeniNaziv = new JLabel("Skra\u0107eni naziv");
			lblSkraeniNaziv.setBounds(169, 143, 84, 14);
		}
		return lblSkraeniNaziv;
	}
	private JTextField getJtfSrednji() {
		if (jtfSrednji == null) {
			jtfSrednji = new JTextField();
			jtfSrednji.setPreferredSize(new Dimension(100, 25));
			jtfSrednji.setMinimumSize(new Dimension(100, 25));
			jtfSrednji.setMaximumSize(new Dimension(100, 25));
			jtfSrednji.setColumns(10);
			jtfSrednji.setBounds(10, 168, 138, 25);
		}
		return jtfSrednji;
	}
	private JTextField getJtfSkraceniNaziv() {
		if (jtfSkraceniNaziv == null) {
			jtfSkraceniNaziv = new JTextField();
			jtfSkraceniNaziv.setPreferredSize(new Dimension(100, 25));
			jtfSkraceniNaziv.setMinimumSize(new Dimension(100, 25));
			jtfSkraceniNaziv.setMaximumSize(new Dimension(100, 25));
			jtfSkraceniNaziv.setColumns(10);
			jtfSkraceniNaziv.setBounds(169, 168, 138, 25);
		}
		return jtfSkraceniNaziv;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Kurs k = new Kurs();
					k.setSifra(jtfSifra.getText());
					k.setNaziv(jtfNaziv.getText());
					k.setSkraceniNaziv(jtfSkraceniNaziv.getText());
					k.setProdajni(jtfProdajni.getText());
					k.setKupovni(jtfKupovni.getText());
					k.setSrednji(jtfSrednji.getText());
					MenjacnicaGUI m = new MenjacnicaGUI();
					m.ispisiStatus(k.toString());
					GUIKontroler.kursevi.add(k);
					GUIKontroler.dodajUTabelu();
					dispose();
				}
			});
			btnDodajKurs.setPreferredSize(new Dimension(138, 25));
			btnDodajKurs.setBounds(10, 215, 138, 25);
		}
		return btnDodajKurs;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(169, 215, 138, 25);
		}
		return btnOdustani;
	}
}
