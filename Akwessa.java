import java.util.Scanner;
class Akwessa{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		System.out.println("Well Come to the 'ASWESUMA' Project....!");
		String dbUseName = "admin";
		int dbUserPassword = 12345;
		int roundLoging = 3;
		
		for(int i=0; i<3; i++){
			System.out.print("Enter Your User Name :- ");
			String userName = input.next();
			System.out.print("Enter Your Password :- ");
			int userPassword = input.nextInt();
			if(dbUseName.equals(userName) && dbUserPassword == userPassword){
				System.out.println("Loging Success...!");
				i=3; //Brake
				//Aftre loging 
				System.out.print("How many familes in your vilalge :- ");
				int howManyFamily = input.nextInt();
				double [][] family = new double [howManyFamily][3];
				for(int k=0; k<howManyFamily; k++){
					for(int j=0; j<3; j++){
						System.out.print("How many "+(k+1)+" Family "+(j+1)+" Income Method :- ");
						family[k][j] = input.nextDouble();
					}
				}
				//find the average income in family
				for(int k=0; k<howManyFamily; k++){
					double totalIncome = 0;
					for(int j=0; j<3; j++){
						totalIncome += family[k][j];
					}
					double averageIncome = (totalIncome/3);
					// Determine eligibility
					if(averageIncome<50000){
							
							System.out.println((k+1)+"Your Family is Eligible for 'ASWESUMA'.......");
						
					}else{
						
								System.out.println((k+1)+"Your Family is Not Eligible for 'ASWESUMA'.......");	
						
					}
				}
				
				
			}else{
				roundLoging++;
				if(roundLoging == 3){
					System.out.println("Loging Unsuccess...!");
				}
			}
		}
		
		}
	}
