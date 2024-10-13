package goaLegislativeAssembly;

//AUTHOR NAME: LAXMI CHARI
//ROLL NO: 22
//TITLE: IMITATION OF GOA LEGISLATIVE ASSEMBLY
//START DATE: 15/072024
//MODIFIED DATE: 22/07/2024
//DESCRIPTION: THIS CLASS EXTENDS ENTITY CLASS AND HOLDS THE DETAILS ABOUT THE SESSIONS HELD IN THE ASSEMBLY

public class Session extends Entity {
  private String date;
  private String agenda;

  public  Session(String date, String agenda){
      this.date=date;
      this.agenda=agenda;
  }

  @Override
  public String toString() {
    return "Date of the session: " + date + "\n Agenda:  " + agenda;
  }



}
