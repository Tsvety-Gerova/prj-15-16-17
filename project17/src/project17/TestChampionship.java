package project17;

import java.util.Arrays;

public class TestChampionship {

	public static void main(String[] args) {

		Country country = new Country();
		Country.name = "Italy";
		
		Coach coach1 = new Coach();
		coach1.name = "Silvano Prandi";
		Coach coach2 = new Coach();
		coach2.name = "Kamilo Placi";
		
		VolleyballTeam team1 = new VolleyballTeam();
		team1.coach = coach1;
		team1.name = "Modena Volley";
		
		VolleyballTeam team2 = new VolleyballTeam();
		team2.coach = coach2;
		team2.name = "Trentino Volley";
		
		Country.teams = Arrays.asList(team1, team2);
		
		System.out.println("Teams of: " + country.name);
		   for(VolleyballTeam team : country.teams) {
			   System.out.println(team.name + " " + team.coach.name);
		   }
		
			
		
	}

}
