/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soa.movieplex.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "THEATERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Theater.findAll", query = "SELECT t FROM Theater t"),
    @NamedQuery(name = "Theater.findById", query = "SELECT t FROM Theater t WHERE t.id = :id"),
    @NamedQuery(name = "Theater.findByCapacity", query = "SELECT t FROM Theater t WHERE t.capacity = :capacity"),
    @NamedQuery(name = "Theater.findByName", query = "SELECT t FROM Theater t WHERE t.Name = :name"),
    @NamedQuery(name = "Theater.findByAddress", query = "SELECT t FROM Theater t WHERE t.Address = :address")})
public class Theater implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    private Integer id;
    @NotNull
    private int capacity;
    @NotNull
    private String Name;
    @NotNull
    private String Address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "theater")
    private Collection<ShowTiming> showTimings;

    public Theater() {
    }

    public Theater(Integer id) {
        this.id = id;
    }

    public Theater(Integer id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    

    @XmlTransient
    public Collection<ShowTiming> getShowTimings() {
        return showTimings;
    }

    public void setShowTimings(Collection<ShowTiming> showTimings) {
        this.showTimings = showTimings;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theater)) {
            return false;
        }
        Theater other = (Theater) object;
        if ((this.id == null && other.id != null) || (this.id != null
                && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Theater[id=" + id + "]";
    }
    
}
