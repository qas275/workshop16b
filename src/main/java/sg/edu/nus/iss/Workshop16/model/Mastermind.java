package sg.edu.nus.iss.Workshop16.model;

import java.io.Serializable;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Mastermind implements Serializable {
    private String name;
    private Pieces pieces;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces value) {
        this.pieces = value;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
                .add("name", name)
                .add("pieces", pieces.toJson())
                .build();
    }
}
