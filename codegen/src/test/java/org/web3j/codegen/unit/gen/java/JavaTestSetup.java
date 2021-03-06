/*
 * Copyright 2020 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.codegen.unit.gen.java;

import java.io.File;

import org.web3j.codegen.unit.gen.TestSetup;
import org.web3j.codegen.unit.gen.UnitClassGenerator;

public abstract class JavaTestSetup extends TestSetup {

    @Override
    protected UnitClassGenerator buildGenerator() {
        return new JavaClassGenerator(
                greeterContractClass,
                "org.com.generated.contracts",
                temp + File.separator + "test");
    }

    @Override
    protected String testFileExtension() {
        return "java";
    }
}
