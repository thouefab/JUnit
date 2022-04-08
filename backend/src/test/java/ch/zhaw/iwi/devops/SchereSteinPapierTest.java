package ch.zhaw.iwi.devops;
import org.junit.Assert;
import org.junit.Test;

import ch.zhaw.iwi.devops.SchereStein.SchereSteinPapier;

public class SchereSteinPapierTest {
    @Test
    public void SchereVerliertStein(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Schere", "Stein");
        Assert.assertEquals("Stein gewinnt", result);
    }
    
}
