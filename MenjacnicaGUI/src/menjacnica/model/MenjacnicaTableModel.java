package menjacnica.model;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;

import menjacnica.Kurs;
@SuppressWarnings("serial")
public class MenjacnicaTableModel extends AbstractTableModel{
	private final String[] kolone = {"Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"};
	private LinkedList<Kurs> kursevi; 
	
	public MenjacnicaTableModel(LinkedList<Kurs> kursevi) {
		if(kursevi==null){
			this.kursevi = new LinkedList<>();
		} else{
			this.kursevi = kursevi;
		}
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return kolone.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return kursevi.size();
	}

	@Override
	public Object getValueAt(int red, int kolona) {
		// TODO Auto-generated method stub
		Kurs k= new Kurs();
		k = kursevi.get(red);
		switch(kolona){
		case 0: return k.getSifra();
		case 1: return k.getSkraceniNaziv();
		case 2: return k.getProdajni();
		case 3: return k.getKupovni();
		case 4: return k.getSrednji();
		case 5: return k.getNaziv();
		default: return "";
		}
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return kolone[column];
	}
	
	
	
}
