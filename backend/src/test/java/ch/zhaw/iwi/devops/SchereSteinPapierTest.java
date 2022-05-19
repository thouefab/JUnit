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
    //Testfall 5: Stein schlaegt Schere
    @Test
    public void SteinVerliertSchere(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Stein", "Schere");
        Assert.assertEquals("Stein gewinnt", result);
    }
    //Testfall 6: Papier schlaegt Stein
    @Test 
    public void PapierSchlaegtStein(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Papier", "Stein");
        Assert.assertEquals("Papier gewinnt", result);
    }
    //Testfall 7: Papier Papier unentschieden
    @Test
    public void PapierPapierUnentschieden(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Papier", "Papier");
        Assert.assertEquals("Unentschieden", result);
    }
    //Testfall 8: Papier schlaegt Schere
    @Test
    public void PapierVerliertSchere(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Papier", "Schere");
        Assert.assertEquals("Schere gewinnt", result);
    }
    //Testfall 9: Echse schlaegt Papier
    @Test
    public void PapierVerliertEchse(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Papier", "Echse");
        Assert.assertEquals("Echse gewinnt", result);
    }
    //Testfall 10: Echse schlaegt Spock
    @Test
    public void SpockVerliertEchse(){
        SchereSteinPapier eingabe = new SchereSteinPapier();
        String result = eingabe.Convert("Spock", "Echse");
        Assert.assertEquals("Echse gewinnt", result);
    }
}
// Hallo
// Hallo