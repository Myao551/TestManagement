package text;

import org.example.WordUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordUtilsTest2 {

    @Test
    public void abbreviate() {
        assertEquals("abdef", WordUtils.abbreviate("abc",0,2,"def"));
    }

    @Test
    public void capitalize() {
        assertEquals("Abc Def Hij",WordUtils.capitalize("abc def hij"));
    }

    @Test
    public void initials() {
        assertEquals("LLF",WordUtils.initials("Li Lin Feng"));
    }
}