/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Saerom Lee
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter user name");
        String userID = input.nextLine();
        
        System.out.println("Choose your favourite genre \n[Comedy, Drama, Action, Mystery]");
        String userGenre = input.nextLine();
        
        UserProfile user1 = new UserProfile(userID, userGenre);
        
        System.out.println("New user profile " + user1.getUserID() + " was created");
        
    }
    
}
