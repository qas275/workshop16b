package sg.edu.nus.iss.Workshop16.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.Workshop16.model.Mastermind;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;;

@RestController
@RequestMapping(path = "/board-game", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class BoardGameController {

    public ResponseEntity<String> createBoardGame(@RequestBody Mastermind ms) {
        return ResponseEntity.ok(ms.toJson().toString());
    }
}
