package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblKupovniKurs;
	private JTextField jtfKupovni;
	private JComboBox comboBox;
	private JLabel lblProdajniKurs;
	private JTextField jtfProdajni;
	private JLabel lblIznos;
	private JTextField jtfIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton jrbKupovna;
	private JRadioButton jrbProdajna;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private JSlider slider;
	private ButtonGroup bg;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
		groupButtons();
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblKupovniKurs());
			panel.add(getJtfKupovni());
			panel.add(getComboBox());
			panel.add(getLblProdajniKurs());
			panel.add(getJtfProdajni());
			panel.add(getLblIznos());
			panel.add(getJtfIznos());
			panel.add(getLblVrstaTransakcije());
			panel.add(getJrbKupovna());
			panel.add(getJrbProdajna());
			panel.add(getBtnIzvrsiZamenu());
			panel.add(getBtnOdustani());
			panel.add(getSlider());
		}
		return panel;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(23, 28, 93, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getJtfKupovni() {
		if (jtfKupovni == null) {
			jtfKupovni = new JTextField();
			jtfKupovni.setEditable(false);
			jtfKupovni.setBounds(23, 53, 102, 20);
			jtfKupovni.setColumns(10);
		}
		return jtfKupovni;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(154, 53, 86, 20);
		}
		return comboBox;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(287, 28, 86, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getJtfProdajni() {
		if (jtfProdajni == null) {
			jtfProdajni = new JTextField();
			jtfProdajni.setEditable(false);
			jtfProdajni.setBounds(287, 53, 102, 20);
			jtfProdajni.setColumns(10);
		}
		return jtfProdajni;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(23, 94, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getJtfIznos() {
		if (jtfIznos == null) {
			jtfIznos = new JTextField();
			jtfIznos.setBounds(23, 119, 140, 20);
			jtfIznos.setColumns(10);
		}
		return jtfIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(235, 94, 86, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getJrbKupovna() {
		if (jrbKupovna == null) {
			jrbKupovna = new JRadioButton("Kupovna");
			jrbKupovna.setBounds(235, 118, 109, 23);
		}
		return jrbKupovna;
	}
	
	private void groupButtons(){
		bg = new ButtonGroup();
		bg.add(jrbKupovna);
		bg.add(jrbProdajna);
	}
	private JRadioButton getJrbProdajna() {
		if (jrbProdajna == null) {
			jrbProdajna = new JRadioButton("Prodajna");
			jrbProdajna.setBounds(235, 144, 109, 23);
		}
		return jrbProdajna;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String vrstaTransakcije = "";
					if(jrbKupovna.isSelected()){
						vrstaTransakcije = jrbKupovna.getText();
					}
					if(jrbProdajna.isSelected()){
						vrstaTransakcije = jrbProdajna.getText();
					}
					String s = "Valuta: "+comboBox.getSelectedItem().toString()+" Iznos: "+jtfIznos.getText()+
							" Vrsta transakcije: "+vrstaTransakcije;
					GUIKontroler.getMenjacnica().ispisiStatus(s);
				}
			});
			btnIzvrsiZamenu.setMinimumSize(new Dimension(120, 25));
			btnIzvrsiZamenu.setMaximumSize(new Dimension(120, 25));
			btnIzvrsiZamenu.setPreferredSize(new Dimension(120, 25));
			btnIzvrsiZamenu.setBounds(23, 230, 140, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setMaximumSize(new Dimension(120, 25));
			btnOdustani.setPreferredSize(new Dimension(120, 25));
			btnOdustani.setMinimumSize(new Dimension(120, 25));
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(249, 231, 140, 22);
		}
		return btnOdustani;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
			slider.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent arg0) {
					jtfIznos.setText(slider.getValue()+"");
				}
			});
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setPaintTicks(true);
			slider.setToolTipText("");
			slider.setBounds(10, 174, 399, 43);
		}
		return slider;
	}
}
