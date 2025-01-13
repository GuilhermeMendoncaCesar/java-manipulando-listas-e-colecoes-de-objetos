package cesar.mendonca.guilherme.Musics.service;

import cesar.mendonca.guilherme.Musics.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
