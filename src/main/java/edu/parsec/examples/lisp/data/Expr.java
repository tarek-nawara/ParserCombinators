package edu.parsec.examples.lisp.data;

/**
 * Interface to represent the arithmetic expressions.
 */
public interface Expr {

    /**
     * Get the value of the underlying expression
     *
     * @return value of the underlying expression
     */
    double eval();
}
