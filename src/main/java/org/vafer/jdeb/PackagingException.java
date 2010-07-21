/*
 * Copyright 2010 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vafer.jdeb;

/**
 * Something went wrong while building the package
 * 
 * @author Torsten Curdt <tcurdt@vafer.org>
 */
public final class PackagingException extends Exception {

    private static final long serialVersionUID = 1L;

    public PackagingException() {
        super();
    }

    public PackagingException(String message, Throwable cause) {
        super(message, cause);
    }

    public PackagingException(String message) {
        super(message);
    }

    public PackagingException(Throwable cause) {
        super(cause);
    }

}