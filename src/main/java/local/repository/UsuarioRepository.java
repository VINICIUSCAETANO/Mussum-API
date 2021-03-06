package local.repository;

import local.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);

    List<Usuario> findByCreatedAtBetween(LocalDate dataInicial, LocalDate dataFinal);

    List<Usuario> findByNomeContains(String parte);
}
