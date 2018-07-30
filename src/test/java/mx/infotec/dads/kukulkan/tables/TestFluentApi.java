package mx.infotec.dads.kukulkan.tables;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.TestCase;
import mx.infotec.dads.kukulkan.tables.handsontable.CheckboxColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.Column;
import mx.infotec.dads.kukulkan.tables.handsontable.DateColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.Handsontable;
import mx.infotec.dads.kukulkan.tables.handsontable.NumericColumn;

/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2018 Roberto Villarejo Martínez
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

public class TestFluentApi extends TestCase {
    
    @Test
    public void testValidHandsontableObject() throws JsonProcessingException, JSONException {
        String json = TestUtils.getResourceFileAsString("handsontable.json");
        Handsontable table = getHandsontable();        
        ObjectMapper mapper = new ObjectMapper();
        JSONAssert.assertEquals(json, mapper.writeValueAsString(table), JSONCompareMode.LENIENT);
    }
    
    public static Handsontable getHandsontable() {
        Handsontable table = new Handsontable(); 
        List<String> colHeaders = new ArrayList<>();
        colHeaders.add("ID");
        colHeaders.add("Login");
        colHeaders.add("Email");
        colHeaders.add("Active");
        colHeaders.add("Language");
        colHeaders.add("Profiles");
        colHeaders.add("Created date");
        colHeaders.add("Modified by");
        colHeaders.add("Modified date");
        
        List<Column> columns = new ArrayList<>();
        columns.add(new NumericColumn().withData("id").withReadOnly(true));
        columns.add(new Column().withData("login").withReadOnly(true));
        columns.add(new Column().withData("email").withReadOnly(true));
        columns.add(new CheckboxColumn().withData("activated").withReadOnly(true));
        columns.add(new Column().withData("langKey").withReadOnly(true));
        columns.add(new Column().withData("authorities").withReadOnly(true));
        columns.add(new DateColumn().withData("createdDate").withReadOnly(true));
        columns.add(new Column().withData("lastModifiedBy").withReadOnly(true));
        columns.add(new DateColumn().withData("lastModifiedDate").withReadOnly(true));
        
        table
            .withRowHeaders(true)
            .withColHeaders(colHeaders)
            .withHeight(440)
            .withContextMenu(true)
            .withMinSpareRows(true)
            .withColumnSorting(true)
            .withColWidths(125)
            .withRowHeights(25)
            .withMinRows(20)
            .withData(getUsersData())
            .withColumns(columns);
        return table;
    }
    
    public static List<Object> getUsersData() {
        Map<String, Object> user;
        user = new HashMap<>();
        user.put("id", "user-33");
        user.put("login", "admin");
        user.put("email", "admin@infotec.mx");
        user.put("activated", "true");
        user.put("langKey", "es");
        user.put("authorities", "ROLE_USER");
        user.put("createdDate", "14/02/18 14:05");
        user.put("lastModifiedBy", "system");
        user.put("lastModifiedDate", "25/07/18 17:05");
        
        List<Object> data = new ArrayList<>();
        data.add(user);
        return data;
    }

}
