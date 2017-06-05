package org.deziras.function;

import org.deziras.annotations.Covariant;

/**
 * Represents a function with no argument.
 *
 * @param <R> return type of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface Function0<@Covariant R>
        extends CheckedFunction0<R> {

    /**
     * Gets a result.
     *
     * @return a result
     */
    R invoke();

}
