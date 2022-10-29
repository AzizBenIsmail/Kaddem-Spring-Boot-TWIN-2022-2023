package esprit.tn.amdounidev.controllers;

import esprit.tn.amdounidev.Services.IUniversiteService;
import esprit.tn.amdounidev.entities.Universite;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.List;

@RestController
//@Component ou @ResponseBody
//@Controller ou @ResponseBody
@RequestMapping("Universite")
@Tag(name ="Universite" ,description = "Gestion de l'Universite ")
public class UniversiteController {

    @Autowired
    IUniversiteService us;

    @Operation(summary = "Add Universite", description = "Ajouter une Universites")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ajout Avec Succ",content = { @Content(mediaType = "application/json",schema = @Schema(implementation = Universite.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",content = @Content),
            @ApiResponse(responseCode = "404", description = "Ajout failed",content = @Content)
    })

    @PostMapping("addUniversite")
    public Universite addUniversite(@RequestBody Universite d) {
        return  us.addUniversite(d);
    }

    @Operation(summary = "Add List Universite", description = "Ajouter une liste des Universites ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ajout Avec Succ",content = { @Content(mediaType = "application/json",schema = @Schema(implementation = Universite.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",content = @Content),
            @ApiResponse(responseCode = "404", description = "Ajout failed",content = @Content)
    })

    @PostMapping("addUniversites")
    public List<Universite> addUniversite(@RequestBody List<Universite> listDepartment) {
        return us.addUniversite(listDepartment);
    }

    @Operation(summary = "Update a Universite", description = "Modifier une Universite ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Modifier Avec Succ",content = { @Content(mediaType = "application/json",schema = @Schema(implementation = Universite.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",content = @Content),
            @ApiResponse(responseCode = "404", description = "Modifier failed",content = @Content)
    })

    @PutMapping("updateUniversite")
    public Universite updateUniversite(@RequestBody Universite d) {
        return  us.updateUniversite(d);
    }

    @Operation(summary = "Update list Universite", description = "Modifier une liste des Universites ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Modifier Avec Succ",content = { @Content(mediaType = "application/json",schema = @Schema(implementation = Universite.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",content = @Content),
            @ApiResponse(responseCode = "404", description = "Modifier failed",content = @Content)
    })

    @PutMapping("updateUniversites")
    public List<Universite> updateUniversite(@RequestBody List<Universite> listUniversite) {
        return us.updateUniversite(listUniversite);
    }

    @Operation(summary = "Delete a Universite By ID", description = "Supprimer une Universites par sont id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Supp Avec Succ",content = { @Content(mediaType = "application/json",schema = @Schema(implementation = Universite.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",content = @Content),
            @ApiResponse(responseCode = "404", description = "Supp failed",content = @Content)
    })

    @DeleteMapping("deleteUniversite")
    public void deleteUniversite( @RequestParam Long id) {
        us.deleteUniversite(id);
    }

    @Operation(summary = "Delete a Universite", description = "Supprimer une Universite ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Supp Avec Succ",content = { @Content(mediaType = "application/json",schema = @Schema(implementation = Universite.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",content = @Content),
            @ApiResponse(responseCode = "404", description = "Supp failed",content = @Content)
    })

    @DeleteMapping("deleteUniversites")
    public void deleteUniversite( @RequestBody Universite d) {
        us.deleteUniversite(d);
    }


    @Operation(summary = "Get AllUniversite", description = "Returns la liste des Universites ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the Universite",content = { @Content(mediaType = "application/json",schema = @Schema(implementation = Universite.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",content = @Content),
            @ApiResponse(responseCode = "404", description = "Universite not found",content = @Content)
    })

    @GetMapping("findAllUniversite")
    public List<Universite> findAllUniversite() {
        return us.findAllUniversite();
    }

    @Operation(summary = "Get Universites par son id", description = "Returns Universites specifique")
    @ApiResponses(value = {
       @ApiResponse(responseCode = "200", description = "Found the Universite",content = { @Content(mediaType = "application/json",schema = @Schema(implementation = Universite.class)) }),
       @ApiResponse(responseCode = "400", description = "Invalid id supplied",content = @Content),
       @ApiResponse(responseCode = "404", description = "Universite not found",content = @Content)
    })

    @GetMapping("findUniversiteById")
    public Universite findUniversiteById(@Parameter(description = "id of book to be searched")  @RequestParam Long id ) {
        return us.findUniversiteById(id);
    }

    @Operation(summary = "Get Universites par son Nom", description = "Returns Universites specifique")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the Universite",content = { @Content(mediaType = "application/json",schema = @Schema(implementation = Universite.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",content = @Content),
            @ApiResponse(responseCode = "404", description = "Universite not found",content = @Content)
    })

    @GetMapping("findUniversiteByNom")
    public Universite findUniversiteById( @RequestParam String Nom) {
        return us.findBynomUniversite(Nom);
    }
}