/*
 *  Copyright (c) 2011-2013 The original author or authors
 *  ------------------------------------------------------
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *       The Eclipse Public License is available at
 *       http://www.eclipse.org/legal/epl-v10.html
 *
 *       The Apache License v2.0 is available at
 *       http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

package com.taobao.middleware.cli.impl;

import com.taobao.middleware.cli.CLIException;
import com.taobao.middleware.cli.annotations.Description;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;

@Summary("A command saying hello.")
@Description("A simple cli to wish you a good day. Pass your name with `--name`")
@Name("hello")
public class HelloClI {

    public static boolean called = false;
    public String name;

    @com.taobao.middleware.cli.annotations.Option(longName = "name", shortName = "n", required = true, argName = "name")
    @Description("your name")
    public void setTheName(String name) {
        this.name = name;
    }

    public String run() throws CLIException {
        called = true;
        return "Hello " + name;
    }
}
