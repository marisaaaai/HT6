/* Universidad del Valle de Guatemala
Maria Jose Morales 19145
Maria Isabel Montoya 19169
Hoja de Trabajo No. 6
HashTables 
mapFactory*/
import java.util.*; 
import java.util.concurrent.*; 

public class mapFactory<K,V>{
	public map<K,V> getMap(int option){
		if(option==1){
			return new hashMap<K,V>();
		}
		else{
			if(option==2){
				return new treeMap<K,V>();
			}
			else{
				return new linkedHashMap<K,V>();
			}
		}
	}
}