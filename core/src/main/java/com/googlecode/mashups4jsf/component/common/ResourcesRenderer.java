/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.googlecode.mashups4jsf.component.common;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

/**
 * @author Hazem Saleh
 * @date Nov. 28, 2009
 * The (ResourcesRenderer) renders all of the mashups related resources.
 */
public class ResourcesRenderer extends Renderer {
    
    @Override
    public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
        if (component.isRendered()) {
            ResponseWriter         writer              = context.getResponseWriter();        
            
            // encode the jsapi.
            writer.write("<script src=\"http://www.google.com/jsapi\"></script>");
            
            // encode the swf object version 2.1
            writer.write("<script>google.load(\"swfobject\", \"2.1\");</script>");
        }
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
    } 
}
