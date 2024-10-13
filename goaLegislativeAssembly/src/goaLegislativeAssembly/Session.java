package goaLegislativeAssembly;

//AUTHOR NAME: LAXMI CHARI
//ROLL NO: 22
//TITLE: IMITATION OF GOA LEGISLATIVE ASSEMBLY
//START DATE: 15/07/2024
//MODIFIED DATE: 22/07/2024
//DESCRIPTION: THIS CLASS EXTENDS ENTITY CLASS AND HOLDS THE DETAILS ABOUT THE SESSIONS HELD IN THE ASSEMBLY

//Session class representing a legislative session
public class Session extends Entity {
	//Inheritance: Session a class that is derived from a abstract class Entity
private String date;
private String agenda;

public Session(String date, String agenda) {
	//Constructor
   this.date = date;
   this.agenda = agenda;
}

@Override
public String toString() {
   return "Date of the session: " + date + "\nAgenda: " + agenda;
}
}
