package dev.com.br.eventos;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtil {

    public static List<ItemVideo> fromJson(String json) throws JSONException {

        List<ItemVideo> lista = new ArrayList<>();

        JSONArray jsonArray = new JSONArray(json);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject object = (JSONObject) jsonArray.get(i);
            String titulo = (String) object.get("titulo");
            String data = (String) object.get("data");
            String url = (String) object.get("url");

            lista.add(new ItemVideo(titulo, data, url));
        }

        return lista;
    }
}
