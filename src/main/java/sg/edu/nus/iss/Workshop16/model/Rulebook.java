package sg.edu.nus.iss.Workshop16.model;

import java.io.ByteArrayInputStream;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class Rulebook {
    private int totalCount;
    private String file;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String value) {
        this.file = value;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
                .add("totalCount", totalCount)
                .add("file", file)
                .build();
    }

    public static Rulebook create(String rec) {
        JsonReader r = Json.createReader(new ByteArrayInputStream(rec.getBytes()));
        JsonObject o = r.readObject();
        Rulebook rb = new Rulebook();
        rb.setTotalCount(o.getInt("totalCount"));
        rb.setFile(o.getString("file"));
        return rb;
    }

}
