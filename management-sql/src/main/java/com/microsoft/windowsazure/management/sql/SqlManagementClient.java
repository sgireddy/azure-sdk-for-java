/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.sql;

import com.microsoft.windowsazure.core.FilterableService;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import java.net.URI;

/**
* The SQL Database Management API is a REST API for managing SQL Database
* servers and the firewall rules associated with SQL Database servers.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/gg715283.aspx for more
* information)
*/
public interface SqlManagementClient extends FilterableService<SqlManagementClient>
{
    /**
    * The URI used as the base for all SQL requests.
    */
    URI getBaseUri(); 
    
    /**
    * When you create a Windows Azure subscription, it is uniquely identified
    * by a subscription ID. The subscription ID forms part of the URI for
    * every call that you make to the Service Management API.  The Windows
    * Azure Service ManagementAPI use mutual authentication of management
    * certificates over SSL to ensure that a request made to the service is
    * secure.  No anonymous requests are allowed.
    */
    SubscriptionCloudCredentials getCredentials(); 
    
    /**
    * Includes operations for importing and exporting SQL Databases into and
    * out of Windows Azure blob storage.
    */
    DacOperations getDacOperations(); 
    
    /**
    * The SQL Database Management API includes operations for managing SQL
    * Database Copies for a subscription.
    */
    DatabaseCopyOperations getDatabaseCopiesOperations(); 
    
    /**
    * The SQL Database Management API includes operations for get/stop SQL
    * Databases' operations for a subscription.
    */
    DatabaseOperationOperations getDatabaseOperationsOperations(); 
    
    /**
    * The SQL Database Management API includes operations for managing SQL
    * Databases for a subscription.
    */
    DatabaseOperations getDatabasesOperations(); 
    
    /**
    * The Windows Azure SQL Database Management API includes operations for
    * managing the server-level firewall rules for SQL Database servers.You
    * cannot manage the database-level firewall rules using the Windows Azure
    * SQL Database Management API; they can only be managed by running the
    * Transact-SQL statements against the master or individual user
    * databases.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/gg715276.aspx for
    * more information)
    */
    FirewallRuleOperations getFirewallRulesOperations(); 
    
    /**
    * The SQL Database Management API includes operations for managing SQL
    * Database servers for a subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/gg715271.aspx for
    * more information)
    */
    ServerOperations getServersOperations(); 
    
    /**
    * The SQL Database Management API includes operations for getting Service
    * Objective for a subscription.
    */
    ServiceObjectiveOperations getServiceObjectivesOperations(); 
}