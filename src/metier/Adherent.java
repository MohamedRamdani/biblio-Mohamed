package metier;



public class Adherent {
	
/******************************************Attributes*********************************************/
	
	private String telephone;
	private int nbMaxPrets = 3;
	private int dureeMaxPrets = 15;
/*************************************************************************************************/


	
	public boolean isConditionsPretAcceptees(){
		
		if (nbMaxPrets<=3)
			return true;
		return false;
	}
		

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
