package ch.zhaw.iwi.devops;
import org.junit.Assert;
import org.junit.Test;

import ch.zhaw.iwi.devops.SchereStein.SchereSteinPapier;

public class SchereSteinPapierTest {
    
    //Testfall 1: Schere verliert gegen Stein
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
    //Testfall 3: Schere Schere unentschieden
    @Test
    public void SchereSchereUnentschieden(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Schere", "Schere");
        Assert.assertEquals("Unentschieden", result);
    }

    //Testfall 4: Papier schlaegt Stein
    @Test
    public void SteinVerliertPapier(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Stein", "Papier");
        Assert.assertEquals("Papier gewinnt", result);
    }
}