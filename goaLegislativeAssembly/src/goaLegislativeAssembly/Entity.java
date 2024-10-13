package goaLegislativeAssembly;

//AUTHOR NAME: LAXMI CHARI
//ROLL NO: 22
//TITLE: IMITATION OF GOA LEGISLATIVE ASSEMBLY
//START DATE: 15/07/2024
//MODIFIED DATE: 22/07/2024
//DESCRIPTION: THIS IS AN ABSTRACT CLASS TO BE EXTENDED BY FOLLOWING CLASSES IN THIS PROJECT 

//Abstract base class for entities like Bill, MLA, Official, Session
public abstract class Entity {
	//Abstraction: The Entity class is abstract, meaning it cannot be instantiated directly. It provides a template for other classes (like Bill, MLA, Official, and Session) to follow.
	//It defines the structure and behavior that all subclasses must implement, but it doesn't provide any implementation details itself.
@Override
public abstract String toString();
}
