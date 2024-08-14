package Controller;

import Service.ArtworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artworks")
public class ArtworkController {
    @Autowired
    private ArtworkService artworkService;

    @GetMapping
    public List<ArtWork> getAllArtworks() {
        return artworkService.getAllArtworks();
    }

    @GetMapping("/{id}")
    public ArtWork getArtworkById(@PathVariable Long id) {
        return artworkService.getArtworkById(id);
    }

    @PostMapping
    public ArtWork createArtwork(@RequestBody ArtWork artwork) {
        return artworkService.saveArtwork(artwork);
    }

    @PutMapping("/{id}")
    public ArtWork updateArtwork(@PathVariable Long id, @RequestBody ArtWork artwork) {
        artwork.setId(id);
        return artworkService.saveArtwork(artwork);
    }

    @DeleteMapping("/{id}")
    public void deleteArtwork(@PathVariable Long id) {
        artworkService.deleteArtwork(id);
    }
}

