package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Costumer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String surname;
	private String name;
	private String street;
	private String location;
	private String phone;
	private Boolean grundversicherung;
	private String zusatzversicherungsstufe;
	private Integer kostenanteil;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Boolean getGrundversicherung() {
		return grundversicherung;
	}
	public void setGrundversicherung(Boolean grundversicherung) {
		this.grundversicherung = grundversicherung;
	}
	public String getZusatzversicherungsstufe() {
		return zusatzversicherungsstufe;
	}
	public void setZusatzversicherungsstufe(String zusatzversicherungsstufe) {
		this.zusatzversicherungsstufe = zusatzversicherungsstufe;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getKostenanteil() {
		return kostenanteil;
	}
	public void setKostenanteil(Integer kostenanteil) {
		this.kostenanteil = kostenanteil;
	}	
}
