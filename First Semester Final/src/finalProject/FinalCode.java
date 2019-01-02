package finalProject;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
/**
 * First Semester Final Project
 * <p>This code is various practice questions on several subjects that can be accessed several times and navigated through loops. </p>
 * @author Kacie Rae Cox
 * <p>Start Date: 12-1-18</p>
 *
 */

public class FinalCode {
	/**
	 * This is the main method which makes use of start
	 * @param args unused
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("What do you want to do today? \n\tIf you want to return to this menu at any time type ''home''.\n\tIn the home menu, if you type ''end'' the project will quit running. \n\tYou can also type ''back'' if you want to go back to topics from a sub-topic.\n\tSpelling matters, but letter case does not. ");
		start("a");
		input.close();				
	}
	//start running
	/**
	 * this is the method that creates a topic choice which makes use of topic
	 * @param a is required to call the method
	 */
	public static void start(String a){
		Scanner input = new Scanner(System.in);
		String start = "start";
		while (start == "start") {
			//pick subject
			System.out.print("\nType your pick (history, chemistry, math, english): ");
			topic(input.nextLine());
			start = "end";	
		}
	}
/* Start of Topics. */
	/**
	 * This is the method that picks a specific topic ex math
	 * this method uses subTopicMath, subTopicEnglish, subTopicChemistry, and subTopicHistory
	 * @param a determines the subject that will call another method to continue specifying topic choices
	 */
	public static void topic(String a){
		Scanner input = new Scanner(System.in);
		String subject = a;
		String start = "start";
		if (subject.equalsIgnoreCase("math")) {
			start = "end";
			// pick sub topic
			System.out.print("Great!");
			System.out.println();
			subTopicMath();		
		}
		if (subject.equalsIgnoreCase("English")) {
			start = "end";
			System.out.print("Great!");
			System.out.println();
			subTopicEnglish();
				
		}
		if (subject.equalsIgnoreCase("chemistry")) {
			start = "end";
			System.out.print("Great!");
			System.out.println();
			subTopicChemistry();			
		}
		if (subject.equalsIgnoreCase("history")) {
			start = "end";
			System.out.print("Great!");
			System.out.println();
			subTopicHistory();
		}
		if (subject.equalsIgnoreCase("home")) {
			start(a);
		}
		if (subject.equalsIgnoreCase("end")) {
			start = "end";
		}
		if(!subject.equalsIgnoreCase("home") && !subject.equalsIgnoreCase("math")&& !subject.equalsIgnoreCase("English") && !subject.equalsIgnoreCase("chemistry")&& !subject.equalsIgnoreCase("history")&& !subject.equalsIgnoreCase("end")){
			start = "end";
			System.out.print("\nInvalid Input try again. \n\n");
			start(a); 
		} 
	
	}
/* Start of Sub Topics. */
	/* Math */
	/**
	 * this method determines what Math topics are utilized which uses ownAddedMatrix, outlinedAddedMatrix, and subTopicMath
	 * @return void
	 */
	public static void subTopicMath(){
		Scanner input = new Scanner(System.in);
		System.out.print("\npick from this list: ");
		String[] mathList = { "matrices", };
		for(int i = 0; i < mathList.length; i++){
			System.out.print("\n\t" + mathList[i]);
		}
		System.out.println("");
		String pick = input.nextLine();
		if (pick.equalsIgnoreCase("home")){
			start("a");
		}
		else if (pick.equalsIgnoreCase("back")){
			start("a");
		}
		else if (pick.equalsIgnoreCase("matrices")){
			System.out.print("Do you want to add your own matrix or an outlined 3x3: ");
			System.out.print("\n\tchoices: own or outlined:  ");
			String choice = input.nextLine();
			if(choice.equalsIgnoreCase("own")){
				ownAddedMatrix();
				subTopicMath();	
			}
			if(choice.equalsIgnoreCase("outlined")){
				outlinedAddedMatrix();
				subTopicMath();	
			}
			if(choice.equalsIgnoreCase("back")){
				subTopicMath();
			}
				
		}
		
		else if (pick != Arrays.toString(mathList)){
			System.out.print("Try checking for spelling errors.");
			subTopicMath();	
		}
		
	}
	/* English */
	/**
	 * this method determines what Math topics are utilized which uses knowFirstColumn, knowSecondColumn, randomizeArray, subTopicEnglish, theOldManAndTheSeaVocab, theOutsidersVocab, ToKillAMockingbirdVocab  
	 * @return void
	 */
	public static void subTopicEnglish(){
		Scanner input = new Scanner(System.in);
		System.out.print("\npick from this list: ");
		String[] englishList = {"vocab", };
		for(int i = 0; i < englishList.length; i++){
			System.out.print("\n\t" + englishList[i]);
		}
		System.out.println();
		String pick = input.nextLine();
		if (pick.equalsIgnoreCase("home")){
			start("a");
		}
		else if (pick.equalsIgnoreCase("back")){
			start("a");
		}
		else if (pick.equalsIgnoreCase("vocab")){
			System.out.println("\nPick if you want to do words or definitions: ");
			String choice = input.nextLine();
			if(choice.equalsIgnoreCase("words")){
				System.out.print("What book do you want to choose vocab from: ");
				String[] booksList = { "The Old Man and the Sea", "To Kill a Mockingbird", "The Outsiders" };
				for(int i = 0; i < booksList.length; i++){
					System.out.print("\n\t" + booksList[i]);
				}
				System.out.println();
				String list = input.nextLine();
				if(list.equalsIgnoreCase("The Old Man and the Sea") ){
					System.out.print("Do you want to do random: ");
					String random = input.nextLine();
					if (random.equalsIgnoreCase("no")){
						String [][] book = theOldManAndTheSeaVocab();
						knowSecondColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
					if (random.equalsIgnoreCase("yes")){
						String [][] book = theOldManAndTheSeaVocab();
						randomizeArray(book);
						knowSecondColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
					
				}
				if(list.equalsIgnoreCase("To Kill a Mockingbird")){
					System.out.print("Do you want to do random: ");
					String random = input.nextLine();
					if (random.equalsIgnoreCase("no")){
						String [][] book = toKillAMockingbirdVocab();
						knowSecondColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
					if (random.equalsIgnoreCase("yes")){
						String [][] book = toKillAMockingbirdVocab();
						randomizeArray(book);
						knowSecondColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
					
				}
				if(list.equalsIgnoreCase("The Outsiders")){
					System.out.print("Do you want to do random: ");
					String random = input.nextLine();
					if (random.equalsIgnoreCase("no")){
						String [][] book = theOutsidersVocab();
						knowSecondColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
					if (random.equalsIgnoreCase("yes")){
						String [][] book = theOutsidersVocab();
						randomizeArray(book);
						knowSecondColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
				}		
			}
			
			if(choice.equalsIgnoreCase("definitions")){
				System.out.print("\nWhat book do you want to choose vocab from: ");
				String[] booksList = { "The Old Man and the Sea", "To Kill A Mockingbird", "The Outsiders" };
				for(int i = 0; i < booksList.length; i++){
					System.out.print("\n\t" + booksList[i]);
				}
				System.out.println("");
				String list = input.nextLine();
				if(list.equalsIgnoreCase("The Old Man and the Sea") ){
					System.out.print("Do you want to do random: ");
					String random = input.nextLine();
					if (random.equalsIgnoreCase("no")){
						String [][] book = theOldManAndTheSeaVocab();
						knowFirstColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
					if (random.equalsIgnoreCase("yes")){
						String [][] book = theOldManAndTheSeaVocab();
						randomizeArray(book);
						knowFirstColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
						
				}
				if(list.equalsIgnoreCase("To Kill a Mockingbird")){
					System.out.print("Do you want to do random: ");
					String random = input.nextLine();
					if (random.equalsIgnoreCase("no")){
						String [][] book = toKillAMockingbirdVocab();
						knowFirstColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
					if (random.equalsIgnoreCase("yes")){
						String [][] book = toKillAMockingbirdVocab();
						randomizeArray(book);
						knowFirstColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
						
				}
				if(list.equalsIgnoreCase("The outsiders")){
					System.out.print("Do you want to do random: ");
					String random = input.nextLine();
					if (random.equalsIgnoreCase("no")){
						String [][] book = theOutsidersVocab();
						knowFirstColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish();
					}
					if (random.equalsIgnoreCase("yes")){
						String [][] book = theOutsidersVocab();
						randomizeArray(book);
						knowFirstColumn(book, "word", "");
						System.out.print("\nWhat next: ");
						subTopicEnglish(
						);
					}
						
				}	
			}
			else {
				subTopicEnglish();	
			}
		}
		else if (pick.equalsIgnoreCase("books")){
			System.out.print("hey");
		}
		else if (pick != Arrays.toString(englishList)){
			System.out.print("Try checking for spelling errors.");
			subTopicEnglish();	
		}
	}
	/* Chemistry */
	/**
	 * this method determines what Math topics are utilized which uses knowFirstColumn, knowSecondColumn, randomizeArray, subTopicChemistry, polyatomicIons
	 * 
	 */
	public static void subTopicChemistry(){
		Scanner input = new Scanner(System.in);
		System.out.print("\npick from this list: ");
		String[] chemistryList = { "Polyatomic Ions", };
		for(int i = 0; i < chemistryList.length; i++){
			System.out.print("\n\t"+chemistryList[i]);
		}
		System.out.println();
		String pick = input.nextLine();
		if (pick.equalsIgnoreCase("home")){
			start("a");
		}
		else if (pick.equalsIgnoreCase("back")){
			start("a");
		}
		else if (pick.equalsIgnoreCase("polyatomic ions")){ 
			String [][] list = polyatomicIons();
			System.out.println("\nPick if you want to do names or formulas: ");
			String choice = input.nextLine();
			
			if(choice.equalsIgnoreCase("names")){
				System.out.print("Do you want to do random: ");
				String random = input.nextLine();
				if (random.equalsIgnoreCase("no")){
					knowSecondColumn(list, "name", "");
					System.out.print("\nWhat next: ");
					subTopicChemistry();
				}
				if (random.equalsIgnoreCase("yes")){
					list = randomizeArray(polyatomicIons());
					knowSecondColumn(list, "name", "");
					System.out.print("\nWhat next: ");
					subTopicChemistry();
				}
				
					
			}
			if(choice.equalsIgnoreCase("formulas")){
				System.out.print("Do you want to do random: ");
				String random = input.nextLine();
				if (random.equalsIgnoreCase("no")){
					knowFirstColumn(list, "name", "");
					System.out.print("\nWhat next: ");
					subTopicChemistry();
				}
				if (random.equalsIgnoreCase("yes")){
					list = randomizeArray(polyatomicIons());
					knowFirstColumn(list, "name", "");
					System.out.print("\nWhat next: ");
					subTopicChemistry();
				}
				
			}
			
			else {
				subTopicChemistry();	
			}

		}			
		
		else if (pick != Arrays.toString(chemistryList)){
			System.out.print("Try checking for spelling errors.");
			subTopicChemistry();	
		}
	}
	/* History */
	/**
	 * this method determines what Math topics are utilized which uses knowFirstColumn, knowSecondColumn, randomizeArray, subTopicHistory, monopolyMen, inventions
	 * 
	 */
	public static void subTopicHistory(){
		Scanner input = new Scanner(System.in);
		System.out.print("pick from this list: ");
		String[] historyList = { "monopoly men", "inventions"  };
		for(int i = 0; i < historyList.length; i++){
			System.out.print("\n\t" + historyList[i]);
		}
		System.out.println();
		String pick = input.nextLine();
		if (pick.equalsIgnoreCase("home")){
			start("a");
		}
		else if (pick.equalsIgnoreCase("back")){
			start("a");
		}
		else if (pick.equalsIgnoreCase("monopoly men")){
			String [][] list = monopolyMen();
			System.out.println("\nPick if you want to do names or monopolies: ");
			String choice = input.nextLine();

			
			if(choice.equalsIgnoreCase("monopolies")){
				System.out.print("Do you want to do random: ");
				String random = input.nextLine();
				if (random.equalsIgnoreCase("no")){
					knowFirstColumn(list,"monopoly", "");
					System.out.print("\nWhat next: ");
					subTopicHistory();
				}
				if (random.equalsIgnoreCase("yes")){
					list = randomizeArray(monopolyMen());
					knowFirstColumn(list,"monopoly", "");
					System.out.print("\nWhat next: ");
					subTopicHistory();	
				}
			}
			if(choice.equalsIgnoreCase("names")){
				System.out.print("Do you want to do random: ");
				String random = input.nextLine();
				if (random.equalsIgnoreCase("no")){
					knowSecondColumn(list, "name", "the person who had this monopoly: ");
					System.out.print("\nWhat next: ");
					subTopicHistory();
				}
				if (random.equalsIgnoreCase("yes")){
					list = randomizeArray(monopolyMen());
					knowSecondColumn(list, "name", "the person who had this monopoly: ");
					System.out.print("\nWhat next: ");
					subTopicHistory();
				}		
			}
			else {
				subTopicHistory();	
			}
		}
		else if (pick.equalsIgnoreCase("inventions")){
			String [][] list = inventions();
			System.out.println("\nPick if you want to do names or inventions: ");
			String choice = input.nextLine();
			if(choice.equalsIgnoreCase("inventions")){
				System.out.print("Do you want to do random: ");
				String random = input.nextLine();
				if (random.equalsIgnoreCase("no")){
					knowFirstColumn(list,"invention", "");
					System.out.print("\nWhat next: ");
					subTopicHistory();
				}
				if (random.equalsIgnoreCase("yes")){
					list = randomizeArray(list);
					knowFirstColumn(list,"invention", "");
					System.out.print("\nWhat next: ");
					subTopicHistory();
				}
			}
			if(choice.equalsIgnoreCase("names")){
				System.out.print("Do you want to do random: ");
				String random = input.nextLine();
				if (random.equalsIgnoreCase("no")){
					knowSecondColumn(list, "name", "the person who invented this: ");
					System.out.print("\nWhat next: ");
					subTopicHistory();
				}
				if (random.equalsIgnoreCase("yes")){
					list = randomizeArray(list);
					knowSecondColumn(list, "name", "the person who invented this: ");
					System.out.print("\nWhat next: ");
					subTopicHistory();
				}
						
			}
			else {
				subTopicHistory();	
			}
		}
		else if (pick != Arrays.toString(historyList)){
			System.out.print("Try checking for spelling errors.");
			subTopicHistory();	
		}
	}
/* Start of helper methods. */
	/* know first column, guess the second */
	/**
	 * This method gives a question from the first column and checks if it is correct within the multidimensional array 
	 * @param list multidimensional String array that the method is using
	 * @param a the String that helps formulate part of the question before the word "for" 
	 * @param b the String that helps formulate part of the question after the word "for" 
	 */
	public static void knowFirstColumn(String[][] list, String a, String b){
		Scanner input = new Scanner(System.in);
		int correct = 0;
		for(int i = 0; i < list.length ; i++){
		System.out.print("What is the " + a + " for " + b + list[i][0] + ": ");
		String s = input.nextLine();
		if (s.equalsIgnoreCase(list[i][1])){
			System.out.println("Correct!");
			correct++;
			}
			else if (s.equalsIgnoreCase("back")){
				return;
				
			}		
			else{
				System.out.println("The correct answer should be: " + list[i][1]);
			}
		}
		System.out.println("\nThe correct count is " + correct + " out of " + list.length);	
		return;
	}
	/* know the second column, guess the first */
	/**
	 * This method gives a question from the second column and checks if it is correct within the multidimensional array 
	 * @param list multidimensional String array that the method is using
	 * @param c the String that helps formulate part of the question before the word "for" 
	 * @param d the String that helps formulate part of the question after the word "for" 
	 * 
	 */
	public static void knowSecondColumn(String[][]list, String c, String d){
		Scanner input = new Scanner(System.in);
		int correct = 0;
		for(int i = 0; i < list.length ; i++){
			System.out.print("What is the " + c + " for " + d + list[i][1] + ": ");
			String s = input.nextLine();
			if (s.equalsIgnoreCase(list[i][0])){
				System.out.println("Correct!");
			correct++;
				}
			else if (s.equalsIgnoreCase("back")){
				return;
			}	
			else {
				System.out.println("The correct answer should be: " + list[i][0]);
			}
		}
		System.out.println("\nThe correct count is " + correct + " out of " + list.length);
		return;		
	}
	/*Randomize array so questions are not in order */
	/**
	 * This method shuffles an array so the questions are in a randomized order
	 * @param input multidimensional String array that the method is using to shuffle
	 * @return randomized multidimensional String array
	 */
	public static String[][] randomizeArray(String [][] input){
		
		Collections.shuffle(Arrays.asList(input));
		return input;
		
	}
	/**
	 * this method creates 2 matrices of a set 3 X 3 dimension to with user input for numbers to add together which uses printResult and addMatrix
	 * @return a matrix that is formed from two matrices added together and printed out for the user to see
	 */
	public static void outlinedAddedMatrix() {
		Scanner input = new Scanner(System.in);
		final int R = 3;
		final int C = 3;
		System.out.println("\nEnter a 3 * 3 matrix for both matrices.  ");
	
		System.out.print("Enter matrix A:");
		double [][] matrixA = new double[R][C];
		
		for(int row = 0; row < matrixA.length; row++) {
			for(int column = 0; column < matrixA[row].length; column++ ){
			matrixA[row][column] = input.nextDouble(); 
			}
		}
	
		System.out.print("Enter matrix B:");
		double [][] matrixB = new double[R][C];
	
		for(int row = 0; row < matrixB.length; row++) {
			for(int column = 0; column < matrixB[row].length; column++ ){
			matrixB[row][column] = input.nextDouble(); 
			}
		}
		double[][] resultMatrix = addMatrix (matrixA, matrixB);
		System.out.println("The sum of the matrices is");
		printResult(resultMatrix);
		return;
	}
	/**
	 * this creates 2 matrices of a user-determined dimension that is added together which uses addMatrix and printResult
	 * @return void
	 */
	public static void ownAddedMatrix() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nHow big is your matrices? Remember they have to be the same size to add: ");
		System.out.println("\nHow many rows: ");
		final int R = input.nextInt();
		System.out.println("\nHow many columns: ");
		final int C = input.nextInt();
		
		System.out.print("Enter matrix A:");
		double [][] matrixA = new double[R][C];
		for(int row = 0; row < matrixA.length; row++) {
			for(int column = 0; column < matrixA[row].length; column++ ){
			matrixA[row][column] = input.nextDouble(); 
			}
		}
	
		System.out.print("Enter matrix B:");
		double [][] matrixB = new double[R][C];
	
		for(int row = 0; row < matrixB.length; row++) {
			for(int column = 0; column < matrixB[row].length; column++ ){
			matrixB[row][column] = input.nextDouble(); 
			}
		}
		double[][] resultMatrix = addMatrix (matrixA, matrixB);
		System.out.println("The sum of the matrices is");
		printResult(resultMatrix);
		return;
	}
	/**
	 * this method adds two numerical arrays together 
	 * @param a the first multidimensional Double array
	 * @param b the second multidimensional Double array
	 * @return a matrix that adds matrix a and matrix b together
	 */
	public static double[][] addMatrix(double[][] a, double[][] b){
			double[][] result = new double[a.length][a[0].length];
			for(int row = 0; row < result.length; row ++){
				for(int column = 0; column < result[row].length; column++){
					result[row][column] = a[row][column] + b[row][column]; 
				}
			}
			return result;
		}
	/**
	 * this matrix prints a given array
	 * @param c the array that is printed 
	 * @return void
	 */
	public static void printResult(double[][] c) {
		for(int row = 0; row < c.length; row++) {
			for(int column = 0; column < c[row].length; column++ ){
				System.out.print(c[row][column] + " " );  
			}
			System.out.println(" ");
		}	
	}
/* Strings */
	/**
	 * the multidimensional String array that has the information set for monopoly men
	 * @return the multidimensional array
	 */
	public static String[][] monopolyMen(){
		String [][] list = {
			{"Vanderbilt", "Train/railroad"},
			{"Andrew Carnegie", "Steel"},
			{"Rockefeller", "Oil"},
			{"JP Morgan", "banking/investment"},								
			
		};
		return list;
	}
	/* inventions */
	/**
	 * the multidimensional String array that has the information set for inventions
	 * @return the multidimensional array
	 */
	public static String[][] inventions(){
		String [][] list = {
			{"Edwin Drake", "drilled oil well"},
			{"Alexander Graham Bell", "telephone"},
			{"Thomas Edison", "light bulb"},
			{"George Westinghouse", "air brake for railroad cars"},
			{"Thaddeus Lowe", "ice machine/refrigerator"},
			{"Gustavus Swift", "refrigerated railroad car"},
			{"Cyrus Field", "telegraph wire across the Atlantic"},
							
		};
		return list;
	}
	
	/**
	 * the multidimensional String array that has the information set for 'the old man and the sea' vocabulary
	 * @return the multidimensional array
	 */
	public static String[][] theOldManAndTheSeaVocab(){
		String [][] list = {
			{"skiff", "a small boat propelled by oars, sails, or a motor"},
			{"harpoon", "a spear with a barbed point for catching large fish"},
			{"erosion", "the process of wearing or grinding something down"},
			{"humility", "a lack of arrogance or false pride"},
			{"relic", "something of sentimental value"},
			{"bodega", "small hispanic shop selling groceries"},
			{"resolution", "the trait of being firm in purpose or belief"},
			{"fathom", "a linear unit of measurement for water depth"},
			{"plummet", "a metal bob of plumb line"},
			{"iridescent", "varying in color when seen in different lights"},
			{"filament", "a very slender fiber"},
			{"carapace", "hard outer covering or case for certain organisms"},
			{"churn", "be agitated"},
			{"taut", "pulled or drawn tight"},
			{"myriad", "a large indefinite number"},
			{"tentative", "hesitant or lacking confidence, unsettled in mind or opinion"},
			{"intolerable", "incapable of being put up with"},
			{"phophorescent", "emitting light with little heat"},
			{"scythe", "an edge tool for cutting grass"},
			{"strain", "an intense or violent exertion"},
			{"coagulate", "change from a liquid to a thickened or solid state"},
			{"teeter", "move unsteadily, with a rocking motion"},
			{"carcass", "the dead body of an animal"},
			{"rigor mortis", "temprary stiffness of joints and muscles after death"},
			{"conscientious", "characterized by extreme care and great effort"},
			{"improvise", "manage in a makeshift way, do with whatever is at hand"},
			{"undulation", "wavelike motion"},
			{"rapier", "a straight sword with a narrow blade and two edges"},
			{"noble", "having high or elated character"},
			{"pilgrimage", "a journey to a sacred place"},
			{"burnish", "polish and make shiny"},
			{"perceptible", "capable of being grasped by the mind or senses"},
			{"resistance", "any mechanical force that tends to oppose motion"},
			{"maw", "informal terms for the mouth"},
			{"cede", "relinquish possession or control over"},
			{"grudgingly", "in a reluctant manner"},
			{"dorsal", "on or near the back of an animal or organism"},
			{"placid", "calm and free from disturbance"},
			{"agony", "intense feelings of suffering, acute mental or physical pain"},				
			{"interminable", "tiresomely long, seemingly without end"},
			{"summon", "ask to come"},
			{"wallow", "roll around"},
			{"malignancy", "quality of being disposed to evil, intense ill will"},
			{"mutilated", "having a part of the body crippled or disabled"},
			{"involuntarily", "against your will"},
			{"juncture", "the shape or manner in which things come together"},
			{"sever", "cut off from a whole"},
			{"awash", "covered with water"},
			{"sluggish", "moving slowly"},
			{"proprietor", "someone who owns a business"},
												
		};
		return list;
	}
	/**
	 * the multidimensional String array that has the information set for 'to kill a mockingbird' vocabulary
	 * @return the multidimensional array
	 */
	public static String[][] toKillAMockingbirdVocab(){
		String [][] list = {
			{"consult", "seek information from"},
			{"unsullied", "spotlessly clean and fresh"},
			{"satisfactory", "meeting requirements"},
			{"tyrannical", "characteristic of an absolute ruler"},
			{"absence", "failure to be present"},
			{"revelation", "an enlightening or astonishing disclosure"},
			{"concede", "be willing to yield"},
			{"employ", "put into service"},
			{"decline", "refuse to accept"},
			{"foray", "a sudden short attack"},
			{"miserable", "very unhappy"},
			{"condenscend", "do something that one considers to be below one's dignity"},
			{"compel", "force somebody to do something"},
			{"expound", "add details, as to an account or idea"},
			{"erratic", "liable to sudden unpredictable change"},
			{"contradict", "prove negative, show to be false"},
			{"humiliation", "strong feelings of embarrasment"},
			{"amiable", "diffusing warmth and friendliness"},
			{"exclusive", "not divided or shared with others"},
			{"withdraw", "remove something as by lifting, pushing or takinf off"},
			{"unanimous", "in complete agreement"},
			{"arbitrate ", "act between parties with a view to reconciling differences"},
			{"inquisitive", "showing curiosity"},
			{"peculiar", "beyond or deviated from the usual or expected"},
			{"ramshackle", "in deplorable condition"},					
		
		};
		return list;
	}
	/**
	 * the multidimensional String array that has the information set for 'the outsiders' vocabulary
	 * @return the multidimensional array
	 */
	public static String[][] theOutsidersVocab(){
		String [][] list = {
			{"consider", "deem to be"},
			{"conscious", "having awareness of surroundings, sensations, and thoughts"},
			{"perspiration", "salty fluid secreted by sweat glands"},
			{"suffocate", "die from lack of oxygen"},
			{"sympathetic", "expressing compassiom or friendly fellow feelings"},
			{"acquire", "win something through effort"},
			{"unfathamable", "impossible to come to understand"},
			{"organized", "methodical and efficient in arrangment or function"},
			{"suspicious", "openly distrusfut and unwilling to confide"},
			{"surround", "extend on all sides of simulateously, encircle"},
			{"savvy", "get the meaning of something"},
			{"appeal", "be attractive to"},
			{"increduous", "not disposed or willing to believe, unbelieving"},
			{"hesitation", "indecision in speech or action"},
			{"rebellious", "resisting control or authority"},
			{"sophisticated", "having wordly knowledge and refinement"},
			{"aloofness", "a disposition to be distant and unsympathetic in manner"},
			{"elite", "a group or class of persons enjoying superior status"},
			{"reputation", "the state of being held in high esteem and honor"},
			{"tension", "a state of mental or emotional strain or suspense"},
			{"reckon", "expect, believe, or suppose"},
			{"frustration", "a feeling of annoyance at being hindered or criticized"},
			{"stagger", "walk as if unable to control movements"},
			{"smoldering", "showing scarcely suppressed anger"},
			{"clutch", "hold firmly usually with the hands"},
			{"apprehensive", "in fear or dread of possible evil or harm"},
			{"defiance", "a hostile challenge"},
			{"gingerly", "with extreme care or delicacy"},
			{"sheepish", "marked by docility, stupidity, meekness, or timidity"},
			{"premonition", "a feeling of evil to come"},
			{"stricken", "affected by something overwhelimg"},
			{"disguise", "make unrecognizable"},
			{"gallant", "unfliching in battle or action"},
			{"elude", "escape physically or mentally"},
			{"transplant", "transfer from one place or period to another"},
			{"indignation", "angered at something unjust or wrong"},
			{"notion", "a vague idea in which some confidence is placed"},
			{"testify", "give a solemn statement in a court of law"},
			{"survey", "look over carefully or inspect"},
			{"apparently", "unmistakably"},
			{"doggedly", "with obstinate determination"},
			{"conviction", "an unshakable belief in something without need for proof"},
			{"ember", "a hot, smoldering fragment of wood left from a fire"},
			{"promptly", "at once"},
			{"soothing", "freeing from fear and anxiety"},
			{"severe", "very bad in degree or extent"},
			{"bleak", "offering little or no hope"},
			{"mourn", "feel great sadness"},
			{"delinquent", "a young offender"},
			{"recurring", "coming back"},
			{"exploit", "a notable achievement"},
			{"outcast", "a person who is rejected"},
			{"sob", "weep convulsively"},
			{"critical", "being in or verging on a state of crisis or emergency"},
			{"falter", "speak haltingly"},
			{"ornery", "having a difficult and contrary disposition"},
			{"casual", "marked by blithe unconcern"},
			{"debate", "think about carefully, weigh"},
			{"deny", "declare untrue, contradict"},
			{"scarce", "deficient in quantity or number compared with the demand"},
			{"interfere", "come between, be a hindrance or obstacle"},
			{"conformity", "compliance with accepted standards, rules, or norms"},
			{"determined", "strongly motivated to succeed"},
			{"discipline", "the act of punishing"},
			{"leery", "openly distrustful and unwilling to confide"},
			{"taut", "subjected to great tension, stretched tight"},
			{"contempt", "lack of respect accompanied by a feeling of intense dislike"},
			{"detached", "showing lack of emotional involvement"},
			{"editorial", "an article giving opinions or perspectives"},
			{"agony", "intense feellings of suffering, acute mental or physical pain"},
			{"stupor", "marginal consiounsness"},
			{"bewildered", "perplexed by many conflicting situations or statements"},
			{"impact", "the striking of one body against another"},
			{"desperate", "dangerously reckless or violent as from urgency or despair"},
			{"concussion", "inury to the brain caused by a blow"},
			{"pity", "share the suffering of"},
			{"filthy", "vile, despicable"},
			{"liable", "at risk of experiencing something usually unpleasant"},
			{"flinch", "draw back, as with fear or pain"},
			{"acquitted", "declared not guilty of a specific offense or crime"},
			{"circumstance", "the set of acts that surround a situation or event"},
			{"vacuum", "an empty area or space"},
			{"expression", "the feeling shown on a person's face"},
			{"condition", "the state of health"},
			{"veer", "turn shrply, change direction abruptly"},
			{"realize", "be fully aware or cognizant of"},
			{"gripe", "complain"},
			{"quiver", "shake with fast, tremulous movements"},
			{"vast", "usually great in size, amount, extent, or scope"},
			{"reckless", "marked by defiant disregard for danger or consequences"},	
			
		};
		return list;
	}
	/**
	 * the multidimensional String array that has the information set for polyatomic ions
	 * @return the multidimensional array
	 */
	public static String[][] polyatomicIons(){
		String [][] list = {
			{"ammonium", "NH4 +"},
			{"hydronium","H3O +"},
				
			{"hydrogen carbonate","HCO3 -"},
			{"hydrogen sulfate","HSO4 -"},
			{"acetate","C2H3O2 -"},
			{"nitrite","NO2 -"},
			{"nitrate","NO3 -"},
			{"hypochlorite"," ClO -"},
			{"chlorite","ClO2 -"},
			{"chlorate","ClO3 -"},
			{"perchlorate","ClO4 -"},
			{"cyanide","CN -"},
			{"hydroxide","OH -"},
			{"dihydrogen phosphate","H2PO4 -"},
			{"permanganate","MnO4 -"},
					
			{"carbonate","Co3 2-"},
			{"sulfite","SO3 2-"},
			{"sulfate","SO4 2-"},
			{"oxalate","C2O4 2-"},
			{"dichromate","Cr2O7 2-"},
			{"hydrogen phosphate","HPO4 2-"},
			{"peroxide","O2 2-"},
					
			{"phosphate","PO4 3-"}					
			
		};
		return list;
	}

}
