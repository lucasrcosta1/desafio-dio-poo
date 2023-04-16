package br.com.dio.desafio.dominio;

public abstract class Contents {
    protected static final double PATTERN_XP = 10d;

    private String title;
    private String description;

    /*
     ***********************************
     **      Getters and Setters      **
     *********************************** 
     */

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /*
     ***********************************
     **          Constructor          **
     *********************************** 
     */
    
    public Contents () {}

    public Contents(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /*
     ***********************************
     **        Public methods         **
     *********************************** 
     */
    
    /**
     * Calculate the experience.
     * @return
     */
    public abstract double calculateXp();



}
