package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    /*
     ***********************************
     **      Getters and Setters      **
     *********************************** 
     */

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /*
     ***********************************
     **          Constructor          **
     *********************************** 
     */
    
    public Curso(String titulo, String descricao, Integer cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    /*
     ***********************************
     **        Public methods         **
     *********************************** 
     */

    @Override
    public String toString() {
        return "\tTitulo = " + titulo + "\n\tDescricao = " + descricao + "\n\tCargaHoraria = " + cargaHoraria + "\n";
    }   

    /*
     ***********************************
     **        Private methods        **
     *********************************** 
     */
    
    private int _calcularXp (){
        return 0;
    }
}
