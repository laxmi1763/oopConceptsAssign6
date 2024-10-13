package goaLegislativeAssembly;

//AUTHOR NAME: LAXMI CHARI
//ROLL NO: 22
//TITLE: IMITATION OF GOA LEGISLATIVE ASSEMBLY
//START DATE: 15/072024
//MODIFIED DATE: 22/07/2024
//DESCRIPTION: THIS CLASS EXTENDS ENTITY CLASS AND IT IS MADE FOR THE DETAILS OF THE OFFICIALS

public class Official extends Entity {
  private String position;
  private String name;

  public Official(String position, String name) {
      this.position = position;
      this.name = name;
  }

  @Override
  public String toString() {
      return "Position: " + position + "\nName: " + name;
  }
}