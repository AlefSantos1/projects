package atvveiculo;

public class Livro {
      private String Titulo;
      private String Autor;
      private String Isbn;
      private int Npag;
      private double Valcom;

    public Livro(String Titulo, String Autor, String Isbn, int Npag, double Valcom) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Isbn = Isbn;
        this.Npag = Npag;
        this.Valcom = Valcom;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public int getNpag() {
        return Npag;
    }

    public void setNpag(int Npag) {
        this.Npag = Npag;
    }

    public double getValcom() {
        return Valcom;
    }

    public void setValcom(double Valcom) {
        this.Valcom = Valcom;
    }

    
    
    
    
}