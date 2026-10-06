fun main(args: Array<String>) {
    println("=== EJEMPLOS DE OPERADORES EN KOTLIN ===\n")

    // ==========================================
    // 1. OPERADORES ARITMÉTICOS
    // ==========================================
    println("--- Operadores Aritméticos ---")
    val a = 20
    val b = 5

    val suma = a + b          // Equivale a a.plus(b)
    val resta = a - b         // Equivale a a.minus(b)
    val multiplicacion = a * b // Equivale a a.times(b)
    val division = a / b      // Equivale a a.div(b)
    val modulo = a % b        // Equivale a a.rem(b)

    println("Suma ($a + $b): $suma")
    println("Resta ($a - $b): $resta")
    println("Multiplicación ($a * $b): $multiplicacion")
    println("División ($a / $b): $division")
    println("Módulo ($a % $b): $modulo")
    println()

    // ==========================================
    // 2. OPERADORES DE INCREMENTO Y DECREMENTO
    // ==========================================
    println("--- Operadores de Incremento/Decremento ---")
    var contador = 10

    println("Valor inicial: $contador")
    contador++ // Equivale a contador.inc()
    println("Después de contador++: $contador")
    contador-- // Equivale a contador.dec()
    println("Después de contador--: $contador")
    println()

    // ==========================================
    // 3. OPERADORES DE COMPARACIÓN
    // ==========================================
    println("--- Operadores de Comparación ---")
    val x = 15
    val y = 25

    val mayorQue = x > y      // x.compareTo(y) > 0
    val menorQue = x < y      // x.compareTo(y) < 0
    val mayorIgual = x >= y   // x.compareTo(y) >= 0
    val menorIgual = x <= y   // x.compareTo(y) <= 0

    println("¿$x > $y? : $mayorQue")
    println("¿$x < $y? : $menorQue")
    println("¿$x >= $y? : $mayorIgual")
    println("¿$x <= $y? : $menorIgual")
    println()

    // ==========================================
    // 4. OPERADOR DE IGUALDAD / DESIGUALDAD
    // ==========================================
    println("--- Operador de Desigualdad ---")
    val texto1 = "Hola"
    val texto2 = "Mundo"
    val texto3 = "Hola"

    val noSonIguales = texto1 != texto2 // Equivale a !texto1.equals(texto2)
    val sonIguales = texto1 == texto3     // Equivale a texto1.equals(texto3)

    println("¿'$texto1' != '$texto2'? : $noSonIguales")
    println("¿'$texto1' == '$texto3'? : $sonIguales")
}