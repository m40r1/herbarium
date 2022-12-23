package org.site.herbarium.domain.horta;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

//qtd de espacos distancia entre eles e posicao
// REVIEW List de sementes para saber oq e plantado por sementeira
final record Grade(int total, @Min(8) @Max(16) int distancia, List<Semente> sementes) {
}

// I really need someone to review my code
public final class Sementeira {
    final Grade grade;
    final Terra terra;

    // Calcura como criar sulcos com padrao da sementeira
    // REVIEW passing null for empty list
    public Grade Sulcar(final int distancia) {
        return new Grade((distancia / terra.largura()) * (distancia / terra.altura()), distancia, null);
    }

    private Sementeira(final Grade grade, final Terra terra) {
        this.grade = grade;
        this.terra = terra;
    }

    public static Optional<Sementeira> ofSementeira(final Sementeira sementeira, final Terra terra) {
        if (terra.largura() >= 1 & terra.comprimento() >= 3 & terra.altura() < 2) {
            System.out.println("sementeira tem q ter ao menos 1 de largura por 3 de comprimento,1cm profundidade");
            return Optional.of(sementeira);
        } else {
            return Optional.empty();
        }
    }

    public Optional<Grade> Semear(final int quantidade, final Semente semente) {
        if (grade.total() > quantidade) {
            return Optional.of(new Grade(grade.total() - quantidade, grade.distancia(), List.of(semente)));
        } else {
            System.out.println("Necessario mais sulcos para a quantidade desejada");
            return Optional.empty();
        }
    }

}
