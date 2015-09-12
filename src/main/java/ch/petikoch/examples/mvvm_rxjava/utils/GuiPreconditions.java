/**
 * Copyright 2015 Peti Koch
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.petikoch.examples.mvvm_rxjava.utils;

import javax.swing.*;

public class GuiPreconditions {

    public static void assertOnAwtEdt() {
        if (!SwingUtilities.isEventDispatchThread()) {
            throw new IllegalStateException("This is not running on AWT EDT, it's running on: " + Thread.currentThread().getName());
        }
    }
}