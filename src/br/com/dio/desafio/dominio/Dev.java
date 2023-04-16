package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String name;
    /*Porque nao uma lista em vez de um LinkedHashSet?
    Um dev nao pode se inscrever em mais de um conteudo mais de uma vez, por isso nao é necessario o uso de uma lista.
    */
    private Set<Contents> subscribedContent = new LinkedHashSet<Contents>();
    private Set<Contents> finishedContent = new LinkedHashSet<Contents>();

    /*
     ***********************************
     **      Getters and Setters      **
     *********************************** 
     */

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getSubscribedContent() {
        return subscribedContent;
    }
    public void setSubscribedContent(Set<Contents> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Contents> getFinishedContent() {
        return finishedContent;
    }
    public void setFinishedContent(Set<Contents> finishedContent) {
        this.finishedContent = finishedContent;
    }

    /*
     ***********************************
     **          Constructor          **
     *********************************** 
     */

    public Dev () {}

    public Dev(String name, Set<Contents> subscribedContent, Set<Contents> finishedContent) {
        this.name = name;
        this.subscribedContent = subscribedContent;
        this.finishedContent = finishedContent;
    }

    /*
     ***********************************
     **        Public methods         **
     *********************************** 
     */
    
    /**
     * Subscribe dev to a bootcamp.
     * @param bootcamp
     */
    public void subscribeBootcamp (Bootcamp bootcamp) {}

    /**
     * Change dev's progress.
     */
    public void progress () {}

    /**
     * Calculate total experience gathered so far by the dev.
     */
    public void calculateTotalXp () {

    }

    @Override
    public String toString() {
        return "Dev [name=" + name + ", subscribedContent=" + subscribedContent + ", finishedContent=" + finishedContent
                + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((subscribedContent == null) ? 0 : subscribedContent.hashCode());
        result = prime * result + ((finishedContent == null) ? 0 : finishedContent.hashCode());
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
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (subscribedContent == null) {
            if (other.subscribedContent != null)
                return false;
        } else if (!subscribedContent.equals(other.subscribedContent))
            return false;
        if (finishedContent == null) {
            if (other.finishedContent != null)
                return false;
        } else if (!finishedContent.equals(other.finishedContent))
            return false;
        return true;
    }

    /*
     ***********************************
     **        Private methods        **
     *********************************** 
     */

    

}
