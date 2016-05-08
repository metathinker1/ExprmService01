package com.experiment;

import static spark.Spark.*;

/**
 * Created by robertwood on 5/7/16.
 */
public class RestController {

    public RestController() {
        port(8031);

        get("/", (req, res) -> "REST Service 01");


    }
}
