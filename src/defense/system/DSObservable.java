/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense.system;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class DSObservable {
    private final ArrayList<DSObserver> observerList = new ArrayList<>();
    
    private boolean status;
    private int position;
    private String message;
//    private boolean select;
//    private int checkNum;
    
    public void addObserver(DSObserver ob){
        observerList.add(ob);
    }
    public void setAreaClearedMessage(boolean status){
        if(this.status != status){
            this.status = status;
            notifyDevices();
        }
    }
    public void setUpdatePosition(int position){
        if(this.position != position){
            this.position = position;
            notifyDevices();
        }
    }
    
    public void setUpdateSendMessage(String message){
        if(this.message == null ? message != null : !this.message.equals(message)){
            this.message = message;
//            this.select = select;
//            this.checkNum = checkNum;
            notifyDevices();
        }
    }
    
    public void notifyDevices(){
        for (DSObserver ob : observerList){
            ob.areaClearedMessage(status);
            ob.updatePosition(position);
            ob.updateSendMessage(message);
        }
    }
}
