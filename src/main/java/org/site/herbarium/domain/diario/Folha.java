package org.site.herbarium.domain.diario;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.mongodb.core.mapping.Document;

public record Folha(@Length(min = 5, max = 25) String titulo,
                    @NotNull LocalDateTime data, String texto) {}
