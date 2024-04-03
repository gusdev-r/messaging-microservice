package academy.devgus.emailm.dto;

import java.util.UUID;

public record EmailDto(UUID userId,
                       String text,
                       String emailTo,
                       String subject) {

}
