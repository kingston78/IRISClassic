package com.temenos.interaction.jdbc;

/*
 * #%L
 * interaction-jdbc-producer
 * %%
 * Copyright (C) 2012 - 2016 Temenos Holdings N.V.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

/**
 * Class to hold Constants used across JDBC Producer
 *
 * @author sjunejo
 *
 */
public final class JDBCProducerConstants {

    public static final String SELECT_FIELD_NAME_ALIAS_SEP = "__AS__";
    public static final int SELECT_FIELD_NAME_ALIAS_SEP_LEN = SELECT_FIELD_NAME_ALIAS_SEP.length();
    
    private JDBCProducerConstants() {        
    }
    
}
