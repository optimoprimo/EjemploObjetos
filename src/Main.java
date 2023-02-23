import Esquimal.Esquimal;
import persona.Persona;

public class Main {
	
	public static void main(String[] args) {
		
		// crear una objeto
		
		Persona alain = new Persona();
		Persona paco = new Persona("hombre", 5, 6);
		
		// ¿Se puede llamar a un metodo de una clase sin un objeto?
		System.out.println( Persona.getClase() );
		
		// Persona hereda de Object por lo que tiene metodos de Object
		System.out.println(alain.hashCode());
		
		// Pero podemos sobreescribir lo que hacen estos metodos
		System.out.println(alain.toString());
		
		// Podemos crear clases que hereden de nuestras clases
		Esquimal mindu = new Esquimal();
		Esquimal sara = new Esquimal(1, "mujer");
		
		// Estas heredan los metodos
		mindu.setBrazos(50);
		System.out.println(mindu.getBrazos());
		
		// Explicación polimorfismo
		Persona ander = new Esquimal();
		//Esquimal jon = new Persona();
		
		System.out.println( paco.getNombre() );
		System.out.println( ander.getNombre() );
		
		// interfaces y clases abstractas

	}
}
