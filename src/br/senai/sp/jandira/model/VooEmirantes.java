package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class VooEmirantes extends Voo {
    private int capacidadePassageiros;
    public VooEmirantes(String numerovoo, String origem, String destino, String dataPartida, int capacidadePassageiros){
        super(numerovoo, origem, destino, dataPartida);
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
