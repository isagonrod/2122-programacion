package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.12
 * Abre el fichero de la Actividad de aplicación 11.11,
 * lee el valor double contenido en él y muéstralo por pantalla
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Act_12 {
	public static void main (String[] args) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/act_apli_11.dat"))) {
			System.out.println(in.readDouble());
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
