package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
/*
        Pessoa p1 = new Pessoa(null,"Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null,"Joaquin Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null,"Ana Maria", "ana@gmail.com");*/

        //criando e realizando a conexão
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpa");
        EntityManager em = emf.createEntityManager();

        // enviando dados para o banco de dados
        /*em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();*/

        //pesquisa no banco de dados
       /* Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);
        System.out.println("Pronto!");*/

        // remover do banco de dados
        Pessoa p = em.find(Pessoa.class,2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        System.out.println(p);
        System.out.println("Pronto!");
        em.close();
        emf.close();

    }
}
