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
package com.googlecode.mashups.services.youtube.api;

import java.util.List;

import com.googlecode.mashups.services.common.ServiceParameter;


public interface YouTubeSearchService {
    public final static String YOU_TUBE_SEARCH_SERVICE_URL = "http://gdata.youtube.com/feeds/api/videos";
    
	public List<YouTubeSearchResultItem> getVideoList(List<ServiceParameter> parameters) throws Exception;
}