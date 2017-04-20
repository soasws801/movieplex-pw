/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soa.movieplex.reviews;

import com.soa.movieplex.entities.Movie;
import static com.soa.movieplex.entities.ShowTiming_.movie;
import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Named
@FlowScoped("review")
public class reviewing implements Serializable {

    int movieId;
    String startTime;
    int startTimeId;
    @PersistenceContext
    EntityManager entityManager;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    
    
    public String getMovieName() {
        try {

            return entityManager.createNamedQuery("Movie.findById", Movie.class).setParameter("id", movieId).getSingleResult().getName();
        } catch (NoResultException e) {
            return "";
        }
        
  
    public void addReview() throws Exception {
        userTransaction.begin();
        
    MovieReview review;
    
    review = new MovieReview(bean.getReviewId(),
    bean.getCustomer(), bean.getRating(), bean.getComments());
    Movie movie = new Movie(movieId);
    review.setMovie(movie);

   
    public String getReviewId() {
        String ReviewId = null;
        return ReviewId;
    }
    
     public String getCustomer() {
        String Customer = null;
        return Customer;
    }
     public String getRating() {
        String Rating = null;
        return Rating;
    }
      public String getComments() {
        String Comments = null;
        return Comments;
    }
    
 entityManager.persist(review);
 userTransaction.commit();
 }
        
    }
 

    

    
}
