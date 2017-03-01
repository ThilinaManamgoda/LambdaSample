
/*
 *
 *  * Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *  *
 *  * WSO2 Inc. licenses this file to you under the Apache License,
 *  * Version 2.0 (the "License"); you may not use this file except
 *  * in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */
package org.wso2.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.function.Context;
import org.wso2.function.RequestHandler;
import org.wso2.function.models.API_CREATION;

public class LambdaApp implements RequestHandler<API_CREATION, API_CREATION> {

    private final static Logger logger = LogManager.getLogger(LambdaApp.class);

    public API_CREATION handleRequest(Context context, API_CREATION apiCreateEvent) {
        logger.info("Tenant: {}",context.getTenant() );
        logger.info("Function Name: {}",context.getFunctionName());
        return apiCreateEvent;
    }
}