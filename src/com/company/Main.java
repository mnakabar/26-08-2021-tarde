package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Veiculo veiculo1 = new Veiculo("Ford", "Fiesta", 1000.0);
        Veiculo veiculo2 = new Veiculo("Ford", "Focus", 1200.0);
        Veiculo veiculo3 = new Veiculo("Ford", "Explorer", 2500.0);
        Veiculo veiculo4 = new Veiculo("Fiat", "Uno", 500.0);
        Veiculo veiculo5 = new Veiculo("Fiat", "Cronos", 1000.0);
        Veiculo veiculo6 = new Veiculo("Fiat", "Torino", 1250.0);
        Veiculo veiculo7 = new Veiculo("Chevrolet", "Aveo",1250.0);
        Veiculo veiculo8 = new Veiculo("Chevrolet", "Spin", 2500.0);
        Veiculo veiculo9 = new Veiculo("Toyota", "Corola", 1200.0);
        Veiculo veiculo10 = new Veiculo("Toyota", "Fortuner", 3000.0);
        Veiculo veiculo11 = new Veiculo("Toyota", "Logan", 950.0);

        List<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();

        listaDeVeiculos.add(veiculo1);
        listaDeVeiculos.add(veiculo2);
         listaDeVeiculos.add(veiculo3);
         listaDeVeiculos.add(veiculo4);
         listaDeVeiculos.add(veiculo5);
         listaDeVeiculos.add(veiculo6);
         listaDeVeiculos.add(veiculo7);
         listaDeVeiculos.add(veiculo8);
         listaDeVeiculos.add(veiculo9);
         listaDeVeiculos.add(veiculo10);
         listaDeVeiculos.add(veiculo11);

         Garagem garagem = new Garagem(1, listaDeVeiculos);

         listaDeVeiculos.stream().sorted((x,y) -> x.getCusto().compareTo(y.getCusto())).forEach(System.out::println);


        listaDeVeiculos.stream().sorted(Comparator.comparing(Veiculo ::getMarca).thenComparing(Veiculo ::getCusto)).forEach(System.out::println);

        List<Veiculo> veiculosPrecoBaixo = listaDeVeiculos.stream().filter(x -> x.getCusto() <1000).collect(Collectors.toList());

        List<Veiculo> veiculosPrecoMedio = listaDeVeiculos.stream().filter(x -> x.getCusto()>=1000).collect(Collectors.toList());

        double soma = listaDeVeiculos.stream().map(x -> x.getCusto()).mapToDouble(Double ::doubleValue).sum();


    }


}

