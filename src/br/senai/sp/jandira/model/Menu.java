package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooEmirantes;
import br.senai.sp.jandira.model.VooGol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<Voo> listVoo = new ArrayList<>();
    public void executarMenu(){
        VooGol vooGol1 = new VooGol("Gl-2530", "Maranhao", "Pará", "2023-11-9",350);
        VooGol vooGol2 = new VooGol("Gl-2530", "Acre", "Espirito Santo", "2023-11-14",250);
        VooGol vooGol3 = new VooGol("Gl-2530", "Pará", "Alagoas", "2023-11-20",150);


        VooEmirantes vooEmirantes1 = new VooEmirantes("Gl-2530", "Sao Paulo", "Amapa", "2023-11-1",150);
        VooEmirantes vooEmirantes2 = new VooEmirantes("Gl-2530", "Goias", "Mato grosso", "2023-11-8",200);
        VooEmirantes vooEmirantes3 = new VooEmirantes("Gl-2530", "Acre", "Rio grande do sul", "2023-12-5",120);





        VooDelta vooDelta1 = new VooDelta("Gl-2530", "Ceara", "Minas Gerais", "2023-11-3",50);
        VooDelta vooDelta2 = new VooDelta("Gl-2670", "Bahia", "Pernambuco ", "2024-2-3",90);
        VooDelta vooDelta3 = new VooDelta("Gl-2450", "Sao Paulo", "Rio de janeiro", "2023-12-10",100);


        listVoo.add(vooGol1);
        listVoo.add(vooGol2);
        listVoo.add(vooGol3);

        listVoo.add(vooDelta1);
        listVoo.add(vooDelta2);
        listVoo.add(vooDelta3);


        listVoo.add(vooEmirantes1);
        listVoo.add(vooEmirantes2);
        listVoo.add(vooEmirantes3);

        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);


        while (continuar) {


            System.out.println("/------- Bem Vindo -------/");
            System.out.println("1 - Listar Voo");
            System.out.println("2 - Pesquisar Voo");
            System.out.println("3 - Sair");
            System.out.println("-----------------------------");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser){
                case 1:
                    listarVoos();
                    break;
                case 2:
                    System.out.println("Informe o numero do Voo");
                    String numero = scanner.nextLine();
                    pesquisarVoo(numero);
                    break;
                case 3:
                    continuar = false;
                    break;
            }

        }
    }
    public void listarVoos(){
        for (Voo voo: listVoo){
            String vooReal = voo.getNumeroVoo();
            if (vooReal.equalsIgnoreCase(voo.getNumeroVoo()))
            System.out.println(voo.getNumeroVoo());
            System.out.println(voo.getDestino());
            System.out.println(voo.getOrigem());
            System.out.println(voo.getDataPartida());
            System.out.println("------------------");
        }
    }
    public void pesquisarVoo (String numeroVoo){
        for (Voo voo: listVoo){
            String numeroVooReal = voo.getNumeroVoo();
        }
        System.out.println("Voo nao encontrado...");
    }
}
