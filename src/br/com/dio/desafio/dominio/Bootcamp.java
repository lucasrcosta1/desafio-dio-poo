package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp extends Content{
    private final LocalDate beginDate = LocalDate.now();
    private final LocalDate endDate = beginDate.plusDays(45);
    /*Porque nao uma HashSet em vez de um LinkedHashSet?
    A ordem que esses devs sao inseridos nao faz diferenca nesse caso.
    */
    private Set<Dev> devsSubscribed = new HashSet<Dev>();
    private Set<Content> contents = new LinkedHashSet<Content>();

    /*
     ***********************************
     **      Getters and Setters      **
     *********************************** 
     */

    public LocalDate getBeginDate() {
        return beginDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Dev> getDevsSubscribed() {
        return devsSubscribed;
    }
    public void setDevsSubscribed(Set<Dev> devsSubscribed) {
        this.devsSubscribed = devsSubscribed;
    }

    public Set<Content> getContents() {
        return contents;
    }
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    /*
     ***********************************
     **          Constructor          **
     *********************************** 
     */

    public Bootcamp () {}
    public Bootcamp(Set<Dev> devsSubscribed, Set<Content> contents) {
        this.devsSubscribed = devsSubscribed;
        this.contents = contents;
    }
    public Bootcamp(String title, String description, Set<Dev> devsSubscribed, Set<Content> contents) {
        super(title, description);
        this.devsSubscribed = devsSubscribed;
        this.contents = contents;
    }   


    /*
     ***********************************
     **        Public methods         **
     *********************************** 
     */
    @Override
    public double calculateXp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateXp'");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((beginDate == null) ? 0 : beginDate.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result + ((devsSubscribed == null) ? 0 : devsSubscribed.hashCode());
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (beginDate == null) {
            if (other.beginDate != null)
                return false;
        } else if (!beginDate.equals(other.beginDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        if (devsSubscribed == null) {
            if (other.devsSubscribed != null)
                return false;
        } else if (!devsSubscribed.equals(other.devsSubscribed))
            return false;
        if (contents == null) {
            if (other.contents != null)
                return false;
        } else if (!contents.equals(other.contents))
            return false;
        return true;
    }




}
