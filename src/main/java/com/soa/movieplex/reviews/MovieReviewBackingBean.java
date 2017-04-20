/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soa.movieplex.client;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Eric Desrochers
 */
@Named
@SessionScoped
public class MovieReviewBackingBean implements Serializable {

    String movieName;
    private int reviewId;
    private String customer;
    private String rating;
    private String comments;     

        public String getMovieName() {
        return movieName;
    }

      public int getReviewId() {
        return reviewId;
    }
         
    public void setReviewId(String R) {
        this.reviewId = reviewId;
    }
        
    public String getCustomer() {
        return customer;
    }
         
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getRating() {
        return rating;
    }
    
    public void setRating(){
    this.rating = rating;
    
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
   


}
