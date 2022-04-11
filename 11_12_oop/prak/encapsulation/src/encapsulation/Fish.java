/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author user
 */
public class Fish {
    private String type, feed;

    //type
    public void settype(String jenis) {
        type = jenis;
        this.type = type;  
    }
    
    public String gettype() {
        return type;
    }
    
    // feed
        public void setfeed(String makanan) {
        feed = makanan;
        this.feed = feed;  
    }
    
    public String getfeed() {
        return feed;
    }


}
