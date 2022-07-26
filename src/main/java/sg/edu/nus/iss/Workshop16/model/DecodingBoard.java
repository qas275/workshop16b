package sg.edu.nus.iss.Workshop16.model;

import java.io.ByteArrayInputStream;
import java.io.Serializable;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class DecodingBoard implements Serializable {
    private int totalCount;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    // public JsonObject toJson() {
    // return Json.createObjectBuilder()
    // .add("totalCount", totalCount)
    // .build();
    // }

    // public static DecodingBoard create(String rec) {
    // JsonReader r = Json.createReader(new ByteArrayInputStream(rec.getBytes()));
    // JsonObject o = r.readObject();
    // DecodingBoard d = new DecodingBoard();
    // d.setTotalCount(o.getInt("totalCount"));
    // return d;
    // }
}
