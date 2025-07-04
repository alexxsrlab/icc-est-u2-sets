package Controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios{

    public Ejercicios(){
        
    }

    public boolean tiendaDuplicados(int[] numeros) {
        Set<Integer> vistos = new HashSet<>();
        for (int num : numeros) {
            if (!vistos.add(num)) {
                return true;
            }
        }
        return false;
    }

    // murciegalo -> true (es isograma)
    // camaleon -> false (repite a)


    public static boolean esIsograma(String palabra) {
    palabra = palabra.toLowerCase();
    Set<Character> letras = new HashSet<>();
    for (char c : palabra.toCharArray()) {
        if (!letras.add(c)) {
            return false;
        }
    }
    return true;
}

    public int contarPalabrasUnicas(String frase){
        String[] palabras = frase.split(" ");
        Set<String> palabrasUnicas = new HashSet<>();
        for (String palabra : palabras) {
            palabrasUnicas.add(palabra);
        }
        return palabrasUnicas.size();
    }

    public Set<String> obtenerPalabrasUnicas(String texto) {
        texto = texto.toLowerCase();
        texto = texto.replaceAll("[.,;:¿?¡!()\"-]", " ");
        texto = texto.replace("á", "a");
        texto = texto.replace("é", "e");
        texto = texto.replace("í", "i");
        texto = texto.replace("ó", "o");
        texto = texto.replace("ú", "u");

        String[] palabras = texto.split("\\s+");
        Set<String> unicas = new HashSet<>();
        for (String palabra : palabras) {
            if (!palabra.isBlank()) {
                unicas.add(palabra);
            }
        }
        return unicas;
    }

    public void compararTextos(String texto1, String texto2) {
        Set<String> palabras1 = obtenerPalabrasUnicas(texto1);
        Set<String> palabras2 = obtenerPalabrasUnicas(texto2);

        System.out.println("Texto 1: " + palabras1.size() + " palabras únicas");
        System.out.println("Texto 2: " + palabras2.size() + " palabras únicas");

        Set<String> comunes = new HashSet<>(palabras1);
        comunes.retainAll(palabras2);
        System.out.println("Cuantas palabras comunes: " + comunes.size());

        double porcentaje = ((double) comunes.size() / palabras1.size()) * 100;
        System.out.printf("Coincidencia léxica: %.2f%%\n", porcentaje);

        Set<String> soloTexto1 = new HashSet<>(palabras1);
        soloTexto1.removeAll(palabras2);
        System.out.println("Solo en texto 1: " + soloTexto1);

        Set<String> soloTexto2 = new HashSet<>(palabras2);
        soloTexto2.removeAll(palabras1);
        System.out.println("Solo en texto 2: " + soloTexto2);
    }
}