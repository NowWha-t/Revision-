package revision.com;

public class Voitures {
	

	 public String marque;
	 public  Double prix;
	

     public  Voitures() {
    	 
     }
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
     public void afficher() 
     {
    	 System.out.println(" La marque de la voitues est " + this.marque );
    	 System.out.println("Le prix de la voiture est "+ this.prix + " euros ");
     }
}
