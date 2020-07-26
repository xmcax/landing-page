package pl.adamnowicki.landingpage.application;

import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import static java.util.Collections.emptyMap;
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        staticFiles.location("/static");

        redirect.get("/", "/page_1");
        get("/page_1", (rq, rs) -> new ModelAndView(emptyMap(), "page_1"), new ThymeleafTemplateEngine());
        get("/page_2", (rq, rs) -> new ModelAndView(emptyMap(), "page_2"), new ThymeleafTemplateEngine());
        get("/page_3", (rq, rs) -> new ModelAndView(emptyMap(), "page_3"), new ThymeleafTemplateEngine());
    }
}