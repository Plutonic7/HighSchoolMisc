public class Driver{
    public static void start(){
        GameMaster g = new GameMaster();
        g.welcome();
        g.tutorial();
        boolean finish = false;
        while(true){
            if (g.encounter() == true){
                g.nextLevel();
                System.out.print('\u000C');
                if(g.encounter() == true){
                    g.nextLevel();
                    System.out.print('\u000C');
                    if(g.encounter()==true){
                        g.nextLevel();
                        System.out.print('\u000C');
                        if(g.encounter()==true){
                            System.out.println("You finished, would you like to proceed to the next floor");
                            finish = true;
                        }
                    }
                }
            }
            if (finish == true){
                break;
            }else{
                g.Reset();
                System.out.print('\u000C');
            }
        }
    }
}