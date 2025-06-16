package com.tka.service;

import java.util.LinkedList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
	
	public List<Player> getRCBTeam() {
		
		IPLDao dao = new IPLDao();
		
		List<Player> team = dao.getRCBTeam();
		
		
		System.out.println("In IPLservice.getRCBTeam");
		return team;
		
			
		}
	
	public List<Player> getPBSKTeam(){
		
		IPLDao dao = new IPLDao();
		List<Player> team2 = dao.getPBSKTeam();
		return team2;
	}
	
}
