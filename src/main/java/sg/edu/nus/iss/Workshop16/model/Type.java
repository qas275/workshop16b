package sg.edu.nus.iss.Workshop16.model;

import java.io.ByteArrayInputStream;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class Type {
    private String type;
    private int count;

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        this.count = value;
    }

    // public JsonObject toJson() {
    // return Json.createObjectBuilder()
    // .add("type", type)
    // .add("count", count)
    // .build();
    // }

    // public static Type create(String rec) {
    // JsonReader r = Json.createReader(new ByteArrayInputStream(rec.getBytes()));
    // JsonObject o = r.readObject();
    // Type t = new Type();
    // t.setCount(o.getInt("count"));
    // t.setType(o.getString("type"));
    // return t;
    // }
}
