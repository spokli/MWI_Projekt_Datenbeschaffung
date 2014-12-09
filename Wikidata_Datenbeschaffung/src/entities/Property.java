package entities;

import java.util.HashMap;

import org.wikidata.wdtk.datamodel.interfaces.MonolingualTextValue;

/**
 * Representation of a property from Wikidata with P-ID
 * Contains the id (as a String because of leading 'P'), Map of description and label by language
 * 
 * @author Marco Kinkel
 * @version 0.1
 */
public class Property {
	
	public String id;
	public HashMap<String, MonolingualTextValue> desc;
	public HashMap<String, MonolingualTextValue> label;

}
