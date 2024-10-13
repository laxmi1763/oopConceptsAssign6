package goaLegislativeAssembly;

//AUTHOR NAME: LAXMI CHARI
//ROLL NO: 22
//TITLE: IMITATION OF GOA LEGISLATIVE ASSEMBLY
//START DATE: 15/07/2024
//MODIFIED DATE: 22/07/2024
//DESCRIPTION: THIS CLASS EXTENDS ENTITY CLASS AND IT IS MADE FOR THE DETAILS OF THE OFFICIALS

//Official class representing a legislative official like Speaker or Governor
public class Official extends Entity {
	//Inheritance: Official a class that is derived from a abstract class Entity
private String position;
private String name;

public Official(String position, String name) {
	//Constructor
   this.position = position;
   this.name = name;
}

@Override
public String toString() {
   return "Position: " + position + "\nName: " + name;
}
}
