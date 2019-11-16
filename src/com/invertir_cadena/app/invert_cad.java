package com.invertir_cadena.app;

public class invert_cad 
{

	public static void main(String[] args) 
	{
		
		
//////////////////////Método 1//////////////////////////////		
		//Se declara una cadena de strings
	    String cadena= "esto es una prueba";
	    String sCadenaInvertida2 ="";
	    
	    //se crea un objeto llamado builder de la clase StringBuilder
	    StringBuilder builder=new StringBuilder(cadena);
	    
	    //se asigna el valor de builder.reverse y se convierte a string
	    String sCadenaInvertida=builder.reverse().toString();
	    
	    System.out.println("Metodo 1: "+sCadenaInvertida);
	    
	    
//////////////////////Método 2//////////////////////////////		
	    for (int x=cadena.length()-1;x>=0;x--)
	    {
    		sCadenaInvertida2 = sCadenaInvertida2 + cadena.charAt(x);
	    }
	    System.out.println("Metodo 2: "+sCadenaInvertida2);

	}

}
