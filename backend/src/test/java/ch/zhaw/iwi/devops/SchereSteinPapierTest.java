package ch.zhaw.iwi.devops;
import org.junit.Assert;
import org.junit.Test;

import ch.zhaw.iwi.devops.SchereStein.SchereSteinPapier;

public class SchereSteinPapierTest {
    
    //Testfall 1: Schere verleiert gegen Stein
    @Test
    public void SchereVerliertStein(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Schere", "Stein");
        Assert.assertEquals("Stein gewinnt", result);
    }

    //Testfall 2: Schere schlaegt Papier
    @Test
    public void SchereSchlaegtPapier(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Schere", "Papier");
        Assert.assertEquals("Schere gewinnt", result);
    }
    
}
