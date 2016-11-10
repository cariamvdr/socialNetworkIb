/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetworkib;

import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author utente
 */
public class User {
    static private long prevId = 0;
    private long id;
    private String name;
    private LocalDate nascita;
    private int day;
    private int month;
    private int year;
    private String avatar;
    
    public void User (String name, String avatar, int day, int month, int year){
        this.id=++prevId;
        this.name=name;
        this.avatar=avatar;
        this.day = day;
        this.month = month;
        this.year = year;
        this.nascita = LocalDate.of(year, month, day);
    }
        //metodi
        public int age (){
            LocalDate oggi = LocalDate.now();
            Period age = Period.between(this.nascita, oggi);
            return age.getYears();
        }
        
        
}
