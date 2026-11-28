package service;
import java.util.ArrayList;

import model.Livro;

// arrayList dos livros//
/*
*usa arrayList poque ele expande e contrai conforme for adicionado
*descobrir uma forma de add os livros
*/
public class LivroService {
    ArrayList<model.Livro> listaLivro = new ArrayList<>();
            Livro Livro1 = new Livro(1, "O Alquimista", 1998, "Paulo Coelho" );
            listaLivro.add(Livro1);

            System.out.println(Livro1)
        }

