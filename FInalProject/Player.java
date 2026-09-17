import java.util.ArrayList;

public class Player{
    //initiates variables
   
    public double level;
   
    //creates the player class
    public Player(double l){
        level = l;
    }
   
    //methods for calling player variables
    public double getLevel()
    {return level;}
   
    public String getRiddle(double level){
        if (level == 1){
            return "What can never walk but can run?";
        }else if (level == 2){
            return "What has bark but cannot bite?";
        }else if ( level == 3){
            return "What word starts with gas and is 3 letters";
        }else if (level == 4){
            return "I have married many people but I've always been single, who am I?";
        }
        return "Complete";
    }
    public String getAnswers(double level){
        if (level == 1){
            return "river";
        }else if (level == 2){
            return "tree";
        }else if (level == 3){
            return "car";
        }else if (level == 4){
            return "priest";
        }
        return "Complete";
    }
    public void nextlevel(){
        level++;
    }
    public void reset(){
        level = 1;
    }
}