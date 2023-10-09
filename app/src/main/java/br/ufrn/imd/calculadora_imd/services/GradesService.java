package br.ufrn.imd.calculadora_imd.services;

import br.ufrn.imd.calculadora_imd.utils.AverageSituation;

public class GradesService {
    public AverageSituation getSituationByAverage(double average) {
        if(average >= 7) return AverageSituation.APPROVED;
        if(average >= 5) return AverageSituation.APPROVED_BY_GRADE;

        return AverageSituation.DISAPPROVED;
    }

    public double getMinimumGradeToApproved(double grade1) {
        return this.getMinimumGrade(grade1, 7);
    }

    public double getMinimumGradeToApprovedByGrade(double grade1) {
        return this.getMinimumGrade(grade1, 5);
    }

    public double getMinimumGradeToApproved(double grade1, double grade2) {
        return this.getMinimumGrade(grade1, grade2, 7);
    }

    public double getMinimumGradeToApprovedByGrade(double grade1, double grade2) {
        return this.getMinimumGrade(grade1, grade2, 5);
    }

    private double getMinimumGrade(double grade1, double average) {
        final double minimumGradesSum = (3 * average) - grade1; // Soma mínima que n1+n2 precisa ter para ser aprovado por média

        return minimumGradesSum / 2; // Divide a soma das notas por 2 para obter a nota mínima que cada nota precisa ser
    }

    private double getMinimumGrade(double grade1, double grade2, double average) {
        return (3 * average) - grade1 - grade2;
    }

    public double calculateAverage(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }
}
