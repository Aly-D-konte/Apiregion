package com.apiregions.apiregions.Controller;

import com.apiregions.apiregions.Models.Commentaire;
import com.apiregions.apiregions.Repository.CommentaireRepository;
import com.apiregions.apiregions.Sevices.CommentaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping(path = "/api/commentaire",name ="commentaire")

public class CommentaireController {

    private CommentaireService commentaireService;
    private final CommentaireRepository commentaireRepository;

    public CommentaireController(CommentaireService commentaireService,
                                 CommentaireRepository commentaireRepository) {
        this.commentaireService = commentaireService;
        this.commentaireRepository = commentaireRepository;
    }

    @PostMapping(path = "/add")
    public String ajouterCommentaire(@RequestBody Commentaire commentaire){
         //   System.out.println("############################################: tttt " + commentaire + "##############################");
        return commentaireService.addNewCommentaire(commentaire);
    }

    @GetMapping(path = "/lister")
    public List<Commentaire> mesCommanteurs(){
        return commentaireService.toutLesCommentaires();
    }
}
