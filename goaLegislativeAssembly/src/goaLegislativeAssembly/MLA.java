package goaLegislativeAssembly;

//AUTHOR NAME: LAXMI CHARI
//ROLL NO: 22
//TITLE: IMITATION OF GOA LEGISLATIVE ASSEMBLY
//START DATE: 15/072024
//MODIFIED DATE: 22/07/2024
//DESCRIPTION: THIS CLASS EXTENDS ENTITY CLASS AND HOLDS THE DETAILS ABOUT MLA

public class MLA extends Entity {
  private String name;
  private String constituency;
  private String party;

  public MLA(String name, String constituency, String party) {
      this.name = name;
      this.constituency = constituency;
      this.party=party;
  }

  @Override
  public String toString() {
      return "Name: " + name + "\nConstituency: " + constituency + "\nPolitical party: " + party;
  }
}