package comptebancaire;

public class Compte 
{
	public Double solde;

	public Compte(Double solde) 
	{
		 
	 }
	
     public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	} 

	public void Deposer() {
    	 
     }
     public void Retirer()
     {
    	 
     }
     public void Afficher() 
     {
    	 System.out.println("le sode de votre compte est"+ this.solde);
     }
}
 