package example;

import com.blade.Blade;
import com.blade.event.EventType;
import com.blade.mvc.WebContext;
import com.blade.mvc.http.Session;

public class Main {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Blade.of()
            .get("/", ctx -> ctx.render("index.html"))
            .enableCors(true)
            .start(Main.class, args);
    }
}
