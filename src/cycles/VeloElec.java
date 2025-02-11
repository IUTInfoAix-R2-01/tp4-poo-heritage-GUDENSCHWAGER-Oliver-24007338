package cycles;

public class VeloElec extends Velo {
	private double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super.setDiamRoue(diamRoue);
		facteurPuissanceMoteur = coupleMoteur;
	}
	public VeloElec() {
		facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getDEFAUT_COUPLE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_COUPLE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double coupleMoteur) {
		facteurPuissanceMoteur = coupleMoteur;
	}
	
	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec vE1 = new VeloElec(10, 6, 69);
		VeloElec vE2 = new VeloElec(5, 45);
		VeloElec vE3 = new VeloElec();
		
		System.out.println("Couple Moteur par défaut de vE3: " + vE3.getDEFAUT_COUPLE_MOTEUR());
		vE3.setDEFAUT_COUPLE_MOTEUR(34);
		
		System.out.println("Facteur puissance moteur de vE1: " + vE1.getFacteurPuissanceMoteur());
		vE1.setFacteurPuissanceMoteur(43);
		
		System.out.println("toString de vE2: " + vE2);
		
		System.out.println("Puissance de vE1 avec 50: " + vE1.getPuissance(50));
	}
}
