package com.tka.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	
	public List<Player> getRCBTeam() {
		
		System.out.println("In IPLDao.getRCBTeam() ");
		
		List<Player> RCB = new LinkedList<>();
	         
	   	RCB.add(new Player(18, "Virat Kohli", "RCB", 0, 657));
		RCB.add(new Player(28, "Phil Salt", "RCB", 0, 208));
		RCB.add(new Player(8, "Tim David", "RCB", 0, 92));
		RCB.add(new Player(38, "Josh Hazlewood", "RCB", 22, 0));
		RCB.add(new Player(25, "Krunal Pandya", "RCB", 8, 0));
		RCB.add(new Player(55, "Jitesh Sharma", "RCB", 0, 88));
		RCB.add(new Player(103, "Yash Dayal", "RCB", 7, 0));
		RCB.add(new Player(15, "Bhuvneshwar Kumar", "RCB", 6, 0));
		RCB.add(new Player(97, "Rajat Patidar ", "RCB", 0, 186));
		RCB.add(new Player(18, "Romario Shepherd", "RCB", 6, 70));
		RCB.add(new Player(16, "Mayank Agarwal", "RCB", 0, 95));
									return RCB;
									
	}
	
	public List<Player> getPBSKTeam(){
		
		List<Player> PBSK =  new LinkedList<>();
		PBSK.add(new Player(96, "Shreyas Iyer", "PBSK", 0, 604));
		PBSK.add(new Player(25, "Nehal Wadhera", "PBSK", 0, 369));
		PBSK.add(new Player(48, "Josh Inglis", "PBSK", 0, 278));
		PBSK.add(new Player(76, "Harnoor Pannu", "PBSK", 0, 0));
		PBSK.add(new Player(2, "Arshdeep Singh", "PBSK", 21, 2));
		PBSK.add(new Player(23, "Yuzvendra Chahal", "PBSK", 16, 0));
		PBSK.add(new Player(17, "Marcus Stoinis", "PBSK", 1, 160));
		PBSK.add(new Player(95, "Harpreet Brar", "PBSK", 10, 11));
		PBSK.add(new Player(18, "Kyle Jamieson", "PBSK", 5, 0));
		PBSK.add(new Player(70, "Marco Jansen", "PBSK", 16, 75));
		PBSK.add(new Player(18, "Priyansh Arya", "PBSK", 0, 475));
		
		
		return PBSK;
		
	}
	
		}
