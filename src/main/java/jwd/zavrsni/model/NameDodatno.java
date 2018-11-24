package jwd.zavrsni.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class NameDodatno {

	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@Column
	private Integer kolicina;
//	@ManyToOne(fetch=FetchType.EAGER)
//	private Linija linija;
	
	
	//SET I GET
	
	//SET LINIJA 
	
	
//	public void setLinija(Linija linija) {
//		this.linija = linija;
//		if(linija!=null && !linija.getKupovine().contains(this)){
//			linija.getKupovine().add(this);
//		}
//	}
	

	
	
}
