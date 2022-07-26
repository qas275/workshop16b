package sg.edu.nus.iss.Workshop16.model;

import java.io.ByteArrayInputStream;
import java.io.Serializable;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class Pieces implements Serializable {
    private DecodingBoard decodingBoard;
    private Pegs pegs;
    private Rulebook rulebook;

    public DecodingBoard getDecodingBoard() {
        return decodingBoard;
    }

    public void setDecodingBoard(DecodingBoard value) {
        this.decodingBoard = value;
    }

    public Pegs getPegs() {
        return pegs;
    }

    public void setPegs(Pegs value) {
        this.pegs = value;
    }

    public Rulebook getRulebook() {
        return rulebook;
    }

    public void setRulebook(Rulebook value) {
        this.rulebook = value;
    }

    // public JsonObject toJson() {
    // DecodingBoard d = new DecodingBoard();
    // Pegs p = new Pegs();
    // Rulebook r = new Rulebook();
    // return Json.createObjectBuilder()
    // .add("decodingBoard", d.toJson())
    // .add("pegs", p.toJson())
    // .add("rulebook", r.toJson())
    // .build();
    // }

    // public static Pieces create(String rec) {
    // JsonReader r = Json.createReader(new ByteArrayInputStream(rec.getBytes()));
    // JsonObject o = r.readObject();
    // Pieces pc = new Pieces();
    // pc.setDecodingBoard(DecodingBoard.create(o.getJsonObject("decodingBoard").toString()));
    // pc.setPegs(Pegs.create(o.getJsonObject("pegs").toString()));
    // pc.setRulebook(Rulebook.create(o.getJsonObject("rulebook").toString()));
    // return pc;
    // }
}
