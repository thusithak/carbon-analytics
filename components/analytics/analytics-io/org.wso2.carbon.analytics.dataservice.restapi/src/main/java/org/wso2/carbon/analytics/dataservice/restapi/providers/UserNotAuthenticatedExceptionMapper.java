/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.analytics.dataservice.restapi.providers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.analytics.dataservice.restapi.Constants;
import org.wso2.carbon.analytics.dataservice.restapi.UnauthenticatedUserException;
import org.wso2.carbon.analytics.dataservice.restapi.beans.ResponseBean;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Mapper class for handling UnauthenticatedUserExceptions
 */
@Provider
public class UserNotAuthenticatedExceptionMapper implements ExceptionMapper<UnauthenticatedUserException> {

        Log logger = LogFactory.getLog(AccessDeniedExceptionMapper.class);

        @Override
        public Response toResponse(UnauthenticatedUserException e) {

            ResponseBean errorResponse = new ResponseBean();
            errorResponse.setStatus(Constants.Status.UNAUTHENTICATED);
            errorResponse.setMessage(e.getMessage());
            logger.error("User is not authenticated: ", e);
            return Response.status(Response.Status.UNAUTHORIZED).entity(errorResponse).build();
        }
}
