package genericMethods;

import org.w3c.dom.ls.LSOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class SwapTest {
    private String[] names = {"Tony", "Andrew", " Hugh", "Diane", "Simon", "Gary"};
    private String[] After = {"Tony", "Simon", " Hugh", "Diane", "Andrew", "Gary"};
    /**
     * A test which checks to see if the swap works
     */
    @Test
    void testValuesSwapped() {
        assertArrayEquals(Swap.Swap(names, 1,4), After);
    }

}

