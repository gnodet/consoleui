/*
 * Copyright (c) 2002-2015, the original author or authors.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package org.jline.reader.completer;

import org.jline.Candidate;

import static org.jline.utils.Preconditions.checkNotNull;

/**
 * {@link org.jline.Completer} for {@link Enum} names.
 *
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 * @since 2.3
 */
public class EnumCompleter extends StringsCompleter
{
    public EnumCompleter(Class<? extends Enum<?>> source) {
        checkNotNull(source);
        for (Enum<?> n : source.getEnumConstants()) {
            candidates.add(new Candidate(n.name().toLowerCase()));
        }
    }
}