package controller.impl;

import controller.interfaces.IPersona;
import model.Persona;

public class PersonaImpl implements IPersona {

	private Persona persona ;
	
	public PersonaImpl(int id, String nombre) {
		persona = new Persona();
		persona.setId(id);
		persona.setNombre(nombre);
		
	}

	public PersonaImpl() {
		
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public void mover() {
		System.out.println(persona.getNombre()+" se esta moviendo");

	}

	@Override
	public void presentar() {
		System.out.println("mi nombre es: "+persona.getNombre());

	}

	@Override
	public void decirEdad() {
		System.out.println("la edad de: "+persona.getNombre()+" es: "+persona.getEdad());
		
	}

}
