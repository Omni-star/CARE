package it.unisannio.ingsof20_21.group8.CARE_MVC.Model.Util;

import java.util.Iterator;
import java.util.LinkedList;

import it.unisannio.ingsof20_21.group8.CARE_MVC.Model.Blood.BloodBag;

/*
 * Hermann: no, questa classe che potrebbe anche essere astratta, definisce una locazione, può essere dov'è situata una sacca o la città di un utente.
 */

public class Location {

	/*
	 * Costruttore della classe 'Location'.
	 * 
	 * @param country enum 'Country' che indica la nazione del nodo.
	 * @param region enum 'Region' che indica la regione del nodo.
	 * @param province enum 'Province' che indica la provincia del nodo.
	 * @param city enum 'City' che indica la città del nodo.
	 * @param streetNumber L'intero che indica il numero civico della strada del nodo.
	 * @param street La stringa che indica la strada del nod.
	 */
    public Location(
    				Country country, 	Region region, 			Province province,
    				City city, 			String streetNumber, 	String street
    		) {
    	this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.province = province;
        this.region = region;
        this.country = country;
    }


    
    public String getStreet() { return street; }
    
    public String getStreetNumber() { return streetNumber; }
    
    public City getCity() { return city; }
    
    public Province getProvince() { return province; }
    
    public Region getRegion() { return region; }
    
    public Country getCountry() { return country; }
        
    public void setStreet(String streetR) { street = streetR; }
    
    public void setStreetNumber(String streetNumberR) { streetNumber = streetNumberR; }
    
    public void setCity(String cityR) { city = City.valueOf(cityR); }
    
    public void setProvince(String provinceR) { province = Province.valueOf(provinceR); }
    
    public void setRegion(String regionR) { region = Region.valueOf(regionR); }
    
    public void setCountry(String countryR) { country = Country.valueOf(countryR); }
    
    
    
	private enum Country {
		Italy, Spain, Croatia, Greece;
	}
	
	private enum Region {
		Abruzzo, Basilicata, Bolzano, Calabria, Campania, Emilia_Romagna, Friuli_Venezia_Giulia, Lazio,	Liguria, Lombardia,	Marche,	Molise, Piemonte, Puglia, Sardegna, Sicilia, Toscana, Trento, Umbria, Valle_d_Aosta, Veneto;
		}
	
	private enum Province {
		
		Chieti, Potenza, Bolzano, Catanzaro, Napoli, Bologna, Udine, Roma, Genova, Varese, Ancona, Campobasso, Torino, Bari, Cagliari, Palermo, Firenze, Trento, Perugia, Aosta, Padova, Benevento, Avellino, Salerno, Caserta;
		
	}
	
	private enum City {
		Chieti, Potenza, Bolzano, Catanzaro, Napoli, Bologna, Udine, Roma, Genova, Varese, Ancona, Campobasso, Torino, Bari, Cagliari, Palermo, Firenze, Trento, Perugia, Aosta, Padova, Benevento, Avellino, Salerno, Caserta;
	}
    
	private String street, streetNumber;          
    private City city;              
    private Province province;           
    private Region region;
    private Country country; 
}
