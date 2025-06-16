package com.tka.entity;

public class Player {
	
	private int jr;
	private String name;
	private String team;
	private int runs;
	private int wickets;
	
	
	
	public Player() {
		super();
	}

	public Player(int jr, String name, String team, int runs, int wickets) {
		super();
		this.jr = jr;
		this.name = name;
		this.team = team;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getJr() {
		return jr;
	}

	public void setJr(int jr) {
		this.jr = jr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Player [jr=" + jr + ", name=" + name + ", team=" + team + ", runs=" + runs + ", wickets=" + wickets
				+ "]";
	}

	
	

}
