package br.com.dio.desafio.dominio;

public class Course extends Contents{
    private int hours;

    /*
     ***********************************
     **      Getters and Setters      **
     *********************************** 
     */

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }  

    /*
     ***********************************
     **          Constructor          **
     *********************************** 
     */

    public Course () {}
    
    public Course(String title, String description, Integer hours) {
        super(title, description);
        this.hours = hours;
    }

    /*
     ***********************************
     **        Public methods         **
     *********************************** 
     */
    
    @Override
    public double calculateXp() {
        return PATTERN_XP + this.getHours();
    } 

    @Override
    public String toString() {
        return "\tTitulo = " + getTitle() + "\n\tDescricao = " + getDescription() + "\n\tCargaHoraria = " + getHours() + "\n";
    }

    /*
     ***********************************
     **        Private methods        **
     *********************************** 
     */
    
}
