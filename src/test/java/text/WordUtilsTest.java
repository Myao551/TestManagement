package text;


import org.example.WordUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class WordUtilsTest {

    @Test
    void abbreviate() {
        assertEquals("abdef", WordUtils.abbreviate("abc",0,2,"def"));
    }

    @Test
    void capitalize() {
        assertEquals("Abc Def Hij",WordUtils.capitalize("abc def hij"));
    }

    @Test
    void initials() {
        assertEquals("LLF",WordUtils.initials("Li Lin Feng"));
    }
}