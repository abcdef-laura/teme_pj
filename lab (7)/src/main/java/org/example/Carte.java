package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Carte {
    @JsonProperty("titlul")
    private String titlul;
    @JsonProperty("autorul")
    private String autorul;
    @JsonProperty("anul")
    private int anul;

    public Carte()
    {

    }
    public Carte(String titlul, String autorul, int anul) {
        this.titlul = titlul;
        this.autorul = autorul;
        this.anul = anul;
    }

    public String getTitlu() {
        return titlul;
    }

    public void setTitlu(String titlu) {
        this.titlul = titlu;
    }

    public String getAutor() {
        return autorul;
    }

    public void setAutor(String autor) {
        this.autorul = autor;
    }

    public int getAnul_aparitiei() {
        return anul;
    }

    public void setAnul_aparitiei(int anul_aparitiei) {
        this.anul = anul_aparitiei;
    }

    @Override
    public String toString() {
        return "\nTitlu: "+titlul+"\nAutor: "+autorul+"\nAnul aparitiei: "+anul;
    }
}
