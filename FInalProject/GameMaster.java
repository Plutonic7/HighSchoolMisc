import java.util.Scanner;
import java.io.*;
public class GameMaster{
    Scanner sc = new Scanner(System.in);
    Player x = new Player(1);
    Rooms r = new Rooms();
    public GameMaster(){}
    public void save(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to load the last game? Or do you wish to create a new Player, yes or no");
        String choice = sc.nextLine();
        if(choice.equals("yes")){
            System.out.print('\u000C');
            try {
                Scanner f = new Scanner (new File("player"));
                int health = f.nextInt();
                int money = f.nextInt();
                int level = f.nextInt();
                Player x = new Player(level);
            }catch(IOException e){
                System.out.println("Something went wrong");
            }
        }else{
            String[] inv = new String[20];
            Player x = new Player(1);
        }
    }
    public void welcome(){
        System.out.println("Welcome to the dungeon there are many four rooms on the first level.");
        System.out.println("The monsters in the rooms will test your worthiness by giving you trials");
        System.out.println("Welcome to the dungeon");
        System.out.println("you will be placed in the first floor, good luck with the tutorial!");
    }
    public void tutorial(){
        
    }
    public boolean encounter(){
        r.room();
        r.printRoom();
        System.out.println(x.getRiddle(x.getLevel()));
        String answer = sc.nextLine();
        if (answer.equals(x.getAnswers(x.getLevel()))){
            return true;
        }
        return false;
    }
    public void nextLevel(){
        x.nextlevel();
    }
    public void Reset(){
        x.reset();
    }
}