package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("application");
		String titre = bundle.getString("titre");
		String asciiArt = FigletFont.convertOneLine(titre);
		System.out.println(asciiArt);
		
		//affichage de l'environnement
		String environnement = ResourceBundle.getBundle("application").getString("environement"); 
		System.out.println("Environnement : "+ environnement);
	}
}
