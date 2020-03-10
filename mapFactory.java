/* Universidad del Valle de Guatemala
Maria Jose Morales 19145
Maria Isabel Montoya 19169
Hoja de Trabajo No. 6
HashTables 
mapFactory*/
import java.util.*; 
import java.util.concurrent.*; 

public class mapFactory{
	public Map getMap(int option){
		if(option==1){
			return new HashMap<K,V>();
		}
		else{
			if(option==2){
				return new TreeMap<K,V>();
			}
			else{
				return new LinkedHashMap<K,V>();
			}
		}
	}
}