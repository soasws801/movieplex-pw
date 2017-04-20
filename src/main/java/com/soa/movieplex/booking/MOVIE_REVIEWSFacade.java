/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soa.movieplex.booking;

import com.soa.movieplex.entities.MOVIE_REVIEWS;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PJW
 */
@Stateless
public class MOVIE_REVIEWSFacade extends AbstractFacade<MOVIE_REVIEWS> {

    @PersistenceContext(unitName = "movieplexPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MOVIE_REVIEWSFacade() {
        super(MOVIE_REVIEWS.class);
    }
    
}
