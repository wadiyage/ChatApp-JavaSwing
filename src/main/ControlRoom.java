package main;


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
    private ArrayList<ChatRoom> roomList = new ArrayList<>();
    private String username;
    private String message;
    
    public void addChatRoom(ChatRoom chatRoom) {
        roomList.add(chatRoom);
    }
    
    public void setMessage(String username, String message) {
        this.username=username;
        this.message=message;
        
        notifyReceivers();
    }
    
    private void notifyReceivers() {
        for(ChatRoom room:roomList) {
            room.update(username, message);
        }
    }
    
}
