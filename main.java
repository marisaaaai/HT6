/* Universidad del Valle de Guatemala
Maria Jose Morales 19145
Maria Isabel Montoya 19169
Hoja de Trabajo No. 6
HashTables 
Main*/
//Se importan los paquetes necesarios 
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.*; 
public class main {
	
	public static void main(String[] args) {
		mapFactory<String,String> Factory = new mapFactory<String,String>();
		Scanner scan = new Scanner(System.in);//instance a scanner that reads what the user writes when we ask them to
		System.out.println("Bienvenido \\n Las impementaciones de mapas son las siguientes \n1. HashMap\n2. TreeMap\n3. LinkedHashMap\n Por favor ingrese el numero de la implementacion que usted desea ");
		int option = scan.nextInt();
		scan.nextLine(); 
		String archive = "cards_desc.txt";
		File fichero = new File(archive);
		Scanner s = null;
		map<String,String> usuario = Factory.getMap(option); 
		map<String,String> datos = Factory.getMap(option); 
		//Variable where we keep all of the String that we can find on the txt
		String linea = "";
		//we create a try that tries to read txt that catches if the txt does not exist
		try {
			//the scanner reads the file
			s = new Scanner(fichero);
			while(s.hasNextLine()){
				//what the scanner reads it saves it on linea
				linea = s.nextLine();
				String[] dataArray = linea.split("\\|");
				datos.add(dataArray[0], dataArray[1]);
			}
		}
		//if the txt does not exist it prints the exception message
		catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		}
		//FInally we close the txt
		finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
		int n=0;
		while(n!=2){
			System.out.println("Ingrese la operación que desea realizar: \n1. Agregar una carta a la colección del usuario.\n2. Mostrar el tipo de una carta específica.\n3. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección.\n4. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección, ordenadas por tipo.\n5. Mostrar el nombre y tipo de todas las cartas existentes.\n6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
			int operacion = scan.nextInt();
			scan.nextLine();
			if(operacion == 1){
				System.out.println("Ingrese el nombre y el tipo de su carta nueva separada por un |: ");
				String cartanueva = scan.nextLine(); 
				String[] split = cartanueva.split("\\|");
				String llave = split[0];
				if(datos.get(llave)==null){
					System.out.println("La carta que ingreso no existe");
				}
				else{
					usuario.add(split[0],split[1]);
					System.out.println("La carta fue agregada");
				}
			}
			else if(operacion == 2){
				System.out.println("Ingrese el nombre de la carta que desea conocer");
				String solicitudCarta = scan.nextLine();
				if(datos.get(solicitudCarta)==null){
					System.out.println("La carta que ingreso no existe");
				}
				else{
					System.out.println("El tipo de su carta es: "+datos.get(solicitudCarta));
				}			
			}
			else if(operacion == 3){
				String mostrar = "";
				for(Map.Entry m: usuario.allEntries()){
					mostrar = mostrar + "Nombre: " + m.getKey().toString() + " Tipo: " + m.getValue().toString() + "\n";
				}
				System.out.println(mostrar);
			}
			else if(operacion == 6){
				
			}
			else if(operacion == 5){
				String mostrar = "";
				for(Map.Entry m: datos.allEntries()){
					mostrar = mostrar + "Nombre: " + m.getKey().toString() + " Tipo: " + m.getValue().toString() + "\n";
				}
				System.out.println(mostrar);				
			
			}
			else if(operacion == 4){

			}
			else{
				System.out.println("La opcion ingresada es invalida");
			}
			System.out.println("\nDesea continuar?\n1. Si \n2. No\n Ingrese su opcion: ");
			n=scan.nextInt();
		}
	}
}