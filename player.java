/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
public class player {
    //artribut
    String name,mati;
    int speed, healthPoint, damage, armor;
    
    //method
    void run(){
        System.out.println(name+" is running...");  
        System.out.println("speed "+ speed);
  
}
   void defend(){
       armor-=damage;
       System.out.println(" Enemy is armor");
       System.out.println(name+" Armor mu Tinggal "+armor );
   
     }    
   void attack(){
       healthPoint-=damage;
       System.out.println("Enemy is attacking");
       System.out.println(name+" Nyawa mu Tinggal "+healthPoint );
     
   }
 boolean isDead(){
    if(healthPoint <=25) return true;
    return false;
    
     
 }
}