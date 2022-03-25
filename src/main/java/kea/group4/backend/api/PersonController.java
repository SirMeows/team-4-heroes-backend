package kea.group4.backend.api;

import kea.group4.backend.dto.PersonRequest;
import kea.group4.backend.dto.PersonResponse;
import kea.group4.backend.security.dto.SignupResponse;
import kea.group4.backend.services.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/persons")
public class PersonController {

    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //Create
    @PostMapping
    public ResponseEntity<PersonResponse> addPerson(@RequestBody @Valid PersonRequest body) {
        return ResponseEntity.ok(personService.addPerson(body));
    }

    //Read
    @GetMapping
    public List<PersonResponse> getPersons(){
        return personService.getPersons();
    }

    @GetMapping("/{id}")
    public PersonResponse getPerson(@PathVariable long id) throws Exception {
        return personService.getPerson(id);
    }

    @GetMapping("/{username}")
    public PersonResponse getPersonByUsername(@PathVariable String username) {
        return personService.getPersonByUsername(username);
    }

    @GetMapping("/{id}/hobbies")
    public PersonResponse getPersonHobbies(@PathVariable long id) throws Exception {
        return personService.getPerson(id);
    }

    //Update
    @PutMapping("/{id}")
    public PersonResponse editPerson(@RequestBody PersonRequest body, @PathVariable long id){
        return personService.editPerson(body, id);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable long id){
        personService.deletePerson(id);
    }
}
