package br.ufrn.imd.calculadora_imd.utils;

public enum AverageSituation {
    APPROVED("Aprovado"), // Aprovado
    APPROVED_BY_GRADE("Aprovado por nota"), // Aprovado por nota
    DISAPPROVED ("Reprovado"); // Reprovado

    private String description;

    AverageSituation(String description) {
        this.description = description;
    }

    public String getDescription() {return this.description;}
}
