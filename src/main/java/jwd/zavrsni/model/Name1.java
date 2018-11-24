package jwd.zavrsni.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;





@Entity
@Table
public class Name1 {
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private Integer brojMesta;
	@Column
	private Double cena;
	@Column
	private String vremePolaska;
	@Column
	private String destinacija;
//	@ManyToOne(fetch=FetchType.EAGER)
//	private Prevoznik prevoznik;

	//GET I SET
	
	// SET PREVOZNIK
	
	
	//	public void setPrevoznik(Prevoznik prevoznik) {
//		this.prevoznik = prevoznik;
//		if(prevoznik!=null && !prevoznik.getLinije().contains(this)){
//			prevoznik.getLinije().add(this);
//		}
//	}
	
	
	
	//KUPOVINA
	
	
//	public void addKupovina(Kupovina kupovina){
//		this.kupovine.add(kupovina);
//		
//		if(!this.equals(kupovina.getLinija())){
//			kupovina.setLinija(this);
//		}
//	}
}
