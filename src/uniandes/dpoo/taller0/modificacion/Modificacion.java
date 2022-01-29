package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	public static void main(String[] args) {
		System.out.println("Hola, mundo!");
	
	
	CalculadoraEstadisticas calc = null;
	try {
		calc = LoaderOlimpicos.cargarArchivo("./data/atelatas.csv");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(calc.paisConMasMedallistas());
	}
	
}
