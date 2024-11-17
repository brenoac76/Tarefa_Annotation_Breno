package br.com.brenoacosta;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

        Class<?> clazz = Cliente.class;


        if (clazz.isAnnotationPresent(Tabela.class)) {

            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.nome());
        }
    }
}

