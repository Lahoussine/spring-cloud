package com.spring.root; /**
 * Class com.spring.root.GreetingController.
 * This represents TODO.
 *
 * @author derradjil
 * @version $$Revision$$
 * @see <script>links('$$HeadURL$$');</script>
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.jms.core.JmsTemplate;
@RestController
//@EnableWebSecurity
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/all")
    public List<Greeting> all(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("Appel All...");
        LinkedList<Greeting> list = new LinkedList<Greeting>();
        for (int i = 0; i < 10; i++) {
            list.add(new Greeting(counter.incrementAndGet(),
                    String.format(template, name) + "_" + i));
        }

        return list;
    }

    @RequestMapping("/info")
    public String send(@RequestParam(value = "name", defaultValue = "World") String name) {

        return "SERVICE OK";
    }
}
