
package Automatas;

public class AutomataPilas {

    public String validarCadena(String cadena) {
        int indice = 0;       
        StringBuilder texto = new StringBuilder();   
        
        //Verificamos si la cadena comienza con un signo...
        if (cadena.charAt(indice) == '+' || cadena.charAt(indice) == '-') {  
            char signo = cadena.charAt(indice);
            texto.append(cadena).append("   | SEN.EN $").append("   |  q2").append("   |  (q2, 3, S; q2, ").append(signo).append(")").append("\n");
            texto.append(cadena).append("   | ").append(signo).append("EN.EN $").append("   |  q2" ).append("   |  (q2, ").append(signo).append(", ").append(signo).append("; q2,3)").append("\n");           
            indice++; 
            cadena=cadena.substring(indice); 
            texto.append(cadena).append("    | EN.EN $").append("     |  q2").append("   |  (q2, 3, EN; q2, DR)").append("\n");
        }else{
            texto.append(cadena).append("   | SEN.EN $").append("   |  q2").append("   |  (q2, 3, S; q2, 3)").append("\n");
            texto.append(cadena).append("    | EN.EN $").append("     |  q2").append("   |  (q2, 3, EN; q2, DR)").append("\n");
            //indice++;
            cadena=cadena.substring(indice);
            indice++;
        } 
        
        //Validar la parte entera de la cadena...
        char numero= cadena.charAt(indice);         
        while (indice < cadena.length() && Character.isDigit(numero)) {
            int contador = 0;
            char digito = cadena.charAt(contador);
            if (digito != '.') {
                texto.append(cadena).append("    | DR.EN $").append("     |  q2").append("   |  (q2, 3, D; q2, 0...9)").append("\n");
                texto.append(cadena).append("    | ").append(digito).append("R.EN $").append("      |  q2").append("   |  (q2, 0...9, 0...9; q2, 3)").append("\n");
                if (cadena.charAt(indice) != '.') {
                    texto.append(cadena.substring(indice)).append("      | R.EN $").append("        |  q2").append("   |  (q2, 3, R; q2, DR)").append("\n");
                } else {
                    
                    texto.append(cadena.substring(indice)).append("      | R.EN $").append("        |  q2").append("   |  (q2, 3, R; q2, 3)").append("\n");
                    break;
                }
            }            
            cadena = cadena.substring(indice);
            contador++;
            
        }
        
        cadena = cadena.substring(indice);
        //texto.append(cadena).append("\n");
        
        //Para leer el punto...
        if(cadena.startsWith(".")){
            texto.append(cadena).append("      | .EN $").append("           |  q2").append("   |  (q2, . , . ; q2, 3)").append("\n");
        }else{
            texto.append("caca");
        }
        
        cadena = cadena.substring(indice);        
        
        //Validar la parte decimal...
        while(cadena.length() >= indice){
            int contador=0;
            char digito = cadena.charAt(contador);
            texto.append(cadena).append("        | EN $").append("          |  q2").append("   |  (q2, 3, EN; q2, DR)").append("\n");
            texto.append(cadena).append("        | DR $").append("          |  q2").append("   |  (q2, 3, D; q2, 0...9)").append("\n");
            texto.append(cadena).append("        | ").append(digito).append("R $").append("           |  q2").append("   |  (q2, 0...9, 0...9; q2, 3)").append("\n");          
            cadena = cadena.substring(indice);
            contador++;
        }
        
        //Para mostrar la parte final de la derivación, cuando la cadena está y vacía...
        texto.append("3").append("        | ").append("R $").append("             |  q2").append("   |  (q2, 3, R; q2, 3)").append("\n");          
        texto.append("3").append("         | ").append(" $").append("               |  q2").append("   |  (q2, 3, $; q2, 3)").append("\n");    
        texto.append("           | ").append(" 3  ").append("             |  q3").append("   |  CADENA ACEPTADA").append("\n");          
        
        return texto.toString();
    }
            
    
    public String mostrarInformacion(String cadena){   
        
        String texto= "" + cadena + "   | 3" + "                 |  q0" + "   |  (q0, 3, 3; q1, $) " + "\n";
        texto += "" + cadena + "   | $" + "                 |  q1" + "   |  (q1, 3, 3; q2, F)     " + "\n";
        texto += "" + cadena + "   | F $" + "              |  q2" + "   |  (q2, 3, F; q2, ES.EN) " + "\n";
        texto += "" + cadena + "   | ES.EN $" + "      |  q2" + "   |  (q2, 3, ES; q2, S EN) " + "\n";       
        return texto; 
    }
}