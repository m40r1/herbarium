package org.site.herbarium.domain.horta;

import java.util.Optional;

public final class Sementeira extends Terra {
    public static Optional<Sementeira> ofSementeira(final Sementeira sementeira) {
        if (sementeira.largura >= 1 & sementeira.comprimento >= 3 & sementeira.altura < 5) {
            System.out.println("sementeira tem q ter ao menos 1 de largura por 3 de comprimento bbk");
            return Optional.of(sementeira);
        } else {
            return Optional.empty();
        }
    }
}
