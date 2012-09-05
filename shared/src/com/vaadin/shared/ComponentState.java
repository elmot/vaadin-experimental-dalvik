/*
 * Copyright 2011 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.vaadin.shared;

import java.util.List;
import java.util.Set;

import com.vaadin.shared.communication.SharedState;

/**
 * Default shared state implementation for UI components.
 * 
 * State classes of concrete components should extend this class.
 * 
 * @since 7.0
 */
public class ComponentState extends SharedState {
    public String height = "";
    public String width = "";
    public boolean readOnly = false;
    public boolean immediate = false;
    public String description = "";
    // Note: for the caption, there is a difference between null and an empty
    // string!
    public String caption = null;
    public boolean visible = true;
    public List<String> styles = null;
    public String id = null;
    /**
     * A set of event identifiers with registered listeners.
     */
    public Set<String> registeredEventListeners = null;

    // HTML formatted error message for the component
    // TODO this could be an object with more information, but currently the UI
    // only uses the message
    public String errorMessage = null;
}
