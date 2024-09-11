package dev.kliffx2.runnerz.run;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Run(
        Integer Id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {
}
