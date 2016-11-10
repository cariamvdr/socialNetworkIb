/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetworkib;

/**
 *
 * @author utente
 */
public class Post {
    static private long prevId = 0;
    private long id;
    private String title;
    private String body;
    
        
    public void Post (String title, String body){
        this.id = ++prevId;
    }
    
        public void show() {
            System.out.println("\n"+this.title+"\n"+this.body);
        }

    
//    public removeBannedWords(){
//    
//    }
    
    
}
