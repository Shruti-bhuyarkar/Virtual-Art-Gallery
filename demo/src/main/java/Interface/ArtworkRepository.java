package Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ArtworkRepository extends JpaRepository<ArtWork, Long> {
    List<ArtWork> findByArtistId(Long artistId);
}
