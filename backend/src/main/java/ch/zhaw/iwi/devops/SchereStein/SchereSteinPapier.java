package ch.zhaw.iwi.devops.SchereStein;

public class SchereSteinPapier {
    public String Convert(String SpielerA, String SpielerB){
        
        if(SpielerA == "Schere" && SpielerB == "Stein"){
            return "Stein gewinnt";
        }
        if(SpielerA == "Schere" && SpielerB == "Papier"){
            return "Schere gewinnt";
        }
        if(SpielerA == "Schere" && SpielerB == "Schere"){
            return "Unentschieden";
        }
        return "";
    }
    
}
