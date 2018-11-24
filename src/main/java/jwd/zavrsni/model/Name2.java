package jwd.zavrsni.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table
public class Name2 {

	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String naziv;
	@Column
	private String adresa;
	@Column
	private String pib;
//	@OneToMany(mappedBy="prevoznik",cascade=CascadeType.REMOVE)
//	private List<Linija> linije = new ArrayList<>();
	
	//GET I SET
	
	
	//ADD LINIJA
	
	
//	public void addLinija(Linija linija){
//		this.linije.add(linija);
//		
//		if(linija.getPrevoznik()!=this){
//			linija.setPrevoznik(this);
//		}
//	}
	
	//REMOVE LINIJA
	
//	public void removeLinija(Linija linija){
//		linija.setPrevoznik(null);
//		linije.remove(linija);
//	}
	
	
}
