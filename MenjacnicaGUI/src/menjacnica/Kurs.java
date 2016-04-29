package menjacnica;

public class Kurs {
	private String sifra, naziv, skraceniNaziv, prodajni, kupovni, srednji;

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public String getProdajni() {
		return prodajni;
	}

	public void setProdajni(String prodajni) {
		this.prodajni = prodajni;
	}

	public String getKupovni() {
		return kupovni;
	}

	public void setKupovni(String kupovni) {
		this.kupovni = kupovni;
	}

	public String getSrednji() {
		return srednji;
	}

	public void setSrednji(String srednji) {
		this.srednji = srednji;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sifra: "+sifra+" Naziv: "+naziv+" Skraceni naziv: "+skraceniNaziv+
				"\n Prodajni kurs: "+prodajni+" Kupovni kurs: "+kupovni+" Srednji kurs: "+srednji;
	}

}
