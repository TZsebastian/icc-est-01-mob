public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodosOrdenamiento = new Metodos();

        int [] arreglo = {5, 7, 30, 12, 9};

        int [] arregloOrdenado = metodosOrdenamiento.sortByBubble(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenado);

        int [] arregloOrdenadoDes = metodosOrdenamiento.sortByBubbleDes(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenadoDes);

        // ORDENAR LAS PALABRAS ALFABETICAMENTE DE LA CADENA DE TEXTO
        String cadena = "este es un ejemplo de texto para Ordenar";
        String[] palabras = cadena.split(" ");

        String[] palabrasOrdenadas = metodosOrdenamiento.sortByBubblePalabras(palabras);
        metodosOrdenamiento.printArreglo(palabrasOrdenadas);

    }
}
