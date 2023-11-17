/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yummy;

/**
 *
 * @author CRISTINA P. SUELLO
 */
public class Manok {
    String adobo;
    String menodo;
    String fried ;
    
    Manok(String adobo, String menodo, String fried){
        this.adobo= adobo;
        this.menodo= menodo;
        this.fried= fried;
    }
    
    void showAdobo(){
        System.out.println( adobo);
    }
    
    void showMenodo(){
        System.out.println(menodo);
    }
    
    void showFried(){
        System.out.println(fried);
    }
    
}


