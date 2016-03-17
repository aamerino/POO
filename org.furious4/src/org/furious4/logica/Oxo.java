package org.furious4.logica;

public class Oxo {
	
	public enum Ficha{
		X , O;
	}

	public static final int filas = 3;
	public static final int columnas = 3;
	Fichas[][] tablero = new Fichas[filas][columnas];
	
	public static boolean ponerFicha(int fila, int columna){
		if (checkFila(fila) && checkColumna(columna)){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean checkFila(int fila){
		return checkLimites(fila);
	}
	
	public static boolean checkColumna(int columna){
		return checkLimites(columna);
	}
	
	public static boolean checkLimites(int posicion){
		if(posicion < 1 || posicion > 3){
			return false;
		}else{
			return true;
		}
	}


	
	
}
