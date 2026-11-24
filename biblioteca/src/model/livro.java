package model;

// aqui a gente cria quais dados vão ter na classe livro
 public class livro{
    private int id;
    private String titulo;
    private int ano;
    private String autor;
    private boolean emprestado;

    // deixando o boolean 'emprestado' publico ---- analogia = é como se abrissemos uma porta para as pessoas verem esse atributo
  public boolean isEmprestado(){
    return emprestado;
  
  }
  public String getTitulo(){
    return titulo;
  }

  public int getAno(){
    return ano;
  }

  public String getAutor(){
    return autor;
  }

  public int getId(){
    return id;
  }

  public void setEmprestado(boolean emprestado){
    this.emprestado = emprestado;
  }

  

 }

 