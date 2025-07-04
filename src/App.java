import Controllers.ContactoController;
import Controllers.Ejercicios;

public class App {

    public static void main(String[] args) throws Exception {

        
        System.out.println("Agenda ordenada por Apellido - Nombre");
        ContactoController controller = new ContactoController();
        System.out.println("Agenda ordenada por Apellido - Nombre - telefono");
        controller.runTreeContactoNumeros();
        System.out.println("Agenda ordenada por Hash Code");
        controller.runTreeContactoHash();


        System.out.println("ARIEL BADILLO");

        System.out.println("EJERCICIO 1");
        Ejercicios e = new Ejercicios();
        System.out.println(e.tiendaDuplicados(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(e.tiendaDuplicados(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 45 }));

        System.out.println("EJERCICIO 2");
        System.out.println(Ejercicios.esIsograma("murciegalo"));
        System.out.println(Ejercicios.esIsograma("camaleon"));

        System.out.println("EJERCICIO 3");
        String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
        int totalUnicas = e.contarPalabrasUnicas(texto);
        System.out.println("Palabras únicas texto 1: " + totalUnicas);

        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        totalUnicas = e.contarPalabrasUnicas(texto1);
        System.out.println("Palabras únicas texto 2: " + totalUnicas);

        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        totalUnicas = e.contarPalabrasUnicas(texto2);
        System.out.println("Palabras únicas texto 3: " + totalUnicas);

        System.out.println("EJERCICIO 4");

        e.compararTextos(texto1, texto2);

        /*
         * Sets set = new Sets();
         * System.out.println("--ARIEL BADILLO--");
         * System.out.println("--IMPRIMIMOS USANDO HASHSET--");
         * runHashSet(set);
         * System.out.println("--IMPRIMIMOS USANDO LINKEDHASHSET--");
         * runLinkedHashSet(set);
         * System.out.println("--IMPRIMIMOS USANDO TREESET(menos a mayor)--");
         * runTreeSet(set);
         * System.out.
         * println("--IMPRIMIMOS USANDO TREESET EMPLEANDO UN COMPARADOR SEGUN LA LONGUITUD DE LA PALABRA DE MENOR A MAYOR--"
         * );
         * runTreeSetConComparador(set);
         * System.out.
         * println("--IMPRIMIMOS USANDO TREESET EMPLEANDO UN COMPARADOR SEGUN LA LONGUITUD DE LA PALABRA DE MAYOR A MENOR--"
         * );
         * runTreeSetConComparadorMayor(set);
         * }
         * 
         * public static void runHashSet(Sets sets) {
         * Sets palabrasSet = new Sets();
         * Set<String> palabras = palabrasSet.construirHashSet();
         * for (String palabrasImp : palabras) {
         * System.out.println("-" + palabrasImp);
         * }
         * }
         * public static void runLinkedHashSet(Sets sets) {
         * Sets palabrasSet = new Sets();
         * Set<String> palabras = palabrasSet.construirLinkedHashSet();
         * for (String palabrasImp : palabras) {
         * System.out.println("-" + palabrasImp);
         * }
         * }
         * public static void runTreeSet(Sets sets) {
         * Sets palabrasSet = new Sets();
         * Set<String> palabras = palabrasSet.construirTreeSet();
         * for (String palabrasImp : palabras) {
         * System.out.println("-" + palabrasImp);
         * }
         * }
         * public static void runTreeSetConComparador(Sets sets) {
         * Sets palabrasSet = new Sets();
         * Set<String> palabras = palabrasSet.construirTreeSetConComparador();
         * for (String palabrasImp : palabras) {
         * System.out.println("-" + palabrasImp);
         * }
         * }
         * public static void runTreeSetConComparadorMayor(Sets sets) {
         * Sets palabrasSet = new Sets();
         * Set<String> palabras = palabrasSet.construirTreeSetConComparadorMayor();
         * for (String palabrasImp : palabras) {
         * System.out.println("-" + palabrasImp);
         * }
         */
    }
}