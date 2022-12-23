package org.site.herbarium.domain.diario;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotNull;

public record Folha(@Length(min = 5, max = 25) String titulo, @NotNull LocalDateTime data, String texto) {
}
