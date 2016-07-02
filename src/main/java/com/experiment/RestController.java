package com.experiment;

import spark.Request;

import static spark.Spark.*;

/**
 * Created by robertwood on 5/7/16.
 */
public class RestController {

    public RestController() {
        port(8031);

        get("/", (request, response) -> "Home: REST Service 01");

        get("/endpoint01", (request, response) -> {
            printRequestInfo(request);
            return "Exprm-Service01: Results of endpoint01";
        });

        get("/endpoint01/02", (request, response) -> {
            printRequestInfo(request);
            return "Exprm-Service01: Results of endpoint01/02";
        });

        // Usage: /endpoint02?id=123
        get("/endpoint02", "application/json", (request, response) -> {
            printRequestInfo(request);
            String id = request.queryParams("id");
            return "Exprm-Service01: Results of endpoint02 for id (" + id + ")";
        });

    }

    private void printRequestInfo(Request request) {
        System.out.println("attributes: " + request.attributes());
        System.out.println("headers: " + request.headers());
        System.out.println("cookies: " + request.cookies());
        System.out.println("host: " + request.host());
        System.out.println("ip: " + request.ip());
        System.out.println("params: " + request.params());
        System.out.println("pathInfo: " + request.pathInfo());
        System.out.println("port: " + request.port());
        System.out.println("protocol: " + request.protocol());
        System.out.println("queryMap: " + request.queryMap());
        System.out.println("queryParams: " + request.queryParams());
        System.out.println("requestMethod: " + request.requestMethod());
        System.out.println("session: " + request.session());
        System.out.println("userAgent: " + request.userAgent());
    }


}
