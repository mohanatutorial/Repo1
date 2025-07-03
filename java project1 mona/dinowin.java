import java.util.Scanner;
public class dinowin{
	public static void main(String args[]){
		System.out.println("WELCOME TO THE GAME");
		for(int i=1;i<=4;++i){
			Scanner sc=new Scanner(System.in);
			System.out.print("The number thrown by player " + i + ":");
			int num=sc.nextInt();
				if(num==1){
					System.out.println("player " + i + " entered the game");
				}
				else{
					System.out.println("player " + i + " is eliminated");
				}
		}

	level1.level();
	}

}


 class level1{
	public static void level(){
		for(int i=1;i<=4;++i){

			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num==1){
				System.out.println("player " + i + " entered into level 1");
			}
			else{
				System.out.println("player " + i + " is already eliminated");
			}
		}	
	level1 obj=new level1();
	obj.Ladders();
	}
	public void Ladders(){
		for(int i=1;i<=4;++i){
			Scanner sc=new Scanner(System.in);
			System.out.print("The number thrown by player " + i + ":");
			int num=sc.nextInt();
			if(num==5){
				System.out.println("player " + i + " climbed on the ladders and move on to level 2");
			}
			else if(num<5 || num==6){
				System.out.println("player " + i + " is eliminated");
			}
			else{
				System.out.println("player " + i + " is already eliminated");
			}
		}
	level2.level();
	}	
}

class level2{
	public static void level(){
		Scanner sc=new Scanner(System.in);
		System.out.print("The number of players move on to the level 2:");
		int size=sc.nextInt();
		int[] numbers=new int[size];
		System.out.println("The players move on to the level 2:");
		for(int i=1;i<size;++i){
			System.out.println("player: ");
			numbers[i] = sc.nextInt();
		}
	level2 obj=new level2();
	obj.Hammerpunch();
	}
	public int Hammerpunch(){
		for(int i=1;i<=4;++i){
			Scanner sc=new Scanner(System.in);
			System.out.print("The time taken to complete this level by the  player " + i + ":");
			int num=sc.nextInt();
			if(num==2){
				System.out.println("player " + i + " escapes from the hammer in 2 mins");
			}
			else if(num==4){
				System.out.println("player " + i + " escapes from the hammer in 4 mins");
			}
			else if(num>5){
				System.out.println("player " + i + " got eliminated");
			}
			else{
				System.out.println("player " +i +" is already eliminated");
			}
		}
	level3 obj=new level3();
	obj.level();
	return 0;
	}
}


class level3{
	public  void level(){
		Scanner sc=new Scanner(System.in);
		System.out.print("The number of players move on to the level 3:");
		int size=sc.nextInt();
		int[] numbers=new int[size];
		System.out.println("The players move on to the level 3:");
		for(int i=1;i<size;++i){
			System.out.println("player: ");
			numbers[i] = sc.nextInt();
		}
		level3 obj=new level3();
		obj.shapes();
	}
	public void shapes(){
		String[] shapes={"square","triangle","rectangle","circle"};
		for(int i=0;i<shapes.length;i++){
			System.out.println("This player had to do one object related to sea");
			Scanner sc=new Scanner(System.in);
			System.out.print(shapes[i] + " is choosen by player:");
			int num=sc.nextInt();
			if(num==0){
				System.out.println("This shape does not choosen because the player is already eliminated");
				break;
			}
		

			if(shapes[i]=="square" || shapes[i]=="rectangle"){
				System.out.println("This player had to do boat");
			}
			else if(shapes[i]=="triangle"){
				System.out.println("This player had to do any type of fish");
			}
			else if(shapes[i]=="circle"){
				System.out.println("This player had to do something like flag");
			}
		}
	
				
			
		for(int j=1;j<=4;j++){
			Scanner sc=new Scanner(System.in);
			System.out.print("The time taken by player " + j + " to complete this level:");
			int num=sc.nextInt();
			if(num<=3){
					System.out.println("player " + j + " completed the level within 3mins");
			}
			else if(num==4){
					System.out.println("player " + j + " is eliminated");
			}
			else{
					System.out.println("player " + j +" is already eliminated");
			}
		}
		level4.level();
	}

	
}


class level4{
	public static  void level(){
		Scanner sc=new Scanner(System.in);
		System.out.print("The number of players move on to the level 4:");
		int size=sc.nextInt();
		int[] numbers=new int[size];
		System.out.println("The players move on to the level 4:");
		for(int i=1;i<size;++i){
			System.out.println("player: ");
			numbers[i] = sc.nextInt();
		}
		level4 obj=new level4();
		obj.memorygame();
	}
	public void memorygame(){
		String [] fruits={"Apples-5","Bananas-3","Cherries-2","Pineapples-10"};
		System.out.println("The screen shows many fruits:"+ fruits[0] + fruits[1] + fruits[2] + fruits[3] );
		System.out.println("These players had to memory the number of fruits within 25 sec");
		int sec=25;
		if (sec==25){
			System.out.println("After 25 seconds,the screen becomes blank");
		}
		System.out.println("The player has 20 seconds to guess");
			for(int j=1;j<=4;++j){
			Scanner sc=new Scanner(System.in);
			System.out.println("--------------");
			int num=sc.nextInt();
			System.out.println("The player " + j + " guesses: " + num + "correctly");

			if(num==4){
				System.out.println("This player guessed all the four correctly");
				System.out.println("This player is announced as a dino winner!");
			
			}
			else if(num==0){
				System.out.println("This player is already eliminated");
			}
			else{
				System.out.println("This player guessed wrong! and eliminated");
			}
		}
		System.out.println("Finally!The dino game is over");
	}
}
				
					

	
			
			
			
		 
		
		
		

				
				