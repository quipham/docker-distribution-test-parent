package feign.manage;

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import feign.model.TestStatus;

public class ResultSender {
    private static final Gson gson = new Gson();
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String ELASTIC_SEARCH_URL = "http://localhost:9200/app/suite";

    public static void send(final TestStatus testStatus){
        try {
            Unirest.post(ELASTIC_SEARCH_URL)
                    .header(CONTENT_TYPE, CONTENT_TYPE_VALUE)
                    .body(gson.toJson(testStatus)).asJson();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
