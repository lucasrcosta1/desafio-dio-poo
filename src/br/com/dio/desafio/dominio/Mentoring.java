package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Contents{
    private LocalDate date;

    /*
     ***********************************
     **                               **
     **      Getters and Setters      **
     **                               **
     *********************************** 
     */

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /*
     ***********************************
     **          Constructor          **
     *********************************** 
     */

    public Mentoring () {}
    
    public Mentoring(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    /*
     ***********************************
     **        Public methods         **
     *********************************** 
     */

    @Override
    public double calculateXp() {
        return PATTERN_XP + 20d;
    }

    @Override
    public String toString() {
        return "\tTitulo = " + getTitle() + "\n\tDescricao = " + getDescription() + ", \n\tData = " + getDate() + "\n";
    }
    

    /*
     ***********************************
     **        Private methods        **
     *********************************** 
     */
}
