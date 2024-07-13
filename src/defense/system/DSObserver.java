/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defense.system;

/**
 *
 * @author DELL
 */
public interface DSObserver {
    void areaClearedMessage(boolean status);
    void updatePosition(int positionLevel);
    void updateSendMessage(String message);
}
