package view;



import controller.impl.PersonaImpl;
import model.Persona;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonaImpl felipe= new PersonaImpl(1,"felipe");
		felipe.presentar();
		felipe.mover();
		felipe.getPersona().setEdad(31);
		felipe.decirEdad();
		
		
		felipe.setPersona(new Persona(2, "Ana Maria", 27));
		felipe.presentar();
		felipe.mover();
		felipe.decirEdad();
		
		
		
	

	}

}
