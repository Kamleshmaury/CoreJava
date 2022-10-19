package com.hops1;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModelJackson {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Scanner sc = new Scanner(System.in);
		try {
			Player p1 = new Player();
			System.out.println("Enter playe id: ");
			p1.setPlayerId(sc.nextLine());
			System.out.println("Enter playe name: ");
			p1.setPlayerName(sc.nextLine());
			List<String> list = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				System.out.println("Enter score : " + (i + 1));
				list.add(sc.nextLine());
			}
			p1.setPlayerScores(list);
			//write in json file
			 //mapper.writeValue(new File("player.json"),p1);
			
			//print on console only
			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(p1);
			System.out.println("Json String ==== " + jsonString);
			
			//readTree() to get rootnode
			JsonNode rootNode = mapper.readTree(jsonString);
			//by using rootnode we get value of playerId and so on..
			JsonNode idNode = rootNode.path("playerId");
			System.out.println("Player Id: " + idNode.textValue());
			
			JsonNode nameNode = rootNode.path("playerName");
			System.out.println("Player Name: " + nameNode.textValue());
			
			JsonNode scores = rootNode.path("playerScores");
			Iterator<JsonNode> iterator = scores.elements();
			System.out.print("Scores: [ ");
			while (iterator.hasNext()) {
				JsonNode data = iterator.next();
				System.out.print(data.textValue() + " ");
			}
			System.out.println("]");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
