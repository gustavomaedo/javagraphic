package com.gustavoams.smile;

import com.gustavoams.smile.services.Smile;

/**
 * User: gustavomaedo
 * Date: 4/11/20
 * Time: 5:59 PM
 */
public class App {
    Smile smile = new Smile();

    void initApp() {
        smile.setSize(8, 8);
        smile.setIcon("X");
        addCoordinates();
        smile.createImage();
        smile.printImage();
    }

    private void addCoordinates(){
        // y = 0
        smile.addCoordinate(2,0);
        smile.addCoordinate(3,0);
        smile.addCoordinate(4,0);
        smile.addCoordinate(5,0);

        // y = 1
        smile.addCoordinate(1,1);
        smile.addCoordinate(6,1);

        // y = 2
        smile.addCoordinate(0,2);
        smile.addCoordinate(2,2);
        smile.addCoordinate(5,2);
        smile.addCoordinate(7,2);

        // y = 3
        smile.addCoordinate(0,3);
        smile.addCoordinate(7,3);

        // y = 4
        smile.addCoordinate(0,4);
        smile.addCoordinate(2,4);
        smile.addCoordinate(5,4);
        smile.addCoordinate(7,4);

        // y = 5
        smile.addCoordinate(0,5);
        smile.addCoordinate(3,5);
        smile.addCoordinate(4,5);
        smile.addCoordinate(7,5);

        // y = 6
        smile.addCoordinate(1,6);
        smile.addCoordinate(6,6);

        // y = 7
        smile.addCoordinate(2,7);
        smile.addCoordinate(3,7);
        smile.addCoordinate(4,7);
        smile.addCoordinate(5,7);
    }
}
