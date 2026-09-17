/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

import java.awt.*;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main()
    {
        ActorWorld world = new ActorWorld();
        
        Bug ni = new YouBug();
        world.add(ni);
        
        Bug j = new JumperBug();
        world.add(j);
        
        Bug x = new TagAlongBug(ni);
        world.add(x);
        //Bug z = new ZedBug(3);
        //world.add(z);
        //z.setDirection(90);
        //z.moveTo(new Location(2,2));     
        
        //Bug sp = new SpiralBug();
        //world.add(sp);
        //sp.moveTo(new Location(0,0));
        //sp.setDirection(90);
        
        Bug rb = new RockCrusherBug();
        //world.add(rb);
        //rb.moveTo(new Location(0,0));
        //rb.setDirection(90);
        
        Bug ob = new Octobug(1);
        //world.add(ob);
        
        Bug bob = new Bug();
        //world.add(bob);
        
        Bug tr = new TriangleBug(3);
        //world.add(tr);
        
        Bug Bg = new BogoBug(1);
        //world.add(Bg);
        
        Bug sq = new BoxBug(2);
        //world.add(sq);
        
        Rock r = new Rock();
        world.add( r );
    
        world.show();
    }
    
    
    
    
    
    
}