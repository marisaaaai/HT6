/* Universidad del Valle de Guatemala
Maria Jose Morales 19145
Maria Isabel Montoya 19169
Hoja de Trabajo No. 6
HashTables 
HashMap*/
import java.util.*; 
import java.util.concurrent.*; 
public class HashMap<K,V> implements Map<K,V>{
	
	//We create a variable where we will save our HasMap
	private HashMap<K,V> map;
	//we create our map
	public HashMap(){
		this.map= new HashMap<K,V>();
	}
	
	//IT RETURNS THE SIZE OF THE HASHTAHBLE
	public int size(){
		return.this.map.size();
	}
	
	//Adds a key and value to our map
	public void add(K key, V value){
		this.map.put(key, value);
	}
	
	//get the value of the key used as paremeter
	public V get(K key){
		V temp=null;
		if(this.map.containsKey(key)){
			temp=this.map.get(key);
		}
		return temp;
	}
	
	//sorts keys
	public ArrayList<K> sortKeys(){
		//Auto generated
	}
	
	//sorts values
	public ArrayList<V> sortValues(){
		//Auto generated
	}
	
	//returns a Set view of the mappings contained in this map
	public Set<Map.Entry<K,V>> allEntries(){
		return this.map.entrySet();
	}
}