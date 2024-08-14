package Service;


import Interface.ArtworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtworkService {
    @Autowired
    private ArtworkRepository artworkRepository;

    public List<ArtWork> getAllArtworks() {
        return artworkRepository.findAll();
    }

    public Class.ArtWork getArtworkById(Long id) {
        return artworkRepository.findById(id).orElse(null);
    }

    public Artwork saveArtwork(ArtWork artwork) {
        return artworkRepository.save(artwork);
    }

    public void deleteArtwork(Long id) {
        artworkRepository.deleteById(id);
    }
}
