import com.google.gson.*;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import models.Profile;

import java.util.ArrayList;
import java.util.List;

public class Main_1 {
    private static String URL = "http://qaleraning.i7m76hdjy3.us-east-1.elasticbeanstalk.com";
    public static void main(String... args) throws Exception{
        OkHttpClient client = new OkHttpClient();
        List<Profile> profiles = new ArrayList<>();
        Gson gson = new Gson();
        for(int i = 1; i < 10; i++){
            Request req = new Request.Builder()
                    .url(URL + "/profiles/"+i)
                    .get()
                    .build();
            Response response = client.newCall(req).execute();
            String body = response.body().string();
            Profile profile = gson.fromJson(body, Profile.class);
            profiles.add(profile);
        }
        profiles.forEach(System.out::println);
    }
}
