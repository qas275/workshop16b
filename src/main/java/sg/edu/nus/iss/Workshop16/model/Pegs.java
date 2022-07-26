package sg.edu.nus.iss.Workshop16.model;

import java.io.ByteArrayInputStream;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class Pegs {
    private int totalCount;
    private Type[] types;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    public Type[] getTypes() {
        return types;
    }

    public void setTypes(Type[] value) {
        this.types = value;
    }

    // public JsonObject toJson() {
    // JsonArrayBuilder typeArrBuilder = Json.createArrayBuilder();
    // if (types != null) {
    // for (Type t : types) {
    // typeArrBuilder.add(t.toJson());
    // }
    // }

    // return Json.createObjectBuilder()
    // .add("types", typeArrBuilder)
    // .add("totalCount", totalCount)
    // .build();
    // }

    // public static Pegs create(String rec) {
    // JsonReader r = Json.createReader(new ByteArrayInputStream(rec.getBytes()));
    // JsonObject o = r.readObject();
    // Pegs pg = new Pegs();
    // JsonArray jsonArr = o.getJsonArray("types");
    // Type[] arrT = jsonArr.toArray(new Type[jsonArr.size()]);
    // pg.setTypes(arrT);
    // pg.setTotalCount(o.getInt("totalCount"));

    // return pg;
    // }
}
