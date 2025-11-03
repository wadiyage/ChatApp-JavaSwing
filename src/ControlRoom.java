
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class ControlRoom {
    private ArrayList<ChatRoom> chatWindowList = new ArrayList<>();
    private String username;
    private String message;
    
    public void setMessage(String username, String message) {
        this.username=username;
        this.message=message;
        displayMessage();
        
        notifyReceivers();
    }
    
    private void displayMessage() {
        System.out.println("Setted message: "+message);
    }
    
    private void notifyReceivers() {
        //////
        for(ChatWindow chatWindow:chatWindowList) {
            chatWindow.update(username, message);
            System.out.println("Are receivers working?");
        }
    }
    
}
