package Controller;

import Service.ExhibitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exhibitions")
public class ExhibitionController {
    @Autowired
    private ExhibitionService exhibitionService;

    @GetMapping
    public List<Exhibition> getAllExhibitions() {
        return exhibitionService.getAllExhibitions();
    }

    @GetMapping("/{id}")
    public Exhibition getExhibitionById(@PathVariable Long id) {
        return exhibitionService.getExhibitionById(id);
    }

    @PostMapping
    public Exhibition createExhibition(@RequestBody Exhibition exhibition) {
        return exhibitionService.saveExhibition(exhibition);
    }

    @PutMapping("/{id}")
    public Exhibition updateExhibition(@PathVariable Long id, @RequestBody Exhibition exhibition) {
        exhibition.setId(id);
        return exhibitionService.saveExhibition(exhibition);
    }

    @DeleteMapping("/{id}")
    public void deleteExhibition(@PathVariable Long id) {
        exhibitionService.deleteExhibition(id);
    }
}

