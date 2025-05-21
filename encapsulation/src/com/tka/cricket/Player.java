package com.tka.cricket;

public class Player {

	private int jerseyNo ;
	private String name ;
	private int runs ; 
	private int Wickets;
	private String TeamName;
	
	Player(){}
	
	Player (int j, String n, int r, int W, String Tn){
		jerseyNo = j;
		name = n;
		runs = r;
		Wickets = W;
		TeamName = Tn;
	}
	
	public void setjerseyNo (int j) {
		jerseyNo = j;
	}
	
	public void setname (String n) {
		name = n;
	}
	
	public void setrun (int r) {
		runs = r;
	}
	
	public void setWickets (int W) {
		Wickets = W;
	}
	
	public void setTeamName (String Tn) {
		TeamName = Tn;
	}
	
	public int getjerseyNo() {
		return jerseyNo;
	}
	
	public String getname() {
		return name;
	}

	public int getrun() {
		return runs;
	}

	public int getWicket() {
		return Wickets;
	}
	
	public String getTeamName() {
		return TeamName;
	}

	@Override
	public String toString() {
		return "Player [jerseyNo= " + jerseyNo + ", name=" + name + ", TeamName=" + TeamName + ", getjerseyNo()="
				+ getjerseyNo() + ", getname()=" + getname() + ", getrun()=" + getrun() + ", getWicket()=" + getWicket()
				+ ", getTeamName()=" + getTeamName() + "]";
	}
	
	

}
