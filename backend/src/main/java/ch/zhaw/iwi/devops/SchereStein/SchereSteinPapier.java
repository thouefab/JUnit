package ch.zhaw.iwi.devops.SchereStein;

public class SchereSteinPapier {
    public String Convert(String SpielerA, String SpielerB){
        
        if(SpielerA == "Schere" && SpielerB == "Stein"){
            return "Stein gewinnt";
        }
        return "";
    }
    
}
