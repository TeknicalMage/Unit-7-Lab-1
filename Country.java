
public class Country implements Comparable<Country>{

	public Country(String name, String capital, int population) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Country c) {
		return(Integer.compare(population,c.population));
	}
	
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	private int population;
	private String name;
	private String capital;	
	

}
