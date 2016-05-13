package com.experiment;

import static spark.Spark.*;

/**
 * Created by robertwood on 5/7/16.
 */
public class RestController {

    public RestController() {
        port(8031);

        get("/", (request, response) -> "Home: REST Service 01");

        get("/endpoint01", (request, response) -> {
           return "Results of endpoint01";
        });

        get("/endpoint01/02", (request, response) -> {
            return "Results of endpoint01/02";
        });

        // Usage: /endpoint02?id=123
        get("/endpoint02", "application/json", (request, response) -> {
           String id = request.queryParams("id");
           return "Results of endpoint02 for id (" + id + ")";
        });

    }
}
