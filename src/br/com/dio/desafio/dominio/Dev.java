package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    /*Porque nao uma lista em vez de um LinkedHashSet?
    Um dev nao pode se inscrever em mais de um conteudo mais de uma vez, por isso nao é necessario o uso de uma lista.
    */
    private Set<Content> subscribedContent = new LinkedHashSet<Content>();
    private Set<Content> finishedContent = new LinkedHashSet<Content>();

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

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }
    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }
    public void setFinishedContent(Set<Content> finishedContent) {
        this.finishedContent = finishedContent;
    }

    /*
     ***********************************
     **          Constructor          **
     *********************************** 
     */

    public Dev () {}

    public Dev(String name, Set<Content> subscribedContent, Set<Content> finishedContent) {
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
    public void subscribeBootcamp (Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getDevsSubscribed().add(this);
    }

    /**
     * Change dev's progress.
     */
    public void progress () {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("Voce nao esta matriculado em nenhum conteudo!");
        }
    }

    /**
     * Calculate total experience gathered so far by the dev.
     * @return
     */
    public double calculateTotalXp () {
        return this.finishedContent
            .stream()
            .mapToDouble(content -> content.calculateXp()) //or .mapToDouble(Content::calculateXp) - to use reference method.
            .sum();
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
