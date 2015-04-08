/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.analytics.datasource.core.internal;

import org.wso2.carbon.ndatasource.core.DataSourceService;

/**
 * Service component implementation for analytics data sources.
 * @scr.component name="analytics.ds.component" immediate="true"
 * @scr.reference name="datasource.service" interface="org.wso2.carbon.ndatasource.core.DataSourceService"
 * cardinality="1..1" policy="dynamic"  bind="setDataSourceService" unbind="unsetDataSourceService"
 */
public class AnalyticsDataSourceComponent {
    
    protected void setDataSourceService(DataSourceService service) {
        ServiceHolder.setDataSourceService(service);
    }
    
    protected void unsetDataSourceService(DataSourceService service) {
        ServiceHolder.setDataSourceService(null);
    }
    
}
