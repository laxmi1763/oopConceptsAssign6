package goaLegislativeAssembly;

//AUTHOR NAME: LAXMI CHARI
//ROLL NO: 22
//TITLE: IMITATION OF GOA LEGISLATIVE ASSEMBLY
//START DATE: 15/072024
//MODIFIED DATE: 22/07/2024
//DESCRIPTION: THIS CLASS EXTENDS ENTITY CLASS AND HOLDS THE DETAILS ABOUT THE BILLS

public class Bill extends Entity {
  private String title;
  private String description;
  private boolean isPassed;

  public Bill(String title, String description) {
      this.title = title;
      this.description = description;
      this.isPassed = false;
  }

  public void pass() {
      this.isPassed = true;
  }

  @Override
  public String toString() {
      return "Title: " + title + "\nDescription: " + description + "\nStatus: " + (isPassed ? "Passed" : "Not Passed");
  }
}