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
        if(SpielerA == "Stein" && SpielerB == "Papier"){
            return "Papier gewinnt";
        }
        if(SpielerA == "Stein" && SpielerB == "Schere"){
            return "Stein gewinnt";
        }
        if(SpielerA == "Papier" && SpielerB == "Stein"){
            return "Papier gewinnt";
        }
        if(SpielerA == "Papier" && SpielerB == "Papier"){
            return "Unentschieden";
        }
        if(SpielerA == "Papier" && SpielerB == "Schere"){
            return "Schere gewinnt";
        }
        if(SpielerA == "Papier" && SpielerB == "Echse") {
			return "Echse gewinnt";
		}
        if(SpielerA == "Spock" && SpielerB == "Echse") {
			return "Echse gewinnt";
		}
        return "";
    }
    
}
