import com.google.gson.*;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class Main_1 {
    private static String URL = "http://qaleraning.i7m76hdjy3.us-east-1.elasticbeanstalk.com";
    public static void main(String... args) throws Exception{
        OkHttpClient client = new OkHttpClient();
        Request req = new Request.Builder()
                .url(URL + "/profiles")
                .get()
                .build();
        Response response = client.newCall(req).execute();
        String body = response.body().string();
        JsonArray profiles = JsonParser.parseString(body).getAsJsonArray();
        JsonObject profile = profiles.get(0).getAsJsonObject();
        System.out.println(profile);
        System.out.println(profile.get("job").getAsString());
    }
}
