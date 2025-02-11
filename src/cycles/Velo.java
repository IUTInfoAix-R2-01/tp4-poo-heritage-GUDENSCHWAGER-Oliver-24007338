package cycles;

import java.util.Random;

public class Velo {
	private double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		genAlea = new Random();
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
		diamRoue = 0;
		genAlea = new Random();
	}
	
	public Velo() {
		braquet = DEFAUT_BRAQUET;
		diamRoue = 0;
		genAlea = new Random();
	}

	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}

	public void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}

	public double getBraquet() {
		return braquet;
	}

	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}

	public double getDiamRoue() {
		return diamRoue;
	}

	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}

	public Random getGenAlea() {
		return genAlea;
	}

	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}

	@Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Velo v1 = new Velo(11, 5);
		Velo v2 = new Velo(12);
		Velo v3 = new Velo();
		
		System.out.println("Braquet par défaut de v3: " + v3.getDEFAUT_BRAQUET());
		v3.setDEFAUT_BRAQUET(20);
		
		System.out.println("Braquet de v1: " + v1.getBraquet());
		v1.setBraquet(21);
		
		System.out.println("Diamètre rue de v1: " + v1.getDiamRoue());
		v1.setDiamRoue(22);
		
		System.out.println("Génération aléatoire de v2: " + v2.getGenAlea());
		v2.setGenAlea(new Random());
		
		System.out.println("toString de v1: " + v1);
		
		System.out.println("Puissance de v1 avec fréquence de pédale de 40: " + v1.getPuissance(40));
	}
}
