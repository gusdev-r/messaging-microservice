package academy.devgus.emailm.repository;

import academy.devgus.emailm.domain.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
