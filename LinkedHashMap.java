/* Universidad del Valle de Guatemala
Maria Jose Morales 19145
Maria Isabel Montoya 19169
Hoja de Trabajo No. 6
HashTables 
LinkedHashMap*/
import java.util.*; 
import java.util.concurrent.*; 
public class LinkedHashMap<K,V> implements Map<K,V>{
	
	//we instance a hashmap
	private LinkedHashMap<K,V> map;
	//we create the hash map
	public LinkedHashMap(){
		this.map = new LinkedHashMap<K,V>();
	}
	//returns the size of the LinkedHashMap
	public int size(){
		//Auto-generated
	}
	//Adds values to the Linkedhashmap
	public void add(K key, V value){
		this.map.put(key,value);
	}
	//it returns the value of the key that acts as a parameter
	public V get(K key){
		V temp=null;
		if(this.map.containsKey(key)){
			temp=this.map.get(key);
		}
		return temp;
	}
	//Sorts Keys
	public ArrayList<K> sortKeys(){
		//Auto generated
	}
	//Sorts values
	public ArrayList<V> sortValues(){
		//Auto generated
	}
	//returns a Set view of the mappings contained in this map
	public Set<Map.Entry<K,V>> allEntries(){
		return this.map.entrySet();
	}
}