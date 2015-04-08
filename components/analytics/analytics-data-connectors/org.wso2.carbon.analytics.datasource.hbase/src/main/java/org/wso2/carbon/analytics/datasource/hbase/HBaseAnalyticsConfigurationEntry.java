/*
*  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.analytics.datasource.hbase;

import org.wso2.carbon.analytics.datasource.hbase.util.HBaseAnalyticsDSConstants;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hbase-configuration")
public class HBaseAnalyticsConfigurationEntry {

    private int batchSize = HBaseAnalyticsDSConstants.DEFAULT_QUERY_BATCH_SIZE;
    private String hdfsHost = "hdfs://localhost:9000";
    private String hbaseHost = "localhost:60000";
    private String hdfsDataDir = "/dfs/data";

    @XmlElement(name = "query-batch-size")
    public int getBatchSize() {
        return batchSize;
    }

    @XmlElement(name = "hbase-host")
    public String getHbaseHost() {
        return hbaseHost;
    }

    @XmlElement(name = "hdfs-data-dir")
    public String getHdfsDataDir() {
        return hdfsDataDir;
    }

    public void setHdfsDataDir(String hdfsDataDir) {
        this.hdfsDataDir = hdfsDataDir;
    }

    @XmlElement(name = "hdfs-host")
    public String getHdfsHost() {
        return hdfsHost;
    }

    public void setHdfsHost(String hdfsHost) {
        this.hdfsHost = hdfsHost;
    }

    public void setHbaseHost(String hbaseHost) {
        this.hbaseHost = hbaseHost;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

}
