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
public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//instance a scanner that reads what the user writes when we ask them to
		System.out.println("Bienvenido \\n Las impementaciones de mapas son las siguientes \n1. HashMap\n2. TreeMap\n3. LinkedHashMap\n Por favor ingrese el numero de la implementacion que usted desea ");
		int option = scan.nextInt();
		String archive = "cards_desc.txt";
		File fichero = new File(archive);
		Scanner s = null;
		ArrayList<String> keys = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
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
				if((dataArray[1].equals("Monstruo"))||(dataArray[1].equals("Hechizo"))||(dataArray[1].equals("Trampa"))){
					keys.add(dataArray[0]);
					values.add(dataArray[1]);
				}
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
		
		//BORRAR ESTO PRUEBA DE SPLIT 
		for(int i =0;i<keys.size();i++){
			System.out.println(keys.get(i)+" "+ values.get(i));
		}
	}
}