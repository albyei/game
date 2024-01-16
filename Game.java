/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Scanner;
/**
 *
 * @author MOLKET012
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        player hero = new player();
        player heru = new player();
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.print(" Masukkan Kecepatan Hero : ");
        int laju = myObj.nextInt();
        System.out.print(" Masukkan Damage Hero  : ");
        int damage = myObj.nextInt();
        System.out.print(" Masukkan Sisa Nyawa Hero  : ");
        int hp = myObj.nextInt();
        
        System.out.println("================================");
        
         System.out.print(" Masukkan Kecepatan Heru : ");
        int laju2 = myObj.nextInt();
        System.out.print(" Masukkan Damage Heru  : ");
        int damage2 = myObj.nextInt();
        System.out.print(" Masukkan Sisa Nyawa Heru  : ");
        int hp2 = myObj.nextInt();

        
        hero.name = "hero";
        hero.speed = laju;
        hero.healthPoint = hp;
        hero.armor =100;  
        hero.damage =damage;
     
        heru.name = "heru";
        heru.speed = laju2;
        heru.healthPoint = hp2;
        heru.armor =100;
        heru.damage =damage2;
        heru.mati = "Mati";
        
        
        hero.run();   
        hero.defend();
        hero.attack();
        
        heru.run();   
        heru.defend();
        heru.attack();
       
       
        
        if (hero.isDead()){
            System.out.println("hero is Win!");
        }else{
            System.out.println("hero is Win!");
            
            if (heru.isDead()){
            System.out.println("heru is Win!");
        }else{
            System.out.println("heru is Win!");
        }
        }
    }
        
    
}
