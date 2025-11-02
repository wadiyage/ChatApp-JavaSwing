
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
    private ArrayList<ChatWindow> chatWindowList = new ArrayList<>();
    private String message;
    
    public void setMessage(String message) {
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
            sendMessage();
            System.out.println("Is working? ll");
        }
    }
    
    private void sendMessage() {
        receiveMessage();
    }
    
    public String receiveMessage() {
        String username="Taasha";
        System.out.println("Sent message: "+message);
        return username+":"+this.message;
    }
    
}
