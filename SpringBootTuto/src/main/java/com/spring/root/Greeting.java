package com.spring.root;

/**
 * Class com.spring.root.Greeting.
 * This represents TODO.
 *
 * @author derradjil
 * @version $$Revision$$
 * @see <script>links('$$HeadURL$$');</script>
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}