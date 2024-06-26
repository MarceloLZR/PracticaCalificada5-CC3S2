package org.example;

public class Tower {
    private char symbol;

    public Tower(char symbol) {
        // Precondición: El símbolo debe ser un carácter imprimible
        assert Character.isLetterOrDigit(symbol) : "El símbolo debe ser un carácter imprimible";
        this.symbol = symbol;

        // Invariante: El símbolo debe permanecer un carácter imprimible después de la construcción
        assert invariant() : "Invariante fallida: El símbolo debe ser un carácter imprimible";
    }

    public char getSymbol() {
        // No hay precondiciones
        // Postcondición: El valor retornado debe ser un carácter imprimible
        assert Character.isLetterOrDigit(symbol) : "El símbolo retornado debe ser un carácter imprimible";
        return symbol;
    }

    private boolean invariant() {
        return Character.isLetterOrDigit(symbol);
    }
}
