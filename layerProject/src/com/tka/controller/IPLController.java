package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {

	public static void main(String[] args) {

		System.out.println("In IPLComtroller.main() ");
		
		IPLService service = new IPLService();
		
		List<Player> allplayers = service.getRCBTeam();
		
		List<Player> PbskTeam = service.getPBSKTeam();
		
		System.out.println("All Players Of RCB");
		
		System.out.println("--------------------x----------------");
		
		for(Player player : allplayers) {
			System.out.println(player);
		}
		
		System.out.println("-----------------x--------------");
		
		System.out.println("All Players Of PBSK ");
		for(Player playerpbsk : allplayers) {
			System.out.println(playerpbsk);
		}
		
	}

}
