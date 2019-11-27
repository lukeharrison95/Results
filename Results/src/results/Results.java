package results;

public class Results {
	static float physics =100;
	static float chemistry =80;
	static float biology = 100;
	static float total;
	static float percentage;
	public static void main(String[] args) {
		total=methodOne(physics,chemistry,biology);
	
		methodTwo(total);
		
	}
	
	public static float methodOne(float physics, float chemistry, float biology) {
		float total=physics + chemistry + biology;
		
		
		System.out.println("Physics =" +physics);
		System.out.println("Chemistry =" +chemistry);
		System.out.println("Biology =" +biology);
		System.out.println("Total Marks =" +total);
		return total ;
		
		
	}
	
	public static void methodTwo(float total) {
		float percentage= (total*100)/450;
		float physicsPercentage= (physics*100)/150;
		float chemistryPercentage= (chemistry*100)/150;
		float biologyPercentage= (biology*100)/150;
		System.out.println("Physics percentage" + physicsPercentage);
		System.out.println("Chemistry percentage" + chemistryPercentage);
		System.out.println("Biology percentage" + biologyPercentage);
		System.out.println("Overall Percentage =" +percentage);

	
	 int count=0;
	 if(physicsPercentage < 60) {
		 count++;}
	 if(chemistryPercentage <60) {
		 count++;}
	 if(biologyPercentage <60) {
		 count++;}
	 
	 if(percentage < 60 || physicsPercentage <60 || chemistryPercentage <60 || biologyPercentage <60) {System.out.println("You have failed, please revise for " + count + " exams");
			 }else {System.out.println("Congratulations, you have passed.");}
	 
	 }
	
	}
	
	
	

