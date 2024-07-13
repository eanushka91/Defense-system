/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defense.system;

/**
 *
 * @author DELL
 */
public class DefenseSystem {

    
    public static void main(String[] args) {
  
        Helicopter helicopter = new Helicopter();
        helicopter.setVisible(true);
        Submarine submarine = new Submarine();
        submarine.setVisible(true);
        Tank tank = new Tank();
        tank.setVisible(true);

        DSObservable dSObservable = new DSObservable();
        dSObservable.addObserver(helicopter);
        dSObservable.addObserver(submarine);
        dSObservable.addObserver(tank);

        new Maincontraller(dSObservable).setVisible(true);
    }
}
